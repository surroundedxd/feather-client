// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.nio.ByteBuffer;
import org.capnproto.MessageReader;
import io.netty.handler.codec.CorruptedFrameException;
import java.nio.channels.ReadableByteChannel;
import org.capnproto.SerializePacked;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;
import io.netty.channel.socket.DatagramPacket;
import io.netty.handler.codec.MessageToMessageDecoder;

public class lc extends MessageToMessageDecoder<Object>
{
    public boolean acceptInboundMessage(final Object o) {
        if (o instanceof DatagramPacket) {
            return this.acceptInboundMessage(((DatagramPacket)o).content());
        }
        return o instanceof ByteBuf;
    }
    
    protected void decode(final ChannelHandlerContext channelHandlerContext, final Object o, final List<Object> list) {
        ByteBuf byteBuf;
        if (o instanceof ByteBuf) {
            byteBuf = (ByteBuf)o;
        }
        else {
            if (!(o instanceof DatagramPacket)) {
                throw new IllegalArgumentException("Unsupported message type: " + o.getClass().getName());
            }
            byteBuf = (ByteBuf)((DatagramPacket)o).content();
        }
        if (!byteBuf.isReadable()) {
            return;
        }
        MessageReader fromUnbuffered;
        try {
            fromUnbuffered = SerializePacked.readFromUnbuffered((ReadableByteChannel)new a(byteBuf));
        }
        catch (Exception ex) {
            throw new CorruptedFrameException("Error decoding", (Throwable)ex);
        }
        if (byteBuf.isReadable()) {
            throw new CorruptedFrameException("Did not read full packet");
        }
        list.add(fromUnbuffered);
    }
    
    private static class a implements ReadableByteChannel
    {
        private final ByteBuf HC;
        
        public a(final ByteBuf hc) {
            this.HC = hc;
        }
        
        @Override
        public int read(final ByteBuffer byteBuffer) {
            final int readerIndex = this.HC.readerIndex();
            final int remaining = byteBuffer.remaining();
            final int readableBytes = this.HC.readableBytes();
            if (remaining > readableBytes) {
                byteBuffer.limit(readableBytes);
            }
            this.HC.readBytes(byteBuffer);
            byteBuffer.limit(remaining);
            return this.HC.readerIndex() - readerIndex;
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
