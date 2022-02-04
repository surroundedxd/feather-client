// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.awt.Color;
import org.jetbrains.annotations.NotNull;
import java.util.regex.Pattern;

public class jV
{
    public static final char Gc = '§';
    private static final Pattern Gd;
    
    private jV() {
    }
    
    public static eZ a(@NotNull final eZ ez, @NotNull final eZ ez2, float o) {
        o = ks.o(o);
        if (ez.gT() && ez2.gT()) {
            return new eZ(true, ez.gU());
        }
        return new eZ(false, a(ez.gT() ? new Color(iM.sU().sW(), true) : ez.gU(), ez2.gT() ? new Color(iM.sU().sW(), true) : ez2.gU(), o));
    }
    
    public static Color a(@NotNull final Color color, @NotNull final Color color2, float o) {
        o = ks.o(o);
        return new Color((int)(color.getRed() + (color2.getRed() - color.getRed()) * o), (int)(color.getGreen() + (color2.getGreen() - color.getGreen()) * o), (int)(color.getBlue() + (color2.getBlue() - color.getBlue()) * o), (int)(color.getAlpha() + (color2.getAlpha() - color.getAlpha()) * o));
    }
    
    public static String aS(final String input) {
        if (input == null) {
            return null;
        }
        return jV.Gd.matcher(input).replaceAll("");
    }
    
    static {
        Gd = Pattern.compile("(?i)§[0-9A-FK-OR]");
    }
}
