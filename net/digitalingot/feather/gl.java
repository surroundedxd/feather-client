// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.network.NetHandlerPlayClient;
import java.awt.Color;
import net.minecraft.client.Minecraft;

@dV(eN = ec.PING, eO = @eb(fj = "Ping", fk = "https://assets.feathercdn.net/game/mods/ping.svg", fl = "Display your ping to the server", fm = { dk.a.HUD }))
public class gL extends dX<a>
{
    private static final Minecraft minecraft;
    
    @Override
    public Object eV() {
        return this.iv();
    }
    
    @Override
    public String eW() {
        return "888 ms";
    }
    
    @Override
    public boolean eL() {
        return ((a)this.jK).uX;
    }
    
    @Override
    public boolean eY() {
        return this.iv() > 0;
    }
    
    @Override
    public boolean eX() {
        return false;
    }
    
    public gL() {
        super("", " ms");
    }
    
    @Override
    protected void c(final is is) {
        this.kE.a(is, this.kK, this.kG, this.kH, this.iw(), ((a)this.jK).lp, ((a)this.jK).lo.gT());
    }
    
    public int S(final int n) {
        return Color.getHSBColor(Math.max((125.0f - n * 10.0f / ((a)this.jK).uV) / 360.0f, 0.0f), 1.0f, 1.0f).getRGB();
    }
    
    public int iv() {
        if (gL.minecraft.field_71439_g == null) {
            return 0;
        }
        final NetHandlerPlayClient func_147114_u = gL.minecraft.func_147114_u();
        if (func_147114_u == null) {
            return 0;
        }
        final NetworkPlayerInfo func_175102_a = func_147114_u.func_175102_a(gL.minecraft.field_71439_g.func_146103_bH().getId());
        if (func_175102_a == null) {
            return 0;
        }
        return func_175102_a.func_178853_c();
    }
    
    private int iw() {
        return ((a)this.jK).uY ? this.S(this.iv()) : ((a)this.jK).lo.gS();
    }
    
    static {
        minecraft = Minecraft.func_71410_x();
    }
    
    @ep(fL = bJ.TOP_RIGHT, fJ = 0.0, fK = 0.0)
    @el(fE = true)
    public static class a extends eh
    {
        @es(fU = 0)
        public fc mu;
        @ex(fw = "badPingColorChangeRate", fj = "Bad Ping Color Change Rate", fY = "25", fo = @es(fU = 1))
        @er(fS = 10, fR = 40)
        public int uV;
        @es(fU = 10)
        public fc uW;
        @ex(fw = "hud", fj = "Show HUD", fY = "false", fo = @es(fU = 11))
        public boolean uX;
        @ex(fw = "dynamicColor", fj = "Dynamic Color", fY = "true", gb = @et(fw = "hud"), fo = @es(fU = 14))
        public boolean uY;
        @ex(fw = "tabList", fj = "Tablist", fY = "true", fo = @es(fU = 21))
        public boolean uZ;
        @ex(fw = "tabListDynamicColor", fj = "Tab List Dynamic Color", fY = "true", gb = @et(fw = "tabList"), fo = @es(fU = 22))
        public boolean va;
        @ex(fw = "tabListColor", fj = "Tab List Color", fY = "255/255/255", gb = @et(fw = "tabList"), fo = @es(fU = 23))
        public Color vb;
        
        public a() {
            this.mu = new fc("General");
            this.uW = new fc("HUD");
        }
    }
}
