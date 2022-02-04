// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import io.netty.util.AttributeKey;

public class hz
{
    public static final AttributeKey<hO> zv;
    public static final AttributeKey<hS> zw;
    public static final String zx;
    public static final int zy = 5432;
    public static final String zz;
    public static final int zA = 5433;
    public static final int zB = 3;
    public static final int zC = 1;
    public static final int zD = 24000;
    public static final int zE = 20;
    public static final int zF = 480;
    public static final int zG = 960;
    public static final double zH = 32.0;
    public static final double zI = 16.0;
    
    static {
        zv = AttributeKey.valueOf("control-connection");
        zw = AttributeKey.valueOf("voice-connection");
        zx = jW.h("FEATHER_VOICE_IPS", "https://game-client.feathermc.com/voice-list");
        zz = jW.h("FEATHER_CONTROL_SERVER", "voice.lb.feathermc.com");
    }
}
