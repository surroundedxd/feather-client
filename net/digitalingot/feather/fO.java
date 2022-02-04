// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.function.Consumer;

public class fo implements cb<ds, cp, cn>
{
    @Override
    public void a(final ds ds, final Consumer<cp> consumer, final Consumer<cn> consumer2) {
        final ea m = e.s().m();
        m.fh().gK().C(ds.dL());
        m.fe();
        consumer.accept(new cp("success"));
    }
}
