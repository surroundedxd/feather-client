// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;

public enum cU
{
    @SerializedName("homepage")
    HOMEPAGE, 
    @SerializedName("mods")
    MODS, 
    @SerializedName("hudSelection")
    HUD_SELECTION;
    
    private static /* synthetic */ cU[] $values() {
        return new cU[] { cU.HOMEPAGE, cU.MODS, cU.HUD_SELECTION };
    }
    
    static {
        $VALUES = $values();
    }
}
