// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jitsi.impl.neomedia.codec.audio.opus.Opus;
import java.io.Closeable;

public class hG implements Closeable
{
    private final long Ah;
    
    public hG() {
        this.Ah = Opus.decoder_create(24000, 1);
        if (this.Ah == 0L) {
            throw new IllegalStateException("Error on creating opus decoder");
        }
    }
    
    public byte[] a(final byte[] array) {
        final byte[] array2 = new byte[960];
        int length;
        byte[] array3;
        if (array == null || array.length == 0) {
            length = 0;
            array3 = null;
        }
        else {
            length = array.length;
            array3 = array;
        }
        final int decode = Opus.decode(this.Ah, array3, 0, length, array2, 0, 480, 0);
        if (decode < 0) {
            throw new IllegalStateException("Failed to decode audio data");
        }
        final byte[] array4 = new byte[decode * 2];
        System.arraycopy(array2, 0, array4, 0, decode * 2);
        return array4;
    }
    
    @Override
    public void close() {
        Opus.decoder_destroy(this.Ah);
    }
}
