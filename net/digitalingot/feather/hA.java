// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public abstract class ha<T extends eg>
{
    @NotNull
    protected final dW<T> xu;
    protected boolean xv;
    
    protected ha(@NotNull final dW<T> xu) {
        this.xu = xu;
    }
    
    public abstract boolean iN();
    
    public void initialize() {
    }
    
    public void eR() {
    }
    
    public void eP() {
        this.xv = true;
    }
    
    public void eQ() {
        this.xv = false;
    }
    
    public boolean eU() {
        return this.xv && this.xu.eU() && this.iN() && jP.tO();
    }
    
    public boolean iS() {
        return this.xv;
    }
}
