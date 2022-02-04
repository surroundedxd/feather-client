// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import net.minecraft.client.settings.KeyBinding;
import java.awt.Color;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.Minecraft;
import java.text.DecimalFormat;

@dV(eN = ec.KEYSTROKES, eO = @eb(fj = "Keystrokes", fk = "https://assets.feathercdn.net/game/mods/keystrokes.svg", fl = "Display your key presses", fm = { dk.a.HUD }))
public class gJ extends dT<f> implements gT.a
{
    private static final int tD = 20;
    private static final int tE = 10;
    private static final int tF = 1;
    private static final int tG = 3;
    private static final int tH = 2;
    private static final int tI = 62;
    private static final int tJ = 12;
    private final gT tK;
    private final DecimalFormat tL;
    private d tM;
    private d tN;
    private d tO;
    private d tP;
    private d tQ;
    private b tR;
    private b tS;
    private d[] tT;
    private int tU;
    private float tV;
    private float tW;
    private float tX;
    private float tY;
    private float tZ;
    private float ua;
    private String ub;
    
    public gJ() {
        this.tK = new gT(this, this);
        this.tL = jY.aT("#.#");
        this.tT = new d[0];
    }
    
    private void in() {
        final GameSettings field_71474_y = Minecraft.func_71410_x().field_71474_y;
        this.tM = new d((f)this.jK, e.FORWARD, field_71474_y.field_74351_w);
        this.tN = new d((f)this.jK, e.BACK, field_71474_y.field_74368_y);
        this.tO = new d((f)this.jK, e.LEFT, field_71474_y.field_74370_x);
        this.tP = new d((f)this.jK, e.RIGHT, field_71474_y.field_74366_z);
        this.tQ = new d((f)this.jK, e.JUMP, field_71474_y.field_74314_A);
        this.tR = new b((f)this.jK, e.ATTACK, field_71474_y.field_74312_F);
        this.tS = new b((f)this.jK, e.USE, field_71474_y.field_74313_G);
        this.tT = new d[] { this.tM, this.tN, this.tO, this.tP, this.tQ, this.tR, this.tS };
    }
    
    @Override
    public void a(final dT.a a, final is is) {
        this.ip();
        if (((f)this.jK).uC != f.b.NONE) {
            this.c(is, this.tM);
            this.c(is, this.tO);
            this.c(is, this.tN);
            this.c(is, this.tP);
        }
        if (((f)this.jK).uA != f.b.NONE) {
            this.a(is, this.tR);
            this.a(is, this.tS);
        }
        if (((f)this.jK).uB != f.b.NONE) {
            this.d(is, this.tQ);
        }
        if (((f)this.jK).uF == f.a.SEPARATE) {
            this.kE.a(is, (int)this.tV, (int)this.tW, (int)this.tX, (int)this.tY, ((f)this.jK).li.getRGB(), false);
            this.kE.a(is, this.ub, this.tZ, this.ua, ((f)this.jK).lo, ((f)this.jK).lp);
        }
    }
    
    @Override
    public void eR() {
        jY.a(this.tL, ((f)this.jK).uG);
        this.in();
        this.iq();
        this.ir();
    }
    
    @Override
    public int eE() {
        return this.tU;
    }
    
    @Override
    public int eD() {
        return 62;
    }
    
    private static void io() {
        final GuiScreen field_71462_r = Minecraft.func_71410_x().field_71462_r;
        if (field_71462_r == null || field_71462_r.field_146291_p) {
            g.u();
        }
    }
    
    private void ip() {
        io();
        final long currentTimeMillis = System.currentTimeMillis();
        for (final d d : this.tT) {
            d.uq = bN.I(bq.a(d.um));
            d.d(currentTimeMillis);
        }
    }
    
    private void a(final is is, final d d) {
        this.kE.b(is, (int)d.ut, (int)d.uu, (int)d.uv, (int)d.uw, d.un.uf.getRGB());
    }
    
    private void b(final is is, final d d) {
        this.kE.a(is, d.kK, d.ux, d.uy, d.un.ug, ((f)this.jK).lp);
    }
    
    private void c(final is is, final d d) {
        this.a(is, d);
        this.b(is, d);
    }
    
    private void a(final is is, final b b) {
        this.c(is, b);
        if (((f)this.jK).uF == f.a.WITH_CLICKS) {
            is.mf();
            is.c(0.5f, 0.5f, 1.0f);
            this.kE.a(is, b.uh, b.ui, b.uj, b.un.ug, ((f)this.jK).lp);
            is.mg();
        }
    }
    
    private void d(final is is, final d d) {
        this.a(is, d);
        if (((f)this.jK).uB == f.b.ARROWS) {
            final float n = d.uu + (d.uw - d.uu) / 2.0f;
            this.kE.a(is, (int)(d.ut + 20.0f), (int)(n + 1.0f), (int)(d.uv - 20.0f), (int)n, d.un.ug.gS(), d.un.ug.gT());
        }
        else {
            this.b(is, d);
        }
    }
    
    private void iq() {
        float n = 0.0f;
        this.tU = 0;
        if (((f)this.jK).uC != f.b.NONE) {
            final d tm = this.tM;
            final float n2 = 1.0f;
            final float n3 = n;
            final float n4 = n3 + 1.0f;
            tm.c(n2, n3);
            this.tO.c(0.0f, n4);
            this.tN.c(1.0f, n4);
            final d tp = this.tP;
            final float n5 = 2.0f;
            final float n6 = n4;
            n = n6 + 1.0f;
            tp.c(n5, n6);
            this.tU += 42;
        }
        if (((f)this.jK).uA != f.b.NONE) {
            this.tR.c(0.0f, n);
            final b ts = this.tS;
            final float n7 = 1.0f;
            final float n8 = n;
            n = n8 + 1.0f;
            ts.c(n7, n8);
            this.tU += 21;
        }
        int n9 = 0;
        if (((f)this.jK).uB != f.b.NONE) {
            final d tq = this.tQ;
            final float n10 = 0.0f;
            final float n11 = n;
            n = n11 + 1.0f;
            tq.a(n10, n11, 10);
            this.tU += 11;
            n9 = -10;
        }
        if (((f)this.jK).uF == f.a.SEPARATE) {
            this.tV = 0.0f;
            this.tW = n * 21.0f + n9;
            this.tX = this.tV + 62.0f;
            this.tY = this.tW + 12.0f;
            this.tU += 12;
        }
    }
    
    @Override
    public void b(final double n, final double n2) {
        switch (gJ$1.uc[((f)this.jK).uF.ordinal()]) {
            case 1: {
                if (n != 0.0) {
                    this.a(this.tR, this.tK.iL());
                }
                if (n2 != 0.0) {
                    this.a(this.tS, this.tK.iM());
                    break;
                }
                break;
            }
            case 2: {
                if (n != 0.0) {
                    this.is();
                    break;
                }
                break;
            }
        }
    }
    
    private void ir() {
        this.a(this.tR, this.tK.iL());
        this.a(this.tS, this.tK.iM());
        this.is();
    }
    
    private void is() {
        this.ub = this.b(this.tK.iL());
        this.tZ = this.tV + (62 - io.az(this.ub)) / 2.0f;
        this.ua = this.tW + 2.5f;
    }
    
    private void a(final b b, final double n) {
        b.W(this.b(n));
    }
    
    private String b(final double n) {
        if (((f)this.jK).uH) {
            return "CPS: " + this.tL.format(n);
        }
        return this.tL.format(n) + " CPS";
    }
    
    @ep(fJ = 35.0, fK = 75.0)
    public static class f extends ed
    {
        @es(fU = 0)
        public fc uz;
        @ex(fw = "clicksDisplayMode", fj = "Clicks Display Mode", fY = "names", fo = @es(fU = 1))
        public b uA;
        @ex(fw = "jumpDisplayMode", fj = "Jump Display Mode", fY = "arrows", fo = @es(fU = 2))
        public b uB;
        @ex(fw = "keysDisplayMode", fj = "Keys Display Mode", fY = "names", fo = @es(fU = 3))
        public b uC;
        @ex(fw = "fadeTime", fj = "Fade Time", fY = "300", fo = @es(fU = 4))
        @em(fG = 2500.0)
        public double uD;
        @es(fU = 10)
        public fc uE;
        @ex(fw = "cpsDisplayMode", fj = "Display Mode", fY = "separate", fo = @es(fU = 11))
        public a uF;
        @ex(fw = "cpsDigits", fj = "Digits", fo = @es(fU = 12))
        @er(fR = 2)
        public int uG;
        @ex(fw = "cpsReversed", fj = "Reversed Text", fo = @es(fU = 13))
        public boolean uH;
        @es(fU = 20)
        public fc sC;
        @ex(fw = "backgroundColor", fj = "Background", fY = "7/7/7/146", fo = @es(fU = 21))
        public Color li;
        @ex(fw = "backgroundActiveColor", fj = "Background Active", fY = "255/255/255/53", fo = @es(fU = 22))
        public Color uI;
        @ex(fw = "textColor", fj = "Text Color", fY = "false/255/255/255/255", fo = @es(fU = 23))
        public eZ lo;
        @ex(fw = "textActiveColor", fj = "Text Active", fY = "false/0/145/237", fo = @es(fU = 24))
        public eZ uJ;
        @ex(fw = "textShadow", fj = "Text Shadow", fY = "false", fo = @es(fU = 25))
        public boolean lp;
        
        public f() {
            this.uz = new fc("Keystrokes");
            this.uE = new fc("CPS");
            this.uG = 0;
            this.sC = new fc("Colors");
        }
        
        public enum a
        {
            @eo(fw = "none", fj = "None")
            NONE, 
            @eo(fw = "withClicks", fj = "With Clicks")
            WITH_CLICKS, 
            @eo(fw = "separate", fj = "Separate")
            SEPARATE;
            
            private static /* synthetic */ a[] $values() {
                return new a[] { a.NONE, a.WITH_CLICKS, a.SEPARATE };
            }
            
            static {
                $VALUES = $values();
            }
        }
        
        public enum b
        {
            @eo(fw = "none", fj = "None")
            NONE, 
            @eo(fw = "names", fj = "Names")
            NAMES, 
            @eo(fw = "arrows", fj = "Arrows")
            ARROWS;
            
            private static /* synthetic */ b[] $values() {
                return new b[] { b.NONE, b.NAMES, b.ARROWS };
            }
            
            static {
                $VALUES = $values();
            }
        }
    }
    
    enum c
    {
        THIRD(20.0f, 20.0f, 1.0f), 
        HALF(30.5f, 20.0f, 1.0f), 
        FULL(62.0f, 20.0f, 0.0f);
        
        private final float width;
        private final float height;
        private final float margin;
        
        private c(final float width, final float height, final float margin) {
            this.width = width;
            this.height = height;
            this.margin = margin;
        }
        
        private static /* synthetic */ c[] $values() {
            return new c[] { c.THIRD, c.HALF, c.FULL };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    enum e
    {
        FORWARD(c.THIRD, "W", "+"), 
        LEFT(c.THIRD, "A", "<"), 
        BACK(c.THIRD, "S", "-"), 
        RIGHT(c.THIRD, "D", ">"), 
        JUMP(c.FULL, "JUMP", ""), 
        CPS(c.FULL, "", ""), 
        ATTACK(c.HALF, "LMB", "<--"), 
        USE(c.HALF, "RMB", "-->");
        
        private final c bounds;
        private final String name;
        private final int nameWidth;
        private final String arrow;
        private final int arrowWidth;
        
        private e(final c bounds, final String name2, final String arrow) {
            this.bounds = bounds;
            this.name = name2;
            this.nameWidth = io.az(name2);
            this.arrow = arrow;
            this.arrowWidth = io.az(arrow);
        }
        
        private String getText(final f f) {
            switch (gJ$1.ud[this.getDisplayMode(f).ordinal()]) {
                case 1: {
                    return this.name;
                }
                case 2: {
                    return this.arrow;
                }
                default: {
                    return null;
                }
            }
        }
        
        private int getTextWidth(final f f) {
            switch (gJ$1.ud[this.getDisplayMode(f).ordinal()]) {
                case 1: {
                    return this.nameWidth;
                }
                case 2: {
                    return this.arrowWidth;
                }
                default: {
                    return 0;
                }
            }
        }
        
        private f.b getDisplayMode(final f f) {
            switch (gJ$1.ue[this.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4: {
                    return f.uC;
                }
                case 5: {
                    return f.uB;
                }
                case 6:
                case 7: {
                    return f.uA;
                }
                default: {
                    throw new AssertionError();
                }
            }
        }
        
        private static /* synthetic */ e[] $values() {
            return new e[] { e.FORWARD, e.LEFT, e.BACK, e.RIGHT, e.JUMP, e.CPS, e.ATTACK, e.USE };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    static class d
    {
        protected final f uk;
        protected final e ul;
        protected final KeyBinding um;
        protected final a un;
        protected float uo;
        protected boolean uq;
        protected long ur;
        protected boolean us;
        protected float ut;
        protected float uu;
        protected float uv;
        protected float uw;
        protected String kK;
        protected float ux;
        protected float uy;
        
        public d(final f uk, final e ul, final KeyBinding um) {
            this.uk = uk;
            this.ul = ul;
            this.um = um;
            this.uo = 0.0f;
            this.un = new a(this.a(uk.uI, uk.li), this.a(uk.uJ, uk.lo));
            this.d(System.currentTimeMillis());
        }
        
        private eZ a(final eZ ez, final eZ ez2) {
            final eZ ez3 = this.us ? ez : ez2;
            if (this.uo != 1.0f) {
                return jV.a(this.us ? ez2 : ez, ez3, this.uo);
            }
            return ez3;
        }
        
        private Color a(final Color color, final Color color2) {
            final Color color3 = this.us ? color : color2;
            if (this.uo != 1.0f) {
                return jV.a(this.us ? color2 : color, color3, this.uo);
            }
            return color3;
        }
        
        public void d(final long ur) {
            final boolean uq = this.uq;
            int n;
            if (this.us != uq) {
                this.us = uq;
                this.ur = ur;
                n = 1;
            }
            else {
                n = ((this.uo != 1.0f) ? 1 : 0);
            }
            if (n != 0) {
                this.uo = ks.o((float)((ur - this.ur) / Math.max(1.0, this.uk.uD)));
                this.un.ug = this.a(this.uk.uJ, this.uk.lo);
                this.un.uf = this.a(this.uk.uI, this.uk.li);
            }
        }
        
        public void iu() {
            this.un.ug = this.a(this.uk.uJ, this.uk.lo);
            this.un.uf = this.a(this.uk.uI, this.uk.li);
            this.kK = this.ul.getText(this.uk);
        }
        
        public void c(final float n, final float n2) {
            this.iu();
            final c access$400 = this.ul.bounds;
            this.ut = n * (access$400.width + access$400.margin);
            this.uu = n2 * (access$400.height + 1.0f);
            this.uv = this.ut + access$400.width;
            this.uw = this.uu + access$400.height;
            this.ux = this.ut + (access$400.width - this.ul.getTextWidth(this.uk)) / 2.0f;
            this.uy = this.uu + (access$400.height - 7.0f) / 2.0f;
        }
        
        public void a(final float n, final float n2, final int n3) {
            this.iu();
            final c access$400 = this.ul.bounds;
            this.ut = n * (access$400.width + access$400.margin);
            this.uu = n2 * (access$400.height + 1.0f);
            this.uv = this.ut + access$400.width;
            this.uw = this.uu + n3;
            this.ux = this.ut + (access$400.width - this.ul.getTextWidth(this.uk)) / 2.0f;
            this.uy = this.uu + (access$400.height - 7.0f) / 2.0f;
        }
    }
    
    private static class b extends d
    {
        private String uh;
        private float ui;
        private float uj;
        
        public b(final f f, final e e, final KeyBinding keyBinding) {
            super(f, e, keyBinding);
        }
        
        @Override
        public void c(final float n, final float n2) {
            super.c(n, n2);
            if (this.uk.uF == f.a.WITH_CLICKS) {
                this.uy -= 2.0f;
                if (this.uh != null) {
                    this.it();
                }
            }
        }
        
        public void W(final String uh) {
            this.uh = uh;
            this.it();
        }
        
        private void it() {
            this.ui = this.ut + (this.ul.bounds.width - io.az(this.uh) / 2.0f) / 2.0f;
            this.uj = this.uy + 7.0f + 1.0f;
            this.ui *= 2.0f;
            this.uj *= 2.0f;
        }
    }
    
    static class a
    {
        @NotNull
        public Color uf;
        @NotNull
        public eZ ug;
        
        public a(@NotNull final Color uf, @NotNull final eZ ug) {
            this.uf = uf;
            this.ug = ug;
        }
    }
}
