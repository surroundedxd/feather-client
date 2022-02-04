// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.io.Closeable;
import java.io.OutputStream;
import org.jetbrains.annotations.Nullable;
import java.io.BufferedOutputStream;
import org.jetbrains.annotations.NotNull;

public class jC implements jA
{
    @NotNull
    private final jA Fj;
    @Nullable
    private BufferedOutputStream Fk;
    
    public jC(@NotNull final jA fj) {
        this.Fj = fj;
    }
    
    @NotNull
    @Override
    public OutputStream tx() {
        return this.Fk = new BufferedOutputStream(this.Fj.tx());
    }
    
    @Override
    public void close() {
        jw.a(this.Fk);
        this.Fj.close();
    }
}
