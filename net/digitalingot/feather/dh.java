// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.google.gson.annotations.SerializedName;

public class dH implements bY
{
    @SerializedName("client_port")
    @Nullable
    private final Integer km;
    
    public dH(@Nullable final Integer km) {
        this.km = km;
    }
    
    @Nullable
    public Integer en() {
        return this.km;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.CALLBACK;
    }
}
