// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import net.minecraft.util.Vec3;
import net.minecraft.client.renderer.entity.RenderManager;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fw;
import net.digitalingot.feather.dZ;
import net.minecraft.client.renderer.entity.RenderFish;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.client.renderer.entity.Render;

@Mixin({ RenderFish.class })
public abstract class bh extends Render<EntityFishHook>
{
    @Unique
    private static final dZ<fw> HV;
    
    protected bh(final RenderManager renderManager) {
        super(renderManager);
    }
    
    @Redirect(method = { "doRender(Lnet/minecraft/entity/projectile/EntityFishHook;DDDFF)V" }, at = @At(value = "NEW", target = "(DDD)Lnet/minecraft/util/Vec3;", ordinal = 0), require = 1, allow = 1)
    private Vec3 g(double n, double n2, double n3) {
        final fw fw = bh.HV.fb();
        if (fw.eU() && fw.dK().mh) {
            n = -0.5;
            n2 = 0.03;
            n3 = 0.8;
        }
        return new Vec3(n, n2, n3);
    }
    
    static {
        HV = ea.a(fw.class);
    }
}
