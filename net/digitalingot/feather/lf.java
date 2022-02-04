// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

public class lf extends ByteToMessageDecoder
{
    protected void decode(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf, final List<Object> list) {
        if (!byteBuf.isReadable()) {
            return;
        }
        final int readerIndex = byteBuf.readerIndex();
        final int unsignedInt = Short.toUnsignedInt(byteBuf.readShort());
        if (unsignedInt == 0) {
            return;
        }
        if (byteBuf.readableBytes() < unsignedInt) {
            byteBuf.readerIndex(readerIndex);
            return;
        }
        list.add(byteBuf.slice(byteBuf.readerIndex(), unsignedInt).retain());
        byteBuf.skipBytes(unsignedInt);
    }
}
