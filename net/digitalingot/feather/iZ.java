// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import io.netty.util.concurrent.GenericFutureListener;
import io.netty.channel.ChannelFutureListener;
import org.capnproto.FromPointerBuilder;
import org.capnproto.MessageBuilder;
import org.jetbrains.annotations.NotNull;
import io.netty.channel.Channel;

public abstract class iz
{
    @NotNull
    protected final Channel iD;
    @NotNull
    protected final ix qK;
    
    protected iz(@NotNull final Channel id, @NotNull final ix qk) {
        this.iD = id;
        this.qK = qk;
    }
    
    @NotNull
    protected iK.q.c.a c(final MessageBuilder messageBuilder) {
        return ((iK.q.a)messageBuilder.initRoot((FromPointerBuilder)iK.q.DW)).rx();
    }
    
    @NotNull
    public ix ia() {
        return this.qK;
    }
    
    protected void a(final MessageBuilder messageBuilder) {
        if (this.iD.eventLoop().inEventLoop()) {
            this.iD.writeAndFlush((Object)messageBuilder).addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
        }
        else {
            this.iD.eventLoop().submit(() -> this.iD.writeAndFlush((Object)messageBuilder).addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE));
        }
    }
}
