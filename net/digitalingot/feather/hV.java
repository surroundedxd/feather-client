// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import com.google.gson.JsonObject;
import java.time.LocalTime;
import java.time.ZoneId;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import com.google.gson.JsonParser;
import java.util.concurrent.ForkJoinPool;

@dV(eN = ec.TIME_CHANGER, eO = @eb(fj = "Time Changer", fk = "https://assets.feathercdn.net/game/mods/timechanger.svg", fl = "Change the time locally", fm = {}))
public class hv extends dW<a>
{
    private static final int zb = 21000;
    private boolean zc;
    private long zd;
    private long ze;
    private int zf;
    
    public hv() {
        this.zd = 21600L;
        this.ze = 64800L;
    }
    
    @Override
    public void initialize() {
        if (((a)this.jK).zh) {
            ForkJoinPool.commonPool().execute(this::js);
        }
    }
    
    @Override
    public void eR() {
        this.zf = 21000 - (int)(((a)this.jK).zg / 100.0f * 21000.0f);
        if (((a)this.jK).zh && !this.zc) {
            ForkJoinPool.commonPool().execute(this::js);
        }
    }
    
    public void js() {
        if (this.zc) {
            return;
        }
        this.zc = true;
        try {
            final hu jp = hu.jp();
            final JsonObject asJsonObject = new JsonParser().parse(jz.aM("http://api.sunrise-sunset.org/json?lat=" + jp.jq() + "&lng=" + jp.jr() + "&formatted=0").tv()).getAsJsonObject().get("results").getAsJsonObject();
            final Calendar instance = Calendar.getInstance();
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ssX");
            final Date parse = simpleDateFormat.parse(asJsonObject.get("sunrise").getAsString());
            final Date parse2 = simpleDateFormat.parse(asJsonObject.get("sunset").getAsString());
            this.zd = LocalTime.ofInstant(parse.toInstant(), ZoneId.systemDefault()).toSecondOfDay();
            this.ze = LocalTime.ofInstant(parse2.toInstant(), ZoneId.systemDefault()).toSecondOfDay();
        }
        catch (Exception ex) {
            kr.Gh.info("Failed to fetch sunrise & sunset time for TimeChanger", (Throwable)ex);
        }
    }
    
    public long jt() {
        return ((a)this.jK).zh ? this.ju() : this.zf;
    }
    
    public long ju() {
        final long n = LocalTime.now().toSecondOfDay();
        long n2;
        if (n < this.zd) {
            n2 = (long)(18000.0 + n * (6000.0 / this.zd));
        }
        else if (n < this.ze) {
            n2 = (long)(0.0 + (n - this.zd) * (12000.0 / Math.abs(this.ze - this.zd)));
        }
        else {
            n2 = (long)(12000.0 + (n - this.ze) * (6000.0 / (TimeUnit.DAYS.toSeconds(1L) - this.ze)));
        }
        return n2;
    }
    
    public static class a extends eg
    {
        @ex(fw = "percentage", fj = "", fY = "100", fo = @es(fU = 1))
        @er(fS = 0, fR = 100)
        public int zg;
        @ex(fw = "useRealWorldTime", fj = "Use Real World Time", fY = "false", fo = @es(fU = 3))
        public boolean zh;
    }
}
