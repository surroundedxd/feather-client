// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.inventory.IInventory;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.Minecraft;

@dV(eN = ec.TOGGLE_SPRINT, eO = @eb(fj = "Toggle Sprint", fk = "https://assets.feathercdn.net/game/mods/togglesprint.svg", fl = "Toggle your sprint and sneak key", fm = { dk.a.PVP }))
public class gR extends dX<a>
{
    private static final Minecraft minecraft;
    private static final KeyBinding vX;
    private static final KeyBinding vY;
    private boolean vZ;
    private boolean wa;
    private boolean wb;
    private boolean wc;
    private boolean wd;
    
    @Override
    public void initialize() {
        W.bn.a((n, p1, n2, p3) -> {
            if (!this.eU()) {
                return;
            }
            else if (gR.minecraft.field_71439_g == null) {
                return;
            }
            else {
                if (gR.minecraft.field_71474_y.field_151444_V.func_151463_i() == n && n2 == 1 && gR.minecraft.field_71439_g.field_71075_bZ.field_75100_b) {
                    this.wb = (((a)this.jK).wg && !this.wb);
                    this.wc = !this.wc;
                }
                return;
            }
        });
        al.bk.a(guiScreen -> {
            if (!this.eU()) {
                return guiScreen;
            }
            else {
                if (this.vZ && guiScreen instanceof IInventory) {
                    this.vZ = false;
                    this.wa = true;
                }
                return guiScreen;
            }
        });
        ao.bE.a(c -> {
            if (!(!this.eU())) {
                if (c == ao.c.START) {
                    if (this.wa && Minecraft.func_71410_x().field_71462_r == null) {
                        this.vZ = true;
                        this.wa = false;
                    }
                }
            }
        });
    }
    
    @Override
    public Object eV() {
        if (gR.minecraft.field_71439_g == null) {
            return "";
        }
        if (!gR.vY.func_151470_d()) {
            this.wd = false;
        }
        if (((a)this.jK).wg && gR.vX.func_151468_f()) {
            this.wb = !this.wb;
        }
        else if (((a)this.jK).wf && gR.vY.func_151468_f() && !gR.minecraft.field_71439_g.field_71075_bZ.field_75100_b) {
            this.vZ = !this.vZ;
        }
        if (gR.minecraft.field_71439_g.func_70093_af()) {
            return gR.minecraft.field_71474_y.field_74311_E.func_151470_d() ? ((a)this.jK).wm : ((a)this.jK).wn;
        }
        if (gR.minecraft.field_71439_g.func_70051_ag() || this.wb) {
            return gR.minecraft.field_71474_y.field_151444_V.func_151470_d() ? ((a)this.jK).wo : (this.wb ? ((a)this.jK).wp : ((a)this.jK).wq);
        }
        return "";
    }
    
    @Override
    public void b(final is is) {
        this.a(dT.a.HUD_OVERLAY, ((a)this.jK).wp, false);
        this.a(dT.a.MOD_LAYOUT, is, true, false);
    }
    
    @Override
    public String eW() {
        return ((a)this.jK).wp;
    }
    
    @Override
    public boolean eL() {
        return !((a)this.jK).wl;
    }
    
    @Override
    public boolean eX() {
        return false;
    }
    
    @Override
    public void eR() {
        super.eR();
        if (!((a)this.jK).wf) {
            this.vZ = false;
        }
        this.wb = ((a)this.jK).wg;
    }
    
    @Override
    public void eQ() {
        this.wb = false;
        this.vZ = false;
    }
    
    public boolean iF() {
        return this.eU() && this.wb;
    }
    
    public boolean iG() {
        return this.eU() && this.vZ;
    }
    
    public void p(final boolean vz) {
        this.vZ = vz;
    }
    
    public boolean iH() {
        return !this.eU() || !((a)this.jK).wi;
    }
    
    public boolean iI() {
        return this.wc && gR.minecraft.field_71439_g.field_71075_bZ.field_75098_d;
    }
    
    public int iJ() {
        return ((a)this.jK).wj;
    }
    
    static {
        minecraft = Minecraft.func_71410_x();
        vX = gR.minecraft.field_71474_y.field_151444_V;
        vY = gR.minecraft.field_71474_y.field_74311_E;
    }
    
    @ep(fL = bJ.TOP_LEFT, fJ = 1.0, fK = 94.0)
    @el(fE = true)
    @eu(fW = { @ev(fX = "backgroundWidth", fR = 150, fY = "110"), @ev(fX = "backgroundHeight", fY = "16") })
    public static class a extends eh
    {
        @es(fU = 0)
        public fc we;
        @ex(fw = "toggleSneak", fj = "Toggle Sneak", fo = @es(fU = 1))
        public boolean wf;
        @ex(fw = "toggleSprint", fj = "Toggle Sprint", fY = "true", fo = @es(fU = 2))
        public boolean wg;
        @es(fU = 10)
        public fc wh;
        @ex(fw = "blockSprintWhenFlying", fj = "Block Sprint", fo = @es(fU = 11))
        public boolean wi;
        @ex(fw = "flyBoostAmount", fj = "Boost Amount", fY = "1", fo = @es(fU = 12))
        @er(fS = 1, fR = 8)
        public int wj;
        @es(fU = 20)
        public fc wk;
        @ex(fw = "hideText", fj = "Hide Text", fo = @es(fU = 21))
        public boolean wl;
        @ex(fw = "sneakingKeyHeldText", fj = "Sneaking Held", fY = "Sneaking (Key Held)", fo = @es(fU = 23))
        @ew(fS = 0, fR = 32)
        public String wm;
        @ex(fw = "sneakingToggledText", fj = "Sneaking Toggled", fY = "Sneaking (Toggled)", fo = @es(fU = 24))
        @ew(fS = 0, fR = 32)
        public String wn;
        @ex(fw = "sprintingKeyHeldText", fj = "Sprinting Held", fY = "Sprinting (Key Held)", fo = @es(fU = 25))
        @ew(fS = 0, fR = 32)
        public String wo;
        @ex(fw = "sprintingToggledText", fj = "Sprinting Toggled", fY = "Sprinting (Toggled)", fo = @es(fU = 26))
        @ew(fS = 0, fR = 32)
        public String wp;
        @ex(fw = "sprintingVanillaText", fj = "Sprinting Vanilla", fY = "Sprinting (Vanilla)", fo = @es(fU = 27))
        @ew(fS = 0, fR = 32)
        public String wq;
        
        public a() {
            this.we = new fc("Toggle Sprint");
            this.wh = new fc("Fly");
            this.wk = new fc("Text Settings");
        }
        
        @Override
        public int fu() {
            return 0;
        }
    }
}
