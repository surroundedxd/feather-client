// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import net.minecraft.client.model.ModelBiped;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fw;
import net.digitalingot.feather.dZ;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;

@Mixin({ LayerHeldItem.class })
public abstract class be implements LayerRenderer<EntityLivingBase>
{
    @Unique
    private static final dZ<fw> HV;
    @Shadow
    @Final
    private RendererLivingEntity<?> field_177206_a;
    
    @Redirect(method = { "doRenderLayer(Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/model/ModelBiped;postRenderArm(F)V", ordinal = 0), require = 1, allow = 1)
    private void a(final ModelBiped modelBiped, final float n) {
    }
    
    @Redirect(method = { "doRenderLayer(Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;translate(FFF)V", ordinal = 1), require = 1, allow = 1)
    private void i(final float n, final float n2, final float n3) {
    }
    
    @Inject(method = { "doRenderLayer(Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;translate(FFF)V", ordinal = 1, shift = At.Shift.AFTER) }, require = 1, allow = 1)
    private void a(final EntityLivingBase entityLivingBase, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final CallbackInfo callbackInfo) {
        if (!(entityLivingBase instanceof EntityPlayer)) {
            ((ModelBiped)this.field_177206_a.func_177087_b()).func_178718_a(0.0625f);
            GlStateManager.func_179109_b(-0.0625f, 0.4375f, 0.0625f);
            return;
        }
        final fw fw = be.HV.fb();
        final boolean eu = fw.eU();
        if (eu && fw.dK().ml) {
            if (((EntityPlayer)entityLivingBase).func_70632_aY()) {
                if (entityLivingBase.func_70093_af()) {
                    ((ModelBiped)this.field_177206_a.func_177087_b()).func_178718_a(0.0325f);
                    GlStateManager.func_179152_a(1.05f, 1.05f, 1.05f);
                    GlStateManager.func_179109_b(-0.58f, 0.32f, -0.07f);
                    GlStateManager.func_179114_b(-24405.0f, 137290.0f, -2009900.0f, -2654900.0f);
                }
                else {
                    ((ModelBiped)this.field_177206_a.func_177087_b()).func_178718_a(0.0325f);
                    GlStateManager.func_179152_a(1.05f, 1.05f, 1.05f);
                    GlStateManager.func_179109_b(-0.45f, 0.25f, -0.07f);
                    GlStateManager.func_179114_b(-24405.0f, 137290.0f, -2009900.0f, -2654900.0f);
                }
            }
            else {
                ((ModelBiped)this.field_177206_a.func_177087_b()).func_178718_a(0.0625f);
            }
        }
        else {
            ((ModelBiped)this.field_177206_a.func_177087_b()).func_178718_a(0.0625f);
        }
        if (!eu || !fw.dK().mm) {
            GlStateManager.func_179109_b(-0.0625f, 0.4375f, 0.0625f);
        }
        else {
            final boolean func_70632_aY = ((EntityPlayer)entityLivingBase).func_70632_aY();
            final boolean func_70093_af = entityLivingBase.func_70093_af();
            if (!func_70632_aY && !func_70093_af) {
                GlStateManager.func_179109_b(-0.0855f, 0.4775f, 0.1585f);
                GlStateManager.func_179114_b(-19.0f, 20.0f, 0.0f, -6.0f);
            }
            else if (func_70093_af && !func_70632_aY) {
                GlStateManager.func_179109_b(-0.0525f, 0.5375f, 0.0725f);
                GlStateManager.func_179114_b(16.0f, -8.0f, 0.0f, 5.0f);
                GlStateManager.func_179109_b(0.0f, 0.1f, 0.09523f);
            }
            else {
                GlStateManager.func_179109_b(-0.0625f, 0.4375f, 0.0625f);
            }
        }
    }
    
    static {
        HV = ea.a(fw.class);
    }
}
