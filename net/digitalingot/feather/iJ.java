// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import java.util.UUID;

public class ij
{
    @NotNull
    private final UUID Bq;
    @NotNull
    private final List<UUID> Br;
    @NotNull
    private final iL.b Bs;
    
    public ij(@NotNull final UUID bq, @NotNull final List<UUID> br, final iL.b bs) {
        this.Bq = bq;
        this.Br = br;
        this.Bs = bs;
    }
    
    @NotNull
    public UUID lz() {
        return this.Bq;
    }
    
    @NotNull
    public List<UUID> lA() {
        return this.Br;
    }
    
    @NotNull
    public iL.b lB() {
        return this.Bs;
    }
}
