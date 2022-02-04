// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import net.digitalingot.feather.kn;

@Mixin({ RendererLivingEntity.class })
public abstract class bY implements kn
{
    @Shadow
    public abstract void func_177067_a(final Entity p0, final double p1, final double p2, final double p3);
    
    @Override
    public void feather$renderName(final Entity entity, final double n, final double n2, final double n3) {
        this.func_177067_a(entity, n, n2, n3);
    }
}
