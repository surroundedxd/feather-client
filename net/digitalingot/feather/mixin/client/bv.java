// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fI;
import net.digitalingot.feather.dZ;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import net.digitalingot.feather.iV;

@Mixin({ Entity.class })
public class bV implements iV
{
    @Unique
    private static final dZ<fI> PERFORMANCE;
    @Unique
    private boolean It;
    @Unique
    private long Iu;
    
    public bV() {
        this.It = false;
        this.Iu = 0L;
    }
    
    @Override
    public boolean isCulled() {
        return bV.PERFORMANCE.fb().dK().oL && this.It && Minecraft.func_71410_x().field_71474_y.field_74320_O == 0;
    }
    
    @Override
    public boolean forceVisible() {
        return this.Iu > System.currentTimeMillis();
    }
    
    @Override
    public void setCulled(final boolean it) {
        if (!(this.It = it)) {
            this.Iu = System.currentTimeMillis() + 1000L;
        }
    }
    
    static {
        PERFORMANCE = ea.a(fI.class);
    }
}
