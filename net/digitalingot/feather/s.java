// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import net.minecraft.entity.Entity;

public interface S
{
    public static final ap<S> bk = aq.a((Class<? super S>)S.class, array -> (entity, world) -> {
        for (length = array.length; i < length; ++i) {
            array[i].joinLevel(entity, world);
        }
    });
    
    void joinLevel(@NotNull final Entity p0, @NotNull final World p1);
    
    default static {
        int length;
        int i = 0;
    }
}
