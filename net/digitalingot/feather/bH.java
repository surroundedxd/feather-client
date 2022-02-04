// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.Iterator;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import com.google.common.collect.ImmutableMap;

public class bh
{
    @NotNull
    private static final ImmutableMap<Integer, Integer> cd;
    
    public static void a(@NotNull final ea ea) {
        e.s().l().b(new dd(b(ea)));
    }
    
    @NotNull
    private static Map<Integer, dd.a> b(@NotNull final ea ea) {
        final TreeMap<Integer, dd.a> treeMap = new TreeMap<Integer, dd.a>();
        for (final dW<eg> dw : ea.dN().values()) {
            final eg dk = dw.dK();
            final el el = dk.getClass().getDeclaredAnnotation(el.class);
            if (el == null) {
                continue;
            }
            final eq ff = el.fF();
            if (ff.fP().isEmpty()) {
                continue;
            }
            if (!dk.enabled || !dk.lf) {
                continue;
            }
            if (ea.fi().contains(dw.eT().eN())) {
                continue;
            }
            treeMap.put(ff.fQ(), new dd.a(ff.fP(), ff.fj(), ff.fk()));
        }
        final HashMap hashMap = new HashMap<Integer, dd.a>(treeMap.size());
        hashMap.put((Integer)bh.cd.get((Object)0), new dd.a("cosmetics", "Cosmetics", "https://assets.feathercdn.net/game/hudselection/cosmetics.svg"));
        int n = 1;
        final Iterator<dd.a> iterator2 = treeMap.values().iterator();
        while (iterator2.hasNext()) {
            hashMap.put((Integer)bh.cd.get((Object)(n++)), (dd.a)iterator2.next());
        }
        return (Map<Integer, dd.a>)hashMap;
    }
    
    static {
        cd = ImmutableMap.builder().put((Object)0, (Object)6).put((Object)1, (Object)2).put((Object)2, (Object)4).put((Object)3, (Object)0).put((Object)4, (Object)1).put((Object)5, (Object)3).put((Object)6, (Object)5).put((Object)7, (Object)7).build();
    }
}
