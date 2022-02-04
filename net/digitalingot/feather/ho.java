// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import io.netty.channel.nio.NioEventLoopGroup;
import java.util.concurrent.TimeUnit;
import java.util.Objects;
import io.netty.channel.ChannelHandler;
import org.capnproto.FromPointerBuilder;
import org.capnproto.MessageBuilder;
import io.netty.channel.Channel;
import org.jetbrains.annotations.NotNull;

public class hO extends hN
{
    @NotNull
    private final hA zi;
    
    public hO(@NotNull final Channel channel, @NotNull final hA zi) {
        super(channel);
        this.zi = zi;
    }
    
    public void au(@NotNull final String s) {
        kr.Gh.debug("Authenticating with voice backend...");
        final MessageBuilder messageBuilder = new MessageBuilder();
        ((hX.d.a)messageBuilder.initRoot((FromPointerBuilder)hX.d.AK)).kV().la().av(s);
        this.a(messageBuilder);
    }
    
    public void T(final int n) {
        kr.Gh.info("Authenticated with voice backend");
        final hM hm = new hM(this.zi, this.iD, n);
        this.zi.a(hm);
        this.iD.pipeline().replace("unauthenticated-handler", "authenticated-handler", (ChannelHandler)new hP(hm));
        final NioEventLoopGroup jd = this.zi.jD();
        final hA zi = this.zi;
        Objects.requireNonNull(zi);
        jd.schedule(zi::jA, 3L, TimeUnit.SECONDS);
        this.zi.jH().jy();
        hm.kl();
    }
}
