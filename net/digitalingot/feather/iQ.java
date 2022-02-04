// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.client.renderer.GlStateManager;

public final class iq
{
    private iq() {
        throw new AssertionError();
    }
    
    public static void md() {
        GlStateManager.func_179094_E();
    }
    
    public static void me() {
        GlStateManager.func_179121_F();
    }
    
    public static void b(final float n, final float n2, final float n3) {
        a(n, n2, n3);
    }
    
    public static void a(final double n, final double n2, final double n3) {
        GlStateManager.func_179137_b(n, n2, n3);
    }
    
    public static void c(final float n, final float n2, final float n3, final float n4) {
        GlStateManager.func_179114_b(n, n2, n3, n4);
    }
    
    public static void c(final float n, final float n2, final float n3) {
        b(n, n2, (double)n3);
    }
    
    public static void b(final double n, final double n2, final double n3) {
        GlStateManager.func_179139_a(n, n2, n3);
    }
}
