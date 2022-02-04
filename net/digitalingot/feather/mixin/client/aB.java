// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.digitalingot.feather.iM;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.GlStateManager;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.network.NetworkPlayerInfo;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.gL;
import net.digitalingot.feather.dZ;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.client.gui.Gui;

@Mixin({ GuiPlayerTabOverlay.class })
public abstract class ab extends Gui
{
    @Unique
    private static final dZ<gL> HH;
    
    @Inject(method = { "drawPing" }, at = { @At("HEAD") }, cancellable = true, require = 1, allow = 1)
    private void a(final int n, final int n2, final int n3, final NetworkPlayerInfo networkPlayerInfo, final CallbackInfo callbackInfo) {
        final gL gl = ab.HH.fb();
        if (gl == null || !gl.eU()) {
            return;
        }
        final gL.a a = gl.dK();
        if (!a.uZ) {
            return;
        }
        callbackInfo.cancel();
        final int func_178853_c = networkPlayerInfo.func_178853_c();
        if (func_178853_c == 0) {
            return;
        }
        final String value = String.valueOf(func_178853_c);
        final int n4 = (int)((n2 + n - 14) / 0.6f);
        final int n5 = (int)(n3 / 0.6f) + 1;
        int n6;
        if (a.va) {
            n6 = gl.S(func_178853_c);
        }
        else {
            n6 = a.vb.getRGB();
        }
        GlStateManager.func_179094_E();
        GL11.glTranslatef(0.0f, 1.0f, 0.0f);
        GL11.glScalef(0.6f, 0.6f, 0.6f);
        iM.sU().a(value, (float)n4, (float)n5, n6, true, false);
        GlStateManager.func_179121_F();
    }
    
    static {
        HH = ea.a(gL.class);
    }
}
