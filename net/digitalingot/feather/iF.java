// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.Iterator;
import net.minecraft.client.entity.EntityPlayerSP;
import java.awt.Color;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class if
{
    public static void a(final boolean b, @NotNull final ib ib) {
        final EntityPlayerSP field_71439_g = Minecraft.func_71410_x().field_71439_g;
        final ia.a a = new ia.a((int)Math.floor(field_71439_g.field_70169_q), (int)Math.floor(field_71439_g.field_70167_r), (int)Math.floor(field_71439_g.field_70166_s));
        ia ia = null;
        final Iterator<ia> iterator = ib.lr().iterator();
        while (iterator.hasNext()) {
            ia = iterator.next();
        }
        e.s().l().b(new dQ(b, new dQ.a(a, (ia != null) ? ia.ez() : new eZ(false, new Color(191, 0, 32, 223)))));
    }
}
