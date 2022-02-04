// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.digitalingot.feather.mixin.core.h;

@dV(eN = ec.FPS, eO = @eb(fj = "FPS", fk = "https://assets.feathercdn.net/game/mods/fps.svg", fl = "Display your frames per second", fm = { dk.a.HUD }))
public class gG extends dX<a>
{
    public gG() {
        super("FPS: ", " FPS");
    }
    
    @Override
    public Object eV() {
        return h.getFPS();
    }
    
    @Override
    public boolean eX() {
        return ((a)this.jK).rJ;
    }
    
    @ep(fL = bJ.TOP_LEFT, fJ = 0.0, fK = 0.0)
    @el(fE = true)
    public static class a extends eh
    {
        @es(fU = 0)
        public fc sF;
        @ex(fw = "reversed", fj = "Reversed", fo = @es(fU = 1))
        public boolean rJ;
        
        public a() {
            this.sF = new fc("FPS");
        }
    }
}
