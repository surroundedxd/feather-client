// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.digitalingot.feather.aa;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ EntityRenderer.class })
public class aN
{
    @Shadow
    private Minecraft field_78531_r;
    
    @Inject(method = { "orientCamera" }, at = { @At("HEAD") })
    private void a(final float n, final CallbackInfo callbackInfo) {
        aa.bo.aH().orient(this.field_78531_r.func_175606_aa());
    }
    
    @Inject(method = { "orientCamera" }, at = { @At("TAIL") })
    private void i(final CallbackInfo callbackInfo) {
        aa.bp.aH().orient(this.field_78531_r.func_175606_aa());
    }
}
