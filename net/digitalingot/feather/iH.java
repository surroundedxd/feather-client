// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.HashMap;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import java.util.UUID;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import java.util.List;

public class ih
{
    @NotNull
    private final List<Integer> Bj;
    @NotNull
    private final Map<UUID, b> Bk;
    @NotNull
    private final Map<UUID, a> Bl;
    @Nullable
    private ix qK;
    
    private ih() {
        this.Bj = new ArrayList<Integer>();
        this.Bk = new HashMap<UUID, b>();
        this.Bl = new HashMap<UUID, a>();
    }
    
    @NotNull
    public static ih lv() {
        final ih ih = new ih();
        final ca l = e.s().l();
        l.a(bV.REQUEST_P2P_JOIN, (cb<bY, bY, bY>)new ii.b(ih));
        l.a(bV.ACCEPT_P2P_JOIN, (cb<bY, bY, bY>)new ii.a(ih));
        return ih;
    }
    
    @NotNull
    public List<Integer> lw() {
        return this.Bj;
    }
    
    @NotNull
    public Map<UUID, b> lx() {
        return this.Bk;
    }
    
    @NotNull
    public Map<UUID, a> ly() {
        return this.Bl;
    }
    
    @Nullable
    public ix ia() {
        return this.qK;
    }
    
    public void a(@NotNull final ix qk) {
        this.qK = qk;
    }
    
    public static class b
    {
        private final int id;
        private final long Bm;
        
        public b(final int id, final long bm) {
            this.id = id;
            this.Bm = bm;
        }
        
        public int eg() {
            return this.id;
        }
        
        public long jt() {
            return this.Bm;
        }
    }
    
    public static class a
    {
        private final long Bm;
        private final int kf;
        
        public a(final long bm, final int kf) {
            this.Bm = bm;
            this.kf = kf;
        }
        
        public long jt() {
            return this.Bm;
        }
        
        public int ef() {
            return this.kf;
        }
    }
}
