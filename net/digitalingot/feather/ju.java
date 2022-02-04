// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public class jU
{
    private jU() {
        throw new AssertionError();
    }
    
    public static ByteBuffer aM(final int capacity) {
        return ByteBuffer.allocateDirect(capacity).order(ByteOrder.nativeOrder());
    }
    
    static int r(final int n, final int n2) {
        return n << n2;
    }
    
    public static IntBuffer aN(final int n) {
        return aM(r(n, 2)).asIntBuffer();
    }
    
    public static FloatBuffer aO(final int n) {
        return aM(r(n, 2)).asFloatBuffer();
    }
}
