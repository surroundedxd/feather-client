// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import com.google.common.collect.Maps;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class eH<T>
{
    @NotNull
    private final ez lF;
    @NotNull
    private final eF<T> lK;
    @NotNull
    private final T lM;
    
    public eH(@NotNull final ez ez, @NotNull final T lm) {
        this.lF = ez;
        this.lK = eI.d(ez.gf());
        if (this.lK == null) {
            throw new IllegalArgumentException("Type " + ez.gf().getName() + " (" + ez + ") not supported");
        }
        this.lM = lm;
    }
    
    @NotNull
    public Map.Entry<String, String> gF() {
        return (Map.Entry<String, String>)Maps.immutableEntry((Object)this.lF.gh().fw(), (Object)this.lK.f(this.lM));
    }
}
