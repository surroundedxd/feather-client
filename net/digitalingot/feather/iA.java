// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.entity.Entity;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public class ia
{
    @SerializedName("name")
    @NotNull
    private String name;
    @SerializedName("toggled")
    private boolean pe;
    @SerializedName("color")
    @NotNull
    private eZ ky;
    @SerializedName("server")
    @Nullable
    private String AQ;
    @SerializedName("world")
    private String AR;
    @SerializedName("location")
    @NotNull
    private a kx;
    
    public ia(@NotNull final String name, final boolean pe, @NotNull final eZ ky, @NotNull final a kx) {
        this.name = name;
        this.pe = pe;
        this.ky = ky;
        this.kx = kx;
    }
    
    public boolean a(@NotNull final ib ib) {
        final String lp = ib.lp();
        if (lp == null) {
            return false;
        }
        if (!lp.equals(this.AR)) {
            return false;
        }
        final String lq = ib.lq();
        return lq == null || lq.equals(this.AQ);
    }
    
    @NotNull
    public String getName() {
        return this.name;
    }
    
    public void Q(@NotNull final String name) {
        this.name = name;
    }
    
    public void q(final boolean pe) {
        this.pe = pe;
    }
    
    public boolean lk() {
        return this.pe;
    }
    
    public void b(@NotNull final eZ ky) {
        this.ky = ky;
    }
    
    @NotNull
    public eZ ez() {
        return this.ky;
    }
    
    public void aw(@Nullable final String aq) {
        this.AQ = aq;
    }
    
    @Nullable
    public String ll() {
        return this.AQ;
    }
    
    public void ax(final String ar) {
        this.AR = ar;
    }
    
    public String lm() {
        return this.AR;
    }
    
    public void a(@NotNull final a kx) {
        this.kx = kx;
    }
    
    @NotNull
    public a ey() {
        return this.kx;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.name.equals(((ia)o).name));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
    
    public static class a
    {
        @SerializedName("x")
        private final int jb;
        @SerializedName("y")
        private final int jc;
        @SerializedName("z")
        private final int AS;
        
        public a(final int jb, final int jc, final int as) {
            this.jb = jb;
            this.jc = jc;
            this.AS = as;
        }
        
        public double j(@NotNull final Entity entity) {
            final double n = this.jb - entity.field_70169_q;
            final double n2 = this.jc - entity.field_70167_r;
            final double n3 = this.AS - entity.field_70166_s;
            return Math.sqrt(n * n + n2 * n2 + n3 * n3);
        }
        
        public int cZ() {
            return this.jb;
        }
        
        public int da() {
            return this.jc;
        }
        
        public int ln() {
            return this.AS;
        }
    }
}
