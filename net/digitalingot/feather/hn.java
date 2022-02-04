// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import io.netty.channel.ChannelFuture;
import org.capnproto.MessageBuilder;
import org.jetbrains.annotations.NotNull;
import io.netty.channel.Channel;

public class hN
{
    @NotNull
    protected final Channel iD;
    
    public hN(@NotNull final Channel id) {
        this.iD = id;
    }
    
    protected void a(final MessageBuilder messageBuilder) {
        this.iD.eventLoop().submit(() -> this.iD.writeAndFlush((Object)messageBuilder));
    }
    
    @NotNull
    public Channel kn() {
        return this.iD;
    }
}
