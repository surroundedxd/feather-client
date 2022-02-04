// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.lang.reflect.Field;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonReader;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.TypeAdapter;

public final class ci<T extends Enum<T>> extends TypeAdapter<T>
{
    private final Map<String, T> iF;
    private final Map<T, String> iG;
    
    public ci(final Class<T> clazz) {
        this.iF = new HashMap<String, T>();
        this.iG = new HashMap<T, String>();
        for (final Enum<T> enum1 : clazz.getEnumConstants()) {
            final String a = a(clazz, (T)enum1);
            this.iF.put(a, (T)enum1);
            this.iG.put((T)enum1, a);
        }
    }
    
    public T e(final JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return this.iF.get(jsonReader.nextString());
    }
    
    public void a(final JsonWriter jsonWriter, final T t) {
        jsonWriter.value((t == null) ? null : this.iG.get(t));
    }
    
    private static <T> String a(final Class<T> clazz, final T t) {
        Field declaredField;
        try {
            declaredField = clazz.getDeclaredField(t.toString());
        }
        catch (NoSuchFieldException cause) {
            throw new IllegalStateException(cause);
        }
        final eo eo = declaredField.getDeclaredAnnotation(eo.class);
        if (eo != null) {
            return eo.fw();
        }
        final SerializedName serializedName = declaredField.getDeclaredAnnotation(SerializedName.class);
        if (serializedName != null) {
            return serializedName.value();
        }
        return t.toString();
    }
}
