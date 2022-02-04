// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class aD implements au
{
    @SubscribeEvent
    public void a(final FOVUpdateEvent fovUpdateEvent) {
        fovUpdateEvent.newfov = U.bk.aH().updateFOV(fovUpdateEvent.fov, fovUpdateEvent.newfov);
    }
}
