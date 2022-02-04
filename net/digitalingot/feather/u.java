// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

public interface U
{
    public static final ap<U> bk = aq.a(U.class, array -> (n, p2) -> {
        for (length = array.length; i < length; ++i) {
            array[i].updateFOV(n, n2);
        }
        return n2;
    });
    
    float updateFOV(final float p0, final float p1);
    
    default static {
        int length;
        int i = 0;
        final float n2;
    }
}
