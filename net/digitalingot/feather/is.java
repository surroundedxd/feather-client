// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.lwjgl.MemoryUtil;
import java.nio.ByteBuffer;
import sun.misc.Unsafe;

public class iS
{
    private static final Unsafe Es;
    
    public static void a(final long address, final int x) {
        iS.Es.putInt(address, x);
    }
    
    public static void a(final long address, final float x) {
        iS.Es.putFloat(address, x);
    }
    
    public static long a(final ByteBuffer byteBuffer) {
        return MemoryUtil.getAddress(byteBuffer);
    }
    
    public static long a(final ByteBuffer byteBuffer, final int n) {
        return MemoryUtil.getAddress(byteBuffer, n);
    }
    
    private static Unsafe ta() {
        for (final Field field : Unsafe.class.getDeclaredFields()) {
            if (field.getType().equals(Unsafe.class)) {
                final int modifiers = field.getModifiers();
                if (Modifier.isStatic(modifiers)) {
                    if (Modifier.isFinal(modifiers)) {
                        try {
                            field.setAccessible(true);
                            return (Unsafe)field.get(null);
                        }
                        catch (Exception ex) {
                            ex.printStackTrace();
                            break;
                        }
                    }
                }
            }
        }
        throw new UnsupportedOperationException("sun.misc.Unsafe is not available!");
    }
    
    static {
        Es = ta();
    }
}
