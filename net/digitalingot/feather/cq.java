// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public enum cQ
{
    MC_SETTINGS("MC Settings", "mcSettings", "https://assets.feathercdn.net/game/homepageicons/settings.svg"), 
    REALMS("Minecraft Realms", "mcRealms", "https://assets.feathercdn.net/game/homepageicons/realms.svg"), 
    REPLAY_MOD("Replay Mod", "replayMod", "https://assets.feathercdn.net/game/homepageicons/replaymod.svg");
    
    @SerializedName("name")
    @NotNull
    private final String name;
    @SerializedName("slug")
    @NotNull
    private final String slug;
    @SerializedName("icon")
    @NotNull
    private final String icon;
    
    private cQ(@NotNull final String name2, final String slug, final String icon) {
        this.name = name2;
        this.slug = slug;
        this.icon = icon;
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
    
    private static /* synthetic */ cQ[] $values() {
        return new cQ[] { cQ.MC_SETTINGS, cQ.REALMS, cQ.REPLAY_MOD };
    }
    
    static {
        $VALUES = $values();
    }
}
