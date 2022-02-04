// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.Iterator;
import java.util.function.Consumer;

public class fr implements cb<dK, cp, cn>
{
    @Override
    public void a(final dK dk, final Consumer<cp> consumer, final Consumer<cn> consumer2) {
        final ea m = e.s().m();
        final Iterator<ec> iterator = dk.er().iterator();
        while (iterator.hasNext()) {
            final dW<?> a = m.a(iterator.next());
            if (a.eT().eO().fn().fj().isEmpty()) {
                continue;
            }
            m.c(a);
        }
        fq.a(m);
        consumer.accept(new cp("success"));
    }
}
