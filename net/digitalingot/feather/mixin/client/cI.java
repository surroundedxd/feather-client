// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.digitalingot.feather.jv;
import net.digitalingot.feather.jg;
import net.digitalingot.feather.iU;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.renderer.WorldRenderer;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.jp;
import net.minecraft.client.renderer.RenderGlobal;
import org.spongepowered.asm.mixin.Mixin;
import net.digitalingot.feather.km;

@Mixin({ RenderGlobal.class })
public class ci implements km
{
    @Unique
    private jp Iy;
    
    @Inject(method = { "renderSky(Lnet/minecraft/client/renderer/WorldRenderer;FZ)V" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/WorldRenderer;begin(ILnet/minecraft/client/renderer/vertex/VertexFormat;)V", shift = At.Shift.AFTER) })
    private void a(final WorldRenderer worldRenderer, final float n, final boolean b, final CallbackInfo callbackInfo) {
        this.Iy = iU.tb().createSink(jg.ER);
    }
    
    @Inject(method = { "renderSky(Lnet/minecraft/client/renderer/WorldRenderer;FZ)V" }, at = { @At("TAIL") })
    private void b(final WorldRenderer worldRenderer, final float n, final boolean b, final CallbackInfo callbackInfo) {
        this.Iy.tn();
    }
    
    @Override
    public jp feather$getPositionSink() {
        return this.Iy;
    }
}
