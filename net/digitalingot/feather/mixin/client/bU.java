// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import net.digitalingot.feather.aS;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fC;
import net.digitalingot.feather.dZ;
import net.minecraft.client.renderer.entity.layers.LayerArmorBase;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;

@Mixin({ LayerArmorBase.class })
public abstract class bu implements LayerRenderer<EntityLivingBase>
{
    @Unique
    private static final dZ<fC> Ig;
    @Unique
    private ItemStack Ih;
    
    public bu() {
        this.Ih = null;
    }
    
    @ModifyArgs(method = { "renderLayer(Lnet/minecraft/entity/EntityLivingBase;FFFFFFFI)V" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemArmor;getColor(Lnet/minecraft/item/ItemStack;)I", ordinal = 0), allow = 1)
    private void b(final Args args) {
        this.Ih = (ItemStack)args.get((int)(aS.aN() ? 1 : 0));
    }
    
    @ModifyArgs(method = { "renderGlint" }, slice = @Slice(from = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;disableLighting()V", ordinal = 0)), at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;color(FFFF)V", ordinal = 0), require = 1, allow = 1)
    private void c(final Args args) {
        final fC fc = bu.Ig.fb();
        if (fc != null && fc.eU()) {
            final int d = fc.d(this.Ih);
            args.set(0, (Object)((d >> 16 & 0xFF) / 255.0f));
            args.set(1, (Object)((d >> 8 & 0xFF) / 255.0f));
            args.set(2, (Object)((d & 0xFF) / 255.0f));
            args.set(3, (Object)((d >> 24 & 0xFF) / 255.0f));
        }
    }
    
    static {
        Ig = ea.a(fC.class);
    }
}
