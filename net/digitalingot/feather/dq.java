// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public class dQ implements bY
{
    @SerializedName("create")
    private final boolean kv;
    @SerializedName("nextFields")
    @NotNull
    private final a kw;
    
    public dQ(final boolean kv, @NotNull final a kw) {
        this.kv = kv;
        this.kw = kw;
    }
    
    public boolean ew() {
        return this.kv;
    }
    
    @NotNull
    public a ex() {
        return this.kw;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.OPEN_WAYPOINTS_MENU;
    }
    
    public static class a
    {
        @SerializedName("location")
        @NotNull
        private final ia.a kx;
        @SerializedName("color")
        @NotNull
        private final eZ ky;
        
        public a(@NotNull final ia.a kx, @NotNull final eZ ky) {
            this.kx = kx;
            this.ky = ky;
        }
        
        @NotNull
        public ia.a ey() {
            return this.kx;
        }
        
        @NotNull
        public eZ ez() {
            return this.ky;
        }
    }
}
