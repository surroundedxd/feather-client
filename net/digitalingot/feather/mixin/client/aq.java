// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.digitalingot.feather.is;
import net.digitalingot.feather.af;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fD;
import net.digitalingot.feather.dZ;
import net.minecraft.client.renderer.entity.RenderManager;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ RenderManager.class })
public abstract class aQ
{
    @Unique
    private static final dZ<fD> HN;
    @Shadow
    private boolean field_85095_o;
    
    @Inject(method = { "doRenderEntity" }, at = { @At("HEAD") }, require = 1, allow = 1)
    private void a(final Entity entity, final double n, final double n2, final double n3, final float n4, final float n5, final boolean b, final CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        af.bo.aH().render(entity, n, n2, n3, new is());
    }
    
    @Inject(method = { "doRenderEntity" }, at = { @At(value = "FIELD", opcode = 180, target = "Lnet/minecraft/client/renderer/entity/RenderManager;debugBoundingBox:Z", ordinal = 0) }, require = 1, allow = 1)
    private void b(final Entity entity, final double n, final double n2, final double n3, final float n4, final float n5, final boolean b, final CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        af.bv.aH().render(entity, n, n2, n3, new is());
    }
    
    @Redirect(method = { "doRenderEntity" }, at = @At(value = "FIELD", opcode = 180, target = "Lnet/minecraft/client/renderer/entity/RenderManager;debugBoundingBox:Z", ordinal = 0), require = 1, allow = 1)
    private boolean c(final RenderManager renderManager) {
        return !aQ.HN.fb().eU() && this.field_85095_o;
    }
    
    static {
        HN = ea.a(fD.class);
    }
}
