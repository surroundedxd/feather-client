// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class cW implements bY
{
    @SerializedName("main")
    private final List<cR> jt;
    @SerializedName("header")
    private final List<cQ> ju;
    
    public cW(@NotNull final List<cR> jt, @NotNull final List<cQ> ju) {
        this.jt = jt;
        this.ju = ju;
    }
    
    @NotNull
    public List<cR> dr() {
        return this.jt;
    }
    
    @NotNull
    public List<cQ> ds() {
        return this.ju;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.LOAD_HOMEPAGE_SELECTIONS;
    }
}
