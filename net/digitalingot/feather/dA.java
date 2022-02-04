// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public class da implements bY
{
    @SerializedName("selection")
    @NotNull
    private final String jy;
    
    public da(@NotNull final String jy) {
        this.jy = jy;
    }
    
    @NotNull
    public String dw() {
        return this.jy;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.PRESS_BUTTON;
    }
}
