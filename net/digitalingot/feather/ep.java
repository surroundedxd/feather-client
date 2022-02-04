// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public class eP implements eF<Integer>
{
    @NotNull
    public Integer i(@NotNull final String s, @NotNull final Class<? extends Integer> clazz) {
        try {
            return Integer.parseInt(s);
        }
        catch (NumberFormatException ex) {
            throw new eS(ex);
        }
    }
    
    @NotNull
    public String e(@NotNull final Integer n) {
        return n.toString();
    }
}
