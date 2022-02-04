// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.client.gui.GuiScreen;

public interface ak
{
    public static final ap<ak> bv = aq.a((Class<? super ak>)ak.class, array -> guiScreen -> {
        for (length = array.length; i < length; ++i) {
            array[i].postInitialization(guiScreen);
        }
    });
    
    void postInitialization(final GuiScreen p0);
    
    default static {
        int length;
        int i = 0;
    }
}
