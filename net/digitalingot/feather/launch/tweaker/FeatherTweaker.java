// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.launch.tweaker;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Set;
import net.digitalingot.feather.bS;
import net.minecraft.launchwrapper.LaunchClassLoader;
import java.io.File;
import java.util.List;
import net.minecraft.launchwrapper.ITweaker;

public class FeatherTweaker implements ITweaker
{
    public final void acceptOptions(final List<String> list, final File file, final File file2, final String s) {
    }
    
    public final void injectIntoClassLoader(final LaunchClassLoader launchClassLoader) {
        a(launchClassLoader);
        launchClassLoader.registerTransformer(bS.class.getName());
    }
    
    public String getLaunchTarget() {
        return "net.minecraft.client.main.Main";
    }
    
    public String[] getLaunchArguments() {
        return new String[0];
    }
    
    private static void a(final LaunchClassLoader launchClassLoader) {
        b(launchClassLoader).remove("org.lwjgl.");
    }
    
    private static Set<String> b(final LaunchClassLoader obj) {
        try {
            final Field declaredField = LaunchClassLoader.class.getDeclaredField("classLoaderExceptions");
            declaredField.setAccessible(true);
            return (Set<String>)declaredField.get(obj);
        }
        catch (NoSuchFieldException | IllegalAccessException ex) {
            return Collections.emptySet();
        }
    }
}
