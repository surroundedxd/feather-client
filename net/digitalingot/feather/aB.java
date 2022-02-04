// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.client.network.NetHandlerPlayClient;
import org.jetbrains.annotations.NotNull;
import net.minecraft.entity.player.EntityPlayer;

public interface ab
{
    public static final ap<ab> bq = aq.a((Class<? super ab>)ab.class, array -> (entityPlayer, netHandlerPlayClient) -> {
        if (a.bs) {
            return;
        }
        else {
            a.bs = true;
            for (length = array.length; i < length; ++i) {
                array[i].on(entityPlayer, netHandlerPlayClient);
            }
            return;
        }
    });
    public static final ap<ab> br = aq.a((Class<? super ab>)ab.class, array2 -> (entityPlayer2, netHandlerPlayClient2) -> {
        if (!(!a.bs)) {
            a.bs = false;
            for (length2 = array2.length; j < length2; ++j) {
                array2[j].on(entityPlayer2, netHandlerPlayClient2);
            }
        }
    });
    
    void on(@NotNull final EntityPlayer p0, @NotNull final NetHandlerPlayClient p1);
    
    default static {
        int length;
        int i = 0;
        int length2;
        int j = 0;
    }
    
    public static class a
    {
        private static boolean bs;
    }
}
