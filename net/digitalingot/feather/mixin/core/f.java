// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.core;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.util.FoodStats;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ FoodStats.class })
public interface f
{
    @Accessor
    float getFoodExhaustionLevel();
}
