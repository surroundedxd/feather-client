// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

public class cm
{
    public static class a extends TypeAdapter<cQ>
    {
        public void a(final JsonWriter jsonWriter, final cQ cq) {
            jsonWriter.beginObject();
            jsonWriter.name("name").value(cq.getName());
            jsonWriter.name("slug").value(cq.getSlug());
            jsonWriter.name("icon").value(cq.getIcon());
            jsonWriter.endObject();
        }
        
        public cQ h(final JsonReader jsonReader) {
            throw new UnsupportedOperationException("not implemented");
        }
    }
    
    public static class b extends TypeAdapter<cR>
    {
        public void a(final JsonWriter jsonWriter, final cR cr) {
            jsonWriter.beginObject();
            jsonWriter.name("name").value(cr.getName());
            jsonWriter.name("slug").value(cr.getSlug());
            jsonWriter.endObject();
        }
        
        public cR i(final JsonReader jsonReader) {
            throw new UnsupportedOperationException("not implemented");
        }
    }
    
    public static class c extends TypeAdapter<cS>
    {
        public void a(final JsonWriter jsonWriter, final cS cs) {
            jsonWriter.beginObject();
            jsonWriter.name("slug").value(cs.getSlug());
            jsonWriter.endObject();
        }
        
        public cS j(final JsonReader jsonReader) {
            return null;
        }
    }
}
