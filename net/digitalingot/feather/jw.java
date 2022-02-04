// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public class jW
{
    public static String h(@NotNull final String name, @NotNull final String s) {
        final String getenv = System.getenv(name);
        if (getenv != null) {
            return getenv;
        }
        return s;
    }
}
