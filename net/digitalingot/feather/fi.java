// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.IReloadableResourceManager;

@dV(eN = ec.PERFORMANCE_OPTIONS, eO = @eb(fj = "Performance", fk = "https://assets.feathercdn.net/game/sidebar/performance.svg", fl = "", fm = {}, fn = @eb.a(fj = "Performance", fo = @es(fU = 2))))
public class fI extends dW<a>
{
    @Override
    public void initialize() {
        aU.aQ();
        iU.Et.tc();
        iU.Et.td();
        ((IReloadableResourceManager)Minecraft.func_71410_x().func_110442_L()).func_110542_a((IResourceManagerReloadListener)new ky());
    }
    
    @Override
    public void eR() {
        Minecraft.func_71410_x().field_71438_f.func_72712_a();
    }
    
    public static final class a extends eg
    {
        @es(fU = 0)
        public fc oB;
        @ex(fw = "fastRendering", fj = "Use Fast Rendering", fY = "true", fo = @es(fU = 1))
        public boolean oC;
        @ex(fw = "directMemoryAccess", fj = "Use Direct Memory Access", fY = "true", fo = @es(fU = 3), gb = @et(fw = "fastRendering"))
        public boolean oD;
        @ex(fw = "fastFontRenderer", fj = "Use Fast Font Rendering", fY = "true", fo = @es(fU = 4))
        public boolean oE;
        @ex(fw = "staticParticleColor", fj = "Use Static Particle Color", fY = "false", fo = @es(fU = 5))
        public boolean oF;
        @ex(fw = "lazyChunkLoading", fj = "Lazy Chunk Loading", fY = "medium", fo = @es(fU = 6))
        public fI.a.a oG;
        @es(fU = 10)
        public fc oH;
        @ex(fw = "fastBlockLighting", fj = "Use Fast Block Lighting", fY = "true", fo = @es(fU = 11))
        public boolean oI;
        @ex(fw = "fastEntityLighting", fj = "Use Fast Entity Lighting", fY = "true", fo = @es(fU = 12))
        public boolean oJ;
        @es(fU = 20)
        public fc oK;
        @ex(fw = "useCulling", fj = "Use Culling", fY = "true", fo = @es(fU = 21))
        public boolean oL;
        @ex(fw = "cullNametags", fj = "Cull Nametags", fY = "true", gb = @et(fw = "useCulling"), fo = @es(fU = 22))
        public boolean oM;
        public b oN;
        
        public a() {
            this.oB = new fc("Rendering Settings");
            this.oH = new fc("Lighting Settings");
            this.oK = new fc("Advanced Settings");
            this.oN = b.DEFAULT;
        }
        
        @Override
        public boolean dI() {
            return true;
        }
        
        public enum a
        {
            @eo(fw = "off", fj = "Off")
            OFF, 
            @eo(fw = "low", fj = "Low")
            LOW, 
            @eo(fw = "medium", fj = "Medium")
            MEDIUM, 
            @eo(fw = "high", fj = "High")
            HIGH;
            
            public int getValue() {
                switch (fI$1.oA[this.ordinal()]) {
                    case 1: {
                        return 50;
                    }
                    case 2: {
                        return 250;
                    }
                    case 3: {
                        return 500;
                    }
                    default: {
                        return 0;
                    }
                }
            }
            
            private static /* synthetic */ a[] $values() {
                return new a[] { a.OFF, a.LOW, a.MEDIUM, a.HIGH };
            }
            
            static {
                $VALUES = $values();
            }
        }
        
        public enum b
        {
            @eo(fw = "default", fj = "Default")
            DEFAULT, 
            @eo(fw = "basic", fj = "Basic")
            BASIC;
            
            private static /* synthetic */ b[] $values() {
                return new b[] { b.DEFAULT, b.BASIC };
            }
            
            static {
                $VALUES = $values();
            }
        }
    }
}
