// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.FloatControl;
import org.jetbrains.annotations.Nullable;

@dV(eN = ec.VOICE, eO = @eb(fj = "Voice", fk = "https://assets.feathercdn.net/game/mods/voice.svg", fl = "", fm = {}))
public class hw extends dW<a>
{
    @Nullable
    private hA zi;
    
    @Override
    public void eP() {
        final fX fx = e.s().m().b(fX.class);
        if (fx.hN() == null) {
            return;
        }
        final k h = fx.hN().H();
        if (h.K() == null) {
            return;
        }
        final gs hm = fx.hM();
        if (hm == null) {
            return;
        }
        this.zi = hA.a(h, hm.ic().hU(), new hC(this), new hF(((a)this.jK).zp, ((a)this.jK).zs));
    }
    
    @Override
    public void eQ() {
        if (this.zi != null) {
            this.zi.close();
            this.zi = null;
        }
    }
    
    @Override
    public void eR() {
        if (this.zi == null) {
            return;
        }
        final hI jl = this.zi.jL();
        if (jl != null) {
            final FloatControl kh = jl.kh();
            if (kh != null) {
                kh.setValue((float)(((a)this.jK).zu * 40.0 / 100.0 - 35.0));
            }
        }
        final hM jk = this.zi.jK();
        if (jk != null) {
            jk.kl();
        }
    }
    
    @Nullable
    public hA jv() {
        return this.zi;
    }
    
    @el(fE = true)
    public static class a extends eg
    {
        @es(fU = 0)
        public fc mu;
        @ex(fw = "receiveMode", fj = "Receive Mode", fY = "everyone", fo = @es(fU = 1))
        public hw.a.a zk;
        @es(fU = 10)
        public fc zl;
        @ex(fw = "keyProximityPTT", fj = "Proximity - Push to Talk", fY = "86", fo = @es(fU = 11))
        public bK zm;
        @ex(fw = "keyPartyPTT", fj = "Party - Push to Talk", fY = "80", fo = @es(fU = 12))
        public bK zn;
        @es(fU = 20)
        public fc zo;
        @ex(fw = "microphone", fj = "Device", fY = "Default", fo = @es(fU = 21))
        @en
        @ei(fw = "microphones")
        public String zp;
        @ex(fw = "microphoneAmplification", fj = "Amplification", fY = "1.0", fo = @es(fU = 22))
        @em
        public double zq;
        @es(fU = 30)
        public fc zr;
        @ex(fw = "speaker", fj = "Device", fY = "Default", fo = @es(fU = 31))
        @en
        @ei(fw = "speakers")
        public String zs;
        @ex(fw = "speakerAmplification", fj = "Amplification", fY = "1.0", fo = @es(fU = 32))
        @em
        public double zt;
        @ex(fw = "maxVolume", fj = "Max Volume", fY = "80", fo = @es(fU = 33))
        @em(fH = 10.0, fG = 100.0)
        public double zu;
        
        public a() {
            this.mu = new fc("General");
            this.zl = new fc("Key Settings");
            this.zo = new fc("Capture");
            this.zr = new fc("Playback");
        }
        
        @ei(fw = "microphones")
        public static List<String> jw() {
            final ArrayList<Object> list = new ArrayList<Object>();
            list.add("Default");
            list.addAll(hF.ke());
            return (List<String>)list;
        }
        
        @ei(fw = "speakers")
        public static List<String> jx() {
            final ArrayList<Object> list = new ArrayList<Object>();
            list.add("Default");
            list.addAll(hF.kf());
            return (List<String>)list;
        }
        
        public enum a
        {
            @eo(fw = "everyone", fj = "Everyone")
            EVERYONE, 
            @eo(fw = "partyOnly", fj = "Party Only")
            PARTY_ONLY;
            
            public hZ.a toCapnProto() {
                switch (hw$1.zj[this.ordinal()]) {
                    case 1: {
                        return hZ.a.EVERYONE;
                    }
                    case 2: {
                        return hZ.a.PARTY_ONLY;
                    }
                    default: {
                        throw new IllegalArgumentException();
                    }
                }
            }
            
            private static /* synthetic */ a[] $values() {
                return new a[] { a.EVERYONE, a.PARTY_ONLY };
            }
            
            static {
                $VALUES = $values();
            }
        }
    }
}
