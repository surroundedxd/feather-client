// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import net.minecraft.client.gui.GuiScreen;

public interface am
{
    public static final ap<am> bv = aq.a((Class<? super am>)am.class, array -> guiScreen -> {
        for (length = array.length; i < length; ++i) {
            array[i].render(guiScreen);
        }
    });
    
    void render(@NotNull final GuiScreen p0);
    
    default static {
        int length;
        int i = 0;
    }
}
