// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public class dy implements dz
{
    @SerializedName("dataTypes")
    @NotNull
    private final String jZ;
    @SerializedName("range")
    private final double[] ka;
    @SerializedName("step")
    @Nullable
    private final Double kb;
    
    public dy(final double n, final double n2, @Nullable final Double kb) {
        this.jZ = "decimal";
        this.ka = new double[] { n, n2 };
        this.kb = kb;
    }
    
    @NotNull
    public String dZ() {
        return this.jZ;
    }
    
    public double[] ea() {
        return this.ka;
    }
    
    @Nullable
    public Double eb() {
        return this.kb;
    }
}
