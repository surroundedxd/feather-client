// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.resources.ResourcePackRepository;
import org.capnproto.TextList;
import java.util.List;
import org.capnproto.Text;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.OpenGlHelper;
import java.util.function.Consumer;
import net.minecraft.client.Minecraft;

public class iw
{
    public static void a(final iy iy) {
        Minecraft.func_71410_x().func_152344_a(() -> iy.a(mC()));
    }
    
    private static Consumer<iK.f.e.a> mC() {
        return a -> {
            a(a);
            a.aH(Minecraft.func_71410_x().func_175600_c());
            b(a);
            c(a);
            d(a);
        };
    }
    
    private static void a(final iK.f.e.a a) {
        final Runtime runtime = Runtime.getRuntime();
        final String property = System.getProperty("os.name");
        final short n = (short)runtime.availableProcessors();
        final int j = j(runtime.maxMemory());
        final String func_183029_j = OpenGlHelper.func_183029_j();
        final String string = GL11.glGetString(7936) + " " + GL11.glGetString(7937);
        final iK.f.e.c.a ph = a.pH();
        ph.aI(property);
        ph.c(n);
        ph.aw(j);
        ph.aJ(func_183029_j);
        ph.aK(string);
    }
    
    private static void b(final iK.f.e.a a) {
        final List<String> ue = kv.ue();
        final TextList.Builder as = a.as(ue.size());
        for (int i = 0; i < ue.size(); ++i) {
            as.set(i++, new Text.Reader((String)ue.get(i)));
        }
    }
    
    private static void c(final iK.f.e.a a) {
        int n = 0;
        final List func_110613_c = Minecraft.func_71410_x().func_110438_M().func_110613_c();
        final TextList.Builder at = a.at(func_110613_c.size());
        final Iterator<ResourcePackRepository.Entry> iterator = func_110613_c.iterator();
        while (iterator.hasNext()) {
            at.set(n, new Text.Reader(iterator.next().func_110515_d()));
            ++n;
        }
    }
    
    private static void d(final iK.f.e.a a) {
        final ArrayList<ec> list = new ArrayList<ec>();
        for (final Map.Entry<ec, dW<?>> entry : e.s().m().dN().entrySet()) {
            if (!entry.getValue().eU()) {
                continue;
            }
            list.add(entry.getKey());
        }
        final TextList.Builder au = a.au(list.size());
        for (int i = 0; i < list.size(); ++i) {
            au.set(i, new Text.Reader(((ec)list.get(i)).getSlug()));
        }
    }
    
    private static int j(final long n) {
        return (int)(n / 1024L / 1024L);
    }
}
