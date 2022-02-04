// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class cP
{
    @SerializedName("favorites")
    private List<String> jl;
    @SerializedName("lastUsed")
    private List<String> jm;
    
    public cP(final List<String> jl, final List<String> jm) {
        this.jl = jl;
        this.jm = jm;
    }
    
    public List<String> dj() {
        return this.jl;
    }
    
    public void d(final List<String> jl) {
        this.jl = jl;
    }
    
    public List<String> dk() {
        return this.jm;
    }
    
    public void e(final List<String> jm) {
        this.jm = jm;
    }
}
