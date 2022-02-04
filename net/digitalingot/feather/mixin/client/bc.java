// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import java.util.Collections;
import net.minecraft.potion.PotionEffect;
import java.util.Collection;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.inventory.Container;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.gM;
import net.digitalingot.feather.dZ;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.client.gui.inventory.GuiContainer;

@Mixin({ InventoryEffectRenderer.class })
public abstract class bC extends GuiContainer
{
    @Unique
    private static final dZ<gM> Il;
    
    public bC(final Container container) {
        super(container);
    }
    
    @Redirect(method = { "updateActivePotionEffects" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/EntityPlayerSP;getActivePotionEffects()Ljava/util/Collection;", opcode = 182), require = 2, allow = 2)
    private Collection<PotionEffect> a(final EntityPlayerSP entityPlayerSP) {
        final gM gm = bC.Il.fb();
        if (gm != null && gm.eU() && gm.dK().vm) {
            return (Collection<PotionEffect>)Collections.emptySet();
        }
        return (Collection<PotionEffect>)entityPlayerSP.func_70651_bq();
    }
    
    static {
        Il = ea.a(gM.class);
    }
}
