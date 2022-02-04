// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.ImmutablePair;
import java.util.UUID;
import javax.sound.sampled.SourceDataLine;
import java.util.concurrent.TimeUnit;
import javax.sound.sampled.Control;
import java.util.concurrent.ArrayBlockingQueue;
import org.jetbrains.annotations.Nullable;
import javax.sound.sampled.FloatControl;
import java.util.concurrent.BlockingQueue;
import org.jetbrains.annotations.NotNull;
import java.io.Closeable;

public class hI extends Thread implements Closeable
{
    @NotNull
    private final hA zi;
    @NotNull
    private final BlockingQueue<hD> Aj;
    @Nullable
    private FloatControl Ak;
    static final /* synthetic */ boolean ac;
    
    public hI(@NotNull final hA zi) {
        this.Aj = new ArrayBlockingQueue<hD>(1000);
        this.zi = zi;
        this.setDaemon(true);
        this.setName("feather-playback");
    }
    
    @Override
    public void run() {
        final SourceDataLine kd = this.zi.jF().kd();
        if (kd == null) {
            return;
        }
        this.Ak = (FloatControl)kd.getControl(FloatControl.Type.MASTER_GAIN);
        if (!hI.ac && this.Ak == null) {
            throw new AssertionError();
        }
        this.Ak.setValue(this.zi.jE().jO() * 40.0f / 100.0f - 35.0f);
        while (true) {
            hD hd;
            try {
                hd = this.Aj.poll(1L, TimeUnit.SECONDS);
            }
            catch (InterruptedException ex) {
                kd.stop();
                kd.flush();
                this.close();
                return;
            }
            if (hd == null) {
                if (kd.getBufferSize() - kd.available() > 0 || !kd.isActive()) {
                    continue;
                }
                kd.stop();
                kd.flush();
            }
            else {
                final hL jx = hd.jX();
                if (jx == null) {
                    break;
                }
                if (kd.getBufferSize() - kd.available() <= 0) {
                    final byte[] array = new byte[Math.min(2880, kd.getBufferSize() - 960)];
                    kd.write(array, 0, array.length);
                }
                this.a(kd, hd, jx);
                jx.h(hd.ka());
                jx.g(System.currentTimeMillis());
                final hG ki = jx.ki();
                byte[] a;
                try {
                    a = ki.a(hd.kb());
                }
                catch (IllegalStateException ex2) {
                    kr.Gh.info("Failed to decode incoming audio from " + hd.jY());
                    continue;
                }
                if (a.length == 0) {
                    continue;
                }
                this.a(kd, hE.a(a, 1.0f, 1.0f));
            }
        }
    }
    
    private void a(@NotNull final SourceDataLine sourceDataLine, final byte[] array) {
        sourceDataLine.write(array, 0, array.length);
        sourceDataLine.start();
    }
    
    private void a(@NotNull final SourceDataLine sourceDataLine, @NotNull final hD hd, @NotNull final hL hl) {
        if (hl.kk() == -1L) {
            return;
        }
        final int n = (int)(hd.ka() - (hl.kk() + 1L));
        if (n > 10) {
            return;
        }
        for (int i = 0; i < n; ++i) {
            if (sourceDataLine.available() < 960) {
                kr.Gh.info("Voice: Compensation failed - could not compensate more than " + (i + 1) + " audio packets");
                break;
            }
            this.a(sourceDataLine, hE.a(hl.ki().a(null), 1.0f, 1.0f));
        }
    }
    
    private byte[] a(@NotNull final UUID uuid, byte[] a, @NotNull final hZ.c c) {
        final hB je = this.zi.jE();
        boolean b = false;
        if (c == hZ.c.PROXIMITY) {
            b = true;
        }
        else {
            final ij le = this.zi.hU().lE();
            if (le == null) {
                return null;
            }
            if (le.lB() == iL.b.PROXIMITY) {
                b = true;
            }
        }
        kW n = null;
        hB.a js = null;
        Object o;
        if (b) {
            n = je.n(uuid);
            if (n == null) {
                return null;
            }
            js = je.jS();
            if (js == null) {
                return null;
            }
            o = hJ.a(n, js);
        }
        else {
            o = ImmutablePair.of((Object)1.0f, (Object)1.0f);
        }
        final float floatValue = (float)((Pair)o).getLeft();
        final float floatValue2 = (float)((Pair)o).getRight();
        float n2 = floatValue * je.jN();
        float n3 = floatValue2 * je.jN();
        if (b) {
            final float ud = kW.b(n, js.jT(), null).uD();
            if (ud > 16.0) {
                final float n4 = (float)(1.0 - Math.min((ud - 16.0) / 16.0, 1.0));
                n2 *= n4;
                n3 *= n4;
            }
        }
        a = hE.a(a, n2, n3);
        return a;
    }
    
    @Override
    public void close() {
        final hD hd = new hD(null, UUID.randomUUID(), hZ.c._NOT_IN_SCHEMA, -1L, new byte[0]);
        this.Aj.clear();
        this.Aj.add(hd);
    }
    
    @NotNull
    public BlockingQueue<hD> kg() {
        return this.Aj;
    }
    
    @Nullable
    public FloatControl kh() {
        return this.Ak;
    }
    
    static {
        ac = !hI.class.desiredAssertionStatus();
    }
}
