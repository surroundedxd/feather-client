// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;

public abstract class eg
{
    @ex(fw = "hudSelection", fj = "Hud Selection", fY = "true", fo = @es(fU = -2))
    public boolean lf;
    @ex(fw = "enabled", fj = "Enabled", fo = @es(fU = -10))
    public transient boolean enabled;
    @SerializedName("favorite")
    public transient boolean jJ;
    
    public boolean dI() {
        return this.enabled;
    }
    
    public Boolean fp() {
        return false;
    }
    
    public boolean dJ() {
        return this.jJ;
    }
}
