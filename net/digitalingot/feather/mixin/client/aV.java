// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.util.ResourceLocation;
import net.digitalingot.feather.mixin.core.d;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.Unique;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.client.gui.GuiYesNoCallback;
import net.digitalingot.feather.dS;
import net.minecraft.client.gui.Gui;

@Mixin({ GuiScreen.class })
public abstract class av extends Gui implements dS, GuiYesNoCallback
{
    @Unique
    private boolean HL;
    
    public av() {
        this.HL = false;
    }
    
    public void feather$setBlur(final boolean hl) {
        this.HL = hl;
    }
    
    @Inject(method = { "setWorldAndResolution(Lnet/minecraft/client/Minecraft;II)V" }, at = { @At("RETURN") })
    private void d(final CallbackInfo callbackInfo) {
        if (this.HL) {
            final Minecraft func_71410_x = Minecraft.func_71410_x();
            if (func_71410_x.field_71441_e != null) {
                ((d)func_71410_x.field_71460_t).feather$loadShader(new ResourceLocation("feather", "shaders/post/blur.json"));
            }
        }
    }
    
    @Inject(method = { "onGuiClosed()V" }, at = { @At("RETURN") })
    private void e(final CallbackInfo callbackInfo) {
        if (this.HL) {
            final Minecraft func_71410_x = Minecraft.func_71410_x();
            if (func_71410_x.field_71441_e != null) {
                func_71410_x.field_71460_t.func_181022_b();
            }
        }
    }
}
