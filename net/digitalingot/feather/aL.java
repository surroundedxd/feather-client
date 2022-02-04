// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import net.minecraft.client.gui.GuiScreen;

public interface al
{
    public static final ap<al> bk = aq.a(al.class, array -> p1 -> {
        for (length = array.length; i < length; ++i) {
            array[i].openScreen(guiScreen);
        }
        return guiScreen;
    });
    
    @NotNull
    GuiScreen openScreen(@NotNull final GuiScreen p0);
    
    default static {
        int length;
        int i = 0;
        final GuiScreen guiScreen;
    }
}
