// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.core;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.util.ChatComponentTranslation;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ ChatComponentTranslation.class })
public interface m
{
    @Accessor("lastTranslationUpdateTimeInMilliseconds")
    void setLastUpdate(final long p0);
}
