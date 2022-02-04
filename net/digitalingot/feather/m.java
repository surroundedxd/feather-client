// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.nio.file.OpenOption;
import java.nio.charset.StandardCharsets;
import com.google.gson.JsonParseException;
import java.util.HashMap;
import com.google.common.reflect.TypeToken;
import java.util.List;
import joptsimple.internal.Strings;
import java.io.IOException;
import java.util.Collections;
import java.nio.file.Files;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import java.util.Map;

public class M
{
    @NotNull
    public static final Map<String, Class<?>> bg;
    @NotNull
    private final Map<String, L> bh;
    @NotNull
    private final File bi;
    
    public M() {
        this.bi = new File(e.s().o(), "cosmetic_settings.json");
        Object o;
        try {
            if (!this.bi.exists()) {
                this.bi.createNewFile();
            }
            o = Files.readAllLines(this.bi.toPath());
        }
        catch (IOException ex) {
            kr.Gh.error("Error while trying to read cosmetics file", (Throwable)ex);
            o = Collections.emptyList();
        }
        final String join = Strings.join((List)o, "\n");
        Map<String, L> bh;
        try {
            bh = (Map<String, L>)ca.GSON.fromJson(join, new TypeToken<HashMap<String, L>>() {}.getType());
        }
        catch (JsonParseException ex2) {
            bh = new HashMap<String, L>();
        }
        if (bh == null) {
            bh = new HashMap<String, L>();
        }
        this.bh = bh;
    }
    
    public <T> T a(@NotNull final String s, @NotNull final Class<T> clazz) {
        return (T)ca.GSON.fromJson(ca.GSON.toJsonTree((Object)this.bh.get(s)), (Class)clazz);
    }
    
    public void a(@NotNull final String s, @NotNull final L l) {
        this.bh.put(s, l);
        this.aC();
    }
    
    public void aC() {
        try {
            Files.write(this.bi.toPath(), ca.GSON.toJson((Object)this.bh).getBytes(StandardCharsets.UTF_8), new OpenOption[0]);
        }
        catch (IOException ex) {
            kr.Gh.error("Error while trying to save cosmetics settings", (Throwable)ex);
        }
    }
    
    @NotNull
    public Map<String, L> aD() {
        return this.bh;
    }
    
    static {
        bg = new HashMap<String, Class<?>>();
    }
}
