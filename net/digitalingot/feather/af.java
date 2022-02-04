// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class aF implements au
{
    @SubscribeEvent
    public void a(final GuiScreenEvent.InitGuiEvent initGuiEvent) {
        final GuiScreen gui = initGuiEvent.gui;
        if (gui == null) {
            return;
        }
        ak.bv.aH().postInitialization(gui);
    }
}
