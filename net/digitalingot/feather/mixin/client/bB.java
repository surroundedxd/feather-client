// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.Slice;
import net.minecraft.client.gui.FontRenderer;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fw;
import net.digitalingot.feather.dZ;
import net.minecraftforge.client.GuiIngameForge;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.client.gui.GuiIngame;

@Mixin({ GuiIngameForge.class })
public abstract class bb extends GuiIngame
{
    @Unique
    private static final dZ<fw> HV;
    
    public bb(final Minecraft minecraft) {
        super(minecraft);
    }
    
    @Redirect(method = { "renderHUDText(II)V" }, at = @At(value = "INVOKE", target = "Lnet/minecraftforge/client/GuiIngameForge;drawRect(IIIII)V"), require = 2, allow = 2)
    private void a(final int n, final int n2, final int n3, final int n4, final int n5) {
        final fw fw = bb.HV.fb();
        if (!fw.eU() || !fw.dK().mq) {
            func_73734_a(n, n2, n3, n4, n5);
        }
    }
    
    @Redirect(method = { "renderHUDText(II)V" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/FontRenderer;drawString(Ljava/lang/String;III)I"), require = 2, allow = 2)
    private int a(final FontRenderer fontRenderer, final String s, final int n, final int n2, final int n3) {
        final fw fw = bb.HV.fb();
        return fontRenderer.func_175065_a(s, (float)n, (float)n2, n3, fw.eU() && fw.dK().mq);
    }
    
    @Redirect(method = { "renderHealth(II)V" }, at = @At(value = "INVOKE", target = "Lnet/minecraftforge/client/GuiIngameForge;drawTexturedModalRect(IIIIII)V"), slice = @Slice(from = @At(value = "INVOKE", target = "Lnet/minecraftforge/client/GuiIngameForge;drawTexturedModalRect(IIIIII)V", shift = At.Shift.AFTER, ordinal = 0), to = @At(value = "INVOKE", target = "Lnet/minecraftforge/client/GuiIngameForge;drawTexturedModalRect(IIIIII)V", shift = At.Shift.BEFORE, ordinal = 3)), require = 2, allow = 2)
    private void a(final GuiIngameForge guiIngameForge, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final fw fw = bb.HV.fb();
        if (!fw.eU() || !fw.dK().mp) {
            this.func_73729_b(n, n2, n3, n4, n5, n6);
        }
    }
    
    static {
        HV = ea.a(fw.class);
    }
}
