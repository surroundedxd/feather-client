// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.HashMap;
import net.minecraft.client.Minecraft;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import java.util.Objects;
import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

public class K implements cb<cC, cp, cn>
{
    @NotNull
    private final gb bf;
    
    public K(@NotNull final gb bf) {
        this.bf = bf;
    }
    
    @Override
    public void a(final cC cc, final Consumer<cp> consumer, final Consumer<cn> consumer2) {
        final cC.a cq = cc.cQ();
        if (cq != null) {
            this.bf.hS().ad().a(cq.getSlug(), cq.cS());
        }
        final cC.b cr = cc.cR();
        if (cr != null) {
            final List<? super Object> list = ((HashMap<K, String>)cr).values().stream().filter(Objects::nonNull).map(s -> this.bf.hS().k(s)).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList());
            this.bf.hT().put(Minecraft.func_71410_x().func_110432_I().func_148256_e().getId(), (List<p>)list);
            this.bf.hR().k((List<p>)list);
        }
        consumer.accept(new cp("success"));
    }
}
