// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class gY extends ha<gZ.a>
{
    private static final long wR = 20L;
    private jM wS;
    
    gY(@NotNull final dW<gZ.a> dw) {
        super(dw);
        this.wS = null;
    }
    
    @Override
    public boolean iN() {
        return ((gZ.a)this.xu.dK()).wZ;
    }
    
    @Override
    public void eR() {
        if (!this.eU()) {
            return;
        }
        this.iP();
    }
    
    @Override
    public void eP() {
        super.eP();
        this.iP();
    }
    
    @Override
    public void eQ() {
        super.eQ();
        this.iO();
    }
    
    private void iO() {
        if (this.wS != null) {
            this.wS.tL();
            this.wS = null;
        }
    }
    
    private void iP() {
        this.iO();
        final Minecraft minecraft;
        this.wS = c.i().b(() -> {
            Minecraft.func_71410_x();
            if (minecraft.func_147114_u() != null && jP.tO()) {
                minecraft.field_71439_g.func_71165_d("/tip all");
            }
        }, 0L, ((gZ.a)this.xu.dK()).xa * 20L);
    }
}
