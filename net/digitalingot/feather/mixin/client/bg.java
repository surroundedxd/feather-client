// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import net.minecraft.entity.player.PlayerCapabilities;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.gR;
import net.digitalingot.feather.dZ;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ EntityPlayer.class })
public class bG
{
    @Unique
    private static final dZ<gR> Io;
    
    @Redirect(method = { "moveEntityWithHeading" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/PlayerCapabilities;getFlySpeed()F"))
    public float a(final PlayerCapabilities playerCapabilities) {
        final gR gr = bG.Io.fb();
        float func_75093_a = playerCapabilities.func_75093_a();
        if (gr.eU() && gr.iI()) {
            func_75093_a *= gr.iJ();
        }
        return func_75093_a;
    }
    
    static {
        Io = ea.a(gR.class);
    }
}
