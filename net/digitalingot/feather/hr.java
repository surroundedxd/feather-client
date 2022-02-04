// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import org.jetbrains.annotations.NotNull;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class hR extends ChannelInboundHandlerAdapter
{
    @NotNull
    private final hO As;
    
    public hR(@NotNull final hO as) {
        this.As = as;
    }
    
    public void channelRead(final ChannelHandlerContext channelHandlerContext, final Object o) {
        final hW.c.d d = (hW.c.d)o;
        if (d.kK().kB() != hW.c.c.d.AUTH_SUCCESSFUL) {
            kr.Gh.error("received packet type {} while still unauthenticated", new Object[] { d.kK() });
            return;
        }
        this.As.T(d.kK().kJ().km());
    }
}
