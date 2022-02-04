// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.gui.GuiMultiplayer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ GuiMultiplayer.class })
public class bx
{
    @Inject(method = { "connectToServer" }, at = { @At("HEAD") })
    public void v(final CallbackInfo callbackInfo) {
        final Minecraft func_71410_x = Minecraft.func_71410_x();
        if (func_71410_x.func_147114_u() != null) {
            func_71410_x.func_147114_u().func_147298_b().func_150718_a((IChatComponent)new ChatComponentText(""));
        }
    }
}
