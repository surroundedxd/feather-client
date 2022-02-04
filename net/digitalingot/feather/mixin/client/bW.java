// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.renderer.entity.RenderManager;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fE;
import net.digitalingot.feather.dZ;
import net.minecraft.client.renderer.entity.RenderEntityItem;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.client.renderer.entity.Render;

@Mixin({ RenderEntityItem.class })
public abstract class bw extends Render<EntityItem>
{
    @Unique
    private static final dZ<fE> Ij;
    
    protected bw(final RenderManager renderManager) {
        super(renderManager);
    }
    
    @Inject(method = { "doRender(Lnet/minecraft/entity/item/EntityItem;DDDFF)V" }, at = { @At("HEAD") }, cancellable = true, require = 1, allow = 1)
    private void a(final EntityItem entityItem, final double n, final double n2, final double n3, final float n4, final float n5, final CallbackInfo callbackInfo) {
        final fE fe = bw.Ij.fb();
        if (fe != null && fe.eU()) {
            fe.a((Entity)entityItem, n5, n, n2, n3);
            callbackInfo.cancel();
        }
    }
    
    static {
        Ij = ea.a(fE.class);
    }
}
