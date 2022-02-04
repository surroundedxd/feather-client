// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import com.google.gson.JsonElement;
import java.util.Iterator;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import java.util.List;

public class ea
{
    @NotNull
    private final List<Class<? extends dW<?>>> kT;
    @NotNull
    private final Map<ec, dW<?>> jN;
    @NotNull
    private final Map<Class<? extends dW<?>>, dW<?>> kU;
    @NotNull
    private final eU kV;
    @NotNull
    private final fv kW;
    @NotNull
    private final fu kX;
    @NotNull
    private Set<ec> kY;
    
    public ea(@NotNull final List<Class<? extends dW<?>>> kt, @NotNull final eU kv, @NotNull final bj bj) {
        this.jN = new HashMap<ec, dW<?>>();
        this.kU = new HashMap<Class<? extends dW<?>>, dW<?>>();
        this.kW = new fv(this);
        this.kY = new HashSet<ec>();
        this.kT = kt;
        this.kV = kv;
        this.kX = new fu(this, bj);
    }
    
    public void initialize() {
        this.kX.gV();
    }
    
    public void fc() {
        this.kW.gX();
    }
    
    public void bb() {
        this.kV.b(this.jN);
    }
    
    public void h(final List<String> list) {
        final HashSet<ec> ky = new HashSet<ec>(list.size());
        final Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            final ec fromSlug = ec.fromSlug(iterator.next());
            if (fromSlug == null) {
                continue;
            }
            if (fromSlug.isCore()) {
                continue;
            }
            ky.add(fromSlug);
        }
        this.kY = ky;
        final Iterator<ec> iterator2 = this.kY.iterator();
        while (iterator2.hasNext()) {
            this.kW.j(this.jN.get(iterator2.next()));
        }
        fe.ah();
    }
    
    public void fd() {
        final Iterator<ec> iterator = this.kY.iterator();
        while (iterator.hasNext()) {
            final dW<?> dw = this.jN.get(iterator.next());
            if (((eg)dw.dK()).enabled) {
                this.kW.i(dw);
            }
        }
        this.kY.clear();
        fe.ah();
    }
    
    public void fe() {
        this.kV.gG();
        final Iterator<dW<eg>> iterator = this.jN.values().iterator();
        while (iterator.hasNext()) {
            this.kX.h(iterator.next());
        }
        this.kW.gW();
        fq.a(this);
        fl.a(this);
        bh.a(this);
    }
    
    public <T extends eg> void a(@NotNull final dW<T> dw, @NotNull final Map<String, JsonElement> map) {
        for (final ez ez : new eA((Class<Object>)dw.dK().getClass()).gq()) {
            final String fw = ez.gh().fw();
            final JsonElement obj = map.get(fw);
            if (obj == null) {
                continue;
            }
            final Object fromJson = ca.GSON.fromJson(obj, (Class)ez.gf());
            final eB eb = new eB<Object>(ez);
            if ((ez.gm() == null || ez.gh() == null || ez.gn() == null || !ez.gh().fw().equals(ez.gn().fX())) && !eb.e(fromJson)) {
                throw new IllegalArgumentException("Config key \"" + fw + "\" contained a payload which couldn't be validated: \"" + obj + "\"");
            }
            try {
                ez.gg().set(dw.dK(), fromJson);
            }
            catch (IllegalAccessException cause) {
                throw new IllegalStateException(cause);
            }
        }
    }
    
    public <T extends eg> void c(@NotNull final dW<T> dw) {
        for (final ez ez : new eA((Class<Object>)dw.dK().getClass()).gq()) {
            if (ez.gh().fo().fU() < 0) {
                continue;
            }
            final Object gd = new eG<Object>(ez, null).gD();
            try {
                ez.gg().set(dw.dK(), gd);
            }
            catch (IllegalAccessException cause) {
                throw new IllegalStateException(cause);
            }
        }
        this.f((dW<eg>)dw);
    }
    
    public <T extends ed> void c(@NotNull final dT<T> dt) {
        final ep ep = dt.dK().getClass().getDeclaredAnnotation(ep.class);
        final ed ed = dt.dK();
        dt.dK().a(ep.fL(), ep.fN() ? ed.fr() : ep.fJ(), ep.fO() ? ed.fs() : ep.fK());
        this.f((dW<eg>)dt);
    }
    
    public void d(@NotNull final dW<?> dw) {
        dw.dK().enabled = true;
        this.f(dw);
    }
    
    public void e(@NotNull final dW<?> dw) {
        dw.dK().enabled = false;
        this.f(dw);
    }
    
    public <T extends eg> void f(@NotNull final dW<T> dw) {
        this.kV.a(dw.eT().eN(), dw.dK());
        dw.eS();
        dw.eR();
        final el el = dw.dK().getClass().getDeclaredAnnotation(el.class);
        if (el != null && !el.fF().fP().isEmpty()) {
            bh.a(this);
        }
        if (dw.eU() && !dw.dK().dI()) {
            this.kW.j(dw);
        }
        else if (!dw.eU() && dw.dK().dI() && !this.kY.contains(dw.eT().eN())) {
            this.kW.i(dw);
        }
    }
    
    @NotNull
    public static <T extends dW<?>> dZ<T> a(@NotNull final Class<T> clazz) {
        return new dZ<T>() {
            private T kZ;
            
            @Override
            public T fb() {
                if (this.kZ != null) {
                    return this.kZ;
                }
                final f s = e.s();
                if (s == null) {
                    return null;
                }
                return this.kZ = s.m().b(clazz);
            }
        };
    }
    
    @NotNull
    public dW<?> a(@NotNull final ec ec) {
        return this.jN.get(ec);
    }
    
    @NotNull
    public <T extends dW<?>> T b(@NotNull final Class<T> clazz) {
        return (T)this.kU.get(clazz);
    }
    
    @NotNull
    public Map<ec, dW<?>> dN() {
        return this.jN;
    }
    
    @NotNull
    public Map<Class<? extends dW<?>>, dW<?>> ff() {
        return this.kU;
    }
    
    @NotNull
    public List<Class<? extends dW<?>>> fg() {
        return this.kT;
    }
    
    @NotNull
    public eU fh() {
        return this.kV;
    }
    
    @NotNull
    public Set<ec> fi() {
        return this.kY;
    }
}
