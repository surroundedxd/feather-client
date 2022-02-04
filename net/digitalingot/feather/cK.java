// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.net.InetSocketAddress;
import com.google.gson.TypeAdapter;

public class ck extends TypeAdapter<InetSocketAddress>
{
    public void a(final JsonWriter jsonWriter, final InetSocketAddress inetSocketAddress) {
        if (inetSocketAddress == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.value(inetSocketAddress.getAddress().getHostAddress() + ":" + inetSocketAddress.getPort());
    }
    
    public InetSocketAddress f(final JsonReader jsonReader) {
        final String[] split = jsonReader.nextString().split(":", 2);
        return new InetSocketAddress(split[0], Integer.parseInt(split[1]));
    }
}
