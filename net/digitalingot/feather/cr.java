// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public enum cR
{
    SINGLEPLAYER("Singleplayer", "singleplayer"), 
    MULTIPLAYER("Multiplayer", "multiplayer"), 
    COSMETICS("Cosmetics", "cosmetics"), 
    QUIT_GAME("Quit Game", "quitGame");
    
    @SerializedName("name")
    @NotNull
    private final String name;
    @SerializedName("slug")
    @NotNull
    private final String slug;
    
    private cR(final String name2, final String slug) {
        this.name = name2;
        this.slug = slug;
    }
    
    @NotNull
    public String getName() {
        return this.name;
    }
    
    @NotNull
    public String getSlug() {
        return this.slug;
    }
    
    private static /* synthetic */ cR[] $values() {
        return new cR[] { cR.SINGLEPLAYER, cR.MULTIPLAYER, cR.COSMETICS, cR.QUIT_GAME };
    }
    
    static {
        $VALUES = $values();
    }
}
