// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class dI implements bY
{
    @SerializedName("tabs")
    @NotNull
    private final List<a> kn;
    
    public dI(@NotNull final List<a> kn) {
        this.kn = kn;
    }
    
    @NotNull
    public List<a> eo() {
        return this.kn;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.BUILD_SIDEBAR_SETTINGS;
    }
    
    public static class a
    {
        @SerializedName("name")
        @NotNull
        private final String name;
        @SerializedName("slug")
        @NotNull
        private final ec jD;
        @SerializedName("sidebar")
        @NotNull
        private final String ko;
        @SerializedName("icon")
        @NotNull
        private final String icon;
        @SerializedName("description")
        @NotNull
        private final String jI;
        @SerializedName("form")
        @NotNull
        private final List<du> iV;
        
        public a(@NotNull final String name, @NotNull final ec jd, @NotNull final String ko, @NotNull final String icon, @NotNull final String ji, @NotNull final List<du> iv) {
            this.name = name;
            this.jD = jd;
            this.ko = ko;
            this.icon = icon;
            this.jI = ji;
            this.iV = iv;
        }
        
        @NotNull
        public String getName() {
            return this.name;
        }
        
        @NotNull
        public ec dB() {
            return this.jD;
        }
        
        @NotNull
        public String ep() {
            return this.ko;
        }
        
        @NotNull
        public String getIcon() {
            return this.icon;
        }
        
        @NotNull
        public String dG() {
            return this.jI;
        }
        
        @NotNull
        public List<du> cT() {
            return this.iV;
        }
    }
}
