// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.nio.FloatBuffer;

public class kP extends kU implements kT
{
    private static final long Hi = 1L;
    public float He;
    public float Hf;
    public float Hz;
    public float HA;
    
    public kP() {
        this.uy();
    }
    
    public kP(final kT kt) {
        this.a(kt);
    }
    
    public kP(final float n, final float n2, final float n3, final float n4) {
        this.f(n, n2, n3, n4);
    }
    
    public void e(final float he, final float hf) {
        this.He = he;
        this.Hf = hf;
    }
    
    public void g(final float he, final float hf, final float hz) {
        this.He = he;
        this.Hf = hf;
        this.Hz = hz;
    }
    
    public void f(final float he, final float hf, final float hz, final float ha) {
        this.He = he;
        this.Hf = hf;
        this.Hz = hz;
        this.HA = ha;
    }
    
    public kP a(final kT kt) {
        this.He = kt.up();
        this.Hf = kt.uq();
        this.Hz = kt.uB();
        this.HA = kt.uC();
        return this;
    }
    
    public kP uy() {
        return a(this);
    }
    
    public static kP a(final kP kp) {
        kp.He = 0.0f;
        kp.Hf = 0.0f;
        kp.Hz = 0.0f;
        kp.HA = 1.0f;
        return kp;
    }
    
    @Override
    public float uz() {
        return this.He * this.He + this.Hf * this.Hf + this.Hz * this.Hz + this.HA * this.HA;
    }
    
    public static kP a(final kP kp, kP kp2) {
        final float n = 1.0f / kp.uD();
        if (kp2 == null) {
            kp2 = new kP();
        }
        kp2.f(kp.He * n, kp.Hf * n, kp.Hz * n, kp.HA * n);
        return kp2;
    }
    
    public kP b(final kP kp) {
        return a(this, kp);
    }
    
    public static float b(final kP kp, final kP kp2) {
        return kp.He * kp2.He + kp.Hf * kp2.Hf + kp.Hz * kp2.Hz + kp.HA * kp2.HA;
    }
    
    public kP c(final kP kp) {
        return c(this, kp);
    }
    
    public static kP c(final kP kp, kP kp2) {
        if (kp2 == null) {
            kp2 = new kP();
        }
        kp2.He = -kp.He;
        kp2.Hf = -kp.Hf;
        kp2.Hz = -kp.Hz;
        kp2.HA = kp.HA;
        return kp2;
    }
    
    @Override
    public kU uA() {
        return c(this, this);
    }
    
    @Override
    public kU g(final FloatBuffer floatBuffer) {
        this.He = floatBuffer.get();
        this.Hf = floatBuffer.get();
        this.Hz = floatBuffer.get();
        this.HA = floatBuffer.get();
        return this;
    }
    
    @Override
    public kU r(final float n) {
        return a(n, this, this);
    }
    
    public static kP a(final float n, final kP kp, kP kp2) {
        if (kp2 == null) {
            kp2 = new kP();
        }
        kp2.He = kp.He * n;
        kp2.Hf = kp.Hf * n;
        kp2.Hz = kp.Hz * n;
        kp2.HA = kp.HA * n;
        return kp2;
    }
    
    @Override
    public kU h(final FloatBuffer floatBuffer) {
        floatBuffer.put(this.He);
        floatBuffer.put(this.Hf);
        floatBuffer.put(this.Hz);
        floatBuffer.put(this.HA);
        return this;
    }
    
    @Override
    public final float up() {
        return this.He;
    }
    
    @Override
    public final float uq() {
        return this.Hf;
    }
    
    public final void s(final float he) {
        this.He = he;
    }
    
    public final void t(final float hf) {
        this.Hf = hf;
    }
    
    public void u(final float hz) {
        this.Hz = hz;
    }
    
    @Override
    public float uB() {
        return this.Hz;
    }
    
    public void v(final float ha) {
        this.HA = ha;
    }
    
    @Override
    public float uC() {
        return this.HA;
    }
    
    @Override
    public String toString() {
        return "Quaternion: " + this.He + " " + this.Hf + " " + this.Hz + " " + this.HA;
    }
    
    public static kP a(final kP kp, final kP kp2, kP kp3) {
        if (kp3 == null) {
            kp3 = new kP();
        }
        kp3.f(kp.He * kp2.HA + kp.HA * kp2.He + kp.Hf * kp2.Hz - kp.Hz * kp2.Hf, kp.Hf * kp2.HA + kp.HA * kp2.Hf + kp.Hz * kp2.He - kp.He * kp2.Hz, kp.Hz * kp2.HA + kp.HA * kp2.Hz + kp.He * kp2.Hf - kp.Hf * kp2.He, kp.HA * kp2.HA - kp.He * kp2.He - kp.Hf * kp2.Hf - kp.Hz * kp2.Hz);
        return kp3;
    }
    
    public static kP b(final kP kp, final kP kp2, kP kp3) {
        final float uz = kp2.uz();
        final float n = (uz == 0.0) ? uz : (1.0f / uz);
        if (kp3 == null) {
            kp3 = new kP();
        }
        kp3.f((kp.He * kp2.HA - kp.HA * kp2.He - kp.Hf * kp2.Hz + kp.Hz * kp2.Hf) * n, (kp.Hf * kp2.HA - kp.HA * kp2.Hf - kp.Hz * kp2.He + kp.He * kp2.Hz) * n, (kp.Hz * kp2.HA - kp.HA * kp2.Hz - kp.He * kp2.Hf + kp.Hf * kp2.He) * n, (kp.HA * kp2.HA + kp.He * kp2.He + kp.Hf * kp2.Hf + kp.Hz * kp2.Hz) * n);
        return kp3;
    }
    
    public final void a(final kX kx) {
        this.He = kx.He;
        this.Hf = kx.Hf;
        this.Hz = kx.Hz;
        final float n = (float)(Math.sin(0.5 * kx.HA) / (float)Math.sqrt(this.He * this.He + this.Hf * this.Hf + this.Hz * this.Hz));
        this.He *= n;
        this.Hf *= n;
        this.Hz *= n;
        this.HA = (float)Math.cos(0.5 * kx.HA);
    }
    
    public final kP f(final kO ko) {
        return a(ko, this);
    }
    
    public static kP a(final kO ko, final kP kp) {
        return kp.b(ko.Hj, ko.Hk, ko.Hn, ko.Hl, ko.Hm, ko.Ho, ko.Hp, ko.Hq, ko.Hr);
    }
    
    public final kP f(final kN kn) {
        return a(kn, this);
    }
    
    public static kP a(final kN kn, final kP kp) {
        return kp.b(kn.Hj, kn.Hk, kn.Hn, kn.Hl, kn.Hm, kn.Ho, kn.Hp, kn.Hq, kn.Hr);
    }
    
    private kP b(final float a, final float n, final float n2, final float n3, final float b, final float n4, final float n5, final float n6, final float b2) {
        final float n7 = a + b + b2;
        if (n7 >= 0.0) {
            final float n8 = (float)Math.sqrt(n7 + 1.0);
            this.HA = n8 * 0.5f;
            final float n9 = 0.5f / n8;
            this.He = (n6 - n4) * n9;
            this.Hf = (n2 - n5) * n9;
            this.Hz = (n3 - n) * n9;
        }
        else {
            final float max = Math.max(Math.max(a, b), b2);
            if (max == a) {
                final float n10 = (float)Math.sqrt(a - (b + b2) + 1.0);
                this.He = n10 * 0.5f;
                final float n11 = 0.5f / n10;
                this.Hf = (n + n3) * n11;
                this.Hz = (n5 + n2) * n11;
                this.HA = (n6 - n4) * n11;
            }
            else if (max == b) {
                final float n12 = (float)Math.sqrt(b - (b2 + a) + 1.0);
                this.Hf = n12 * 0.5f;
                final float n13 = 0.5f / n12;
                this.Hz = (n4 + n6) * n13;
                this.He = (n + n3) * n13;
                this.HA = (n2 - n5) * n13;
            }
            else {
                final float n14 = (float)Math.sqrt(b2 - (a + b) + 1.0);
                this.Hz = n14 * 0.5f;
                final float n15 = 0.5f / n14;
                this.He = (n5 + n2) * n15;
                this.Hf = (n4 + n6) * n15;
                this.HA = (n3 - n) * n15;
            }
        }
        return this;
    }
}
