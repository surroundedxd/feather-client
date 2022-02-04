// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.core;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.client.gui.GuiButton;
import java.util.List;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ GuiScreen.class })
public interface j
{
    @Accessor("buttonList")
    List<GuiButton> getRenderables();
}
