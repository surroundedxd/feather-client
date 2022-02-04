// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.util.ResourceLocation;

class bG implements bD
{
    private static final ResourceLocation hB;
    private static final ResourceLocation hC;
    private is hD;
    private dT<? extends ed> hE;
    private ed hF;
    
    @Override
    public void a(final is hd, final dT<? extends ed> he) {
        this.hD = hd;
        this.hE = he;
        this.hF = he.dK();
    }
    
    @Override
    public void bx() {
        this.hE = null;
        this.hF = null;
    }
    
    @Override
    public void B(final int n) {
        this.hE.eM().b(this.hD, 0, 0, (int)Math.round(this.hE.eJ()), (int)Math.round(this.hE.eK()), n);
    }
    
    @Override
    public void by() {
        final int mw = iv.mw();
        final int mx = iv.mx();
        final int n = mw / 4;
        final int n2 = mx / 4;
        final double eb = this.hE.eB();
        final double ec = this.hE.eC();
        final int n3 = (int)(this.hE.eK() + 4.0);
        final String fj = this.hE.eT().eO().fj();
        final iP em = this.hE.eM();
        final int n4 = (int)Math.round(this.hE.eJ() - em.V(fj));
        if (eb < n) {
            if (ec < n2) {
                em.a(this.hD, fj, 0.0f, (float)n3, -1, false, false);
            }
            else {
                em.a(this.hD, fj, 0.0f, -13.0f, -1, false, false);
            }
        }
        else if (ec < n2) {
            em.a(this.hD, fj, (float)n4, (float)n3, -1, false, false);
        }
        else {
            em.a(this.hD, fj, (float)n4, -13.0f, -1, false, false);
        }
    }
    
    @Override
    public void C(final int n) {
        final int n2 = (int)Math.round(this.hE.eJ());
        final int n3 = (int)Math.round(this.hE.eK());
        final iP em = this.hE.eM();
        em.b(this.hD, -2, -2, 2, 2, n);
        em.b(this.hD, n2 - 2, -2, n2 + 2, 2, n);
        em.b(this.hD, -2, n3 - 2, 2, n3 + 2, n);
        em.b(this.hD, n2 - 2, n3 - 2, n2 + 2, n3 + 2, n);
    }
    
    @Override
    public void D(final int n) {
        this.hE.eM().a(this.hD, 0, 0, (int)Math.round(this.hE.eJ()), (int)Math.round(this.hE.eK()), n);
    }
    
    @Override
    public void d(final int n, final int n2) {
        if (n != 0) {
            this.D(n);
        }
        if (n2 != 0) {
            this.C(n2);
        }
    }
    
    @Override
    public void bz() {
        this.hD.mf();
        final double n = iv.mA() * 2.0;
        this.hD.b(1.0 / n, 1.0 / n, 1.0);
        final int n2 = (int)Math.round(this.hE.eJ() * n) - 48;
        final int n3 = (int)Math.round(this.hE.eK() * n) - 48;
        final iP em = this.hE.eM();
        io.a(0, bG.hC);
        em.a(this.hD, 0, n3, 0.0f, 0.0f, 48, 48, 48, 48, 48.0f, 48.0f);
        io.a(0, bG.hB);
        em.a(this.hD, n2, n3, 0.0f, 0.0f, 48, 48, 48, 48, 48.0f, 48.0f);
        this.hD.mg();
    }
    
    static {
        hB = new ResourceLocation("feather:textures/gui/modlayout/remove.png");
        hC = new ResourceLocation("feather:textures/gui/modlayout/settings.png");
    }
}
