// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.google.gson.annotations.SerializedName;

public class cO implements bY
{
    @SerializedName("colorPicker")
    @Nullable
    private final cP jh;
    @SerializedName("modMenu")
    @Nullable
    private final cT ji;
    
    public cO(@Nullable final cP jh, @Nullable final cT ji) {
        this.jh = jh;
        this.ji = ji;
    }
    
    @Nullable
    public cP df() {
        return this.jh;
    }
    
    @Nullable
    public cT dg() {
        return this.ji;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.UPDATE_CLIENT_PREFERENCES;
    }
}
