// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class aE implements au
{
    @SubscribeEvent
    public void a(final GuiOpenEvent guiOpenEvent) {
        final GuiScreen gui = guiOpenEvent.gui;
        if (gui == null) {
            return;
        }
        guiOpenEvent.gui = al.bk.aH().openScreen(gui);
    }
}
