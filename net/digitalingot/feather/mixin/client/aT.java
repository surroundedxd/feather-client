// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraftforge.fml.client.SplashProgress;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = { SplashProgress.class }, remap = false)
public abstract class at
{
    @Shadow(aliases = { "SplashProgress" }, remap = false)
    private static boolean enabled;
    
    @Inject(method = { "start" }, at = { @At(value = "FIELD", target = "Lnet/minecraftforge/fml/client/SplashProgress;enabled:Z", opcode = 178, remap = false, ordinal = 0) }, remap = false, require = 1, allow = 1)
    private static void a(final CallbackInfo callbackInfo) {
        at.enabled = true;
    }
    
    @Inject(method = { "finish" }, at = { @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/Drawable;makeCurrent()V", shift = At.Shift.AFTER, remap = false, ordinal = 0) }, remap = false, cancellable = true, require = 1, allow = 1)
    private static void b(final CallbackInfo callbackInfo) {
        callbackInfo.cancel();
    }
}
