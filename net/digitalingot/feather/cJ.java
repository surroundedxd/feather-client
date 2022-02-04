// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.TypeAdapterFactory;

public class cj implements TypeAdapterFactory
{
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        Class<? super Enum> clazz = (Class<? super Enum>)typeToken.getRawType();
        if (!Enum.class.isAssignableFrom(clazz) || clazz == Enum.class) {
            return null;
        }
        if (!clazz.isEnum()) {
            clazz = clazz.getSuperclass();
        }
        return new ci<T>((Class<T>)clazz);
    }
}
