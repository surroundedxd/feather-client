// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public class dt
{
    @SerializedName("slug")
    @NotNull
    private final String slug;
    @SerializedName("name")
    @NotNull
    private final String name;
    
    public dt(@NotNull final String slug, @NotNull final String name) {
        this.slug = slug;
        this.name = name;
    }
    
    @NotNull
    public String getSlug() {
        return this.slug;
    }
    
    @NotNull
    public String getName() {
        return this.name;
    }
}
