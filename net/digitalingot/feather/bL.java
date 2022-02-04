// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public class bl
{
    @SerializedName("updateClientPreferences")
    @NotNull
    private cT cf;
    @SerializedName("colorPickerPreferences")
    @NotNull
    private cP cg;
    
    public bl(@NotNull final cT cf, @NotNull final cP cg) {
        this.cf = cf;
        this.cg = cg;
    }
    
    @NotNull
    public cT be() {
        return this.cf;
    }
    
    public void a(@NotNull final cT cf) {
        this.cf = cf;
    }
    
    @NotNull
    public cP bf() {
        return this.cg;
    }
    
    public void a(@NotNull final cP cg) {
        this.cg = cg;
    }
}
