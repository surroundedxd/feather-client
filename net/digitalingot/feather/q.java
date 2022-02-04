// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import net.minecraft.util.IChatComponent;

public interface Q
{
    public static final ap<Q> bk = aq.a((Class<? super Q>)Q.class, array -> p1 -> {
        length = array.length;
        while (i < length) {
            array[i].receiveMessage(chatComponent);
            if (chatComponent == null) {
                return null;
            }
            else {
                ++i;
            }
        }
        return chatComponent;
    });
    
    @Nullable
    IChatComponent receiveMessage(@NotNull final IChatComponent p0);
    
    default static {
        final int length;
        int i = 0;
        final IChatComponent chatComponent;
    }
}
