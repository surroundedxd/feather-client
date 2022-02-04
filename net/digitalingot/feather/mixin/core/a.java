// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.core;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.client.gui.Gui;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ Gui.class })
public interface a
{
    @Accessor("zLevel")
    float getBlitOffset();
}
