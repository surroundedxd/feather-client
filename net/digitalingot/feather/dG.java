// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;
import java.util.Collection;

public class dg implements bY
{
    @SerializedName("mods")
    @NotNull
    private final Collection<ec> jC;
    
    public dg(@NotNull final Collection<ec> jc) {
        this.jC = jc;
    }
    
    @NotNull
    public Collection<ec> dA() {
        return this.jC;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.DISABLED_MODS;
    }
}
