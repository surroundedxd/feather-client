// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.Loader;
import java.util.List;

public class kv
{
    public static List<String> ue() {
        return Loader.instance().getIndexedModList().values().stream().map((Function<? super Object, ?>)ModContainer::getModId).collect((Collector<? super Object, ?, List<String>>)Collectors.toList());
    }
}
