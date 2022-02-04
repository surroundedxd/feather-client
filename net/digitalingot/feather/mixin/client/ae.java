// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.Render;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ Render.class })
public abstract class aE
{
    @Redirect(method = { "renderLivingLabel(Lnet/minecraft/entity/Entity;Ljava/lang/String;DDDI)V" }, at = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/entity/RenderManager;playerViewX:F"))
    private float b(final RenderManager renderManager) {
        return (Minecraft.func_71410_x().field_71474_y.field_74320_O == 2) ? (-renderManager.field_78732_j) : renderManager.field_78732_j;
    }
}
