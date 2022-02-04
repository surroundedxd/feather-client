// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.function.Consumer;

public class fn implements cb<dr, cp, cn>
{
    @Override
    public void a(final dr dr, final Consumer<cp> consumer, final Consumer<cn> consumer2) {
        final eY gk = e.s().m().fh().gK();
        new eX(gk, dr.dL()).gI().renameTo(new eX(gk, dr.dM()).gI());
        if (gk.gN().getName().equals(dr.dL())) {
            gk.C(dr.dM());
        }
        consumer.accept(new cp("success"));
    }
}
