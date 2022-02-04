// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import org.jetbrains.annotations.NotNull;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class hP extends ChannelInboundHandlerAdapter
{
    @NotNull
    private final hM Ar;
    
    public hP(@NotNull final hM ar) {
        this.Ar = ar;
    }
    
    public void channelRead(final ChannelHandlerContext channelHandlerContext, final Object o) {
        if (((hW.c.d)o).kK().kB() == hW.c.c.d.AUTH_SUCCESSFUL) {
            kr.Gh.error("Received authentication successful packet on voice control while already authenticated.");
        }
    }
}
