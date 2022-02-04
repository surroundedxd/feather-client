// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.awt.event.KeyEvent;
import java.lang.reflect.Field;

final class bs
{
    private static final Field cr;
    
    private bs() {
        throw new AssertionError();
    }
    
    public static void a(final KeyEvent obj, final int i) {
        try {
            bs.cr.set(obj, i);
        }
        catch (Throwable t) {}
    }
    
    static {
        try {
            (cr = KeyEvent.class.getDeclaredField("scancode")).setAccessible(true);
        }
        catch (Throwable cause) {
            throw new IllegalStateException(cause);
        }
    }
}
