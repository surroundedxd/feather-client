// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.client.renderer.GlStateManager;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.digitalingot.feather.fX;
import net.digitalingot.feather.dZ;
import net.minecraft.client.renderer.ItemRenderer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ ItemRenderer.class })
public class bt
{
    private static final dZ<fX> If;
    
    @Inject(method = { "renderFireInFirstPerson" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;translate(FFF)V") })
    private void u(final CallbackInfo callbackInfo) {
        GlStateManager.func_179137_b(0.0, -0.4000000059604645 * (1.0 - bt.If.fb().dK().pV), 0.0);
    }
    
    static {
        If = ea.a(fX.class);
    }
}
