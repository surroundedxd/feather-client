// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import java.awt.Color;

public class gu
{
    private static io f(final Color color) {
        final io ly = io.lY();
        io.lP();
        io.lT();
        io.c(770, 771, 1, 0);
        return ly;
    }
    
    public static void a(final is is, final double n, final double n2, final int n3, final Color color) {
        final int red = color.getRed();
        final int green = color.getGreen();
        final int blue = color.getBlue();
        final int alpha = color.getAlpha();
        final io f = f(color);
        f.b(io.a.LINE_STRIP, DefaultVertexFormats.field_181706_f);
        for (int i = 0; i <= 360; ++i) {
            final float n4 = (float)(i * 0.017453292519943295);
            f.a(is, n + Math.cos(n4) * n3, n2 + Math.sin(n4) * n3, 0.0).d(red, green, blue, alpha).ma();
        }
        f.mb();
        io.lU();
        io.lQ();
    }
    
    public static void a(final is is, final int n, final int n2, final int n3, final int n4, final Color color) {
        final int red = color.getRed();
        final int blue = color.getBlue();
        final int green = color.getGreen();
        final int alpha = color.getAlpha();
        final io f = f(color);
        f.b(io.a.LINE_STRIP, DefaultVertexFormats.field_181706_f);
        f.a(is, n, n2, 0.0).d(red, green, blue, alpha).ma();
        f.a(is, n3, n4, 0.0).d(red, green, blue, alpha).ma();
        f.mb();
        io.lU();
        io.lQ();
    }
    
    public static void b(final is is, int n, int n2, int n3, int n4, final Color color) {
        if (n < n3) {
            final int n5 = n;
            n = n3;
            n3 = n5;
        }
        if (n2 < n4) {
            final int n6 = n2;
            n2 = n4;
            n4 = n6;
        }
        final int red = color.getRed();
        final int green = color.getGreen();
        final int blue = color.getBlue();
        final int alpha = color.getAlpha();
        final io f = f(color);
        f.b(io.a.QUADS, DefaultVertexFormats.field_181706_f);
        f.a(is, n, n4, 0.0).d(red, green, blue, alpha).ma();
        f.a(is, n3, n4, 0.0).d(red, green, blue, alpha).ma();
        f.a(is, n3, n2, 0.0).d(red, green, blue, alpha).ma();
        f.a(is, n, n2, 0.0).d(red, green, blue, alpha).ma();
        f.mb();
        io.lU();
        io.lQ();
    }
    
    public static void a(final is is, final int n, final int n2, final int n3, final Color color, final int n4) {
        b(is, n2, n, n3 + n4, n + n4, color);
    }
    
    public static void b(final is is, final int n, final int n2, final int n3, final Color color, final int n4) {
        b(is, n, n2, n + n4, n3 + n4, color);
    }
    
    public static void a(final is is, final int n, final int n2, final int n3, final int n4, final Color color, final int n5) {
        a(is, n2, n, n3, color, n5);
        a(is, n4, n, n3, color, n5);
        b(is, n, n2, n4, color, n5);
        b(is, n3, n2, n4, color, n5);
    }
    
    public static void a(final is is, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        iM.sU().d(is, n, n2, n3, n4, n5, n6);
    }
    
    public static int V(final String s) {
        return iM.sV().func_78256_a(s);
    }
}
