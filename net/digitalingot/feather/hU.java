// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;

public class hu
{
    @SerializedName("lat")
    private final double yZ;
    @SerializedName("lon")
    private final double za;
    
    public static hu jp() {
        return jz.aM("http://ip-api.com/json/?fields=192").h(hu.class);
    }
    
    public hu(final double yz, final double za) {
        this.yZ = yz;
        this.za = za;
    }
    
    public double jq() {
        return this.yZ;
    }
    
    public double jr() {
        return this.za;
    }
}
