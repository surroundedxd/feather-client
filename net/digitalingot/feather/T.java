// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public class t
{
    @SerializedName("slug")
    @NotNull
    private final String slug;
    
    public t(@NotNull final String slug) {
        this.slug = slug;
    }
    
    @NotNull
    public String getSlug() {
        return this.slug;
    }
}
