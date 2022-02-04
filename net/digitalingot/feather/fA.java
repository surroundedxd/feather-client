// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

public enum fa
{
    @eo(fw = "black", fj = "Black")
    BLACK('0'), 
    @eo(fw = "darkBlue", fj = "Dark Blue")
    DARK_BLUE('1'), 
    @eo(fw = "darkGreen", fj = "Dark Green")
    DARK_GREEN('2'), 
    @eo(fw = "darkAqua", fj = "Dark Aqua")
    DARK_AQUA('3'), 
    @eo(fw = "darkRed", fj = "Dark Red")
    DARK_RED('4'), 
    @eo(fw = "darkPurple", fj = "Dark Purple")
    DARK_PURPLE('5'), 
    @eo(fw = "gold", fj = "Gold")
    GOLD('6'), 
    @eo(fw = "gray", fj = "Gray")
    GRAY('7'), 
    @eo(fw = "darkGray", fj = "Dark Gray")
    DARK_GRAY('8'), 
    @eo(fw = "blue", fj = "Blue")
    BLUE('9'), 
    @eo(fw = "green", fj = "Green")
    GREEN('a'), 
    @eo(fw = "aqua", fj = "Aqua")
    AQUA('b'), 
    @eo(fw = "red", fj = "Red")
    RED('c'), 
    @eo(fw = "lightPurple", fj = "Light Purple")
    LIGHT_PURPLE('d'), 
    @eo(fw = "yellow", fj = "Yellow")
    YELLOW('e'), 
    @eo(fw = "white", fj = "White")
    WHITE('f');
    
    public static final String PREFIX_CHAR = "§";
    public final char code;
    public final String toString;
    
    private fa(final char c) {
        this.code = c;
        this.toString = "§" + c;
    }
    
    private static /* synthetic */ fa[] $values() {
        return new fa[] { fa.BLACK, fa.DARK_BLUE, fa.DARK_GREEN, fa.DARK_AQUA, fa.DARK_RED, fa.DARK_PURPLE, fa.GOLD, fa.GRAY, fa.DARK_GRAY, fa.BLUE, fa.GREEN, fa.AQUA, fa.RED, fa.LIGHT_PURPLE, fa.YELLOW, fa.WHITE };
    }
    
    static {
        $VALUES = $values();
    }
}
