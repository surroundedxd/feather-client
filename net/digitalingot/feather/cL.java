// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.ArrayList;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

public class cl extends TypeAdapter<bK>
{
    public void a(final JsonWriter jsonWriter, final bK bk) {
        if (bk == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("keys");
        jsonWriter.beginArray();
        final int[] cl = bk.cl();
        for (int length = cl.length, i = 0; i < length; ++i) {
            jsonWriter.value((long)bQ.J(cl[i]).cr());
        }
        jsonWriter.endArray();
        jsonWriter.name("display").value(bk.getName());
        jsonWriter.endObject();
    }
    
    public bK g(final JsonReader jsonReader) {
        jsonReader.beginObject();
        final ArrayList<Object> list = new ArrayList<Object>();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("keys")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    list.add(bQ.K(jsonReader.nextInt()).cq());
                }
                jsonReader.endArray();
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new bK(list.stream().mapToInt(n -> n).toArray());
    }
}
