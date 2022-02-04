// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraftforge.common.MinecraftForge;

public interface au
{
    default void aL() {
        MinecraftForge.EVENT_BUS.register((Object)this);
    }
}
