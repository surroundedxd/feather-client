// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import java.awt.Color;
import com.google.gson.annotations.SerializedName;

public class eZ
{
    @SerializedName("chroma")
    private boolean lZ;
    @SerializedName("color")
    @NotNull
    private Color ma;
    
    public eZ(final boolean lz, @NotNull final Color ma) {
        this.lZ = lz;
        this.ma = ma;
    }
    
    public int gS() {
        return this.ma.getRGB();
    }
    
    public void k(final boolean lz) {
        this.lZ = lz;
    }
    
    public void e(@NotNull final Color ma) {
        this.ma = ma;
    }
    
    public boolean gT() {
        return this.lZ;
    }
    
    @NotNull
    public Color gU() {
        return this.ma;
    }
}
