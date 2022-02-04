// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class dJ implements bY
{
    @SerializedName("sidebar")
    @NotNull
    private final Map<ec, dM> kp;
    
    public dJ(@NotNull final Map<ec, dM> kp) {
        this.kp = kp;
    }
    
    @NotNull
    public Map<ec, dM> eq() {
        return this.kp;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.LOAD_SIDEBAR_SETTINGS;
    }
}
