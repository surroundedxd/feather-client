// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public class ag
{
    public static ap<b> bo;
    public static ap<a> bp;
    public static ap<a> bw;
    
    static {
        final int length;
        int i = 0;
        final ar ar;
        ag.bo = aq.a(b.class, array -> (is, c) -> {
            length = array.length;
            while (i < length) {
                array[i].render(is, c);
                if (ar != net.digitalingot.feather.ar.PASS) {
                    return ar;
                }
                else {
                    ++i;
                }
            }
            return net.digitalingot.feather.ar.PASS;
        });
        int length2;
        int j = 0;
        ag.bp = aq.a((Class<? super a>)a.class, array2 -> (is2, c2) -> {
            for (length2 = array2.length; j < length2; ++j) {
                array2[j].render(is2, c2);
            }
            return;
        });
        int length3;
        int k = 0;
        ag.bw = aq.a((Class<? super a>)a.class, array3 -> (is3, c3) -> {
            for (length3 = array3.length; k < length3; ++k) {
                array3[k].render(is3, c3);
            }
        });
    }
    
    public enum c
    {
        ALL, 
        CROSSHAIRS, 
        FOOD;
        
        private static /* synthetic */ c[] $values() {
            return new c[] { c.ALL, c.CROSSHAIRS, c.FOOD };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    public interface a
    {
        void render(@NotNull final is p0, @NotNull final c p1);
    }
    
    public interface b
    {
        @NotNull
        ar render(@NotNull final is p0, @NotNull final c p1);
    }
}
