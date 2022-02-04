// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public class du
{
    @SerializedName("type")
    @NotNull
    private final a jQ;
    @SerializedName("name")
    @NotNull
    private final String name;
    @SerializedName("slug")
    @Nullable
    private final String slug;
    @SerializedName("parent")
    @Nullable
    private final dv jR;
    @SerializedName("value")
    @Nullable
    private final dz jS;
    @SerializedName("chroma")
    @Nullable
    private final Boolean jT;
    @SerializedName("opacity")
    @Nullable
    private final Boolean jU;
    
    public du(@NotNull final a jq, @NotNull final String name, @Nullable final String slug, @Nullable final dv jr, @Nullable final dz js, @Nullable final Boolean jt, @Nullable final Boolean ju) {
        this.jQ = jq;
        this.name = name;
        this.slug = slug;
        this.jR = jr;
        this.jS = js;
        this.jT = jt;
        this.jU = ju;
    }
    
    @NotNull
    public a dQ() {
        return this.jQ;
    }
    
    @NotNull
    public String getName() {
        return this.name;
    }
    
    @Nullable
    public String getSlug() {
        return this.slug;
    }
    
    @Nullable
    public dv dR() {
        return this.jR;
    }
    
    @Nullable
    public dz dS() {
        return this.jS;
    }
    
    @Nullable
    public Boolean dT() {
        return this.jT;
    }
    
    @Nullable
    public Boolean dU() {
        return this.jU;
    }
    
    public enum a
    {
        @SerializedName("title")
        TITLE, 
        @SerializedName("radio")
        RADIO, 
        @SerializedName("dropdown")
        DROPDOWN, 
        @SerializedName("bool")
        BOOLEAN, 
        @SerializedName("colorpicker")
        COLOR_PICKER, 
        @SerializedName("slider")
        SLIDER, 
        @SerializedName("text")
        TEXT, 
        @SerializedName("keyPicker")
        KEY_PICKER, 
        @SerializedName("checkbox")
        CHECKBOX;
        
        private static /* synthetic */ a[] $values() {
            return new a[] { a.TITLE, a.RADIO, a.DROPDOWN, a.BOOLEAN, a.COLOR_PICKER, a.SLIDER, a.TEXT, a.KEY_PICKER, a.CHECKBOX };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
