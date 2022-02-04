// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.io.Closeable;
import org.jetbrains.annotations.Nullable;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;

public class jD implements jx
{
    @NotNull
    private final String Fl;
    @Nullable
    private InputStream Fm;
    
    public jD(@NotNull final String fl) {
        this.Fl = fl;
    }
    
    @NotNull
    @Override
    public InputStream ts() {
        this.Fm = this.getClass().getClassLoader().getResourceAsStream(this.Fl);
        if (this.Fm == null) {
            throw new RuntimeException("Could not find resource: " + this.Fl);
        }
        return this.Fm;
    }
    
    @Override
    public void close() {
        jw.a(this.Fm);
        this.Fm = null;
    }
}
