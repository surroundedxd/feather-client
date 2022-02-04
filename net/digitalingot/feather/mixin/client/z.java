// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import net.minecraft.client.settings.GameSettings;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fX;
import net.digitalingot.feather.dZ;
import net.minecraft.client.renderer.EntityRenderer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ EntityRenderer.class })
public abstract class Z
{
    @Unique
    private static final dZ<fX> HF;
    
    @Redirect(method = { "renderLevel" }, at = @At(value = "FIELD", target = "Lnet/minecraft/client/settings/GameSettings;viewBobbing:Z", opcode = 180))
    private boolean a(final GameSettings gameSettings) {
        return !Z.HF.fb().dK().pU && gameSettings.field_74336_f;
    }
    
    static {
        HF = ea.a(fX.class);
    }
}
