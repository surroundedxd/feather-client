// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.digitalingot.feather.is;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.scoreboard.ScoreObjective;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.gO;
import net.digitalingot.feather.dZ;
import net.minecraft.client.gui.GuiIngame;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ GuiIngame.class })
public class bD
{
    @Unique
    private static final dZ<gO> Im;
    
    @Inject(method = { "renderScoreboard" }, at = { @At("HEAD") }, cancellable = true)
    protected void a(final ScoreObjective scoreObjective, final ScaledResolution scaledResolution, final CallbackInfo callbackInfo) {
        callbackInfo.cancel();
        bD.Im.fb().i(new is());
    }
    
    static {
        Im = ea.a(gO.class);
    }
}
