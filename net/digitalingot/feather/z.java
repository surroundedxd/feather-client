// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public interface Z
{
    public static final ap<Z> bk = aq.a((Class<? super Z>)Z.class, array -> (dw, b) -> {
        for (length = array.length; i < length; ++i) {
            array[i].loadedStateChange(dw, b);
        }
    });
    
    void loadedStateChange(@NotNull final dW<?> p0, final boolean p1);
    
    default static {
        int length;
        int i = 0;
    }
}
