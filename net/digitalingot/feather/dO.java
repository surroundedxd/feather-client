// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public class do implements bY
{
    @SerializedName("profile")
    @NotNull
    private final String jL;
    
    public do(@NotNull final String jl) {
        this.jL = jl;
    }
    
    @NotNull
    public String dL() {
        return this.jL;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.DELETE_MOD_PROFILE;
    }
}
