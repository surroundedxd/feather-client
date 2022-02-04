// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import com.google.common.collect.Lists;
import java.util.List;

public class jX
{
    private static final List<a> vK;
    private static boolean Ge;
    
    public static void a(final a a) {
        if (jX.Ge) {
            jX.vK.add(() -> "");
        }
        jX.Ge = false;
        jX.vK.add(a);
    }
    
    public static void tW() {
        jX.Ge = true;
    }
    
    public static List<a> tX() {
        return jX.vK;
    }
    
    static {
        vK = Lists.newArrayList();
        jX.Ge = true;
    }
    
    public interface a
    {
        String get();
    }
}
