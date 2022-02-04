// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

public abstract class dX<C extends eh> extends dT<C>
{
    protected float kG;
    protected float kH;
    protected int kI;
    protected int kJ;
    protected String kK;
    protected Object kL;
    private final String kM;
    private final String kN;
    private a kO;
    
    public abstract Object eV();
    
    public String eW() {
        return "";
    }
    
    public abstract boolean eX();
    
    public boolean eY() {
        return true;
    }
    
    public dX() {
        this(null, null);
    }
    
    public dX(final String km, final String kn) {
        this.kM = km;
        this.kN = kn;
    }
    
    @Override
    public int eD() {
        return this.gO = ((this.jK.lh == ed.a.BACKGROUND) ? this.jK.lj : this.kI);
    }
    
    @Override
    public int eE() {
        return this.gP = ((this.jK.lh == ed.a.BACKGROUND) ? this.jK.lk : this.kJ);
    }
    
    @Override
    public void eR() {
        this.a(a.HUD_OVERLAY, true);
        this.fa();
    }
    
    @Override
    public void a(final a a, final is is) {
        this.a(a, is, a == dT.a.MOD_LAYOUT, true);
    }
    
    @Override
    public void b(final is is) {
        this.a(a.MOD_LAYOUT, is, true, true);
    }
    
    protected void a(final a a, final is is, final boolean b, final boolean b2) {
        if (b || this.eY()) {
            if (b2) {
                this.a(a, false);
            }
            if (this.kK == null || this.kK.isEmpty()) {
                return;
            }
            if (this.jK.lh == ed.a.BACKGROUND) {
                this.kE.b(is, 0, 0, this.gO, this.gP, this.jK.li.getRGB());
                if (this.jK.ll) {
                    this.kE.a(is, 0, 0, this.gO, this.gP, this.jK.lm.getRGB(), this.jK.ln / 20.0f);
                }
            }
            this.c(is);
        }
    }
    
    protected void c(final is is) {
        this.kE.a(is, this.kK, this.kG, this.kH, this.jK.lo, this.jK.lp);
    }
    
    private void eZ() {
        this.kI = io.az(this.kK);
        this.kJ = (int)io.s(this.jK.lp);
    }
    
    protected void a(final a a, final boolean b) {
        this.a(a, this.eV(), b);
    }
    
    protected void a(final a ko, final Object kl, final boolean b) {
        if (!b && kl == this.kL && this.kO == ko) {
            return;
        }
        this.kL = kl;
        this.kO = ko;
        switch (dX$1.kP[ko.ordinal()]) {
            case 1: {
                this.c(kl);
                break;
            }
            case 2: {
                this.d(kl);
                break;
            }
        }
        this.eZ();
        this.fa();
    }
    
    private void fa() {
        if (this.jK.lh == ed.a.BACKGROUND) {
            this.kG = (this.eD() - this.kI) / 2.0f;
            this.kH = (this.eE() - this.kJ) / 2.0f;
        }
        else {
            this.kG = 0.0f;
            this.kH = 0.0f;
        }
    }
    
    private void c(final Object obj) {
        final String value = String.valueOf(obj);
        final int length = value.length();
        if (length == 0) {
            this.kK = "";
            return;
        }
        final boolean ex = this.eX();
        final boolean b = this.kM != null && !this.kM.isEmpty() && ex;
        final boolean b2 = this.kN != null && !this.kN.isEmpty() && !ex;
        final boolean b3 = this.jK.lh == ed.a.BRACKETS;
        final StringBuilder sb = new StringBuilder((b3 ? 2 : 0) + (b ? this.kM.length() : (b2 ? this.kN.length() : 0)) + length);
        if (b3) {
            sb.append('[');
        }
        if (b) {
            sb.append(this.kM);
        }
        sb.append(value);
        if (b2) {
            sb.append(this.kN);
        }
        if (b3) {
            sb.append(']');
        }
        this.kK = sb.toString();
    }
    
    private void d(final Object o) {
        if (this.eW().isEmpty()) {
            this.c(o);
        }
        else {
            this.kK = this.eW();
        }
    }
}
