// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

public class ic implements cb<dN, cp, cn>
{
    @NotNull
    private final ib Ba;
    
    public ic(@NotNull final ib ba) {
        this.Ba = ba;
    }
    
    @Override
    public void a(final dN dn, final Consumer<cp> consumer, final Consumer<cn> consumer2) {
        final ia eu = dn.eu();
        if (dn.et() != null) {
            final ia ia2 = this.Ba.lr().stream().filter(ia -> ia.getName().equals(dn.et())).findAny().orElse(null);
            if (ia2 == null) {
                throw new IllegalArgumentException("Waypoint not found");
            }
            ia2.Q(eu.getName());
            ia2.q(eu.lk());
            ia2.b(eu.ez());
            ia2.a(eu.ey());
            ia2.aw(this.Ba.lq());
            ia2.ax(this.Ba.lp());
        }
        else {
            eu.aw(this.Ba.lq());
            eu.ax(this.Ba.lp());
            this.Ba.a(eu);
        }
        consumer.accept(new cp("success"));
    }
}
