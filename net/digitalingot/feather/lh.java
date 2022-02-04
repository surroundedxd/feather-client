// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.Nullable;
import java.lang.reflect.ParameterizedType;

public final class lh
{
    public static Class<?> a(final Class<?> clazz, final int n, final int n2) {
        return a((ParameterizedType)clazz.getGenericInterfaces()[n], n2);
    }
    
    public static Class<?> a(final Class<?> clazz, final int n) {
        return a((ParameterizedType)clazz.getGenericSuperclass(), n);
    }
    
    @Nullable
    public static Class<?> a(final ParameterizedType parameterizedType, final int n) {
        final String typeName = parameterizedType.getActualTypeArguments()[n].getTypeName();
        try {
            return Class.forName(typeName);
        }
        catch (ClassNotFoundException ex) {
            return null;
        }
    }
}
