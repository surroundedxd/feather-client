// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.Minecraft;
import net.digitalingot.feather.ab;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.util.IChatComponent;
import io.netty.channel.Channel;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.network.EnumConnectionState;
import io.netty.util.AttributeKey;
import net.minecraft.network.NetworkManager;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ NetworkManager.class })
public class aP
{
    @Shadow
    @Final
    public static AttributeKey<EnumConnectionState> field_150739_c;
    @Shadow
    private Channel field_150746_k;
    
    @Inject(method = { "closeChannel" }, at = { @At(value = "INVOKE", target = "Lio/netty/channel/Channel;close()Lio/netty/channel/ChannelFuture;", remap = false) })
    public void a(final IChatComponent chatComponent, final CallbackInfo callbackInfo) {
        if (this.field_150746_k.attr((AttributeKey)aP.field_150739_c).get() != EnumConnectionState.PLAY) {
            return;
        }
        ab.br.aH().on((EntityPlayer)Minecraft.func_71410_x().field_71439_g, Minecraft.func_71410_x().func_147114_u());
    }
}
