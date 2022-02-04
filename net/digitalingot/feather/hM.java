// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class hm
{
    public static a j(final ItemStack itemStack) {
        final ItemFood itemFood = (ItemFood)itemStack.func_77973_b();
        return new a(itemFood.func_150905_g(itemStack), itemFood.func_150906_h(itemStack));
    }
    
    public static a k(final ItemStack itemStack) {
        return j(itemStack);
    }
    
    public static class a
    {
        public final int yr;
        public final float ys;
        
        public a(final int yr, final float ys) {
            this.yr = yr;
            this.ys = ys;
        }
        
        public float jn() {
            return this.yr * this.ys * 2.0f;
        }
    }
}
