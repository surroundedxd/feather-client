// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.minecraft.util.Session;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.exceptions.AuthenticationException;
import net.minecraft.client.Minecraft;
import java.util.Iterator;
import java.io.IOException;
import java.util.Collection;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.UUID;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import com.google.gson.Gson;
import java.io.Closeable;

public class i implements Closeable
{
    @NotNull
    public static final Gson GSON;
    @NotNull
    private final k C;
    @NotNull
    private final Map<UUID, String> D;
    @NotNull
    private final Map<String, UUID> E;
    
    public i() {
        this.D = new HashMap<UUID, String>();
        this.E = new TreeMap<String, UUID>(String.CASE_INSENSITIVE_ORDER);
        this.C = new k(this);
        this.F();
    }
    
    @Nullable
    public String a(@NotNull final UUID uuid) {
        return this.a(new UUID[] { uuid }).values().stream().findAny().orElse(null);
    }
    
    @NotNull
    public Map<UUID, String> a(@NotNull final UUID... array) {
        final ArrayList<UUID> list = new ArrayList<UUID>();
        final HashMap<UUID, String> hashMap = new HashMap<UUID, String>(array.length);
        for (final UUID uuid : array) {
            final String s = this.D.get(uuid);
            if (s != null) {
                hashMap.put(uuid, s);
            }
            else {
                list.add(uuid);
            }
        }
        if (!list.isEmpty()) {
            final m m = new m(null, list, null);
            n n;
            try {
                n = this.a(n.class, j.ACCOUNT_SEARCH, m, new String[0]);
            }
            catch (IOException ex) {
                kr.Gh.error("Error while making an account search request", (Throwable)ex);
                return new HashMap<UUID, String>();
            }
            for (final n.a a : n.Q()) {
                this.a(a);
                hashMap.put(a.S(), a.T());
            }
        }
        return hashMap;
    }
    
    @Nullable
    public UUID h(@NotNull final String s) {
        return this.d(s).values().stream().findAny().orElse(null);
    }
    
    @NotNull
    public Map<String, UUID> d(@NotNull final String... array) {
        final ArrayList<String> list = new ArrayList<String>();
        final HashMap<String, UUID> hashMap = new HashMap<String, UUID>(array.length);
        for (final String s : array) {
            final UUID uuid = this.E.get(s);
            if (uuid != null) {
                hashMap.put(s, uuid);
            }
            else {
                list.add(s);
            }
        }
        if (!list.isEmpty()) {
            final m m = new m(null, null, list);
            n n;
            try {
                n = this.a(n.class, j.ACCOUNT_SEARCH, m, new String[0]);
            }
            catch (IOException ex) {
                kr.Gh.error("Error while making an account search request", (Throwable)ex);
                return new HashMap<String, UUID>();
            }
            for (final n.a a : n.Q()) {
                this.a(a);
                hashMap.put(a.T(), a.S());
            }
        }
        return hashMap;
    }
    
    private void a(@NotNull final n.a a) {
        this.D.put(a.S(), a.T());
        this.E.put(a.T(), a.S());
    }
    
    void D() {
        this.a(o.class, j.UPDATE_TOKEN, new String[0]);
    }
    
    @NotNull
    String E() {
        return this.a(String.class, j.AUTH_TOKEN, new String[0]);
    }
    
    public void F() {
        final Minecraft func_71410_x = Minecraft.func_71410_x();
        final MinecraftSessionService func_152347_ac = func_71410_x.func_152347_ac();
        if (func_152347_ac == null) {
            throw new l("session service not available");
        }
        final Session func_110432_I = func_71410_x.func_110432_I();
        if (func_110432_I == null) {
            throw new l("session not available");
        }
        boolean b = false;
        for (int i = 0; i < 2; ++i) {
            final String s = this.a(String.class, j.SERVER_ID, new String[0]);
            try {
                func_152347_ac.joinServer(func_110432_I.func_148256_e(), func_110432_I.func_148254_d(), s);
            }
            catch (AuthenticationException ex) {
                throw new l((Throwable)ex);
            }
            if (this.a(j.HAS_JOINED, new String[] { func_110432_I.func_111285_a(), s }).contains("mcUsername")) {
                b = true;
                break;
            }
        }
        if (!b) {
            throw new l("Failed to authenticate with core backend");
        }
        if (a.b() != cF.a.IDE) {
            this.G();
        }
        kr.Gh.info("Authenticated with core backend");
    }
    
    void G() {
        try {
            final HttpsURLConnection httpsURLConnection = (HttpsURLConnection)new URL("https://wl.feathermc.com/whitelist_status").openConnection();
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty("User-Agent", "Feather Client");
            httpsURLConnection.setRequestProperty("Authorization", this.C.K());
            httpsURLConnection.connect();
            final InputStreamReader in = new InputStreamReader(httpsURLConnection.getInputStream());
            try {
                final BufferedReader bufferedReader = new BufferedReader(in);
                try {
                    if (!Boolean.parseBoolean(bufferedReader.readLine())) {
                        Minecraft.func_71410_x().func_71400_g();
                    }
                    bufferedReader.close();
                }
                catch (Throwable t) {
                    try {
                        bufferedReader.close();
                    }
                    catch (Throwable exception) {
                        t.addSuppressed(exception);
                    }
                    throw t;
                }
                in.close();
            }
            catch (Throwable t2) {
                try {
                    in.close();
                }
                catch (Throwable exception2) {
                    t2.addSuppressed(exception2);
                }
                throw t2;
            }
        }
        catch (Exception ex) {
            Minecraft.func_71410_x().func_71400_g();
        }
    }
    
    @NotNull
    private <T> T a(@NotNull final Class<T> clazz, @NotNull final j j, @NotNull final String... array) {
        return this.a(clazz, j, (Object)null, array);
    }
    
    @NotNull
    private <T> T a(@NotNull final Class<T> clazz, @NotNull final j j, @Nullable final Object o, @NotNull final String... array) {
        return (T)i.GSON.fromJson(this.a(j, o, array), (Class)clazz);
    }
    
    @NotNull
    private String a(@NotNull final j j, @NotNull final String... array) {
        return this.a(j, (Object)null, array);
    }
    
    @NotNull
    private String a(@NotNull final j j, @Nullable final Object o, @NotNull final String... array) {
        final HttpsURLConnection httpsURLConnection = (HttpsURLConnection)j.get(array).openConnection();
        httpsURLConnection.setRequestMethod(j.getMethod().name());
        httpsURLConnection.setRequestProperty("User-Agent", "Feather Client");
        if (j != j.SERVER_ID && j != j.HAS_JOINED) {
            final String i = this.C.J();
            if (i != null) {
                httpsURLConnection.setRequestProperty("Authorization", i);
            }
        }
        httpsURLConnection.connect();
        if (o != null) {
            final String json = i.GSON.toJson(o);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setRequestProperty("Content-Type", "application/json");
            final OutputStream outputStream = httpsURLConnection.getOutputStream();
            try {
                outputStream.write(json.getBytes(StandardCharsets.UTF_8));
                outputStream.flush();
                if (outputStream != null) {
                    outputStream.close();
                }
            }
            catch (Throwable t) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    }
                    catch (Throwable exception) {
                        t.addSuppressed(exception);
                    }
                }
                throw t;
            }
        }
        final String headerField = httpsURLConnection.getHeaderField("Authorization");
        if (headerField != null) {
            this.C.i(headerField);
        }
        return jz.d(httpsURLConnection.getInputStream()).tv();
    }
    
    @Override
    public void close() {
        this.C.close();
    }
    
    @NotNull
    public k H() {
        return this.C;
    }
    
    static {
        GSON = new Gson();
    }
}
