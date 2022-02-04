// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public enum cS
{
    HUD_EDITOR("hudEditor");
    
    @SerializedName("slug")
    @NotNull
    private final String slug;
    
    private cS(final String slug) {
        this.slug = slug;
    }
    
    @NotNull
    public String getSlug() {
        return this.slug;
    }
    
    private static /* synthetic */ cS[] $values() {
        return new cS[] { cS.HUD_EDITOR };
    }
    
    static {
        $VALUES = $values();
    }
}
