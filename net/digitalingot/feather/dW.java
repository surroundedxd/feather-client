// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class dw implements dz
{
    @SerializedName("columns")
    private final int jX;
    @SerializedName("choices")
    @NotNull
    private final List<dt> jY;
    
    public dw(final int jx, @NotNull final List<dt> jy) {
        this.jX = jx;
        this.jY = jy;
    }
    
    public int dX() {
        return this.jX;
    }
    
    @NotNull
    public List<dt> dY() {
        return this.jY;
    }
}
