// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ax implements au
{
    @SubscribeEvent
    public void a(final AttackEntityEvent attackEntityEvent) {
        if (!Minecraft.func_71410_x().func_152345_ab()) {
            return;
        }
        N.bk.aH().attack(attackEntityEvent.entityPlayer, attackEntityEvent.target);
    }
}
