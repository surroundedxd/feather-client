// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import java.awt.Color;

public class eL implements eF<Color>
{
    @NotNull
    public Color e(@NotNull final String s, @NotNull final Class<? extends Color> clazz) {
        final String[] split = s.split("/");
        if (split.length != 3 && split.length != 4) {
            throw new eS("Color input doesn't contain 3 or 4 parts");
        }
        try {
            final int int1 = Integer.parseInt(split[0]);
            final int int2 = Integer.parseInt(split[1]);
            final int int3 = Integer.parseInt(split[2]);
            if (split.length == 3) {
                return new Color(int1, int2, int3);
            }
            return new Color(int1, int2, int3, Integer.parseInt(split[3]));
        }
        catch (NumberFormatException ex) {
            throw new eS("A color component wasn't an integer", ex);
        }
        catch (IllegalArgumentException ex2) {
            throw new eS("A color component wasn't in the range [0;255]");
        }
    }
    
    @NotNull
    public String d(@NotNull final Color color) {
        return color.getRed() + "/" + color.getGreen() + "/" + color.getBlue() + "/" + color.getAlpha();
    }
}
