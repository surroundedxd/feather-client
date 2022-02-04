// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

public class aQ
{
    private static boolean bQ;
    
    public static boolean aN() {
        return aQ.bQ;
    }
    
    static {
        try {
            Class.forName("gg.essential.Essential");
            aQ.bQ = true;
        }
        catch (ClassNotFoundException ex) {
            aQ.bQ = false;
        }
    }
}
