// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.util.MathHelper;

public class iT
{
    private static final float Er = 127.0f;
    
    public static int d(final float n, final float n2, final float n3) {
        return n(n3) << 16 | n(n2) << 8 | n(n);
    }
    
    private static int n(final float n) {
        return (int)(MathHelper.func_76131_a(n, -1.0f, 1.0f) * 127.0f) & 0xFF;
    }
}
