// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public class cN implements bY
{
    @SerializedName("colorPicker")
    @NotNull
    private final cP jh;
    @SerializedName("modMenu")
    @NotNull
    private final cT ji;
    @SerializedName("militaryTime")
    private boolean jj;
    @SerializedName("version")
    @NotNull
    private final String jk;
    
    public cN(@NotNull final cP jh, @NotNull final cT ji, final boolean jj, @NotNull final String jk) {
        this.jh = jh;
        this.ji = ji;
        this.jj = jj;
        this.jk = jk;
    }
    
    @NotNull
    public cP df() {
        return this.jh;
    }
    
    @NotNull
    public cT dg() {
        return this.ji;
    }
    
    public boolean dh() {
        return this.jj;
    }
    
    @NotNull
    public String di() {
        return this.jk;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.LOAD_CLIENT_PREFERENCES;
    }
}
