// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.awt.geom.Point2D;

public class ed extends eg
{
    @ex(fw = "hudAnchor", fj = "AnchorPoint", fY = "top_left", fo = @es(fU = -99))
    public transient bJ lb;
    @ex(fw = "hudRelativeX", fj = "Relative X", fo = @es(fU = -98))
    public transient double lc;
    @ex(fw = "hudRelativeY", fj = "Relative Y", fo = @es(fU = -97))
    public transient double ld;
    @ex(fw = "hudScale", fj = "Scale", fo = @es(fU = -96))
    public transient double le;
    
    @Override
    public Boolean fp() {
        return null;
    }
    
    public double getX(final double n) {
        return this.lb.getX(iv.my()) + this.lc - this.lb.getX(n);
    }
    
    public double getY(final double n) {
        return this.lb.getY(iv.mz()) + this.ld - this.lb.getY(n);
    }
    
    public <C extends ed> double d(final dT<C> dt) {
        return this.lb.getX(iv.my()) - this.lb.getX(dt.eJ());
    }
    
    public <C extends ed> double e(final dT<C> dt) {
        return this.lb.getY(iv.mz()) - this.lb.getY(dt.eK());
    }
    
    public void fq() {
        final double x1 = this.lb.getX(iv.my()) + this.lc;
        final double y1 = this.lb.getY(iv.mz()) + this.ld;
        bJ top_LEFT = bJ.TOP_LEFT;
        double n = -1.0;
        for (final bJ bj : bJ.values()) {
            final double distance = Point2D.distance(x1, y1, bj.getX(iv.my()), bj.getY(iv.mz()));
            if (n == -1.0 || distance < n) {
                top_LEFT = bj;
                n = distance;
            }
        }
        this.lc = x1 - top_LEFT.getX(iv.my());
        this.ld = y1 - top_LEFT.getY(iv.mz());
        this.lb = top_LEFT;
    }
    
    public void a(final dT<?> dt, final double n, final double n2) {
        this.fq();
        double lc = n - this.d(dt);
        double ld = n2 - this.e(dt);
        Label_0063: {
            if (this.lb.isLeft()) {
                if (lc >= 0.0) {
                    break Label_0063;
                }
            }
            else if (!this.lb.isRightSide() || lc <= 0.0) {
                break Label_0063;
            }
            lc = 0.0;
        }
        Label_0103: {
            if (this.lb.isTop()) {
                if (ld >= 0.0) {
                    break Label_0103;
                }
            }
            else if (!this.lb.isBottomSide() || ld <= 0.0) {
                break Label_0103;
            }
            ld = 0.0;
        }
        this.lc = lc;
        this.ld = ld;
    }
    
    public void a(final bJ lb, final double lc, final double ld) {
        this.lb = lb;
        this.lc = lc;
        this.ld = ld;
    }
    
    public void b(final dT<?> dt, final double n, final double n2) {
        double n3 = 0.0;
        double n4 = 0.0;
        if (this.lb.isLeft()) {
            n3 = dt.eJ() / 2.0;
        }
        if (this.lb.isRightSide()) {
            n3 = -dt.eJ() / 2.0;
        }
        if (this.lb.isTop()) {
            n4 = dt.eK() / 2.0;
        }
        else if (this.lb.isBottomSide()) {
            n4 = -dt.eK() / 2.0;
        }
        this.lc = n - this.lb.getX(iv.my()) - n3;
        this.ld = n2 - this.lb.getY(iv.mz()) - n4;
    }
    
    public void a(final dT<?> dt, final bJ lb, final double lc, final double ld, final double le) {
        this.lb = lb;
        this.lc = lc;
        this.ld = ld;
        this.le = le;
    }
    
    public double fr() {
        return 1.0;
    }
    
    public double fs() {
        return 1.0;
    }
    
    public double ft() {
        return this.le;
    }
    
    public enum a
    {
        @eo(fw = "background", fj = "Background")
        BACKGROUND, 
        @eo(fw = "brackets", fj = "Brackets")
        BRACKETS, 
        @eo(fw = "justText", fj = "Just Text")
        JUST_TEXT;
        
        private static /* synthetic */ a[] $values() {
            return new a[] { a.BACKGROUND, a.BRACKETS, a.JUST_TEXT };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
