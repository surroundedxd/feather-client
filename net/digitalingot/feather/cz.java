// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class cZ implements bY
{
    @SerializedName("pages")
    @NotNull
    private final List<cU> jx;
    
    public cZ(@NotNull final List<cU> jx) {
        this.jx = jx;
    }
    
    @NotNull
    public List<cU> dv() {
        return this.jx;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.PAGE_UPDATE;
    }
}
