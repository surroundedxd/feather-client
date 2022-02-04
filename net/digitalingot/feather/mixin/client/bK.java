// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;
import net.minecraft.client.gui.FontRenderer;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fy;
import net.digitalingot.feather.dZ;
import net.minecraft.client.gui.GuiNewChat;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.client.gui.Gui;

@Mixin({ GuiNewChat.class })
public abstract class bk extends Gui
{
    @Unique
    private static final dZ<fy> Ie;
    
    @Inject(method = { "drawChat" }, at = { @At("HEAD") }, cancellable = true, require = 1, allow = 1)
    private void p(final CallbackInfo callbackInfo) {
        final fy fy = bk.Ie.fb();
        if (fy != null && fy.dK().mJ) {
            callbackInfo.cancel();
        }
    }
    
    @Redirect(method = { "drawChat" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/FontRenderer;drawStringWithShadow(Ljava/lang/String;FFI)I"), require = 1, allow = 1)
    private int a(final FontRenderer fontRenderer, final String s, final float n, float n2, final int n3) {
        final fy fy = bk.Ie.fb();
        n2 -= 13.0f;
        if (fy != null && fy.dK().lp) {
            return fontRenderer.func_175063_a(s, n, n2, n3);
        }
        return fontRenderer.func_78276_b(s, (int)n, (int)n2, n3);
    }
    
    @ModifyConstant(method = { "setChatLine" }, constant = { @Constant(intValue = 100) }, require = 2, allow = 2)
    private int bd(final int n) {
        final fy fy = bk.Ie.fb();
        return (fy != null && fy.dK().mK) ? 100000 : n;
    }
    
    @Redirect(method = { "drawChat" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiNewChat;drawRect(IIIII)V"), require = 3, allow = 3)
    private void b(final int n, int n2, final int n3, int n4, int rgb) {
        final fy fy = bk.Ie.fb();
        final int n5 = rgb >> 24 & 0xFF;
        rgb = fy.dK().li.getRGB();
        final int n6 = rgb >> 24 & 0xFF;
        if (n5 < 127 && n5 < n6) {
            rgb = ((rgb & 0xFFFFFF) | n5 << 24);
        }
        n2 -= 13;
        n4 -= 13;
        func_73734_a(n, n2, n3, n4, rgb);
    }
    
    @ModifyConstant(method = { "getChatComponent" }, constant = { @Constant(intValue = 27) }, require = 1, allow = 1)
    private int be(final int n) {
        return n + 13;
    }
    
    static {
        Ie = ea.a(fy.class);
    }
}
