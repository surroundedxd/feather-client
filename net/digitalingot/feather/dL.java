// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public class dl
{
    @SerializedName("enabled")
    private final boolean enabled;
    @SerializedName("favorite")
    private final boolean jJ;
    @SerializedName("settings")
    @NotNull
    private final eg jK;
    
    public dl(@NotNull final eg jk) {
        this.enabled = jk.dI();
        this.jJ = jk.dJ();
        this.jK = jk;
    }
    
    public boolean dI() {
        return this.enabled;
    }
    
    public boolean dJ() {
        return this.jJ;
    }
    
    @NotNull
    public eg dK() {
        return this.jK;
    }
}
