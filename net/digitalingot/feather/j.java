// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.Iterator;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

public class J implements cb<cB, cp, cn>
{
    @NotNull
    private final r be;
    
    public J(@NotNull final r be) {
        this.be = be;
    }
    
    @Override
    public void a(final cB cb, final Consumer<cp> consumer, final Consumer<cn> consumer2) {
        for (final String str : cb.af()) {
            final p k = this.be.k(str);
            if (k == null) {
                throw new IllegalArgumentException("Cosmetic with specified slug \"" + str + "\" not found");
            }
            if (k.X() == null) {
                continue;
            }
            this.be.ad().aD().put(str, (L)ca.GSON.fromJson(k.X(), (Class)L.class));
        }
        this.be.ad().aC();
        consumer.accept(new cp("success"));
    }
}
