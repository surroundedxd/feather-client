// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.renderer.texture.DynamicTexture;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fX;
import net.digitalingot.feather.dZ;
import net.minecraft.client.renderer.EntityRenderer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ EntityRenderer.class })
public class bm
{
    @Unique
    private static final dZ<fX> HF;
    @Shadow
    private Minecraft field_78531_r;
    @Shadow
    @Final
    private int[] field_78504_Q;
    @Shadow
    @Final
    private DynamicTexture field_78513_d;
    @Shadow
    private boolean field_78536_aa;
    
    @Inject(method = { "updateLightmap" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/profiler/Profiler;startSection(Ljava/lang/String;)V", shift = At.Shift.BEFORE, ordinal = 0) }, cancellable = true, require = 1, allow = 1)
    private void q(final CallbackInfo callbackInfo) {
        if (this.field_78531_r.field_71441_e == null) {
            return;
        }
        final fX fx = bm.HF.fb();
        if (fx == null || !fx.eU() || !fx.dK().pQ) {
            return;
        }
        callbackInfo.cancel();
        for (int i = 0; i < 256; ++i) {
            this.field_78504_Q[i] = -1;
        }
        this.field_78513_d.func_110564_a();
        this.field_78536_aa = false;
    }
    
    static {
        HF = ea.a(fX.class);
    }
}
