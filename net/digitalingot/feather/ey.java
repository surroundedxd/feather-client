// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.apache.commons.io.IOUtils;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import java.nio.file.Path;

public class eY
{
    @NotNull
    private final Path lX;
    @Nullable
    private eX lY;
    
    public eY(@NotNull final Path lx) {
        this.lX = lx;
    }
    
    public void gM() {
        this.lY = new eX(this, this.dL());
    }
    
    @NotNull
    public eX gN() {
        if (this.lY == null) {
            this.gM();
        }
        return this.lY;
    }
    
    public void B(@NotNull final String s) {
        new eX(this, s).gI().delete();
    }
    
    public void C(@NotNull final String s) {
        try {
            this.D(s);
            this.lY = new eX(this, s);
        }
        catch (IOException cause) {
            throw new IllegalStateException(cause);
        }
    }
    
    @NotNull
    public List<String> gO() {
        final ArrayList<String> list = new ArrayList<String>();
        for (final String s : this.lX.resolve("profiles").toFile().list()) {
            if (s.endsWith(".json")) {
                list.add(s.substring(0, s.length() - ".json".length()));
            }
        }
        return list;
    }
    
    @NotNull
    private File gP() {
        final File gr = this.gR();
        if (!gr.exists()) {
            this.b(gr);
        }
        return gr;
    }
    
    private void b(@NotNull final File file) {
        try {
            if (file.getParentFile().mkdirs()) {
                kr.Gh.info("Created profile storage directory");
            }
            if (!file.createNewFile()) {
                throw new IOException("Profile storage couldn't be created.");
            }
            this.D("default");
        }
        catch (IOException cause) {
            throw new IllegalStateException(cause);
        }
    }
    
    private void D(@NotNull final String s) {
        final FileWriter out = new FileWriter(this.gP());
        try {
            final BufferedWriter bufferedWriter = new BufferedWriter(out);
            try {
                IOUtils.write(s, (Writer)bufferedWriter);
                bufferedWriter.close();
            }
            catch (Throwable t) {
                try {
                    bufferedWriter.close();
                }
                catch (Throwable exception) {
                    t.addSuppressed(exception);
                }
                throw t;
            }
            out.close();
        }
        catch (Throwable t2) {
            try {
                out.close();
            }
            catch (Throwable exception2) {
                t2.addSuppressed(exception2);
            }
            throw t2;
        }
    }
    
    @NotNull
    private String dL() {
        return jz.m(this.gP()).tt().tv();
    }
    
    @NotNull
    public Path gQ() {
        return this.lX;
    }
    
    @NotNull
    private File gR() {
        return this.lX.resolve("current.profile").toFile();
    }
}
