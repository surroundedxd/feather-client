// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import java.util.List;

public class n
{
    private final int R;
    @NotNull
    private final List<a> S;
    
    public n(final int r, @NotNull final List<a> s) {
        this.R = r;
        this.S = s;
    }
    
    public int P() {
        return this.R;
    }
    
    @NotNull
    public List<a> Q() {
        return this.S;
    }
    
    public static class a
    {
        @SerializedName("id")
        @NotNull
        private final UUID T;
        @SerializedName("mcID")
        @NotNull
        private final UUID U;
        @SerializedName("mcUsername")
        @NotNull
        private final String V;
        
        public a(@NotNull final UUID t, @NotNull final UUID u, @NotNull final String v) {
            this.T = t;
            this.U = u;
            this.V = v;
        }
        
        @NotNull
        public UUID R() {
            return this.T;
        }
        
        @NotNull
        public UUID S() {
            return this.U;
        }
        
        @NotNull
        public String T() {
            return this.V;
        }
    }
}
