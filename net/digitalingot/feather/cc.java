// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.google.gson.annotations.SerializedName;

public class cC implements bY
{
    @SerializedName("settings")
    @Nullable
    private final a iS;
    @SerializedName("equipped")
    @Nullable
    private final b iT;
    
    public cC(@Nullable final a is, @Nullable final b it) {
        this.iS = is;
        this.iT = it;
    }
    
    @Nullable
    public a cQ() {
        return this.iS;
    }
    
    @Nullable
    public b cR() {
        return this.iT;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.UPDATE_COSMETICS;
    }
    
    public static class a
    {
        @SerializedName("cosmetic")
        @NotNull
        private final String slug;
        @SerializedName("settings")
        @NotNull
        private final L iU;
        
        public a(@NotNull final String slug, @NotNull final L iu) {
            this.slug = slug;
            this.iU = iu;
        }
        
        @NotNull
        public String getSlug() {
            return this.slug;
        }
        
        @NotNull
        public L cS() {
            return this.iU;
        }
    }
    
    public static class b extends HashMap<p.a, String>
    {
    }
}
