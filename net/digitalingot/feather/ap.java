// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class aP implements au
{
    @SubscribeEvent
    public void a(final TickEvent.ClientTickEvent clientTickEvent) {
        ao.bE.aH().tick(this.a(clientTickEvent.phase));
    }
    
    @SubscribeEvent
    public void a(final TickEvent.WorldTickEvent worldTickEvent) {
        ao.bF.aH().tick(this.a(worldTickEvent.phase), worldTickEvent.world);
    }
    
    @SubscribeEvent
    public void a(final TickEvent.PlayerTickEvent playerTickEvent) {
        ao.bG.aH().tick(this.a(playerTickEvent.phase), playerTickEvent.player);
    }
    
    @SubscribeEvent
    public void a(final TickEvent.RenderTickEvent renderTickEvent) {
        ao.bH.aH().tick(this.a(renderTickEvent.phase), renderTickEvent.renderTickTime);
    }
    
    @NotNull
    private ao.c a(final TickEvent.Phase phase) {
        return (phase == TickEvent.Phase.END) ? ao.c.END : ao.c.START;
    }
}
