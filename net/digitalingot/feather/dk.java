// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class dK implements bY
{
    @SerializedName("sidebar")
    @NotNull
    private final List<ec> kq;
    
    public dK(@NotNull final List<ec> kq) {
        this.kq = kq;
    }
    
    @NotNull
    public List<ec> er() {
        return this.kq;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.RESET_SIDEBAR_SETTINGS;
    }
}
