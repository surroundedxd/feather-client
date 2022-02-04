// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import java.util.List;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class aH implements au
{
    @SubscribeEvent
    public void a(final ItemTooltipEvent itemTooltipEvent) {
        X.bk.aH().showTooltip(itemTooltipEvent.itemStack, itemTooltipEvent.toolTip);
    }
}
