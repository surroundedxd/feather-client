// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.awt.Color;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;

@dV(eN = ec.DIRECTION, eO = @eb(fj = "Direction", fk = "https://assets.feathercdn.net/game/mods/direction.svg", fl = "Display your cardinal direction", fm = { dk.a.HUD }))
public class gF extends dT<a>
{
    private static final float sj = 33.33f;
    private static final float sk = 33.335f;
    private static final float sl = 0.33330002f;
    private static final float sm = 0.33335f;
    private static final Minecraft minecraft;
    private ResourceLocation texture;
    private int textureWidth;
    private int textureHeight;
    private float pixelsPerDegree;
    private int sn;
    private int so;
    private int sp;
    private int sq;
    private int gO;
    private int gP;
    private int sr;
    private int ss;
    private float st;
    private float su;
    private int sv;
    private int sw;
    
    public gF() {
        this.sv = (int)(0.33330002f * this.st);
        this.sw = (int)(0.33335f * this.st);
    }
    
    @Override
    public void a(final dT.a a, final is is) {
        this.a(is, gF.minecraft.field_71439_g.field_70177_z);
    }
    
    @Override
    public void b(final is is) {
        this.a(is, 90.0f);
    }
    
    public void a(final is is, final float n) {
        this.b(is, n);
        this.f(is);
    }
    
    private void b(final is is, final float n) {
        float n2 = n;
        if (n2 < 0.0f) {
            n2 += 360.0f;
        }
        final float n3 = (-this.su + n2 * this.pixelsPerDegree + 7.5f * this.pixelsPerDegree) % this.textureWidth;
        io.a(0, this.texture);
        this.kE.b(is, 0, 0, this.ss, this.gP, this.sn, this.so);
        this.kE.a(is, 0, 0, n3, 0.0f, this.sw, this.textureHeight, this.ss, this.gP, (float)this.textureWidth, (float)this.textureHeight, this.sp, this.sq);
        this.kE.b(is, 0 + this.ss, 0, this.sr, this.gP, this.so, this.so);
        this.kE.a(is, 0 + this.ss, 0, n3 + this.sw, 0.0f, this.sv, this.textureHeight, this.sr, this.gP, (float)this.textureWidth, (float)this.textureHeight, this.sq, this.sq);
        this.kE.b(is, 0 + this.ss + this.sr, 0, this.ss, this.gP, this.so, this.sn);
        this.kE.a(is, 0 + this.ss + this.sr, 0, n3 + this.sw + this.sv, 0.0f, this.sw, this.textureHeight, this.ss, this.gP, (float)this.textureWidth, (float)this.textureHeight, this.sq, this.sp);
    }
    
    private void f(final is is) {
        final float n = (this.gO - ((a)this.jK).sz) / 2.0f;
        final float n2 = -1.0f;
        final float n3 = n2 - ((a)this.jK).sz;
        final int red = ((a)this.jK).sE.getRed();
        final int green = ((a)this.jK).sE.getGreen();
        final int blue = ((a)this.jK).sE.getBlue();
        io.lP();
        io.lT();
        io.c(770, 771, 1, 0);
        final io ly = io.lY();
        ly.b(io.a.TRIANGLE_FAN, DefaultVertexFormats.field_181706_f);
        ly.a(is, n, n2, 0.0).d(red, green, blue, 255).ma();
        ly.a(is, n + ((a)this.jK).sz, n3, 0.0).d(red, green, blue, 255).ma();
        ly.a(is, n - ((a)this.jK).sz, n3, 0.0).d(red, green, blue, 255).ma();
        ly.mb();
        io.lU();
        io.lQ();
    }
    
    private void ig() {
        this.texture = ((a)this.jK).sy.texture;
        this.textureWidth = ((a)this.jK).sy.textureWidth;
        this.textureHeight = ((a)this.jK).sy.textureHeight;
        this.pixelsPerDegree = ((a)this.jK).sy.pixelsPerDegree;
    }
    
    private void ih() {
        this.so = ((a)this.jK).li.getRGB();
        this.sn = (this.so & 0xFFFFFF);
        this.sq = ((a)this.jK).sD.gS();
        this.sp = (this.sq & 0xFFFFFF);
    }
    
    private void ii() {
        this.gO = ((a)this.jK).gO;
        this.gP = (int)(((a)this.jK).sz * 0.75 + 18.0);
        this.sr = (int)(0.33330002f * this.gO);
        this.ss = (int)(0.33335f * this.gO);
        this.st = ((a)this.jK).sB * this.pixelsPerDegree;
        this.su = this.st / 2.0f;
        this.sv = (int)(0.33330002f * this.st);
        this.sw = (int)(0.33335f * this.st);
    }
    
    @Override
    public void eR() {
        this.ig();
        this.ii();
        this.ih();
    }
    
    @Override
    public int eE() {
        return this.gP;
    }
    
    @Override
    public int eD() {
        return this.gO;
    }
    
    static {
        minecraft = Minecraft.func_71410_x();
    }
    
    public enum b
    {
        @eo(fw = "default", fj = "Default")
        DEFAULT("default.png", 1728, 70, 4.8f), 
        @eo(fw = "simple", fj = "Simple")
        SIMPLE("simple.png", 1728, 84, 4.8f), 
        @eo(fw = "noTick", fj = "No Tick")
        NO_TICK("no_tick.png", 1728, 84, 4.8f);
        
        private static final String BASE_PATH = "textures/direction/";
        public final ResourceLocation texture;
        public final int textureWidth;
        public final int textureHeight;
        public final float pixelsPerDegree;
        
        private b(final String str, final int textureWidth, final int textureHeight, final float pixelsPerDegree) {
            this.texture = new ResourceLocation("feather", "textures/direction/" + str);
            this.textureWidth = textureWidth;
            this.textureHeight = textureHeight;
            this.pixelsPerDegree = pixelsPerDegree;
        }
        
        private static /* synthetic */ b[] $values() {
            return new b[] { b.DEFAULT, b.SIMPLE, b.NO_TICK };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @ep(fN = true, fK = 30.0)
    public static class a extends ed
    {
        @es(fU = 0)
        public fc sx;
        @ex(fw = "type", fj = "Type", fY = "default", fo = @es(fU = 1))
        public b sy;
        @ex(fw = "markerSize", fj = "Marker Size", fY = "3", fo = @es(fU = 2))
        @er(fS = 1, fR = 9)
        public int sz;
        @ex(fw = "shadow", fj = "Shadow", fY = "true", fo = @es(fU = 3))
        public boolean sA;
        @ex(fw = "visibleDegrees", fj = "Visible Degrees", fY = "200", fo = @es(fU = 4))
        @er(fS = 45, fR = 360)
        public int sB;
        @ex(fw = "width", fj = "Width", fY = "200", fo = @es(fU = 5))
        @er(fS = 50, fR = 300)
        public int gO;
        @es(fU = 10)
        public fc sC;
        @ex(fw = "backgroundColor", fj = "Background Color", fY = "7/7/7/100", fo = @es(fU = 11))
        public Color li;
        @ex(fw = "directionColor", fj = "Direction Color", fY = "false/255/255/255", fo = @es(fU = 12))
        public eZ sD;
        @ex(fw = "markerColor", fj = "Marker Color", fY = "255/255/255", fo = @es(fU = 13))
        public Color sE;
        
        public a() {
            this.sx = new fc("Direction");
            this.sC = new fc("Colors");
        }
        
        @Override
        public double fr() {
            return iv.mw() / iv.mA() / 2.0;
        }
    }
}
