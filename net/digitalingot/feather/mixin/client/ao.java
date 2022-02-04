// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.entity.player.EntityPlayer;
import net.digitalingot.feather.ab;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.network.play.server.S01PacketJoinGame;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ NetHandlerPlayClient.class })
public class aO
{
    @Shadow
    private Minecraft field_147299_f;
    
    @Inject(method = { "handleJoinGame" }, at = { @At("TAIL") })
    public void a(final S01PacketJoinGame s01PacketJoinGame, final CallbackInfo callbackInfo) {
        ab.bq.aH().on((EntityPlayer)this.field_147299_f.field_71439_g, (NetHandlerPlayClient)this);
    }
}
