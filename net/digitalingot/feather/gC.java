// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.Iterator;
import net.minecraft.client.Minecraft;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public class gc implements v
{
    @NotNull
    private final gb qD;
    
    public gc(@NotNull final gb qd) {
        this.qD = qd;
    }
    
    @Override
    public void a(final UUID uuid, final t t) {
    }
    
    @Override
    public void b(final List<a> list) {
        for (final a a2 : list) {
            this.qD.hT().put(a2.ai(), a2.af());
        }
        if (list.stream().anyMatch(a -> a.ai().toString().replace("-", "").equals(Minecraft.func_71410_x().func_110432_I().func_148255_b()))) {
            I.b(this.qD);
        }
    }
}
