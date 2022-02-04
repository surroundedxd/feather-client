// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

@dV(eN = ec.CLEAR_WATER, eO = @eb(fj = "Clear Water", fk = "https://assets.feathercdn.net/game/mods/clearwater.svg", fl = "Removes fog underwater so you can see clearer", fm = {}))
public class fz extends dW<a>
{
    private float mT;
    private float mU;
    
    @Override
    public void initialize() {
        T.bk.a((blockStaticLiquid, p1) -> {
            if (this.eU()) {
                if (((a)this.jK).mZ && blockStaticLiquid == Blocks.field_150355_j) {
                    return Float.valueOf(this.mT);
                }
                else if (((a)this.jK).mW && blockStaticLiquid == Blocks.field_150353_l) {
                    return Float.valueOf(this.mU);
                }
            }
            return null;
        });
    }
    
    @Override
    public void eR() {
        this.mT = N(((a)this.jK).na);
        this.mU = N(((a)this.jK).mX);
    }
    
    private static float N(final int n) {
        return n * 0.2f / 100.0f;
    }
    
    public static class a extends eg
    {
        @es(fU = 0)
        public fc mV;
        @ex(fw = "lava", fj = "Lava", fo = @es(fU = 1))
        public boolean mW;
        @ex(fw = "fogDensityLava", fj = "Fog Density", gb = @et(fw = "lava"), fo = @es(fU = 2))
        @er
        public int mX;
        @es(fU = 10)
        public fc mY;
        @ex(fw = "water", fj = "Water", fY = "true", fo = @es(fU = 11))
        public boolean mZ;
        @ex(fw = "fogDensityWater", fj = "Fog Density", gb = @et(fw = "water"), fo = @es(fU = 12))
        @er
        public int na;
        
        public a() {
            this.mV = new fc("Lava");
            this.mY = new fc("Water");
        }
    }
}
