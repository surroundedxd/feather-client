// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.Optional;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

public class id implements cb<dO, cp, cn>
{
    @NotNull
    private final ib Ba;
    
    public id(@NotNull final ib ba) {
        this.Ba = ba;
    }
    
    @Override
    public void a(final dO do1, final Consumer<cp> consumer, final Consumer<cn> consumer2) {
        final Optional<ia> any = this.Ba.lr().stream().filter(ia -> ia.getName().equals(do1.et())).findAny();
        if (!any.isPresent()) {
            consumer2.accept(new cn("Waypoint not found"));
            return;
        }
        this.Ba.b(any.get());
        consumer.accept(new cp("success"));
    }
}
