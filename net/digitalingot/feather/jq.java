// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.regex.Pattern;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.Nullable;
import java.util.Iterator;
import net.minecraft.network.NetworkManager;
import java.net.InetSocketAddress;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import java.util.HashMap;

public class jQ extends HashMap<String, b>
{
    @NotNull
    private static final List<a> FS;
    
    public static void initialize() {
        final NetworkManager networkManager;
        final String s;
        final a a;
        ab.bq.a((p0, netHandlerPlayClient) -> {
            if (aV.aV()) {
                return;
            }
            else {
                netHandlerPlayClient.func_147298_b();
                if (networkManager.func_150731_c()) {
                    return;
                }
                else if (Minecraft.func_71410_x().func_71356_B()) {
                    return;
                }
                else {
                    ((InetSocketAddress)networkManager.func_74430_c()).getHostName();
                    aQ(s.endsWith(".") ? s.substring(0, s.length() - 1) : s);
                    if (a != null) {
                        e.s().m().h(a.tS());
                        bh.a(e.s().m());
                    }
                    return;
                }
            }
        });
        for (final b b : ((HashMap<K, b>)jz.aM("https://game-client.feathermc.com/disabled-mods.json").h(jQ.class)).values()) {
            try {
                jQ.FS.add(b.tT());
            }
            catch (Exception ex) {
                kr.Gh.error("Error while trying to compile a server metadata", (Throwable)ex);
            }
        }
    }
    
    @Nullable
    private static a aQ(@NotNull final String s) {
        for (final a a : jQ.FS) {
            if (a.aR(s)) {
                return a;
            }
        }
        return null;
    }
    
    static {
        FS = new ArrayList<a>();
    }
    
    public static class b
    {
        @SerializedName("match")
        @NotNull
        private final List<String> FV;
        @SerializedName("disabledMods")
        @NotNull
        private final List<String> FU;
        
        public b(@NotNull final List<String> fv, @NotNull final List<String> fu) {
            this.FV = fv;
            this.FU = fu;
        }
        
        @NotNull
        public a tT() {
            final ArrayList<Pattern> list = new ArrayList<Pattern>(this.FV.size());
            final Iterator<String> iterator = this.FV.iterator();
            while (iterator.hasNext()) {
                list.add(Pattern.compile(iterator.next(), 2));
            }
            return new a(list, this.FU);
        }
        
        @NotNull
        public List<String> tU() {
            return this.FV;
        }
        
        @NotNull
        public List<String> tS() {
            return this.FU;
        }
    }
    
    public static class a
    {
        @NotNull
        private final List<Pattern> FT;
        @NotNull
        private final List<String> FU;
        
        public a(@NotNull final List<Pattern> ft, @NotNull final List<String> fu) {
            this.FT = ft;
            this.FU = fu;
        }
        
        public boolean aR(@NotNull final String input) {
            final Iterator<Pattern> iterator = this.FT.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().matcher(input).matches()) {
                    return true;
                }
            }
            return false;
        }
        
        @NotNull
        public List<Pattern> tR() {
            return this.FT;
        }
        
        @NotNull
        public List<String> tS() {
            return this.FU;
        }
    }
}
