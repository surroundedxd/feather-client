// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import net.minecraft.util.Session;
import net.digitalingot.feather.mixin.core.h;
import java.util.function.Supplier;
import java.util.UUID;
import com.mojang.authlib.GameProfile;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import net.minecraft.client.Minecraft;
import java.util.function.Consumer;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import java.util.List;

public class fU
{
    @NotNull
    private List<a> iL;
    
    private fU() {
        this.iL = new ArrayList<a>();
    }
    
    public static fU hJ() {
        final fU fu = new fU();
        final ca l = e.s().l();
        l.b(new cs(), (Consumer<bY>)new Consumer<ct>() {
            public void a(final ct ct) {
                fu.iL = ct.cJ();
                l.b(new cr(Minecraft.func_71410_x().func_110432_I().func_148256_e().getId(), (List<cr.a>)fu.iL.stream().map(cr.a::a).collect(Collectors.toList())));
            }
        }, (Consumer<bY>)null);
        if (c.k()) {
            final GameProfile func_148256_e = Minecraft.func_71410_x().func_110432_I().func_148256_e();
            fu.iL.add(new a("support@feathermc.com", func_148256_e.getId(), func_148256_e.getName(), ""));
            l.b(new cr(func_148256_e.getId(), (List<cr.a>)fu.iL.stream().map((Function<? super Object, ?>)cr.a::a).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList())));
        }
        l.a(bV.CHANGE_ACCOUNT, (cb<bY, bY, bY>)new b(fu));
        return fu;
    }
    
    public void e(final UUID uuid) {
        kr.Gh.info("Changing account to " + uuid + "...");
        final a a2 = this.iL.stream().filter(a -> a.ai().equals(uuid)).findFirst().orElseThrow((Supplier<? extends Throwable>)IllegalArgumentException::new);
        ((h)Minecraft.func_71410_x()).setSession(new Session(a2.getName(), a2.ai().toString(), a2.hL(), "mojang"));
        final ea m = e.s().m();
        final fX fx = m.b(fX.class);
        final i hn = fx.hN();
        if (hn != null) {
            try {
                hn.F();
            }
            catch (IOException | l ex) {
                final Throwable t;
                t.printStackTrace();
            }
            hn.H().I();
        }
        if (fx.hM() != null) {
            fx.hM().ia().jz();
        }
        final hw hw = m.b(hw.class);
        if (hw.eU() && hw.jv() != null) {
            hw.jv().jz();
        }
    }
    
    public static class a
    {
        @SerializedName("email")
        private final String pB;
        @SerializedName("uuid")
        private final UUID an;
        @SerializedName("name")
        private final String name;
        @SerializedName("authToken")
        private final String pC;
        
        public a(final String pb, final UUID an, final String name, final String pc) {
            this.pB = pb;
            this.an = an;
            this.name = name;
            this.pC = pc;
        }
        
        public String hK() {
            return this.pB;
        }
        
        public UUID ai() {
            return this.an;
        }
        
        public String getName() {
            return this.name;
        }
        
        public String hL() {
            return this.pC;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final a a = (a)o;
            return Objects.equals(this.pB, a.pB) && Objects.equals(this.an, a.an) && Objects.equals(this.name, a.name) && Objects.equals(this.pC, a.pC);
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(this.pB, this.an, this.name, this.pC);
        }
    }
    
    public static class b implements cb<cq, co, cn>
    {
        @NotNull
        private final fU pD;
        
        b(@NotNull final fU pd) {
            this.pD = pd;
        }
        
        @Override
        public void a(final cq cq, final Consumer<co> consumer, final Consumer<cn> consumer2) {
            this.pD.e(cq.cF());
        }
    }
}
