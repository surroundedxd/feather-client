// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import java.util.Iterator;
import java.util.concurrent.ForkJoinPool;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Collections;
import java.util.LinkedHashMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import java.util.Map;
import java.util.UUID;
import java.util.List;
import net.minecraft.client.Minecraft;

public class hb extends ha<gZ.a>
{
    public static final int xw = 9;
    private static final int xx = 20;
    private static final int xy = 100;
    private static final int xz = 500;
    private static final int xA = 100;
    private static final int xB = 1;
    private static final long xC = 1000L;
    private static final long xD = 1000L;
    private Minecraft minecraft;
    private final List<UUID> xE;
    private final Map<UUID, he> xF;
    private final List<he> xG;
    private final Map<UUID, hc> xH;
    private long xI;
    private int xJ;
    private hd.a xK;
    private boolean xL;
    
    public hb(@NotNull final dW<gZ.a> dw) {
        super(dw);
        this.xE = new ArrayList<UUID>();
        this.xF = (Map<UUID, he>)Maps.newHashMap();
        this.xG = (List<he>)Lists.newArrayList();
        this.xH = Collections.synchronizedMap(new LinkedHashMap<UUID, hc>());
        this.xI = 0L;
        this.xJ = 0;
        this.xK = null;
        this.xL = false;
    }
    
    @Override
    public boolean iN() {
        return ((gZ.a)this.xu.dK()).xj;
    }
    
    @Override
    public void initialize() {
        this.minecraft = Minecraft.func_71410_x();
        final UUID uuid;
        he he;
        ac.bt.a(entity -> {
            if (!this.eU()) {
                return;
            }
            else if (!(entity instanceof EntityPlayer)) {
                return;
            }
            else if (!jP.tO()) {
                return;
            }
            else {
                entity.func_110124_au();
                if (!this.xF.containsKey(uuid)) {
                    he = new he(uuid);
                    this.xF.put(uuid, he);
                    this.xG.add(he);
                }
                return;
            }
        });
        final UUID uuid2;
        ac.bu.a(entity2 -> {
            if (!this.eU()) {
                return;
            }
            else if (!(entity2 instanceof EntityPlayer)) {
                return;
            }
            else if (!jP.tO()) {
                return;
            }
            else {
                entity2.func_110124_au();
                this.xG.remove(this.xF.remove(uuid2));
                this.xE.remove(uuid2);
                return;
            }
        });
        S.bk.a((entityPlayerSP, p1) -> {
            if (!this.eU()) {
                return;
            }
            else if (entityPlayerSP != this.minecraft.field_71439_g) {
                return;
            }
            else {
                this.xF.clear();
                this.xG.clear();
                this.xE.clear();
                this.iT();
                return;
            }
        });
        final Iterator<he> iterator;
        he he2;
        ao.bE.a(c -> {
            if (!this.eU()) {
                return;
            }
            else if (c != ao.c.END) {
                return;
            }
            else if (!jP.tO()) {
                return;
            }
            else {
                if (this.xK == null && !this.xL) {
                    this.xL = true;
                    ForkJoinPool.commonPool().execute(() -> this.xK = hd.iW());
                }
                this.xG.iterator();
                while (iterator.hasNext()) {
                    he2 = iterator.next();
                    if (he2.jc() > 100) {
                        this.xE.add(he2.jb());
                        iterator.remove();
                    }
                }
                if (this.xI != 0L && System.currentTimeMillis() > this.xI) {
                    this.xI = 0L;
                }
                return;
            }
        });
        final UUID uuid3;
        hc hc;
        final int n;
        ai.bk.a((entity3, a) -> {
            if (!(!this.eU())) {
                if (!(!jP.tO())) {
                    if (!entity3.func_70093_af()) {
                        entity3.func_110124_au();
                        a.aG();
                        if (uuid3 != this.minecraft.field_71439_g.func_110124_au()) {
                            if (!this.xE.contains(uuid3)) {
                                return;
                            }
                        }
                        else if (!((gZ.a)this.xu.dK()).xk) {
                            return;
                        }
                        hc = this.xH.get(uuid3);
                        if (hc == null) {
                            if (this.xI == 0L) {
                                this.j(uuid3);
                            }
                        }
                        else if (!(hc.iU() instanceof hg)) {
                            this.a(new is(), hc.iU(), n);
                            a.p(n - 9);
                        }
                    }
                }
            }
        });
    }
    
    private void iT() {
        if (this.xH.size() > 500) {
            final Iterator<UUID> iterator = this.xH.keySet().iterator();
            for (int n = 0; n < 500 && iterator.hasNext(); ++n) {
                iterator.next();
                iterator.remove();
            }
        }
    }
    
    public boolean i(final UUID uuid) {
        final hc hc = this.xH.get(uuid);
        return hc != null && !(hc.iU() instanceof hg);
    }
    
    private void a(final is is, final hf hf, final int n) {
        final gZ.a a = (gZ.a)this.xu.dK();
        final String str = a.xn ? (a.xo.trim() + " ") : "";
        final String str2 = a.xr ? (" " + a.xs.trim()) : "";
        final int az = io.az(str + hf.je() + str2);
        io.lT();
        final int n2 = az / 2;
        final io ly = io.lY();
        ly.b(io.a.QUADS, DefaultVertexFormats.field_181706_f);
        ly.a(is, -n2 - 1, n, 0.0).b(0.0f, 0.0f, 0.0f, 0.25f).ma();
        ly.a(is, -n2 - 1, 9 + n, 0.0).b(0.0f, 0.0f, 0.0f, 0.25f).ma();
        ly.a(is, n2 + 1, 9 + n, 0.0).b(0.0f, 0.0f, 0.0f, 0.25f).ma();
        ly.a(is, n2 + 1, n, 0.0).b(0.0f, 0.0f, 0.0f, 0.25f).ma();
        ly.mb();
        io.lU();
        int n3 = -az / 2;
        io.lL();
        io.r(true);
        final iM su = iM.sU();
        if (a.xn) {
            su.a(is, str, (float)n3, (float)(1 + n), a.xp.gS(), false, a.xp.gT());
            n3 += io.az(str);
        }
        su.a(is, hf.je(), (float)n3, (float)(1 + n), a.xl.gS(), false, a.xl.gT());
        final int n4 = n3 + io.az(hf.je());
        if (a.xr) {
            su.a(is, str2, (float)n4, (float)(1 + n), a.xt.gS(), false, a.xt.gT());
        }
        io.r(false);
        io.lM();
    }
    
    private void j(final UUID uuid) {
        if (this.xK == null || this.xK.iX()) {
            return;
        }
        if (this.xJ >= 100) {
            this.xI = System.currentTimeMillis() + 1000L;
            this.xJ = 0;
            return;
        }
        ++this.xJ;
        this.xH.put(uuid, new hc(new hg(), ""));
        final hh hh;
        ForkJoinPool.commonPool().execute(() -> {
            hd.b(uuid, this.xK.iZ());
            if (!hh.ag("success")) {
                hh.f("strlevel", "Error");
            }
            this.xH.put(uuid, new hc(new hf(hh.aj("level")), hh.aj("strlevel")));
        });
    }
    
    public static class a extends eg
    {
        @es(fU = 0)
        public fc xi;
        @ex(fw = "showSelf", fj = "Show Self", fo = @es(fU = 1))
        public boolean xM;
        @ex(fw = "levelColor", fj = "Nametag Color", fY = "false/255/255/0", fo = @es(fU = 2))
        public eZ xN;
        @es(fU = 10)
        public fc xO;
        @ex(fw = "prefixEnabled", fj = "Prefix", fo = @es(fU = 11))
        public boolean xP;
        @ex(fw = "prefixText", fj = "Text", fY = "Level:", fo = @es(fU = 12))
        @ew(fS = 0, fR = 32)
        public String xQ;
        @ex(fw = "prefixColor", fj = "Color", fY = "false/0/255/255", fo = @es(fU = 13))
        public eZ xR;
        @es(fU = 20)
        public fc xS;
        @ex(fw = "suffixEnabled", fj = "Suffix", fo = @es(fU = 21))
        public boolean xT;
        @ex(fw = "suffixText", fj = "Text", fY = "Level", fo = @es(fU = 22))
        @ew(fS = 0, fR = 32)
        public String xU;
        @ex(fw = "suffixColor", fj = "Color", fY = "false/0/255/255", fo = @es(fU = 23))
        public eZ xV;
        
        public a() {
            this.xi = new fc("LevelHead");
            this.xM = false;
            this.xO = new fc("Prefix");
            this.xS = new fc("Suffix");
        }
    }
}
