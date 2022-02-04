// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.awt.Color;
import java.util.List;
import com.google.common.collect.Iterables;
import net.minecraft.client.resources.ResourcePackRepository;
import net.minecraft.client.Minecraft;

@dV(eN = ec.PACK_DISPLAY, eO = @eb(fj = "Pack Display", fk = "https://assets.feathercdn.net/game/mods/packdisplay.svg", fl = "Displays your current texture pack", fm = { dk.a.HUD }))
public class gK extends dT<a>
{
    private static final Minecraft minecraft;
    private static final int uK = 22;
    private final kw uL;
    
    public gK() {
        this.uL = new kw();
    }
    
    @Override
    public void a(final dT.a a, final is is) {
        switch (gK$1.kP[a.ordinal()]) {
            case 1: {
                this.e(is);
                break;
            }
            case 2: {
                this.g(is);
                break;
            }
        }
    }
    
    private void g(final is is) {
        final List func_110613_c = gK.minecraft.func_110438_M().func_110613_c();
        if (func_110613_c.size() == 0) {
            return;
        }
        final ResourcePackRepository.Entry entry = (ResourcePackRepository.Entry)Iterables.getLast((Iterable)func_110613_c);
        final boolean um = ((a)this.jK).uM;
        final boolean us = ((a)this.jK).uS;
        if (((a)this.jK).uN) {
            this.kE.b(is, 0, 0, this.eD(), this.eE(), ((a)this.jK).li.getRGB());
        }
        if (um) {
            this.uL.a(entry);
            this.uL.a(this.kE, is, 0, 0, 22);
        }
        final int n = um ? 22 : 0;
        this.uL.a((iM)this.kE, is, entry, (float)(n + 2), us ? 1.0f : (this.eE() / 2.0f - gK.minecraft.field_71466_p.field_78288_b / 2.0f), ((a)this.jK).uP, ((a)this.jK).uQ);
        if (us) {
            this.uL.a((iM)this.kE, is, entry, (float)(n + 2), 12.0f, ((a)this.jK).uT.getRGB(), ((a)this.jK).uU);
        }
    }
    
    private void e(final is is) {
        final boolean um = ((a)this.jK).uM;
        final boolean us = ((a)this.jK).uS;
        if (((a)this.jK).uN) {
            this.kE.b(is, 0, 0, this.eD(), this.eE(), ((a)this.jK).li.getRGB());
        }
        if (um) {
            this.uL.tZ();
            this.uL.a(this.kE, is, 0, 0, 22);
        }
        final int n = um ? 22 : 0;
        this.kE.a(is, "Feather", (float)(n + 2), us ? 1.0f : (this.eE() / 2.0f - gK.minecraft.field_71466_p.field_78288_b / 2.0f), ((a)this.jK).uP, ((a)this.jK).uQ);
        if (us) {
            this.kE.a(is, "Pack Display", (float)(n + 2), 12.0f, ((a)this.jK).uT.getRGB(), ((a)this.jK).uU, false);
        }
    }
    
    @Override
    public int eD() {
        return 157 + (((a)this.jK).uM ? 22 : 0);
    }
    
    @Override
    public int eE() {
        return 22;
    }
    
    static {
        minecraft = Minecraft.func_71410_x();
    }
    
    @ep(fJ = 1.0, fK = 15.0, fL = bJ.TOP_RIGHT)
    public static class a extends ed
    {
        @es(fU = 0)
        public fc lg;
        @ex(fw = "showIcon", fj = "Show Icon", fY = "true", fo = @es(fU = 1))
        public boolean uM;
        @ex(fw = "showBackground", fj = "Show Background", fY = "true", fo = @es(fU = 2))
        public boolean uN;
        @ex(fw = "backgroundColor", fj = "Background Color", fY = "0/0/0/100", gb = @et(fw = "showBackground"), fo = @es(fU = 3))
        public Color li;
        @es(fU = 10)
        public fc uO;
        @ex(fw = "titleColor", fj = "Text Color", fY = "false/255/255/255/255", fo = @es(fU = 11))
        public eZ uP;
        @ex(fw = "titleShadow", fj = "Text Shadow", fY = "true", fo = @es(fU = 12))
        public boolean uQ;
        @es(fU = 20)
        public fc uR;
        @ex(fw = "showDescription", fj = "Show Description", fY = "true", fo = @es(fU = 21))
        public boolean uS;
        @ex(fw = "descriptionColor", fj = "Text Color", fY = "128/128/128", gb = @et(fw = "showDescription"), fo = @es(fU = 22))
        public Color uT;
        @ex(fw = "descriptionShadow", fj = "Text Shadow", fY = "true", gb = @et(fw = "showDescription"), fo = @es(fU = 23))
        public boolean uU;
        
        public a() {
            this.lg = new fc("General Style");
            this.uO = new fc("Title Style");
            this.uR = new fc("Description Style");
        }
    }
}
