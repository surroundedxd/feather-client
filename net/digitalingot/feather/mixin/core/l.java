// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.core;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.util.ChatComponentText;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ ChatComponentText.class })
public interface l
{
    @Accessor("text")
    void setText(final String p0);
}
