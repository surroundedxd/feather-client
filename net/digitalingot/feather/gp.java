// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;

@dV(eN = ec.SERVER_ADDRESS, eO = @eb(fj = "Server Address", fk = "https://assets.feathercdn.net/game/mods/serveraddress.svg", fl = "Shows the server address", fm = { dk.a.HUD }))
public class gP extends dX<a>
{
    private static final Minecraft nQ;
    private static final ResourceLocation vQ;
    private ResourceLocation vR;
    private String vS;
    
    @Override
    public boolean eY() {
        return gP.nQ.func_147104_D() != null;
    }
    
    @Override
    public Object eV() {
        return (gP.nQ.func_147104_D() != null) ? gP.nQ.func_147104_D().field_78845_b : null;
    }
    
    @Override
    public String eW() {
        return "feathermc.com";
    }
    
    @Override
    public int eD() {
        return this.gO = super.eD() + (((a)this.jK).uM ? (((a)this.jK).lk + 6) : 0);
    }
    
    @Override
    public int eE() {
        return ((a)this.jK).uM ? Math.max(super.eE(), ((a)this.jK).lk) : super.eE();
    }
    
    @Override
    protected void c(final is is) {
        final int lk = ((a)this.jK).lk;
        if (((a)this.jK).uM) {
            this.kE.a(is, this.kK, (float)(((a)this.jK).uM ? (lk + 3) : 0), lk / 2.0f - Minecraft.func_71410_x().field_71466_p.field_78288_b / 2.0f, ((a)this.jK).lo, ((a)this.jK).lp);
            if (gP.nQ.func_147104_D() != null && (this.vS == null || !this.vS.equals(gP.nQ.func_147104_D().field_78845_b))) {
                this.vS = gP.nQ.func_147104_D().field_78845_b;
                if (this.vS != null && !this.vS.isEmpty()) {
                    this.vR = new ResourceLocation("servers/" + this.vS + "/icon");
                }
                else {
                    this.vR = null;
                }
            }
            io.a(0, (this.vR == null) ? gP.vQ : this.vR);
            GlStateManager.func_179147_l();
            GlStateManager.func_179112_b(770, 771);
            GlStateManager.func_179090_x();
            this.kE.a(is, 0, 0, 0.0f, 0.0f, lk, lk, lk, lk, (float)lk, (float)lk);
            GlStateManager.func_179098_w();
        }
        else {
            super.c(is);
        }
    }
    
    @Override
    public boolean eX() {
        return false;
    }
    
    static {
        nQ = Minecraft.func_71410_x();
        vQ = new ResourceLocation("textures/misc/unknown_server.png");
    }
    
    @ep
    @eu(fW = { @ev(fX = "backgroundWidth", fY = "75", fR = 150) })
    public static class a extends eh
    {
        @es(fU = 0)
        public fc mu;
        @ex(fw = "showIcon", fj = "Show icon", fY = "true", gb = @et(fw = "displayMode", fV = { "background", "justText" }), fo = @es(fU = 1))
        public boolean uM;
        
        public a() {
            this.mu = new fc("General Options");
        }
    }
}
