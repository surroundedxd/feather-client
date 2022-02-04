// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public class dC implements bY
{
    @SerializedName("id")
    private final int id;
    
    public dC(final int id) {
        this.id = id;
    }
    
    public int eg() {
        return this.id;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.CLOSE_P2P;
    }
}
