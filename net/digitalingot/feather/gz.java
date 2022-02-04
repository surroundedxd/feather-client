// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.Iterator;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import java.util.List;

@dV(eN = ec.HYPIXEL, eO = @eb(fj = "Hypixel", fk = "https://assets.feathercdn.net/game/mods/hypixel.svg", fl = "Useful mods for Hypixel", fm = { dk.a.HYPIXEL }))
public class gZ extends dW<a>
{
    private final hb wT;
    @NotNull
    private final List<ha<?>> wU;
    
    public gZ() {
        this.wT = new hb(this);
        this.wU = Arrays.asList(new gW(this), new gY(this), new gX(this), new gU(this), new gV(this), this.wT);
    }
    
    @Override
    public void initialize() {
        final Iterator<ha<?>> iterator = this.wU.iterator();
        while (iterator.hasNext()) {
            iterator.next().initialize();
        }
    }
    
    @Override
    public void eR() {
        for (final ha<?> ha : this.wU) {
            if (ha.iN() && !ha.iS()) {
                ha.eP();
            }
            if (!ha.iN() && ha.iS()) {
                ha.eQ();
            }
            ha.eR();
        }
    }
    
    @Override
    public void eP() {
        for (final ha<?> ha : this.wU) {
            if (ha.iN()) {
                ha.eP();
            }
        }
    }
    
    @Override
    public void eQ() {
        for (final ha<?> ha : this.wU) {
            if (ha.iS()) {
                ha.eQ();
            }
        }
    }
    
    @NotNull
    public hb iR() {
        return this.wT;
    }
    
    public static class a extends eg
    {
        @es(fU = 0)
        public fc wV;
        @ex(fw = "autoFriendEnabled", fj = "Enabled", fo = @es(fU = 1))
        public boolean wW;
        @ex(fw = "friendMessages", fj = "Show Friend Messages", gb = @et(fw = "autoFriendEnabled"), fo = @es(fU = 2))
        public boolean wX;
        @es(fU = 10)
        public fc wY;
        @ex(fw = "autoTipEnabled", fj = "Enabled", fY = "true", fo = @es(fU = 11))
        public boolean wZ;
        @ex(fw = "autoTipInterval", fj = "Interval", fY = "900", gb = @et(fw = "autoTipEnabled"), fo = @es(fU = 12))
        @er(fS = 0, fR = 3600)
        public int xa;
        @es(fU = 20)
        public fc xb;
        @ex(fw = "autoGGEnabled", fj = "Enabled", fo = @es(fU = 21))
        public boolean xc;
        @ex(fw = "autoGGDelay", fj = "Delay", fY = "20", gb = @et(fw = "autoGGEnabled"), fo = @es(fU = 22))
        @er(fS = 1)
        public int xd;
        @es(fU = 30)
        public fc xe;
        @ex(fw = "antiGGEnabled", fj = "Enabled", fo = @es(fU = 31))
        public boolean xf;
        @es(fU = 40)
        public fc xg;
        @ex(fw = "antiLobbyJoinEnabled", fj = "Enabled", fo = @es(fU = 41))
        public boolean xh;
        @es(fU = 50)
        public fc xi;
        @ex(fw = "levelHeadEnabled", fj = "Enabled", fY = "true", fo = @es(fU = 51))
        public boolean xj;
        @ex(fw = "levelHeadShowSelf", fj = "Show Self", gb = @et(fw = "levelHeadEnabled"), fo = @es(fU = 52))
        public boolean xk;
        @ex(fw = "levelHeadLevelColor", fj = "Nametag Color", fY = "false/255/255/0", gb = @et(fw = "levelHeadEnabled"), fo = @es(fU = 53))
        public eZ xl;
        @es(fU = 60)
        public fc xm;
        @ex(fw = "levelHeadPrefixEnabled", fj = "Prefix", fY = "true", fo = @es(fU = 61))
        public boolean xn;
        @ex(fw = "levelHeadPrefixText", fj = "Text", fY = "Level:", gb = @et(fw = "levelHeadPrefixEnabled"), fo = @es(fU = 62))
        @ew(fS = 0, fR = 32)
        public String xo;
        @ex(fw = "levelHeadPrefixColor", fj = "Color", fY = "false/0/255/255", gb = @et(fw = "levelHeadPrefixEnabled"), fo = @es(fU = 63))
        public eZ xp;
        @es(fU = 64)
        public fc xq;
        @ex(fw = "levelHeadSuffixEnabled", fj = "Suffix", fo = @es(fU = 65))
        public boolean xr;
        @ex(fw = "levelHeadSuffixText", fj = "Text", fY = "Level", gb = @et(fw = "levelHeadSuffixEnabled"), fo = @es(fU = 66))
        @ew(fS = 0, fR = 32)
        public String xs;
        @ex(fw = "levelHeadSuffixColor", fj = "Color", fY = "false/0/255/255", gb = @et(fw = "levelHeadSuffixEnabled"), fo = @es(fU = 67))
        public eZ xt;
        
        public a() {
            this.wV = new fc("Auto Friend");
            this.wY = new fc("Auto Tip");
            this.xb = new fc("Auto GG");
            this.xe = new fc("Anti GG");
            this.xg = new fc("Anti Lobby Join");
            this.xi = new fc("Level Head");
            this.xk = false;
            this.xm = new fc("LevelHead Prefix");
            this.xq = new fc("LevelHead Suffix");
        }
    }
}
