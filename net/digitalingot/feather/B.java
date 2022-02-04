// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.Collection;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import javax.annotation.Nullable;
import java.util.HashMap;
import feather.org.objectweb.asm.tree.FieldNode;
import feather.org.objectweb.asm.ClassVisitor;
import feather.org.objectweb.asm.tree.ClassNode;
import feather.org.objectweb.asm.ClassReader;
import net.minecraftforge.fml.common.patcher.ClassPatchManager;
import com.google.common.io.Files;
import java.util.List;
import com.google.common.base.Strings;
import java.util.Iterator;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import com.google.common.collect.Iterables;
import com.google.common.base.Splitter;
import com.google.common.base.CharMatcher;
import java.nio.charset.StandardCharsets;
import java.io.InputStream;
import net.minecraftforge.fml.common.asm.transformers.deobf.LZMAInputSupplier;
import java.io.FileInputStream;
import java.io.File;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableBiMap;
import java.util.Set;
import net.minecraft.launchwrapper.LaunchClassLoader;
import java.util.Map;
import com.google.common.collect.BiMap;
import feather.org.objectweb.asm.commons.Remapper;

public class b extends Remapper
{
    public static final b b;
    private BiMap<String, String> c;
    private Map<String, Map<String, String>> d;
    private Map<String, Map<String, String>> e;
    private Map<String, Map<String, String>> f;
    private Map<String, Map<String, String>> g;
    private LaunchClassLoader h;
    private static final boolean i;
    private static final boolean j;
    private static final boolean k;
    private final Map<String, Map<String, String>> l;
    private final Set<String> m;
    private final Set<String> n;
    
    private b() {
        this.c = (BiMap<String, String>)ImmutableBiMap.of();
        this.l = (Map<String, Map<String, String>>)Maps.newHashMap();
        this.m = (Set<String>)Sets.newHashSet();
        this.n = (Set<String>)Sets.newHashSet();
    }
    
    public void a(final String pathname, final boolean b) {
        try {
            final ImmutableList lines = new LZMAInputSupplier((InputStream)new FileInputStream(new File(pathname))).asCharSource(StandardCharsets.UTF_8).readLines();
            this.e = (Map<String, Map<String, String>>)Maps.newHashMap();
            this.d = (Map<String, Map<String, String>>)Maps.newHashMap();
            final ImmutableBiMap.Builder builder = ImmutableBiMap.builder();
            final Splitter trimResults = Splitter.on(CharMatcher.anyOf((CharSequence)": ")).omitEmptyStrings().trimResults();
            final Iterator<String> iterator = ((List<String>)lines).iterator();
            while (iterator.hasNext()) {
                final String[] array = (String[])Iterables.toArray(trimResults.split((CharSequence)iterator.next()), (Class)String.class);
                final String anObject = array[0];
                if ("CL".equals(anObject)) {
                    this.a((ImmutableBiMap.Builder<String, String>)builder, array);
                }
                else if ("MD".equals(anObject) && b) {
                    this.b(array);
                }
                else {
                    if (!"FD".equals(anObject) || !b) {
                        continue;
                    }
                    this.a(array);
                }
            }
            this.c = (BiMap<String, String>)builder.build();
        }
        catch (IOException ex) {
            kr.Gh.error("An error occurred loading the deobfuscation map data", (Throwable)ex);
        }
        this.g = (Map<String, Map<String, String>>)Maps.newHashMapWithExpectedSize(this.e.size());
        this.f = (Map<String, Map<String, String>>)Maps.newHashMapWithExpectedSize(this.d.size());
    }
    
    public void a(final File file, final LaunchClassLoader h, final String name) {
        this.h = h;
        try {
            final String property = System.getProperty("net.minecraftforge.gradle.GradleStart.srg.srg-mcp");
            Object o;
            if (Strings.isNullOrEmpty(property)) {
                o = new LZMAInputSupplier(this.getClass().getResourceAsStream(name)).asCharSource(StandardCharsets.UTF_8).readLines();
                kr.Gh.debug("Loading deobfuscation resource {} with {} records", new Object[] { name, ((List<String>)o).size() });
            }
            else {
                o = Files.readLines(new File(property), StandardCharsets.UTF_8);
                kr.Gh.debug("Loading deobfuscation resource {} with {} records", new Object[] { property, ((List<String>)o).size() });
            }
            this.e = (Map<String, Map<String, String>>)Maps.newHashMap();
            this.d = (Map<String, Map<String, String>>)Maps.newHashMap();
            final ImmutableBiMap.Builder builder = ImmutableBiMap.builder();
            final Splitter trimResults = Splitter.on(CharMatcher.anyOf((CharSequence)": ")).omitEmptyStrings().trimResults();
            final Iterator<String> iterator = ((List<String>)o).iterator();
            while (iterator.hasNext()) {
                final String[] array = (String[])Iterables.toArray(trimResults.split((CharSequence)iterator.next()), (Class)String.class);
                final String anObject = array[0];
                if ("CL".equals(anObject)) {
                    this.a((ImmutableBiMap.Builder<String, String>)builder, array);
                }
                else if ("MD".equals(anObject)) {
                    this.b(array);
                }
                else {
                    if (!"FD".equals(anObject)) {
                        continue;
                    }
                    this.a(array);
                }
            }
            this.c = (BiMap<String, String>)builder.build();
        }
        catch (IOException ex) {
            kr.Gh.error("An error occurred loading the deobfuscation map data", (Throwable)ex);
        }
        this.g = (Map<String, Map<String, String>>)Maps.newHashMapWithExpectedSize(this.e.size());
        this.f = (Map<String, Map<String, String>>)Maps.newHashMapWithExpectedSize(this.d.size());
    }
    
    public boolean a(final String anObject) {
        return !this.map(anObject).equals(anObject);
    }
    
    private void a(final String[] array) {
        final String s = array[1];
        final int lastIndex = s.lastIndexOf(47);
        final String substring = s.substring(0, lastIndex);
        final String substring2 = s.substring(lastIndex + 1);
        final String s2 = array[2];
        final String substring3 = s2.substring(s2.lastIndexOf(47) + 1);
        if (!this.d.containsKey(substring)) {
            this.d.put(substring, Maps.newHashMap());
        }
        String str = this.a(substring, substring2);
        if (str == null) {
            str = this.a(substring, substring3);
        }
        this.d.get(substring).put(substring2 + ":" + str, substring3);
        this.d.get(substring).put(substring2 + ":null", substring3);
    }
    
    @Nullable
    private String a(final String s, final String s2) {
        if (this.l.containsKey(s)) {
            return this.l.get(s).get(s2);
        }
        synchronized (this.l) {
            try {
                final byte[] patchedResource = ClassPatchManager.INSTANCE.getPatchedResource(s, this.map(s).replace('/', '.'), this.h);
                if (patchedResource == null) {
                    return null;
                }
                final ClassReader classReader = new ClassReader(patchedResource);
                final ClassNode classNode = new ClassNode();
                classReader.accept((ClassVisitor)classNode, 7);
                final HashMap hashMap = Maps.newHashMap();
                for (final FieldNode fieldNode : classNode.fields) {
                    hashMap.put(fieldNode.name, fieldNode.desc);
                }
                this.l.put(s, hashMap);
                return (String)hashMap.get(s2);
            }
            catch (IOException ex) {
                kr.Gh.error("A critical exception occurred reading a class file {}", new Object[] { s, ex });
                return null;
            }
        }
    }
    
    private void a(final ImmutableBiMap.Builder<String, String> builder, final String[] array) {
        builder.put((Object)array[1], (Object)array[2]);
    }
    
    private void b(final String[] array) {
        final String s = array[1];
        final int lastIndex = s.lastIndexOf(47);
        final String substring = s.substring(0, lastIndex);
        final String substring2 = s.substring(lastIndex + 1);
        final String str = array[2];
        final String s2 = array[3];
        final String substring3 = s2.substring(s2.lastIndexOf(47) + 1);
        if (!this.e.containsKey(substring)) {
            this.e.put(substring, Maps.newHashMap());
        }
        this.e.get(substring).put(substring2 + str, substring3);
    }
    
    String a(final String s, final String s2, final String s3) {
        final String a = this.a(s, s2, s3, true);
        this.a(s, s2, s3, a);
        return a;
    }
    
    private void a(final String s, final String s2, final String str, final String s3) {
        final Map<String, String> c = this.c(s);
        final String string = s2 + ":" + str;
        final String string2 = s2 + ":null";
        if (!c.containsKey(string)) {
            c.put(string, s3);
            c.put(string2, s3);
            this.f.remove(s);
        }
    }
    
    public String mapFieldName(final String s, final String s2, @Nullable final String s3) {
        return this.a(s, s2, s3, false);
    }
    
    String a(final String s, final String s2, @Nullable final String s3, final boolean b) {
        if (this.c != null && !this.c.isEmpty()) {
            final Map<String, String> b2 = this.b(s, b);
            return (b2 != null && b2.containsKey(s2 + ":" + s3)) ? b2.get(s2 + ":" + s3) : ((b2 != null && b2.containsKey(s2 + ":null")) ? b2.get(s2 + ":null") : s2);
        }
        return s2;
    }
    
    public String map(final String s) {
        if (this.c == null || this.c.isEmpty()) {
            return s;
        }
        if (this.c.containsKey((Object)s)) {
            return (String)this.c.get((Object)s);
        }
        final int lastIndex = s.lastIndexOf(36);
        return (lastIndex > -1) ? (this.map(s.substring(0, lastIndex)) + "$" + s.substring(lastIndex + 1)) : s;
    }
    
    public String b(final String s) {
        if (this.c == null || this.c.isEmpty()) {
            return s;
        }
        if (this.c.containsValue((Object)s)) {
            return (String)this.c.inverse().get((Object)s);
        }
        final int lastIndex = s.lastIndexOf(36);
        return (lastIndex > -1) ? (this.b(s.substring(0, lastIndex)) + "$" + s.substring(lastIndex + 1)) : s;
    }
    
    public String mapMethodName(final String s, final String str, final String str2) {
        if (this.c != null && !this.c.isEmpty()) {
            final Map<String, String> d = this.d(s);
            final String string = str + str2;
            return (d != null && d.containsKey(string)) ? d.get(string) : str;
        }
        return str;
    }
    
    @Nullable
    public String mapSignature(final String s, final boolean b) {
        return (s != null && s.contains("!*")) ? null : super.mapSignature(s, b);
    }
    
    private Map<String, String> c(final String s) {
        if (!this.d.containsKey(s)) {
            this.d.put(s, Maps.newHashMap());
        }
        return this.d.get(s);
    }
    
    private Map<String, String> b(final String s, final boolean b) {
        if (b) {
            return this.c(s);
        }
        if (!this.f.containsKey(s) && !this.n.contains(s)) {
            this.e(s);
            if (!this.f.containsKey(s)) {
                this.n.add(s);
            }
            if (b.j) {
                kr.Gh.trace("Field map for {} : {}", new Object[] { s, this.f.get(s) });
            }
        }
        return this.f.get(s);
    }
    
    private Map<String, String> d(final String s) {
        if (!this.g.containsKey(s) && !this.m.contains(s)) {
            this.e(s);
            if (!this.g.containsKey(s)) {
                this.m.add(s);
            }
            if (net.digitalingot.feather.b.k) {
                kr.Gh.trace("Method map for {} : {}", new Object[] { s, this.g.get(s) });
            }
        }
        return this.g.get(s);
    }
    
    private void e(final String s) {
        try {
            String superName = null;
            String[] interfaces = new String[0];
            final byte[] patchedResource = ClassPatchManager.INSTANCE.getPatchedResource(s, this.map(s), this.h);
            if (patchedResource != null) {
                final ClassReader classReader = new ClassReader(patchedResource);
                superName = classReader.getSuperName();
                interfaces = classReader.getInterfaces();
            }
            this.a(s, superName, interfaces);
        }
        catch (IOException ex) {
            kr.Gh.error("Error getting patched resource:", (Throwable)ex);
        }
    }
    
    public void a(final String s, @Nullable final String s2, final String[] a) {
        if (this.c != null && !this.c.isEmpty() && !Strings.isNullOrEmpty(s2)) {
            final ImmutableList build = ImmutableList.builder().add((Object)s2).addAll((Iterable)Arrays.asList(a)).build();
            for (final String s3 : build) {
                if (!this.f.containsKey(s3)) {
                    this.e(s3);
                }
            }
            final HashMap hashMap = Maps.newHashMap();
            final HashMap hashMap2 = Maps.newHashMap();
            for (final String s4 : build) {
                if (this.g.containsKey(s4)) {
                    hashMap.putAll(this.g.get(s4));
                }
                if (this.f.containsKey(s4)) {
                    hashMap2.putAll(this.f.get(s4));
                }
            }
            if (this.e.containsKey(s)) {
                hashMap.putAll(this.e.get(s));
            }
            if (this.d.containsKey(s)) {
                hashMap2.putAll(this.d.get(s));
            }
            this.g.put(s, (Map<String, String>)ImmutableMap.copyOf((Map)hashMap));
            this.f.put(s, (Map<String, String>)ImmutableMap.copyOf((Map)hashMap2));
        }
    }
    
    public Set<String> d() {
        return (Set<String>)ImmutableSet.copyOf((Collection)this.c.keySet());
    }
    
    @Nullable
    public String b(final String s, final String s2, final String s3, final String s4) {
        final String a = this.a(s3, s4);
        if (s.equals(s3)) {
            return a;
        }
        this.l.computeIfAbsent(s3, p0 -> Maps.newHashMap()).put(s4, a);
        return a;
    }
    
    static {
        b = new b();
        i = Boolean.parseBoolean(System.getProperty("fml.remappingDebug", "false"));
        j = (Boolean.parseBoolean(System.getProperty("fml.remappingDebug.dumpFieldMaps", "false")) && net.digitalingot.feather.b.i);
        k = (Boolean.parseBoolean(System.getProperty("fml.remappingDebug.dumpMethodMaps", "false")) && net.digitalingot.feather.b.i);
    }
}
