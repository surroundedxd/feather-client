// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jitsi.impl.neomedia.codec.audio.opus.Opus;
import java.io.Closeable;

public class hH implements Closeable
{
    private final long Ai;
    
    public hH() {
        this.Ai = Opus.encoder_create(24000, 1);
        if (this.Ai == 0L) {
            throw new IllegalStateException("Error on creating opus encoder");
        }
    }
    
    public byte[] b(final byte[] array) {
        final byte[] array2 = new byte[1276];
        final int encode = Opus.encode(this.Ai, array, 0, 480, array2, 0, array2.length);
        if (encode < 0) {
            throw new IllegalStateException("Failed to encode audio data");
        }
        final byte[] array3 = new byte[encode];
        System.arraycopy(array2, 0, array3, 0, encode);
        return array3;
    }
    
    @Override
    public void close() {
        Opus.encoder_destroy(this.Ai);
    }
}
