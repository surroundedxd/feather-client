// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public class eJ implements eF<Boolean>
{
    @NotNull
    public Boolean c(@NotNull final String s, @NotNull final Class<? extends Boolean> clazz) {
        if (s.equalsIgnoreCase("true")) {
            return true;
        }
        if (s.equalsIgnoreCase("false")) {
            return false;
        }
        throw new eS("Input was neither true nor false.");
    }
    
    @NotNull
    public String d(@NotNull final Boolean b) {
        return b.toString();
    }
}
