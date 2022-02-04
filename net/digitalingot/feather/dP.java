// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class dp implements bY
{
    @SerializedName("mods")
    @NotNull
    private final Map<ec, dl> jN;
    
    public dp(@NotNull final Map<ec, dl> jn) {
        this.jN = jn;
    }
    
    @NotNull
    public Map<ec, dl> dN() {
        return this.jN;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.LOAD_MOD_PROFILE;
    }
}
