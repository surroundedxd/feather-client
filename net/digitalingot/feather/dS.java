// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public class ds implements bY
{
    @SerializedName("profile")
    @NotNull
    private final String jL;
    
    public ds(@NotNull final String jl) {
        this.jL = jl;
    }
    
    @NotNull
    public String dL() {
        return this.jL;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.SELECT_MOD_PROFILE;
    }
}
