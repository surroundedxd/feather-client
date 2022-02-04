// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.io.File;
import org.jetbrains.annotations.NotNull;

public class eX
{
    @NotNull
    private final String name;
    @NotNull
    private final File lW;
    
    public eX(@NotNull final eY ey, @NotNull String s) {
        if (s.contains("\u0000")) {
            s = "default";
        }
        this.name = s;
        this.lW = ey.gQ().resolve("profiles/" + s + ".json").toFile();
        if (this.lW.getParentFile().mkdirs()) {
            kr.Gh.info("Created profiles directory under " + this.lW.getAbsolutePath());
        }
    }
    
    @NotNull
    public String getName() {
        return this.name;
    }
    
    @NotNull
    public File gI() {
        return this.lW;
    }
}
