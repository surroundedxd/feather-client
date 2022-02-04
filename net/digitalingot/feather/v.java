// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public interface V
{
    public static final ap<V> bk = aq.a((Class<? super V>)V.class, array -> s -> {
        for (length = array.length; i < length; ++i) {
            array[i].select(s);
        }
    });
    
    void select(@NotNull final String p0);
    
    default static {
        int length;
        int i = 0;
    }
}
