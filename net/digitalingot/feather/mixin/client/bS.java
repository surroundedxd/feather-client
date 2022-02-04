// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import java.util.function.Function;
import net.digitalingot.feather.jP;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ Minecraft.class })
public class bs
{
    @Shadow
    private int field_71429_W;
    
    @Inject(method = { "clickMouse" }, at = { @At("HEAD") })
    private void t(final CallbackInfo callbackInfo) {
        if (jP.tN().map((Function<? super jP, ? extends Boolean>)jP::tQ).orElse(false)) {
            this.field_71429_W = 0;
        }
    }
}
