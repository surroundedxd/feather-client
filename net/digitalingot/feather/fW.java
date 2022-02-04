// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.awt.Color;
import java.nio.FloatBuffer;

@dV(eN = ec.ANIMATIONS, eO = @eb(fj = "Animations", fk = "https://assets.feathercdn.net/game/mods/animations.svg", fl = "Switch between 1.7 and 1.8 animations", fm = {}))
public class fw extends dW<a>
{
    public void a(final FloatBuffer floatBuffer) {
        final a.a ms = ((a)this.jK).ms;
        final Color mt = ((a)this.jK).mt;
        if (ms == a.a.CUSTOM_COLOR) {
            floatBuffer.put(mt.getRed() / 255.0f);
            floatBuffer.put(mt.getGreen() / 255.0f);
            floatBuffer.put(mt.getBlue() / 255.0f);
            floatBuffer.put(mt.getAlpha() / 255.0f);
        }
        else if (ms == a.a.CHROMA) {
            final Color color = new Color(iM.sU().sW());
            floatBuffer.put(color.getRed() / 255.0f);
            floatBuffer.put(color.getGreen() / 255.0f);
            floatBuffer.put(color.getBlue() / 255.0f);
            floatBuffer.put(mt.getAlpha() / 255.0f);
        }
    }
    
    @el(fE = true)
    public static class a extends eg
    {
        @es(fU = 0)
        public fc md;
        @ex(fw = "blockHit", fj = "Block Hit", fY = "true", fo = @es(fU = 1))
        public boolean me;
        @ex(fw = "blockBreak", fj = "Block Break", fY = "true", fo = @es(fU = 2))
        public boolean mf;
        @ex(fw = "bow", fj = "Bow", fY = "true", fo = @es(fU = 3))
        public boolean mg;
        @ex(fw = "rod", fj = "Rod", fY = "true", fo = @es(fU = 4))
        public boolean mh;
        @ex(fw = "eating", fj = "Eating", fY = "true", fo = @es(fU = 5))
        public boolean mi;
        @ex(fw = "sneaking", fj = "Sneaking", fY = "true", fo = @es(fU = 6))
        public boolean mj;
        @ex(fw = "damage", fj = "Damage", fY = "true", fo = @es(fU = 7))
        public boolean mk;
        @ex(fw = "sword", fj = "Sword", fY = "true", fo = @es(fU = 8))
        public boolean ml;
        @ex(fw = "itemHeld", fj = "Item Held", fY = "true", fo = @es(fU = 9))
        public boolean mm;
        @ex(fw = "itemUpdate", fj = "Item Update", fY = "true", fo = @es(fU = 10))
        public boolean mn;
        @ex(fw = "swing", fj = "Swing", fY = "true", fo = @es(fU = 11))
        public boolean mo;
        @ex(fw = "health", fj = "Health", fY = "true", fo = @es(fU = 12))
        public boolean mp;
        @ex(fw = "debug", fj = "Debug", fY = "true", fo = @es(fU = 13))
        public boolean mq;
        @es(fU = 20)
        public fc mr;
        @ex(fw = "damageIndicatorMode", fj = "Mode", fY = "default", fo = @es(fU = 21))
        public fw.a.a ms;
        @ex(fw = "damageIndicatorColor", fj = "Color", fY = "160/0/0/76", gb = @et(fw = "damageIndicatorMode", fV = { "customColor" }), fo = @es(fU = 22))
        public Color mt;
        
        public a() {
            this.md = new fc("Animations");
            this.mr = new fc("Damage Indicator");
        }
        
        public enum a
        {
            @eo(fw = "default", fj = "Default")
            DEFAULT, 
            @eo(fw = "customColor", fj = "Custom Color")
            CUSTOM_COLOR, 
            @eo(fw = "chroma", fj = "Chroma")
            CHROMA;
            
            private static /* synthetic */ a[] $values() {
                return new a[] { a.DEFAULT, a.CUSTOM_COLOR, a.CHROMA };
            }
            
            static {
                $VALUES = $values();
            }
        }
    }
}
