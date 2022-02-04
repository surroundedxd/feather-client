// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public class dM
{
    @SerializedName("settings")
    @NotNull
    private final eg jK;
    
    public dM(@NotNull final eg jk) {
        this.jK = jk;
    }
    
    @NotNull
    public eg dK() {
        return this.jK;
    }
}
