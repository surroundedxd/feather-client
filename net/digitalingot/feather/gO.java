// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.UUID;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.client.entity.EntityPlayerSP;
import org.jetbrains.annotations.NotNull;

public class go extends gp
{
    public go(@NotNull final i i, @NotNull final ix ix, @NotNull final gd gd) {
        super(i, gd, ix, a.LEADER);
    }
    
    @Override
    public void a(final EntityPlayerSP entityPlayerSP, final String[] array) {
        if (array.length == 0) {
            bq.a(entityPlayerSP, (IChatComponent)new ChatComponentTranslation("feather.commands.featherparty.remove.usage", new Object[0]));
            return;
        }
        final String s = array[0];
        final UUID h = this.F.h(s);
        if (this.qG.hU().lE().lA().contains(h)) {
            bq.a(entityPlayerSP, (IChatComponent)new ChatComponentTranslation("feather.commands.targetNotFound", new Object[0]));
            return;
        }
        this.qK.hR().q(h);
        bq.a(entityPlayerSP, (IChatComponent)new ChatComponentTranslation("feather.commands.featherparty.remove.success", new Object[] { s }));
    }
}
