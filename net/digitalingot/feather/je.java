// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import org.jetbrains.annotations.Nullable;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import java.io.File;

public class jE implements jA, jx
{
    @NotNull
    private final File lW;
    @Nullable
    private InputStream Fm;
    @Nullable
    private OutputStream Fn;
    
    public jE(@NotNull final File lw) {
        this.lW = lw;
    }
    
    @NotNull
    @Override
    public InputStream ts() {
        if (this.Fm != null) {
            return this.Fm;
        }
        try {
            return this.Fm = new FileInputStream(this.lW);
        }
        catch (Exception ex) {
            throw new jy(ex);
        }
    }
    
    @NotNull
    @Override
    public OutputStream tx() {
        if (this.Fn != null) {
            return this.Fn;
        }
        try {
            return this.Fn = new FileOutputStream(this.lW);
        }
        catch (Exception ex) {
            throw new jy(ex);
        }
    }
    
    @Override
    public void close() {
        jw.a(this.Fm, this.Fn);
        this.Fm = null;
        this.Fn = null;
    }
}
