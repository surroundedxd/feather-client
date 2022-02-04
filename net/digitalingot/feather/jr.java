// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import net.minecraftforge.fml.common.network.internal.FMLProxyPacket;
import net.minecraft.network.PacketBuffer;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import net.minecraftforge.fml.common.network.FMLEmbeddedChannel;

public class jR
{
    @Nullable
    private static FMLEmbeddedChannel FW;
    
    static void a(@NotNull final String s, @NotNull final jT jt) {
        if (!NetworkRegistry.INSTANCE.hasChannel(s, Side.CLIENT)) {
            jR.FW = NetworkRegistry.INSTANCE.newChannel(s, new ChannelHandler[] { (ChannelHandler)new a(jt) }).get(Side.CLIENT);
        }
    }
    
    static void a(@NotNull final String s, final byte[] array) {
        if (jR.FW == null) {
            throw new IllegalStateException("Channel not yet registered");
        }
        jR.FW.writeAndFlush((Object)new FMLProxyPacket(new PacketBuffer(Unpooled.wrappedBuffer(array)), s));
    }
    
    @ChannelHandler.Sharable
    static class a extends ChannelInboundHandlerAdapter
    {
        @NotNull
        private final jT FX;
        
        private a(@NotNull final jT fx) {
            this.FX = fx;
        }
        
        public void channelRead(final ChannelHandlerContext channelHandlerContext, final Object o) {
            final ByteBuf payload = ((FMLProxyPacket)o).payload();
            final byte[] array = new byte[payload.readableBytes()];
            payload.readBytes(array);
            this.FX.onMessage(array);
        }
    }
}
