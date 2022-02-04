// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import net.minecraft.entity.Entity;

public interface ac
{
    public static final ap<ac> bt = aq.a((Class<? super ac>)ac.class, array -> entity -> {
        for (length = array.length; i < length; ++i) {
            array[i].track(entity);
        }
        return;
    });
    public static final ap<ac> bu = aq.a((Class<? super ac>)ac.class, array2 -> entity2 -> {
        for (length2 = array2.length; j < length2; ++j) {
            array2[j].track(entity2);
        }
    });
    
    void track(@NotNull final Entity p0);
    
    default static {
        int length;
        int i = 0;
        int length2;
        int j = 0;
    }
}
