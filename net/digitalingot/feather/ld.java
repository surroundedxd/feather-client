// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.capnproto.SerializePacked;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import org.capnproto.MessageBuilder;
import io.netty.handler.codec.MessageToByteEncoder;

public class ld extends MessageToByteEncoder<MessageBuilder>
{
    protected void a(final ChannelHandlerContext channelHandlerContext, final MessageBuilder messageBuilder, final ByteBuf byteBuf) {
        SerializePacked.writeToUnbuffered((WritableByteChannel)new a(byteBuf), messageBuilder);
    }
    
    static class a implements WritableByteChannel
    {
        private final ByteBuf HD;
        
        public a(final ByteBuf hd) {
            this.HD = hd;
        }
        
        @Override
        public int write(final ByteBuffer byteBuffer) {
            final int writerIndex = this.HD.writerIndex();
            this.HD.writeBytes(byteBuffer);
            return this.HD.writerIndex() - writerIndex;
        }
        
        @Override
        public boolean isOpen() {
            return true;
        }
        
        @Override
        public void close() {
        }
    }
}
