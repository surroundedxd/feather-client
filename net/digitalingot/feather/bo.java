// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public class bO
{
    private final int hX;
    private final int hY;
    
    public bO(final int hx, final int hy) {
        this.hX = hx;
        this.hY = hy;
    }
    
    @NotNull
    public String getName() {
        return bP.a(this);
    }
    
    public int cq() {
        return this.hX;
    }
    
    public int cr() {
        return this.hY;
    }
}
