// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import java.util.Iterator;
import java.util.Arrays;
import net.minecraft.client.renderer.vertex.VertexFormatElement;
import java.awt.Color;
import org.lwjgl.util.vector.Matrix3f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector4f;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.gui.FontRenderer;

public final class io
{
    public static final float By = 7.0f;
    public static final float Bz = 1.0f;
    public static final float BA = 1.0f;
    private static final FontRenderer BB;
    private static final TextureManager BC;
    private final WorldRenderer BD;
    private VertexFormat BE;
    
    private io() {
        throw new AssertionError();
    }
    
    private io(final WorldRenderer bd) {
        this.BD = bd;
    }
    
    public static void lH() {
        GlStateManager.func_179118_c();
    }
    
    public static void lI() {
        GlStateManager.func_179141_d();
    }
    
    public static void a(final int n, final float n2) {
        GlStateManager.func_179092_a(n, n2);
    }
    
    public static void Z(final int n) {
        GlStateManager.func_179103_j(n);
    }
    
    public static void lJ() {
        GlStateManager.func_179145_e();
    }
    
    public static void lK() {
        GlStateManager.func_179140_f();
    }
    
    public static void lL() {
        GlStateManager.func_179126_j();
    }
    
    public static void lM() {
        GlStateManager.func_179097_i();
    }
    
    public static void b(final int n) {
        GlStateManager.func_179143_c(n);
    }
    
    public static void r(final boolean b) {
        GlStateManager.func_179132_a(b);
    }
    
    public static void lN() {
        GlStateManager.func_179091_B();
    }
    
    public static void lO() {
        GlStateManager.func_179101_C();
    }
    
    public static void lP() {
        GlStateManager.func_179147_l();
    }
    
    public static void lQ() {
        GlStateManager.func_179084_k();
    }
    
    public static void lR() {
        GlStateManager.func_179129_p();
    }
    
    public static void lS() {
        GlStateManager.func_179129_p();
    }
    
    public static void c(final int n, final int n2, final int n3, final int n4) {
        GlStateManager.func_179120_a(n, n2, n3, n4);
    }
    
    public static void n(final int n, final int n2) {
        GlStateManager.func_179112_b(n, n2);
    }
    
    @Deprecated
    public static void lT() {
        GlStateManager.func_179090_x();
    }
    
    @Deprecated
    public static void lU() {
        GlStateManager.func_179098_w();
    }
    
    public static void a(final float n, final float n2, final float n3, final float n4) {
        GlStateManager.func_179131_c(n, n2, n3, n4);
    }
    
    public static void a(final float n, final float n2, final float n3) {
        GlStateManager.func_179124_c(n, n2, n3);
    }
    
    public static void j(final float n) {
        GL11.glLineWidth(n);
    }
    
    public static float lV() {
        return GL11.glGetFloat(2849);
    }
    
    public static void a(final is is, final String s, final float n, final float n2, final int n3, final boolean b) {
        if ((n3 >> 24 & 0xFF) <= 10) {
            return;
        }
        if (s == null) {
            return;
        }
        iq.md();
        is.mj();
        io.BB.func_175065_a(s, n, n2, n3, b);
        iq.me();
    }
    
    public static void a(final is is, final String s, final float n, final float n2, final int n3, final int n4) {
        if ((n3 >> 24 & 0xFF) <= 10) {
            return;
        }
        iq.md();
        is.mj();
        io.BB.func_175065_a(s, n + 1.0f, n2 + 1.0f, n4, false);
        io.BB.func_175065_a(s, n, n2, n3, false);
        iq.me();
    }
    
    public static int az(final String s) {
        return io.BB.func_78256_a(s);
    }
    
    public static float a(final char c) {
        return (float)io.BB.func_78263_a(c);
    }
    
    public static float s(final boolean b) {
        float n = 7.0f;
        if (b) {
            ++n;
        }
        return n;
    }
    
    public static int lW() {
        return GL11.glGetInteger(34016);
    }
    
    public static void aa(final int n) {
        GlStateManager.func_179138_g(n);
    }
    
    public static void a(final int n, final Runnable runnable) {
        final int glGetInteger = GL11.glGetInteger(32873);
        ab(n);
        runnable.run();
        ab(glGetInteger);
    }
    
    private static void ab(final int n) {
        GlStateManager.func_179144_i(n);
    }
    
    public static void o(final int n, final int n2) {
        b(n, () -> ab(n2));
    }
    
    public static void a(final int n, final ResourceLocation resourceLocation) {
        o(n, b(resourceLocation));
    }
    
    private static int b(final ResourceLocation resourceLocation) {
        Object func_110581_b = io.BC.func_110581_b(resourceLocation);
        if (func_110581_b == null) {
            func_110581_b = new SimpleTexture(resourceLocation);
            io.BC.func_110579_a(resourceLocation, (ITextureObject)func_110581_b);
        }
        return ((ITextureObject)func_110581_b).func_110552_b();
    }
    
    public static void b(final int n, final Runnable runnable) {
        final int lw = lW();
        aa(33984 + n);
        runnable.run();
        aa(lw);
    }
    
    public static Tessellator lX() {
        return Tessellator.func_178181_a();
    }
    
    public static io lY() {
        return new io(lX().func_178180_c());
    }
    
    public WorldRenderer lZ() {
        return this.BD;
    }
    
    public io a(final is is, final double n, final double n2, final double n3) {
        final Vector4f vector4f = new Vector4f((float)n, (float)n2, (float)n3, 1.0f);
        Matrix4f.transform(is.mh().ml(), vector4f, vector4f);
        this.BD.func_181662_b((double)vector4f.getX(), (double)vector4f.getY(), (double)vector4f.getZ());
        return this;
    }
    
    public io a(final is is, final float n, final float n2, final float n3) {
        final Vector3f vector3f = new Vector3f(n, n2, n3);
        Matrix3f.transform(is.mh().mm(), vector3f, vector3f);
        this.BD.func_181663_c(vector3f.getX(), vector3f.getY(), vector3f.getZ());
        return this;
    }
    
    public io d(final int n, final int n2, final int n3, final int n4) {
        this.BD.func_181669_b(n, n2, n3, n4);
        return this;
    }
    
    public io b(final float n, final float n2, final float n3, final float n4) {
        this.BD.func_181666_a(n, n2, n3, n4);
        return this;
    }
    
    public io g(final Color color) {
        return this.d(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }
    
    public io ma() {
        this.BD.func_181675_d();
        return this;
    }
    
    public io c(final double n, final double n2) {
        this.BD.func_181673_a(n, n2);
        return this;
    }
    
    public io a(final a a, final VertexFormat be) {
        this.BE = be;
        this.BD.func_181668_a(a.vertexMode, be);
        return this;
    }
    
    public io b(final a a, final VertexFormat vertexFormat) {
        return this.a(a, vertexFormat);
    }
    
    public void mb() {
        this.mc();
    }
    
    public void h(final int n, final int n2, final int n3) {
        this.BD.func_181674_a((float)n, (float)n2, (float)n3);
        this.mc();
    }
    
    private static boolean[] a(final VertexFormat vertexFormat) {
        final VertexFormatElement.EnumUsage uv = VertexFormatElement.EnumUsage.UV;
        boolean[] copy = new boolean[2];
        for (final VertexFormatElement vertexFormatElement : vertexFormat.func_177343_g()) {
            if (vertexFormatElement.func_177375_c() == uv) {
                final int func_177369_e = vertexFormatElement.func_177369_e();
                if (copy.length <= func_177369_e) {
                    copy = Arrays.copyOf(copy, func_177369_e + 1);
                }
                copy[func_177369_e] = true;
            }
        }
        return copy;
    }
    
    private void mc() {
        final VertexFormat be = this.BE;
        if (be == null) {
            lX().func_78381_a();
            return;
        }
        final boolean[] a = a(be);
        final boolean[] array = new boolean[a.length];
        for (int i = 0; i < array.length; ++i) {
            final Object o;
            final int n;
            final Object o2;
            final Object o3;
            final int n2;
            final int n3;
            b(i, () -> {
                GL11.glIsEnabled(3553);
                o[n] = o2;
                n2 = o3[n];
                if (n3 != n2) {
                    if (n2 != 0) {
                        GlStateManager.func_179098_w();
                    }
                    else {
                        GlStateManager.func_179090_x();
                    }
                }
                return;
            });
        }
        lX().func_78381_a();
        for (int j = 0; j < array.length; ++j) {
            if (array[j] != a[j]) {
                if (array[j]) {
                    b(j, GlStateManager::func_179098_w);
                }
                else {
                    b(j, GlStateManager::func_179090_x);
                }
            }
        }
    }
    
    @Deprecated
    public static void md() {
        iq.md();
    }
    
    @Deprecated
    public static void me() {
        iq.me();
    }
    
    @Deprecated
    public static void b(final float n, final float n2, final float n3) {
        iq.b(n, n2, n3);
    }
    
    @Deprecated
    public static void a(final double n, final double n2, final double n3) {
        iq.a(n, n2, n3);
    }
    
    @Deprecated
    public static void c(final float n, final float n2, final float n3, final float n4) {
        iq.c(n, n2, n3, n4);
    }
    
    @Deprecated
    public static void c(final float n, final float n2, final float n3) {
        iq.c(n, n2, n3);
    }
    
    @Deprecated
    public static void b(final double n, final double n2, final double n3) {
        iq.b(n, n2, n3);
    }
    
    static {
        BB = Minecraft.func_71410_x().field_71466_p;
        BC = Minecraft.func_71410_x().func_110434_K();
    }
    
    public enum a
    {
        LINES(1), 
        LINE_STRIP(3), 
        TRIANGLES(4), 
        TRIANGLE_STRIP(5), 
        TRIANGLE_FAN(6), 
        QUADS(7);
        
        private final int mode;
        private final int vertexMode;
        
        private a(final int n) {
            this.mode = n;
            this.vertexMode = n;
        }
        
        public static a fromGlMode(final int i) {
            switch (i) {
                case 1: {
                    return a.LINES;
                }
                case 3: {
                    return a.LINE_STRIP;
                }
                case 4: {
                    return a.TRIANGLES;
                }
                case 5: {
                    return a.TRIANGLE_STRIP;
                }
                case 6: {
                    return a.TRIANGLE_FAN;
                }
                case 7: {
                    return a.QUADS;
                }
                default: {
                    throw new IllegalArgumentException("Invalid mode " + i);
                }
            }
        }
        
        private static /* synthetic */ a[] $values() {
            return new a[] { a.LINES, a.LINE_STRIP, a.TRIANGLES, a.TRIANGLE_STRIP, a.TRIANGLE_FAN, a.QUADS };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
