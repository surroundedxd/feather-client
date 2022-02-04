// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.Nullable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public class cD
{
    @SerializedName("name")
    @NotNull
    private final String name;
    @SerializedName("slug")
    @NotNull
    private final String slug;
    @SerializedName("icon")
    @NotNull
    private final String icon;
    @SerializedName("category")
    @NotNull
    private final p.a Y;
    @SerializedName("form")
    @Nullable
    private final List<du> iV;
    
    public cD(@NotNull final String name, @NotNull final String slug, @NotNull final String icon, @NotNull final p.a y, @Nullable final List<du> iv) {
        this.name = name;
        this.slug = slug;
        this.icon = icon;
        this.Y = y;
        this.iV = iv;
    }
    
    @NotNull
    public String getName() {
        return this.name;
    }
    
    @NotNull
    public String getSlug() {
        return this.slug;
    }
    
    @NotNull
    public String getIcon() {
        return this.icon;
    }
    
    @NotNull
    public p.a W() {
        return this.Y;
    }
    
    @Nullable
    public List<du> cT() {
        return this.iV;
    }
}
