// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.HashMap;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import java.net.HttpURLConnection;
import java.io.IOException;
import com.google.gson.JsonParser;
import java.io.File;
import java.util.Map;

public class hs
{
    private static final String yW = "https://api.imgur.com/3/image";
    private static final Map<String, String> yX;
    
    public static String h(final File file) {
        final String s = hs.yX.get(file.getAbsolutePath());
        if (s != null) {
            return s;
        }
        final String replace = new JsonParser().parse(i(file)).getAsJsonObject().get("data").getAsJsonObject().get("link").getAsString().replace("i.imgur.com", "i.feathermc.com");
        hs.yX.put(file.getAbsolutePath(), replace);
        return replace;
    }
    
    private static String i(final File file) {
        HttpURLConnection ap = null;
        try {
            ap = ap("https://api.imgur.com/3/image");
            a(ap, "image=" + j(file));
            return a(ap);
        }
        catch (IOException cause) {
            throw new RuntimeException(cause);
        }
        finally {
            if (ap != null) {
                ap.disconnect();
            }
        }
    }
    
    private static String j(final File file) {
        return URLEncoder.encode(new String(Base64.encodeBase64(FileUtils.readFileToByteArray(file)), StandardCharsets.US_ASCII), StandardCharsets.UTF_8.toString());
    }
    
    private static HttpURLConnection ap(final String spec) {
        final HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(spec).openConnection();
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Authorization", "Client-ID ecd202364b54dde");
        httpURLConnection.setReadTimeout(100000);
        httpURLConnection.connect();
        return httpURLConnection;
    }
    
    private static void a(final HttpURLConnection httpURLConnection, final String str) {
        final OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
            final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            try {
                outputStreamWriter.write(str);
                outputStreamWriter.flush();
                outputStreamWriter.close();
            }
            catch (Throwable t) {
                try {
                    outputStreamWriter.close();
                }
                catch (Throwable exception) {
                    t.addSuppressed(exception);
                }
                throw t;
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
        catch (Throwable t2) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                }
                catch (Throwable exception2) {
                    t2.addSuppressed(exception2);
                }
            }
            throw t2;
        }
    }
    
    private static String a(final HttpURLConnection httpURLConnection) {
        return jz.d(httpURLConnection.getInputStream()).tv();
    }
    
    static {
        yX = new HashMap<String, String>();
    }
}
