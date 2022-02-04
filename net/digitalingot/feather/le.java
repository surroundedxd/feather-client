// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class le
{
    public static class a extends ChannelInboundHandlerAdapter
    {
        public void exceptionCaught(final ChannelHandlerContext channelHandlerContext, final Throwable t) {
            kr.Gh.error("Error during an inbound netty operation", t);
        }
    }
    
    public static class b extends ChannelOutboundHandlerAdapter
    {
        public void exceptionCaught(final ChannelHandlerContext channelHandlerContext, final Throwable t) {
            kr.Gh.error("Error during an outbound netty operation", t);
        }
    }
}
