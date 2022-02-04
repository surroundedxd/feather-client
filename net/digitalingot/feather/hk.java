// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import javax.sound.sampled.TargetDataLine;
import org.jetbrains.annotations.NotNull;
import java.io.Closeable;

public class hK extends Thread implements Closeable
{
    @NotNull
    private final hA zi;
    @NotNull
    private final hH Al;
    private boolean Am;
    
    public hK(@NotNull final hA zi) {
        this.Al = new hH();
        this.Am = true;
        this.zi = zi;
        this.setDaemon(true);
        this.setName("feather-recording");
    }
    
    @Override
    public void run() {
        while (this.Am) {
            try {
                Thread.sleep(10L);
            }
            catch (InterruptedException ex) {
                return;
            }
            final hB je = this.zi.jE();
            hZ.c[] array = je.jR();
            if (array == null) {
                continue;
            }
            final TargetDataLine kc = this.zi.jF().kc();
            if (kc == null) {
                continue;
            }
            Label_0058: {
                break Label_0058;
                try {
                    do {
                        this.a(array, this.a(kc));
                    } while ((array = je.jR()) != null);
                }
                finally {
                    kc.stop();
                    kc.flush();
                }
            }
        }
    }
    
    private byte[] a(@NotNull final TargetDataLine targetDataLine) {
        targetDataLine.start();
        while (targetDataLine.available() < 960) {
            try {
                Thread.sleep(1L);
                continue;
            }
            catch (InterruptedException ex) {
                return new byte[0];
            }
            break;
        }
        final byte[] array = new byte[960];
        targetDataLine.read(array, 0, 960);
        return array;
    }
    
    private void a(final hZ.c[] array, final byte[] array2) {
        hE.a(array2, this.zi.jE().jM());
        final hS ji = this.zi.jI();
        if (ji == null) {
            return;
        }
        final byte[] b = this.Al.b(array2);
        for (int length = array.length, i = 0; i < length; ++i) {
            ji.a(b, array[i]);
        }
    }
    
    @Override
    public void close() {
        this.Am = false;
    }
}
