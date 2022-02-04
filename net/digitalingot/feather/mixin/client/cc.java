// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import net.digitalingot.feather.ka;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ BlockRendererDispatcher.class })
public class cC
{
    @Redirect(method = { "renderBlockDamage" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/util/EnumWorldBlockLayer;values()[Lnet/minecraft/util/EnumWorldBlockLayer;"))
    private EnumWorldBlockLayer[] uR() {
        return ka.Gg;
    }
}
