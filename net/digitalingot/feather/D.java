// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.io.File;
import org.jetbrains.annotations.NotNull;

public class d implements f
{
    @NotNull
    private final ca s;
    @NotNull
    private final ea t;
    @NotNull
    private final bj u;
    @NotNull
    private final File v;
    @NotNull
    private final File w;
    @NotNull
    private final String x;
    
    public d(@NotNull final ca s, @NotNull final ea t, @NotNull final bj u, @NotNull final File v, @NotNull final File w, @NotNull final String x) {
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    @NotNull
    @Override
    public ca l() {
        return this.s;
    }
    
    @NotNull
    @Override
    public ea m() {
        return this.t;
    }
    
    @NotNull
    @Override
    public bj n() {
        return this.u;
    }
    
    @NotNull
    @Override
    public File o() {
        return this.v;
    }
    
    @NotNull
    @Override
    public File p() {
        return this.w;
    }
    
    @NotNull
    @Override
    public String g() {
        return this.x;
    }
}
