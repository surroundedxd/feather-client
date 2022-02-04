// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.ArrayList;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Array;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles;
import java.util.function.Function;
import java.util.List;

public final class at
{
    private static final List<as<?>> bN;
    
    private at() {
    }
    
    public static void aJ() {
        at.bN.forEach(as::aK);
    }
    
    public static <T> ap<T> a(final Class<? super T> clazz, final Function<T[], T> function) {
        final as<Object> as = new as<Object>((Class<? super Object>)clazz, (Function<Object[], Object>)function);
        at.bN.add(as);
        return (ap<T>)as;
    }
    
    private static <T> T b(final Class<T> componentType, final Function<T[], T> function) {
        Method m = null;
        for (final Method method : componentType.getMethods()) {
            if ((method.getModifiers() & 0x802) == 0x0) {
                if (m != null) {
                    throw new IllegalStateException("Multiple virtual methods in " + componentType + "; cannot build empty invoker!");
                }
                m = method;
            }
        }
        if (m == null) {
            throw new IllegalStateException("No virtual methods in " + componentType + "; cannot build empty invoker!");
        }
        try {
            final MethodHandle unreflect = MethodHandles.lookup().unreflect(m);
            final MethodType dropParameterTypes = unreflect.type().dropParameterTypes(0, 1);
            if (dropParameterTypes.returnType() != Void.TYPE) {
                final MethodHandle explicitCastArguments = MethodHandles.explicitCastArguments(unreflect, MethodType.genericMethodType(dropParameterTypes.parameterCount()).changeReturnType(dropParameterTypes.returnType()).insertParameterTypes(0, (Class<?>[])new Class[] { unreflect.type().parameterType(0) }));
                final Object[] arguments = new Object[unreflect.type().parameterCount()];
                arguments[0] = function.apply((T[])Array.newInstance(componentType, 0));
                explicitCastArguments.invokeWithArguments(arguments);
            }
        }
        catch (Throwable cause) {
            throw new RuntimeException(cause);
        }
        final Object o;
        return (T)Proxy.newProxyInstance(at.class.getClassLoader(), new Class[] { componentType }, (p1, p2, p3) -> o);
    }
    
    static {
        bN = new ArrayList<as<?>>();
    }
}
