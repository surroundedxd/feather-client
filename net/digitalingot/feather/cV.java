// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public class cv implements bY
{
    @SerializedName("macro")
    @NotNull
    private final String iM;
    
    public cv(@NotNull final String im) {
        this.iM = im;
    }
    
    @NotNull
    public String cK() {
        return this.iM;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.DELETE_MACRO;
    }
}
