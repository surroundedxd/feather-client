// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.nio.FloatBuffer;
import java.io.Serializable;

public class kM extends kL implements Serializable
{
    private static final long Hi = 1L;
    public float Hj;
    public float Hk;
    public float Hl;
    public float Hm;
    
    public kM() {
        this.us();
    }
    
    public kM(final kM km) {
        this.a(km);
    }
    
    public kM a(final kM km) {
        return a(km, this);
    }
    
    public static kM a(final kM km, kM km2) {
        if (km2 == null) {
            km2 = new kM();
        }
        km2.Hj = km.Hj;
        km2.Hk = km.Hk;
        km2.Hl = km.Hl;
        km2.Hm = km.Hm;
        return km2;
    }
    
    @Override
    public kL b(final FloatBuffer floatBuffer) {
        this.Hj = floatBuffer.get();
        this.Hk = floatBuffer.get();
        this.Hl = floatBuffer.get();
        this.Hm = floatBuffer.get();
        return this;
    }
    
    @Override
    public kL c(final FloatBuffer floatBuffer) {
        this.Hj = floatBuffer.get();
        this.Hl = floatBuffer.get();
        this.Hk = floatBuffer.get();
        this.Hm = floatBuffer.get();
        return this;
    }
    
    @Override
    public kL d(final FloatBuffer floatBuffer) {
        floatBuffer.put(this.Hj);
        floatBuffer.put(this.Hk);
        floatBuffer.put(this.Hl);
        floatBuffer.put(this.Hm);
        return this;
    }
    
    @Override
    public kL e(final FloatBuffer floatBuffer) {
        floatBuffer.put(this.Hj);
        floatBuffer.put(this.Hl);
        floatBuffer.put(this.Hk);
        floatBuffer.put(this.Hm);
        return this;
    }
    
    public static kM a(final kM km, final kM km2, kM km3) {
        if (km3 == null) {
            km3 = new kM();
        }
        km3.Hj = km.Hj + km2.Hj;
        km3.Hk = km.Hk + km2.Hk;
        km3.Hl = km.Hl + km2.Hl;
        km3.Hm = km.Hm + km2.Hm;
        return km3;
    }
    
    public static kM b(final kM km, final kM km2, kM km3) {
        if (km3 == null) {
            km3 = new kM();
        }
        km3.Hj = km.Hj - km2.Hj;
        km3.Hk = km.Hk - km2.Hk;
        km3.Hl = km.Hl - km2.Hl;
        km3.Hm = km.Hm - km2.Hm;
        return km3;
    }
    
    public static kM c(final kM km, final kM km2, kM km3) {
        if (km3 == null) {
            km3 = new kM();
        }
        final float hj = km.Hj * km2.Hj + km.Hl * km2.Hk;
        final float hk = km.Hk * km2.Hj + km.Hm * km2.Hk;
        final float hl = km.Hj * km2.Hl + km.Hl * km2.Hm;
        final float hm = km.Hk * km2.Hl + km.Hm * km2.Hm;
        km3.Hj = hj;
        km3.Hk = hk;
        km3.Hl = hl;
        km3.Hm = hm;
        return km3;
    }
    
    public static kV a(final kM km, final kV kv, kV kv2) {
        if (kv2 == null) {
            kv2 = new kV();
        }
        final float he = km.Hj * kv.He + km.Hl * kv.Hf;
        final float hf = km.Hk * kv.He + km.Hm * kv.Hf;
        kv2.He = he;
        kv2.Hf = hf;
        return kv2;
    }
    
    @Override
    public kL uv() {
        return this.b(this);
    }
    
    public kM b(final kM km) {
        return b(this, km);
    }
    
    public static kM b(final kM km, kM km2) {
        if (km2 == null) {
            km2 = new kM();
        }
        final float hl = km.Hl;
        final float hk = km.Hk;
        km2.Hk = hl;
        km2.Hl = hk;
        return km2;
    }
    
    @Override
    public kL ut() {
        return c(this, this);
    }
    
    public static kM c(final kM km, kM km2) {
        final float ux = km.ux();
        if (ux != 0.0f) {
            if (km2 == null) {
                km2 = new kM();
            }
            final float n = 1.0f / ux;
            final float hj = km.Hm * n;
            final float hk = -km.Hk * n;
            final float hm = km.Hj * n;
            final float hl = -km.Hl * n;
            km2.Hj = hj;
            km2.Hk = hk;
            km2.Hl = hl;
            km2.Hm = hm;
            return km2;
        }
        return null;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.Hj).append(' ').append(this.Hl).append(' ').append('\n');
        sb.append(this.Hk).append(' ').append(this.Hm).append(' ').append('\n');
        return sb.toString();
    }
    
    @Override
    public kL uu() {
        return this.c(this);
    }
    
    public kM c(final kM km) {
        return d(this, km);
    }
    
    public static kM d(final kM km, kM km2) {
        if (km2 == null) {
            km2 = new kM();
        }
        km2.Hj = -km.Hj;
        km2.Hk = -km.Hk;
        km2.Hl = -km.Hl;
        km2.Hm = -km.Hm;
        return km2;
    }
    
    @Override
    public kL us() {
        return d(this);
    }
    
    public static kM d(final kM km) {
        km.Hj = 1.0f;
        km.Hk = 0.0f;
        km.Hl = 0.0f;
        km.Hm = 1.0f;
        return km;
    }
    
    @Override
    public kL uw() {
        return e(this);
    }
    
    public static kM e(final kM km) {
        km.Hj = 0.0f;
        km.Hk = 0.0f;
        km.Hl = 0.0f;
        km.Hm = 0.0f;
        return km;
    }
    
    @Override
    public float ux() {
        return this.Hj * this.Hm - this.Hk * this.Hl;
    }
}
