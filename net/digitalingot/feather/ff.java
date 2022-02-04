// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.HashSet;
import java.util.Collection;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import net.minecraft.client.resources.SkinManager;
import java.util.Comparator;
import java.util.regex.Pattern;
import java.util.Locale;
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetworkPlayerInfo;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Lists;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.Cache;
import java.util.List;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;

@dV(eN = ec.NICK_HIDER, eO = @eb(fj = "Nick Hider", fk = "https://assets.feathercdn.net/game/mods/nickhider.svg", fl = "Hide your nick and skin", fm = {}))
public class fF extends dW<b>
{
    private static final int nT = 5000;
    private static final int nU = 1000000000;
    private static final String kM = "Player-";
    private static final String nV = " ";
    private static final String nW = "You";
    private Minecraft minecraft;
    private ResourceLocation nX;
    private String nY;
    private ResourceLocation nZ;
    private boolean oa;
    private final List<a> ob;
    private final Cache<String, Boolean> oc;
    private final LoadingCache<String, String> od;
    
    public fF() {
        this.ob = (List<a>)Lists.newArrayList();
        this.oc = (Cache<String, Boolean>)CacheBuilder.newBuilder().maximumSize(5000L).build();
        this.od = (LoadingCache<String, String>)CacheBuilder.newBuilder().maximumSize(5000L).build((CacheLoader)new CacheLoader<String, String>() {
            @NotNull
            public String N(@NotNull final String s) {
                String replaceAll = s;
                for (final a a : fF.this.ob) {
                    replaceAll = a.og.matcher(replaceAll).replaceAll(a.jM);
                }
                return replaceAll;
            }
        });
    }
    
    @Override
    public void initialize() {
        this.minecraft = Minecraft.func_71410_x();
        ao.bE.a(c -> {
            if (c == ao.c.START && this.eU()) {
                this.onClientTick();
            }
            return;
        });
        ao.bH.a((c2, p1) -> {
            if (c2 == ao.c.START && this.eU()) {
                this.hl();
            }
            return;
        });
        P.bk.a(s -> this.eU() ? this.J(s) : s);
    }
    
    private void hk() {
    }
    
    private void onClientTick() {
    }
    
    private String H(final String s) {
        return null;
    }
    
    private void hl() {
        if (!((b)this.jK).ok && !((b)this.jK).op) {
            return;
        }
        final EntityPlayerSP field_71439_g = this.minecraft.field_71439_g;
        if (field_71439_g == null) {
            return;
        }
        final NetHandlerPlayClient field_71174_a = field_71439_g.field_71174_a;
        if (field_71174_a == null) {
            return;
        }
        final UUID id = this.hq().getId();
        boolean b = false;
        final Iterator iterator = field_71174_a.func_175106_d().iterator();
        while (iterator.hasNext()) {
            final GameProfile func_178845_a = iterator.next().func_178845_a();
            final String name = func_178845_a.getName();
            if (id.equals(func_178845_a.getId())) {
                if (!((b)this.jK).ok) {
                    continue;
                }
                b |= this.d(name, "You");
            }
            else {
                if (!((b)this.jK).ol) {
                    continue;
                }
                b |= this.d(name, this.I(name));
            }
        }
        if (b) {
            this.od.invalidateAll();
        }
    }
    
    private String I(final String s) {
        return "Player-" + Math.abs(s.hashCode()) % 1000000000;
    }
    
    private boolean d(String lowerCase, final String s) {
        if (lowerCase.isEmpty() || lowerCase.contains(" ")) {
            return false;
        }
        lowerCase = lowerCase.toLowerCase(Locale.ROOT);
        if (this.oc.getIfPresent((Object)lowerCase) != null) {
            return false;
        }
        this.oc.put((Object)lowerCase, (Object)true);
        this.ob.add(new a(Pattern.compile(Pattern.quote(lowerCase), 2), lowerCase, (lowerCase.length() > 2) ? s : lowerCase));
        this.ob.sort(Comparator.comparingInt(a -> a.oh.length()).reversed());
        return true;
    }
    
    public ResourceLocation hm() {
        this.hn();
        return this.nX;
    }
    
    private void hn() {
        if (this.nY != null || this.oa) {
            return;
        }
        this.a(this.hq(), (type, resourceLocation, minecraftProfileTexture) -> {
            switch (fF$2.of[type.ordinal()]) {
                case 1: {
                    this.nX = resourceLocation;
                    this.nY = minecraftProfileTexture.getMetadata("model");
                    if (this.nY == null) {
                        this.nY = "default";
                        break;
                    }
                    break;
                }
                case 2: {
                    this.nZ = resourceLocation;
                    break;
                }
            }
            this.oa = false;
        }, false);
    }
    
    private void a(final GameProfile gameProfile, final SkinManager.SkinAvailableCallback skinAvailableCallback, final boolean b) {
        this.minecraft.func_152342_ad().func_152790_a(gameProfile, skinAvailableCallback, b);
    }
    
    public String ho() {
        return this.nY;
    }
    
    public ResourceLocation hp() {
        return this.nZ;
    }
    
    private String J(String replaceAll) {
        if (this.hr()) {
            for (final a a : this.ob) {
                if (a.jM.equals("You")) {
                    continue;
                }
                replaceAll = Pattern.compile(a.jM, 2).matcher(replaceAll).replaceAll(a.oh);
            }
        }
        return replaceAll;
    }
    
    public String K(final String s) {
        return s;
    }
    
    public String L(final String s) {
        return (String)(this.hr() ? this.od.getUnchecked((Object)s) : s);
    }
    
    public String[] a(final String[] array, final String s) {
        if (!this.hr()) {
            return array;
        }
        for (int i = 0; i < array.length; ++i) {
            array[i] = this.L(array[i]);
        }
        final String[] split = s.split(" ");
        final String lowerCase = split[split.length - 1].toLowerCase(Locale.ROOT);
        final ArrayList<String> list = new ArrayList<String>();
        for (final a a : this.ob) {
            if (a.oi.startsWith(lowerCase)) {
                list.add(a.jM);
            }
        }
        final HashSet hashSet = Sets.newHashSet((Object[])array);
        hashSet.addAll(list);
        return (String[])hashSet.toArray(new String[0]);
    }
    
    private GameProfile hq() {
        return this.minecraft.func_110432_I().func_148256_e();
    }
    
    private boolean hr() {
        return (((b)this.jK).ok || ((b)this.jK).ol) && !this.ob.isEmpty();
    }
    
    static class a
    {
        public Pattern og;
        public String oh;
        public String jM;
        public String oi;
        
        public a(final Pattern og, final String oh, final String jm) {
            this.og = og;
            this.oh = oh;
            this.jM = jm;
            this.oi = jm.toLowerCase(Locale.ROOT);
        }
    }
    
    public static class b extends eg
    {
        @es(fU = 0)
        public fc oj;
        @ex(fw = "hideOwnName", fj = "Hide Your Own Name", fY = "false", fo = @es(fU = 1))
        public boolean ok;
        @ex(fw = "hideOtherNames", fj = "Hide Other Names", fY = "false", fo = @es(fU = 2))
        public boolean ol;
        @es(fU = 10)
        public fc om;
        @ex(fw = "hideSkin", fj = "Hide Your Skin", fY = "false", fo = @es(fU = 11))
        public boolean on;
        @ex(fw = "showRealSkin", fj = "Show Real Skin", fY = "false", fo = @es(fU = 12))
        public boolean oo;
        @ex(fw = "hideOtherSkins", fj = "Hide Other Skins", fY = "false", fo = @es(fU = 13))
        public boolean op;
        
        public b() {
            this.oj = new fc("Name Options");
            this.om = new fc("Skin Options");
        }
    }
}
