// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import java.awt.Color;

public class bm
{
    public static void a(@NotNull final Color color) {
        e.s().l().b(new cM(b(color), b(a.c(color).r(17).bg()), b(a.c(color).r(57).bg())));
    }
    
    private static String b(final Color color) {
        return String.format("%s,%s,%s", color.getRed(), color.getGreen(), color.getBlue());
    }
    
    private static class a
    {
        private int ch;
        private int ci;
        private int cj;
        
        private a(final int ch, final int ci, final int cj) {
            this.ch = ch;
            this.ci = ci;
            this.cj = cj;
        }
        
        @NotNull
        public static a c(@NotNull final Color color) {
            final float[] hsbvals = new float[3];
            Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), hsbvals);
            return new a(Math.round(hsbvals[0] * 100.0f), Math.round(hsbvals[1] * 100.0f), Math.round(hsbvals[2] * 100.0f));
        }
        
        @NotNull
        public Color bg() {
            return Color.getHSBColor(this.ch / 100.0f, this.ci / 100.0f, this.cj / 100.0f);
        }
        
        public a r(final int n) {
            this.cj = Math.min(Math.max(this.cj + ((this.cj >= 50) ? -1 : 1) * n, 0), 100);
            return this;
        }
        
        public int bh() {
            return this.ch;
        }
        
        public void s(final int ch) {
            this.ch = ch;
        }
        
        public int bi() {
            return this.ci;
        }
        
        public void t(final int ci) {
            this.ci = ci;
        }
        
        public int bj() {
            return this.cj;
        }
        
        public void u(final int cj) {
            this.cj = cj;
        }
    }
}
