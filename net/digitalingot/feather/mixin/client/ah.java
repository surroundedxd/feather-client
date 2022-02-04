// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.minecraft.scoreboard.ScorePlayerTeam;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ Scoreboard.class })
public class aH
{
    @Inject(method = { "removeObjective" }, at = { @At("HEAD") }, cancellable = true)
    private void a(final ScoreObjective scoreObjective, final CallbackInfo callbackInfo) {
        if (scoreObjective == null) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "removeTeam" }, at = { @At("HEAD") }, cancellable = true)
    private void a(final ScorePlayerTeam scorePlayerTeam, final CallbackInfo callbackInfo) {
        if (scorePlayerTeam == null) {
            callbackInfo.cancel();
        }
    }
}
