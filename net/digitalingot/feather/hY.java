// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.UUID;
import org.jetbrains.annotations.NotNull;

class hy implements hx
{
    @NotNull
    private final hA zi;
    static final /* synthetic */ boolean ac;
    
    public hy(@NotNull final hA zi) {
        this.zi = zi;
    }
    
    @Override
    public void jy() {
    }
    
    @Override
    public void a(final UUID key, final long n, final byte[] array, final hZ.c c) {
        hL hl = this.zi.jC().computeIfAbsent(key, p0 -> new hL());
        if (hl.kj() + 500L < System.currentTimeMillis()) {
            hl.close();
            hl = new hL();
            this.zi.jC().put(key, hl);
        }
        if (n < hl.kk()) {
            return;
        }
        final hI jl = this.zi.jL();
        if (!hy.ac && jl == null) {
            throw new AssertionError();
        }
        jl.kg().add(new hD(hl, key, c, n, array));
    }
    
    static {
        ac = !hy.class.desiredAssertionStatus();
    }
}
