// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

public class iR
{
    private static final float Er = 255.0f;
    
    public static int e(final int n, final int n2, final int n3, final int n4) {
        return (n4 & 0xFF) << 24 | (n3 & 0xFF) << 16 | (n2 & 0xFF) << 8 | (n & 0xFF);
    }
    
    public static int d(final float n, final float n2, final float n3, final float n4) {
        return e((int)(n * 255.0f), (int)(n2 * 255.0f), (int)(n3 * 255.0f), (int)(n4 * 255.0f));
    }
}
