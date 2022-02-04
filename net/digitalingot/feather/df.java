// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import java.util.UUID;
import com.google.gson.annotations.SerializedName;

public class dF implements bY
{
    @SerializedName("id")
    private final int id;
    @SerializedName("target")
    @NotNull
    private final UUID kj;
    
    public dF(final int id, @NotNull final UUID kj) {
        this.id = id;
        this.kj = kj;
    }
    
    public int eg() {
        return this.id;
    }
    
    @NotNull
    public UUID ek() {
        return this.kj;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.REQUEST_P2P_JOIN;
    }
}
