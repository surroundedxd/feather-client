// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class cB implements bY
{
    @SerializedName("cosmetics")
    @NotNull
    private final List<String> al;
    
    public cB(@NotNull final List<String> al) {
        this.al = al;
    }
    
    @NotNull
    public List<String> af() {
        return this.al;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.RESET_COSMETICS_SETTINGS;
    }
}
