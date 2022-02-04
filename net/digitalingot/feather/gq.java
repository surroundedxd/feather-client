// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@dV(eN = ec.TIME, eO = @eb(fj = "Time", fk = "https://assets.feathercdn.net/game/mods/time.svg", fl = "Display the current time", fm = { dk.a.HUD }))
public class gQ extends dX<a>
{
    private static final DateTimeFormatter vT;
    private static final DateTimeFormatter vU;
    
    @Override
    public Object eV() {
        return LocalDateTime.now().format((((a)this.jK).vW == a.a.HOUR_12) ? gQ.vT : gQ.vU);
    }
    
    @Override
    public boolean eX() {
        return false;
    }
    
    static {
        vT = DateTimeFormatter.ofPattern("hh:mm a");
        vU = DateTimeFormatter.ofPattern("HH:mm");
    }
    
    @ep(fJ = 33.0, fK = 8.0)
    public static class a extends eh
    {
        @es(fU = 0)
        public fc vV;
        @ex(fw = "timeFormat", fj = "Time Format", fY = "12", fo = @es(fU = 2))
        public gQ.a.a vW;
        
        public a() {
            this.vV = new fc("Time");
        }
        
        public enum a
        {
            @eo(fw = "24", fj = "24h")
            HOUR_24, 
            @eo(fw = "12", fj = "12h")
            HOUR_12;
            
            private static /* synthetic */ a[] $values() {
                return new a[] { a.HOUR_24, a.HOUR_12 };
            }
            
            static {
                $VALUES = $values();
            }
        }
    }
}
