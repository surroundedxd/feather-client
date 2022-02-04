// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.client.entity.EntityPlayerSP;
import org.jetbrains.annotations.NotNull;

public class gn extends gp
{
    public gn(@NotNull final i i, @NotNull final ix ix, @NotNull final gd gd) {
        super(i, gd, ix, a.LEADER);
    }
    
    @Override
    public void a(final EntityPlayerSP entityPlayerSP, final String[] array) {
        if (array.length == 0) {
            bq.a(entityPlayerSP, (IChatComponent)new ChatComponentTranslation("feather.commands.featherparty.mode.usage", new Object[0]));
            return;
        }
        final String lowerCase = array[0].toLowerCase();
        int n = -1;
        switch (lowerCase.hashCode()) {
            case -1039745817: {
                if (lowerCase.equals("normal")) {
                    n = 0;
                    break;
                }
                break;
            }
            case 110: {
                if (lowerCase.equals("n")) {
                    n = 1;
                    break;
                }
                break;
            }
            case -490041217: {
                if (lowerCase.equals("proximity")) {
                    n = 2;
                    break;
                }
                break;
            }
            case 112: {
                if (lowerCase.equals("p")) {
                    n = 3;
                    break;
                }
                break;
            }
        }
        iL.b b = null;
        String s = null;
        switch (n) {
            case 0:
            case 1: {
                b = iL.b.EVERYONE;
                s = "feather.commands.featherparty.mode.successNormal";
                break;
            }
            case 2:
            case 3: {
                b = iL.b.PROXIMITY;
                s = "feather.commands.featherparty.mode.successProximity";
                break;
            }
            default: {
                bq.a(entityPlayerSP, (IChatComponent)new ChatComponentTranslation("feather.commands.featherparty.mode.usage", new Object[0]));
                return;
            }
        }
        this.qK.hR().a(b);
        bq.a(entityPlayerSP, (IChatComponent)new ChatComponentTranslation(s, new Object[0]));
    }
}
