// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToByteEncoder;

public class lg extends MessageToByteEncoder<ByteBuf>
{
    protected void a(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf, final ByteBuf byteBuf2) {
        final int readableBytes = byteBuf.readableBytes();
        byteBuf2.ensureWritable(2 + readableBytes);
        byteBuf2.writeShort(readableBytes);
        byteBuf2.writeBytes(byteBuf, byteBuf.readerIndex(), readableBytes);
    }
}
