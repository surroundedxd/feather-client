// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public class eO implements eF<Float>
{
    @NotNull
    public Float h(@NotNull final String s, @NotNull final Class<? extends Float> clazz) {
        try {
            return Float.parseFloat(s);
        }
        catch (NumberFormatException ex) {
            throw new eS(ex);
        }
    }
    
    @NotNull
    public String a(@NotNull final Float n) {
        return n.toString();
    }
}
