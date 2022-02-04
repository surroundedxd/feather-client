// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.digitalingot.feather.jp;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.RenderGlobal;
import org.spongepowered.asm.mixin.Mixin;
import net.digitalingot.feather.km;

@Mixin({ RenderGlobal.class })
public abstract class cj implements km
{
    @Inject(method = { "renderSky(Lnet/minecraft/client/renderer/WorldRenderer;FZ)V" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/WorldRenderer;pos(DDD)Lnet/minecraft/client/renderer/WorldRenderer;", ordinal = 0) }, slice = { @Slice(from = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/WorldRenderer;begin(ILnet/minecraft/client/renderer/vertex/VertexFormat;)V")) }, locals = LocalCapture.CAPTURE_FAILHARD, cancellable = true)
    private void a(final WorldRenderer worldRenderer, final float n, final boolean b, final CallbackInfo callbackInfo, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8) {
        callbackInfo.cancel();
        final jp feather$getPositionSink = this.feather$getPositionSink();
        feather$getPositionSink.e(n7, n, (float)n6);
        feather$getPositionSink.e(n8, n, (float)n6);
        feather$getPositionSink.e(n8, n, (float)(n6 + 64));
        feather$getPositionSink.e(n7, n, (float)(n6 + 64));
    }
}
