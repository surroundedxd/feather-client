// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import net.digitalingot.feather.x;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.layers.LayerCape;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ LayerCape.class })
public class b
{
    @Inject(method = { "doRenderLayer(Lnet/minecraft/client/entity/AbstractClientPlayer;FFFFFFF)V" }, at = { @At("HEAD") }, cancellable = true, require = 1, allow = 1)
    private void a(final AbstractClientPlayer abstractClientPlayer, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final CallbackInfo callbackInfo) {
        if (abstractClientPlayer.func_82150_aj()) {
            return;
        }
        if (!x.az.b(abstractClientPlayer.func_110124_au())) {
            return;
        }
        callbackInfo.cancel();
        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.func_179094_E();
        GlStateManager.func_179109_b(0.0f, 0.0f, 0.125f);
        final double n8 = abstractClientPlayer.field_71091_bM + (abstractClientPlayer.field_71094_bP - abstractClientPlayer.field_71091_bM) * n3 - (abstractClientPlayer.field_70169_q + (abstractClientPlayer.field_70165_t - abstractClientPlayer.field_70169_q) * n3);
        final double n9 = abstractClientPlayer.field_71096_bN + (abstractClientPlayer.field_71095_bQ - abstractClientPlayer.field_71096_bN) * n3 - (abstractClientPlayer.field_70167_r + (abstractClientPlayer.field_70163_u - abstractClientPlayer.field_70167_r) * n3);
        final double n10 = abstractClientPlayer.field_71097_bO + (abstractClientPlayer.field_71085_bR - abstractClientPlayer.field_71097_bO) * n3 - (abstractClientPlayer.field_70166_s + (abstractClientPlayer.field_70161_v - abstractClientPlayer.field_70166_s) * n3);
        final float n11 = abstractClientPlayer.field_70760_ar + (abstractClientPlayer.field_70761_aq - abstractClientPlayer.field_70760_ar) * n3;
        final double n12 = MathHelper.func_76126_a(n11 * 0.017453292f);
        final double n13 = -MathHelper.func_76134_b(n11 * 0.017453292f);
        final float func_76131_a = MathHelper.func_76131_a((float)n9 * 10.0f, -6.0f, 32.0f);
        float n14 = (float)(n8 * n12 + n10 * n13) * 100.0f;
        final float n15 = (float)(n8 * n13 - n10 * n12) * 100.0f;
        if (n14 < 0.0f) {
            n14 = 0.0f;
        }
        float n16 = func_76131_a + MathHelper.func_76126_a((abstractClientPlayer.field_70141_P + (abstractClientPlayer.field_70140_Q - abstractClientPlayer.field_70141_P) * n3) * 6.0f) * 32.0f * (abstractClientPlayer.field_71107_bF + (abstractClientPlayer.field_71109_bG - abstractClientPlayer.field_71107_bF) * n3);
        if (abstractClientPlayer.func_70093_af()) {
            n16 += 25.0f;
        }
        GlStateManager.func_179114_b(6.0f + n14 / 2.0f + n16, 1.0f, 0.0f, 0.0f);
        GlStateManager.func_179114_b(n15 / 2.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.func_179114_b(-n15 / 2.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.func_179114_b(180.0f, 0.0f, 1.0f, 0.0f);
        if (abstractClientPlayer.func_70093_af()) {
            GlStateManager.func_179109_b(0.0f, 0.115625f, 0.0875f);
        }
        x.az.c(abstractClientPlayer.func_110124_au());
        GlStateManager.func_179121_F();
    }
}
