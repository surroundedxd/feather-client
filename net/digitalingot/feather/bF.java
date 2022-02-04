// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.function.Consumer;

public class bf implements cb<cK, cp, cn>
{
    @Override
    public void a(final cK renderMod, final Consumer<cp> consumer, final Consumer<cn> consumer2) {
        dU.INSTANCE.setRenderMod(renderMod);
        consumer.accept(new cp("success"));
    }
}
