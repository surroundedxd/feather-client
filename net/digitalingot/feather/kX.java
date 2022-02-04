// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.nio.ByteBuffer;
import java.util.UUID;

public class kx
{
    public static byte[] r(final UUID uuid) {
        final ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }
    
    public static UUID o(final byte[] array) {
        long mostSigBits = 0L;
        long leastSigBits = 0L;
        for (int i = 0; i < 8; ++i) {
            mostSigBits = (mostSigBits << 8 | (long)(array[i] & 0xFF));
        }
        for (int j = 8; j < 16; ++j) {
            leastSigBits = (leastSigBits << 8 | (long)(array[j] & 0xFF));
        }
        return new UUID(mostSigBits, leastSigBits);
    }
}
