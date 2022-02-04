// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import net.digitalingot.feather.ka;
import net.minecraft.util.EnumFacing;
import net.minecraft.client.renderer.entity.RenderItem;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ RenderItem.class })
public class cF
{
    @Redirect(method = { "renderModel(Lnet/minecraft/client/resources/model/IBakedModel;ILnet/minecraft/item/ItemStack;)V" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/util/EnumFacing;values()[Lnet/minecraft/util/EnumFacing;"))
    private EnumFacing[] uO() {
        return ka.Gf;
    }
}
