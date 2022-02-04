// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.entity.player.EntityPlayer;
import java.awt.Color;
import java.util.Iterator;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.digitalingot.feather.mixin.core.c;
import net.digitalingot.feather.mixin.core.i;
import org.apache.commons.lang3.math.NumberUtils;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.client.Minecraft;

@dV(eN = ec.COORDINATES, eO = @eb(fj = "Coordinates", fk = "https://assets.feathercdn.net/game/mods/coordinates.svg", fl = "Display your location and world info", fm = { dk.a.PVP, dk.a.HUD }))
public class gE extends dT<a>
{
    private static final int rK = 2;
    private static final String[] rL;
    private static final String[] rM;
    private static final String[] rN;
    private static final int rO = 3;
    private static final int rP = 10;
    private final Minecraft nQ;
    private String rQ;
    private String rR;
    private int rS;
    
    public gE() {
        this.nQ = Minecraft.func_71410_x();
    }
    
    @Override
    public void a(final dT.a a, final is is) {
        final EntityPlayerSP field_71439_g = this.nQ.field_71439_g;
        final int func_76128_c = MathHelper.func_76128_c(((EntityPlayer)field_71439_g).field_70169_q);
        final int func_76128_c2 = MathHelper.func_76128_c(((EntityPlayer)field_71439_g).field_70167_r);
        final int func_76128_c3 = MathHelper.func_76128_c(((EntityPlayer)field_71439_g).field_70166_s);
        this.rQ = this.nQ.field_71441_e.func_175726_f(new BlockPos(func_76128_c, func_76128_c2, func_76128_c3)).func_177411_a(new BlockPos(func_76128_c & 0xF, func_76128_c2, func_76128_c3 & 0xF), this.nQ.field_71441_e.func_72959_q()).field_76791_y;
        this.a(is, func_76128_c, func_76128_c2, func_76128_c3, this.f(((EntityPlayer)field_71439_g).field_70177_z), this.rQ, this.rR = this.if());
    }
    
    @Override
    public void b(final is is) {
        if (this.nQ.field_71439_g != null) {
            this.a(null, is);
        }
        else {
            this.a(is, 100, 100, 100, 0, "Plains", this.rR = "C: 0 (s)");
        }
    }
    
    @Override
    public int eH() {
        return this.eD();
    }
    
    @Override
    public int eI() {
        return this.eE();
    }
    
    private void a(final is is, final int n, final int n2, final int n3, final int n4, final String s, final String s2) {
        final int n5 = 12;
        final int n6 = ((a)this.jK).rZ ? 2 : 0;
        if (((a)this.jK).rZ) {
            this.kE.b(is, 0, 0, this.eD(), this.eE(), ((a)this.jK).li.getRGB());
        }
        final String s3 = gE.rL[n4];
        final String s4 = gE.rM[n4];
        final String s5 = gE.rN[n4];
        switch (gE$1.rT[((a)this.jK).rU.ordinal()]) {
            case 1: {
                final String string = "(" + n + ", " + (((a)this.jK).rX ? (n2 + ", ") : "") + n3 + ")";
                this.kE.a(is, string, (float)n6, 2.0f, ((a)this.jK).rV.gS(), ((a)this.jK).lp, ((a)this.jK).rV.gT());
                int rs = this.kE.V(string) + 3;
                if (((a)this.jK).sb) {
                    this.kE.a(is, s, (float)(n6 + rs), 2.0f, ((a)this.jK).sc, ((a)this.jK).lp);
                    rs += this.kE.V(s) + 3;
                }
                if (((a)this.jK).se) {
                    this.kE.a(is, s2, (float)(n6 + rs), 2.0f, ((a)this.jK).sf, ((a)this.jK).lp);
                    rs += this.kE.V(s2) + 3;
                }
                if (((a)this.jK).rW) {
                    this.kE.a(is, s4, (float)(n6 + rs), -1.0f, ((a)this.jK).si, ((a)this.jK).lp);
                    this.kE.a(is, s5, (float)(n6 + rs), 5.0f, ((a)this.jK).si, ((a)this.jK).lp);
                    rs += this.kE.V("++");
                }
                if (((a)this.jK).sh) {
                    this.kE.a(is, s3, (float)(n6 + rs), 2.0f, ((a)this.jK).si, ((a)this.jK).lp);
                    rs += this.kE.V("NW");
                }
                this.rS = rs;
                break;
            }
            case 2: {
                final String string2 = "X " + n;
                final String s6 = ((a)this.jK).rX ? ("Y " + n2) : "";
                final String string3 = "Z " + n3;
                final int max = NumberUtils.max(new int[] { this.kE.V(string2), this.kE.V(s6), this.kE.V(string3) });
                this.kE.a(is, string2, (float)n6, 2.0f, ((a)this.jK).rV, ((a)this.jK).lp);
                if (((a)this.jK).rX) {
                    this.kE.a(is, s6, (float)n6, (float)(n5 + 2), ((a)this.jK).rV, ((a)this.jK).lp);
                }
                if (((a)this.jK).sh) {
                    if (((a)this.jK).rW && !((a)this.jK).rX) {
                        this.kE.a(is, s3, (float)(n6 + max + 10 + 15), n5 / 2.0f + 2.0f, ((a)this.jK).si, ((a)this.jK).lp);
                    }
                    else {
                        this.kE.a(is, s3, (float)(n6 + max + 10), (float)(n5 + 2), ((a)this.jK).si, ((a)this.jK).lp);
                    }
                }
                if (((a)this.jK).rW) {
                    this.kE.a(is, s4, (float)(n6 + max + 10), 2.0f, ((a)this.jK).si, ((a)this.jK).lp);
                    this.kE.a(is, s5, (float)(n6 + max + 10), (float)((((a)this.jK).rX ? 2 : 1) * n5 + 2), ((a)this.jK).si, ((a)this.jK).lp);
                }
                this.kE.a(is, string3, (float)n6, (float)((((a)this.jK).rX ? 2 : 1) * n5 + 2), ((a)this.jK).rV, ((a)this.jK).lp);
                if (((a)this.jK).sb) {
                    this.kE.a(is, s, (float)n6, (float)((((a)this.jK).rX ? 3 : 2) * n5 + 2), ((a)this.jK).sc, ((a)this.jK).lp);
                }
                if (((a)this.jK).se) {
                    int n7 = 0;
                    if (((a)this.jK).rX) {
                        ++n7;
                    }
                    if (((a)this.jK).sb) {
                        ++n7;
                    }
                    this.kE.a(is, s2, (float)n6, (float)((2 + n7) * n5 + 2), ((a)this.jK).sf, ((a)this.jK).lp);
                    break;
                }
                break;
            }
        }
    }
    
    @Override
    public int eD() {
        try {
            int n;
            if (((a)this.jK).rU == a.a.VERTICAL) {
                n = NumberUtils.max(new int[] { this.kE.V("X -17777") + (((a)this.jK).sh ? (10 + this.kE.V("NW")) : 0), ((a)this.jK).se ? this.kE.V(this.rR) : 0, ((a)this.jK).sb ? this.kE.V(this.rQ) : 0 });
            }
            else {
                n = this.rS;
            }
            return ((a)this.jK).rZ ? (4 + n) : n;
        }
        catch (NullPointerException ex) {
            return 0;
        }
    }
    
    @Override
    public int eE() {
        if (((a)this.jK).rU == a.a.HORIZONTAL) {
            return 14;
        }
        return (2 + (((a)this.jK).sb ? 1 : 0) + (((a)this.jK).rX ? 1 : 0) + (((a)this.jK).se ? 1 : 0)) * 12 + 2;
    }
    
    private int f(final float n) {
        return MathHelper.func_76128_c((MathHelper.func_76142_g(n) + 180.0 + 22.5) % 360.0 / 45.0);
    }
    
    private String if() {
        final int length = ((i)this.nQ.field_71438_f).getViewFrustum().field_178164_f.length;
        int i = 0;
        for (final c c : ((i)this.nQ.field_71438_f).getRenderInfos()) {
            final CompiledChunk field_178502_a = CompiledChunk.field_178502_a;
            final CompiledChunk field_178590_b = c.getRenderChunk().field_178590_b;
            final boolean func_178489_a = field_178590_b.func_178489_a();
            if (field_178590_b != field_178502_a && !func_178489_a) {
                ++i;
            }
        }
        return String.format("C %d/%d %s", i, length, this.nQ.field_175612_E ? "(s)" : "");
    }
    
    static {
        rL = new String[] { "N", "NE", "E", "SE", "S", "SW", "W", "NW" };
        rM = new String[] { "", "+", "++", "+", "", "-", "--", "-" };
        rN = new String[] { "--", "-", "", "+", "++", "+", "", "-" };
    }
    
    @ep(fN = true, fK = 28.0)
    public static class a extends ed
    {
        @es(fU = 0)
        public fc mu;
        @ex(fw = "orientation", fj = "Orientation", fY = "vertical", fo = @es(fU = 1))
        public gE.a.a rU;
        @ex(fw = "coordinatesColor", fj = "Color", fo = @es(fU = 2))
        public eZ rV;
        @ex(fw = "directionDetails", fj = "Direction Details", fY = "true", fo = @es(fU = 3))
        public boolean rW;
        @ex(fw = "yCoordinate", fj = "Y Coordinate", fY = "true", fo = @es(fU = 4))
        public boolean rX;
        @ex(fw = "textShadow", fj = "Text Shadow", fY = "false", fo = @es(fU = 5))
        public boolean lp;
        @es(fU = 10)
        public fc rY;
        @ex(fw = "background", fj = "Background", fY = "true", fo = @es(fU = 11))
        public boolean rZ;
        @ex(fw = "backgroundColor", fj = "Color", fY = "7/7/7/146", gb = @et(fw = "background"), fo = @es(fU = 12))
        public Color li;
        @es(fU = 20)
        public fc sa;
        @ex(fw = "biome", fj = "Biome", fY = "true", fo = @es(fU = 21))
        public boolean sb;
        @ex(fw = "biomeColor", fj = "Color", gb = @et(fw = "biome"), fo = @es(fU = 22))
        public eZ sc;
        @es(fU = 30)
        public fc sd;
        @ex(fw = "chunkCounter", fj = "Chunk Counter", fY = "true", fo = @es(fU = 31))
        public boolean se;
        @ex(fw = "chunkCounterColor", fj = "Color", gb = @et(fw = "chunkCounter"), fo = @es(fU = 32))
        public eZ sf;
        @es(fU = 40)
        public fc sg;
        @ex(fw = "directions", fj = "Directions", fY = "true", fo = @es(fU = 41))
        public boolean sh;
        @ex(fw = "directionsColor", fj = "Color", fY = "false/0/255/255", gb = @et(fw = "directions"), fo = @es(fU = 42))
        public eZ si;
        
        public a() {
            this.mu = new fc("General");
            this.rY = new fc("Background");
            this.sa = new fc("Biome");
            this.sd = new fc("Chunk Counter");
            this.sg = new fc("Directions");
        }
        
        public enum a
        {
            @eo(fw = "horizontal", fj = "Horizontal")
            HORIZONTAL, 
            @eo(fw = "vertical", fj = "Vertical")
            VERTICAL;
            
            private static /* synthetic */ a[] $values() {
                return new a[] { a.HORIZONTAL, a.VERTICAL };
            }
            
            static {
                $VALUES = $values();
            }
        }
    }
}
