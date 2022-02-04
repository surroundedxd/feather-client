// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

public class W
{
    public static ap<b> bm;
    public static ap<a> bn;
    
    static {
        int length;
        int i = 0;
        W.bm = aq.a((Class<? super b>)b.class, array -> (n, n3, n5) -> {
            for (length = array.length; i < length; ++i) {
                array[i].mouseInput(n, n3, n5);
            }
            return;
        });
        int length2;
        int j = 0;
        W.bn = aq.a((Class<? super a>)a.class, array2 -> (n2, n4, n6, n7) -> {
            for (length2 = array2.length; j < length2; ++j) {
                array2[j].keyInput(n2, n4, n6, n7);
            }
        });
    }
    
    public interface a
    {
        void keyInput(final int p0, final int p1, final int p2, final int p3);
    }
    
    public interface b
    {
        void mouseInput(final int p0, final int p1, final int p2);
    }
}
