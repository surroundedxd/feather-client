// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

public class bN
{
    public static boolean I(final int n) {
        return (n < 0) ? it.ad(n + 100) : g.a(n);
    }
    
    public static boolean d(final int... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (!I(array[i])) {
                return false;
            }
        }
        return true;
    }
}
