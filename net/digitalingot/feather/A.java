// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import java.util.function.Consumer;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.Nullable;

public class a
{
    @Nullable
    private static cF.a a;
    
    public static void a() {
        new Thread(null, null, "Feather-DRM") {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000L);
                }
                catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                if (net.digitalingot.feather.a.a == null || net.digitalingot.feather.a.a.getPriority() < net.digitalingot.feather.a.b().getPriority()) {
                    kr.Gh.debug("DRM check failed.");
                    Minecraft.func_71410_x().func_71400_g();
                }
                else {
                    kr.Gh.debug("Passed DRM check");
                }
            }
        }.start();
        e.s().l().b(new cE(), (Consumer<bY>)new Consumer<cF>() {
            public void a(final cF cf) {
                net.digitalingot.feather.a.a = cf.b();
            }
        }, (Consumer<bY>)null);
    }
    
    @NotNull
    public static cF.a b() {
        return cF.a.RELEASE;
    }
}
