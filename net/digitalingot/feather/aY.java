// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ay implements au
{
    @SubscribeEvent
    public void a(final ClientChatReceivedEvent clientChatReceivedEvent) {
        if (clientChatReceivedEvent.type == 2) {
            return;
        }
        final IChatComponent receiveMessage = Q.bk.aH().receiveMessage(clientChatReceivedEvent.message);
        if (receiveMessage == null) {
            clientChatReceivedEvent.setCanceled(true);
            return;
        }
        clientChatReceivedEvent.message = receiveMessage;
    }
}
