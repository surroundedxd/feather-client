// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.item.ItemStack;
import java.awt.Color;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.Minecraft;

public class iM
{
    public static final int xw = 12;
    private static final iQ Eb;
    private static iM Ec;
    private fX.a Ed;
    private double Ee;
    private double Ef;
    private double Eg;
    
    protected iM() {
        this.Ed = null;
        this.Ee = 1.0;
        this.Ef = 0.0;
        this.Eg = 0.0;
        Minecraft.func_71410_x().func_175599_af().field_77023_b = 200.0f;
    }
    
    private fX.a sT() {
        if (this.Ed == null) {
            this.Ed = e.s().m().b(fX.class).dK();
        }
        return this.Ed;
    }
    
    public static iM sU() {
        if (iM.Ec == null) {
            iM.Ec = new iM();
        }
        return iM.Ec;
    }
    
    public static iQ sV() {
        return iM.Eb;
    }
    
    public final void a(final is is, final int n, final int n2, final int n3, final int n4) {
        this.a(is, n, n2, n3, n4, -1);
    }
    
    public final void a(final is is, final int n, final int n2, final int n3, final int n4, final int n5) {
        this.a(is, n, n2, n3, n4, n5, 1.0f);
    }
    
    public final void a(final is is, final int n, final int n2, final int n3, final int n4, final int n5, final float n6) {
        final int n7 = n + n3;
        final int n8 = n2 + n4;
        float n9;
        float n10;
        float n11;
        float n12;
        if (n5 != -1) {
            n9 = (n5 >> 24 & 0xFF) / 255.0f;
            n10 = (n5 >> 16 & 0xFF) / 255.0f;
            n11 = (n5 >> 8 & 0xFF) / 255.0f;
            n12 = (n5 & 0xFF) / 255.0f;
        }
        else {
            n10 = (n9 = (n11 = (n12 = 1.0f)));
        }
        final boolean b = n6 != 0.1f;
        if (b) {
            io.j(n6);
        }
        final io ly = io.lY();
        ly.b(io.a.LINE_STRIP, DefaultVertexFormats.field_181706_f);
        ly.a(is, n, n8, 0.0).b(n10, n11, n12, n9).ma();
        ly.a(is, n7, n8, 0.0).b(n10, n11, n12, n9).ma();
        ly.a(is, n7, n2, 0.0).b(n10, n11, n12, n9).ma();
        ly.a(is, n, n2, 0.0).b(n10, n11, n12, n9).ma();
        ly.a(is, n, n8, 0.0).b(n10, n11, n12, n9).ma();
        ly.mb();
        if (b) {
            io.j(1.0f);
        }
    }
    
    public final void b(final is is, final int n, final int n2, final int n3, final int n4, final int n5) {
        this.a(is, n, n2, n3, n4, n5, false);
    }
    
    public final void a(final is is, final int n, final int n2, final int n3, final int n4, final int n5, final boolean b) {
        if (b) {
            final fX.a st = this.sT();
            if (st.pX == iN.NORMAL) {
                final double py = st.pY;
                final long currentTimeMillis = System.currentTimeMillis();
                this.c(is, n, n2, n3, n4, Color.HSBtoRGB((float)((currentTimeMillis - n * 100 / py - n2 * 100 / py) % (50000.0 / py) / (50000.0 / py)), 0.8f, 0.8f), Color.HSBtoRGB((float)((currentTimeMillis - (n + Math.abs(n3 - n)) * 100 / py - n2 * 100 / py) % (50000.0 / py) / (50000.0 / py)), 0.8f, 0.8f));
            }
            else {
                this.c(is, n, n2, n3, n4, this.sW());
            }
        }
        else {
            this.c(is, n, n2, n3, n4, n5);
        }
    }
    
    private void c(final is is, int n, int n2, int n3, int n4, final int n5) {
        if (n < n3) {
            final int n6 = n;
            n = n3;
            n3 = n6;
        }
        if (n2 < n4) {
            final int n7 = n2;
            n2 = n4;
            n4 = n7;
        }
        final float n8 = (n5 >> 24 & 0xFF) / 255.0f;
        final float n9 = (n5 >> 16 & 0xFF) / 255.0f;
        final float n10 = (n5 >> 8 & 0xFF) / 255.0f;
        final float n11 = (n5 & 0xFF) / 255.0f;
        io.lP();
        io.lT();
        io.c(770, 771, 1, 0);
        final io ly = io.lY();
        ly.b(io.a.QUADS, DefaultVertexFormats.field_181706_f);
        ly.a(is, n, n4, 0.0).b(n9, n10, n11, n8).ma();
        ly.a(is, n3, n4, 0.0).b(n9, n10, n11, n8).ma();
        ly.a(is, n3, n2, 0.0).b(n9, n10, n11, n8).ma();
        ly.a(is, n, n2, 0.0).b(n9, n10, n11, n8).ma();
        ly.mb();
        io.lU();
        io.lQ();
    }
    
    @Deprecated
    public void a(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final int round = Math.round(this.l((float)n));
        final int round2 = Math.round(this.m((float)n2));
        this.c(new is(), round, round2, round + n3, round2 + n4, n5, n6);
    }
    
    public void b(final is is, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.c(is, n, n2, n + n3, n2 + n4, n5, n6);
    }
    
    private void c(final is is, int n, int n2, int n3, int n4, final int n5, final int n6) {
        if (n < n3) {
            final int n7 = n;
            n = n3;
            n3 = n7;
        }
        if (n2 < n4) {
            final int n8 = n2;
            n2 = n4;
            n4 = n8;
        }
        final int n9 = n5 >> 24 & 0xFF;
        final int n10 = n5 >> 16 & 0xFF;
        final int n11 = n5 >> 8 & 0xFF;
        final int n12 = n5 >> 0 & 0xFF;
        final int n13 = n6 >> 24 & 0xFF;
        final int n14 = n6 >> 16 & 0xFF;
        final int n15 = n6 >> 8 & 0xFF;
        final int n16 = n6 >> 0 & 0xFF;
        io.lT();
        io.lP();
        io.lH();
        io.c(770, 771, 1, 0);
        io.Z(7425);
        final io ly = io.lY();
        ly.b(io.a.TRIANGLE_STRIP, DefaultVertexFormats.field_181706_f);
        ly.a(is, n3, n4, 0.0).d(n10, n11, n12, n9).ma();
        ly.a(is, n3, n2, 0.0).d(n10, n11, n12, n9).ma();
        ly.a(is, n, n4, 0.0).d(n14, n15, n16, n13).ma();
        ly.a(is, n, n2, 0.0).d(n14, n15, n16, n13).ma();
        ly.mb();
        io.Z(7424);
        io.lQ();
        io.lI();
        io.lU();
    }
    
    @Deprecated
    public void a(final String s, final float n, final float n2, final eZ ez, final boolean b) {
        this.a(new is(), s, this.l(n), this.m(n2), ez, b);
    }
    
    public void a(final is is, final String s, final float n, final float n2, final eZ ez, final boolean b) {
        this.a(is, s, n, n2, ez.gS(), b, ez.gT());
    }
    
    @Deprecated
    public void a(final String s, final float n, final float n2, final int n3, final boolean b, final boolean b2) {
        this.a(new is(), s, this.l(n), this.m(n2), n3, b, b2);
    }
    
    public void a(final is is, final String s, final float n, final float n2, final int n3, final boolean b, final boolean b2) {
        if (b2) {
            this.b(is, s, n, n2, n3 >> 24 & 0xFF, b);
        }
        else {
            io.a(is, s, n, n2, n3, b);
        }
    }
    
    protected void b(final is is, String as, float n, final float n2, final int n3, final boolean b) {
        as = jV.aS(as);
        final fX.a st = this.sT();
        switch (iM$1.Eh[st.pX.ordinal()]) {
            case 1: {
                final Color color = new Color(this.sW(), true);
                this.a(is, as, n, n2, new Color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha() * n3 / 255).getRGB(), b, false);
                break;
            }
            case 2: {
                for (final char c : as.toCharArray()) {
                    final Color color2 = new Color(Color.HSBtoRGB((float)((System.currentTimeMillis() - (n * this.Ee - this.Ef) * 100.0 / st.pY - (n2 * this.Ee - this.Eg) * 100.0 / st.pY) % (50000.0 / st.pY) / (50000.0 / st.pY)), 0.8f, 0.8f), true);
                    final Color color3 = new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha() * n3 / 255);
                    final String value = String.valueOf(c);
                    this.a(is, value, n, n2, color3.getRGB(), b, false);
                    n += this.V(value);
                }
                break;
            }
        }
    }
    
    public int sW() {
        final double n = 50000.0 / this.sT().pY;
        return Color.HSBtoRGB((float)(System.currentTimeMillis() % n / n), 0.8f, 0.8f);
    }
    
    public int V(final String s) {
        return iM.Eb.func_78256_a(s);
    }
    
    @Deprecated
    public void a(final ItemStack itemStack, int round, int round2, final boolean b, final boolean b2) {
        round = Math.round(this.l((float)round));
        round2 = Math.round(this.m((float)round2));
        io.lN();
        RenderHelper.func_74519_b();
        RenderHelper.func_74520_c();
        Minecraft.func_71410_x().func_175599_af().func_180450_b(itemStack, round, round2);
        kb.a(iM.Eb, itemStack, round, round2, b, b2);
        RenderHelper.func_74518_a();
        io.lO();
    }
    
    public void a(final is is, final ItemStack itemStack, final int n, final int n2, final boolean b, final boolean b2) {
        io.lN();
        RenderHelper.func_74519_b();
        RenderHelper.func_74520_c();
        is.a(() -> Minecraft.func_71410_x().func_175599_af().func_180450_b(itemStack, n, n2));
        RenderHelper.func_74518_a();
        io.lO();
    }
    
    @Deprecated
    public void b(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.d(new is(), Math.round(this.l((float)n)), Math.round(this.m((float)n2)), n3, n4, n5, n6);
    }
    
    public void d(final is is, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.a(is, n, n2, (float)n3, (float)n4, n5, n6, n5, n6, 256.0f, 256.0f);
    }
    
    @Deprecated
    public void a(final int n, final int n2, final float n3, final float n4, final int n5, final int n6, final int n7, final int n8, final float n9, final float n10) {
        this.a(new is(), Math.round(this.l((float)n)), Math.round(this.m((float)n2)), n3, n4, n5, n6, n7, n8, n9, n10);
    }
    
    public void a(final is is, final int n, final int n2, final float n3, final float n4, final int n5, final int n6, final int n7, final int n8, final float n9, final float n10) {
        this.a(is, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, -1);
    }
    
    @Deprecated
    public void a(final int n, final int n2, final float n3, final float n4, final int n5, final int n6, final int n7, final int n8, final float n9, final float n10, final int n11) {
        this.a(new is(), Math.round(this.l((float)n)), Math.round(this.m((float)n2)), n3, n4, n5, n6, n7, n8, n9, n10, n11);
    }
    
    public void a(final is is, final int n, final int n2, final float n3, final float n4, final int n5, final int n6, final int n7, final int n8, final float n9, final float n10, final int n11) {
        final float n12 = 1.0f / n9;
        final float n13 = 1.0f / n10;
        final float n14 = (n11 >> 24 & 0xFF) / 255.0f;
        final float n15 = (n11 >> 16 & 0xFF) / 255.0f;
        final float n16 = (n11 >> 8 & 0xFF) / 255.0f;
        final float n17 = (n11 & 0xFF) / 255.0f;
        final io ly = io.lY();
        ly.b(io.a.QUADS, DefaultVertexFormats.field_181709_i);
        ly.a(is, n, n2 + n8, 0.0).c(n3 * n12, (n4 + n6) * n13).b(n15, n16, n17, n14).ma();
        ly.a(is, n + n7, n2 + n8, 0.0).c((n3 + n5) * n12, (n4 + n6) * n13).b(n15, n16, n17, n14).ma();
        ly.a(is, n + n7, n2, 0.0).c((n3 + n5) * n12, n4 * n13).b(n15, n16, n17, n14).ma();
        ly.a(is, n, n2, 0.0).c(n3 * n12, n4 * n13).b(n15, n16, n17, n14).ma();
        ly.mb();
    }
    
    public void a(final is is, final int n, final int n2, final float n3, final float n4, final int n5, final int n6, final int n7, final int n8, final float n9, final float n10, final int n11, final int n12) {
        final float n13 = 1.0f / n9;
        final float n14 = 1.0f / n10;
        final int n15 = n11 >> 24 & 0xFF;
        final int n16 = n11 >> 16 & 0xFF;
        final int n17 = n11 >> 8 & 0xFF;
        final int n18 = n11 >> 0 & 0xFF;
        final int n19 = n12 >> 24 & 0xFF;
        final int n20 = n12 >> 16 & 0xFF;
        final int n21 = n12 >> 8 & 0xFF;
        final int n22 = n12 >> 0 & 0xFF;
        io.lP();
        io.lH();
        io.c(770, 771, 1, 0);
        io.Z(7425);
        final boolean glIsEnabled = GL11.glIsEnabled(2848);
        if (!glIsEnabled) {
            GL11.glEnable(2848);
        }
        final io ly = io.lY();
        ly.b(io.a.TRIANGLE_STRIP, DefaultVertexFormats.field_181709_i);
        ly.a(is, n + n7, n2 + n8, 0.0).c((n3 + n5) * n13, (n4 + n6) * n14).d(n20, n21, n22, n19).ma();
        ly.a(is, n + n7, n2, 0.0).c((n3 + n5) * n13, n4 * n14).d(n20, n21, n22, n19).ma();
        ly.a(is, n, n2 + n8, 0.0).c(n3 * n13, (n4 + n6) * n14).d(n16, n17, n18, n15).ma();
        ly.a(is, n, n2, 0.0).c(n3 * n13, n4 * n14).d(n16, n17, n18, n15).ma();
        ly.mb();
        if (!glIsEnabled) {
            GL11.glDisable(2848);
        }
        io.Z(7424);
        io.lQ();
        io.lI();
        io.lU();
    }
    
    public void sX() {
        this.Ee = 1.0;
        this.Ef = 0.0;
        this.Eg = 0.0;
    }
    
    public void c(final double ee, final double ef, final double eg) {
        this.Ee = ee;
        this.Ef = ef;
        this.Eg = eg;
    }
    
    protected float l(final float n) {
        return n;
    }
    
    protected float m(final float n) {
        return n;
    }
    
    static {
        Eb = new iQ();
    }
}
