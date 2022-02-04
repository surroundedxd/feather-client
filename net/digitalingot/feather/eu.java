// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.Iterator;
import java.util.HashMap;
import java.nio.file.Path;
import org.jetbrains.annotations.Nullable;
import java.util.Map;
import java.io.File;
import org.jetbrains.annotations.NotNull;

public class eU
{
    @NotNull
    private final eY lR;
    @NotNull
    private final eW lS;
    @NotNull
    private final eV lT;
    @NotNull
    private final File lU;
    @Nullable
    private Map<ec, Map<String, String>> lV;
    
    public eU(@NotNull final Path path) {
        this.lR = new eY(path.resolve("configuration"));
        this.lS = new eW(this);
        this.lT = new eV(this);
        this.lU = path.resolve("sidebar.json").toFile();
    }
    
    public void a(@NotNull final Map<ec, Map<String, String>> lv) {
        this.lS.b(lv);
        this.lV = lv;
    }
    
    public void a(final ec ec, @NotNull final Map<String, String> map) {
        this.lS.b(ec, map);
        if (this.lV == null) {
            this.lV = new HashMap<ec, Map<String, String>>();
        }
        this.lV.put(ec, map);
    }
    
    public void a(final ec ec, @NotNull final eg eg) {
        this.a(ec, new eE(eg).gB());
    }
    
    public void b(@NotNull final Map<ec, dW<?>> map) {
        if (this.lV == null) {
            this.lV = new HashMap<ec, Map<String, String>>();
        }
        for (final Map.Entry<ec, dW<?>> entry : map.entrySet()) {
            this.lV.put(entry.getKey(), new eE((eg)entry.getValue().dK()).gB());
        }
        this.a(this.lV);
    }
    
    @NotNull
    public Map<ec, Map<String, String>> gG() {
        return this.lV = this.lT.gL();
    }
    
    @Nullable
    public Map<ec, Map<String, String>> gH() {
        return this.lV;
    }
    
    @NotNull
    public File gI() {
        return this.lR.gN().gI();
    }
    
    @NotNull
    public File gJ() {
        return this.lU;
    }
    
    @NotNull
    public eY gK() {
        return this.lR;
    }
}
