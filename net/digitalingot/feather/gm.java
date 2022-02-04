// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import java.util.Iterator;
import net.minecraft.util.StatCollector;
import net.minecraft.util.StringUtils;
import java.awt.Color;
import java.util.Collection;
import net.minecraft.client.Minecraft;
import java.util.Set;
import net.minecraft.potion.PotionEffect;
import java.util.List;

@dV(eN = ec.POTION_EFFECTS, eO = @eb(fj = "Potion Effects", fk = "https://assets.feathercdn.net/game/mods/potioneffects.svg", fl = "Display potion effects", fm = { dk.a.PVP, dk.a.HUD }))
public class gM extends dT<d>
{
    private static final List<PotionEffect> vc;
    private static final Set<Integer> vd;
    private static final b ve;
    
    @Override
    public void a(final dT.a a, final is is) {
        switch (gM$1.kP[a.ordinal()]) {
            case 1: {
                this.render(is);
            }
            case 2: {
                this.h(is);
            }
            default: {}
        }
    }
    
    private void render(final is is) {
        this.a(is, Minecraft.func_71410_x().field_71439_g.func_70651_bq(), false);
    }
    
    private void h(final is is) {
        this.a(is, gM.vc, true);
    }
    
    @Override
    public int eD() {
        return (((d)this.jK).vj || ((d)this.jK).vk) ? 120 : 50;
    }
    
    @Override
    public int eE() {
        return Minecraft.func_71410_x().field_71439_g.func_70651_bq().size() * (((d)this.jK).vj ? 25 : 20);
    }
    
    @Override
    public int eG() {
        return 5 * (((d)this.jK).vj ? 25 : 20);
    }
    
    public boolean ix() {
        return this.eU() && ((d)this.jK).vm;
    }
    
    private void a(final is is, final Collection<PotionEffect> collection, final boolean b) {
        if (collection.isEmpty()) {
            return;
        }
        int n = ((d)this.jK).vj ? 25 : (((d)this.jK).vk ? 20 : 18);
        if (collection.size() > 5 && ((d)this.jK).vj) {
            n = 132 / (collection.size() - 1);
        }
        int n2 = 0;
        if (((d)this.jK).vj) {
            this.kE.b(is, 0, 0, this.eD(), b ? this.eG() : this.eE(), new Color(0, 0, 0, 100).getRGB());
        }
        for (final PotionEffect potionEffect : collection) {
            final String b2 = gM.ve.b(potionEffect);
            final int c = gM.ve.c(potionEffect);
            String func_76337_a;
            if (gM.ve.d(potionEffect)) {
                func_76337_a = "**:**";
            }
            else {
                func_76337_a = StringUtils.func_76337_a(c);
            }
            gM.ve.a(potionEffect, is, ((d)this.jK).vj ? 6 : 0, n2 + (((d)this.jK).vj ? 5 : 0));
            if (((d)this.jK).vk) {
                final StringBuilder sb = new StringBuilder();
                sb.append(X(StatCollector.func_74838_a(b2)));
                if (!gM.vd.contains(gM.ve.a(potionEffect))) {
                    sb.append(" ").append(kB.aQ(potionEffect.func_76458_c() + 1));
                }
                this.kE.a(is, sb.toString(), (float)((((d)this.jK).vj ? 10 : 4) + 18), (float)(n2 + (((d)this.jK).vj ? 4 : 0)), ((d)this.jK).vi, true);
            }
            if (a(potionEffect, potionEffect.func_76459_b(), ((d)this.jK).vg)) {
                this.kE.a(is, func_76337_a, (float)((((d)this.jK).vj ? 10 : 4) + 18), (float)(n2 + (((d)this.jK).vj ? 4 : 0) + (((d)this.jK).vk ? 10 : 5)), ((d)this.jK).vh, true);
            }
            n2 += n;
        }
    }
    
    private static boolean a(final PotionEffect potionEffect, final int n, final int n2) {
        return potionEffect.func_82720_e() || n / 20 > n2 || n % 20 < 10;
    }
    
    private static PotionEffect g(final int n, final int n2, final int n3) {
        return new PotionEffect(n, n2, n3);
    }
    
    private static String X(final String s) {
        final char[] charArray = s.toCharArray();
        int n = 1;
        for (int length = charArray.length, i = 0; i < length; ++i) {
            final char ch = charArray[i];
            if (ch == ' ') {
                n = 1;
            }
            else if (n != 0) {
                charArray[i] = Character.toUpperCase(ch);
                n = 0;
            }
        }
        return new String(charArray);
    }
    
    static {
        vc = Lists.newArrayList((Object[])new PotionEffect[] { g(1, 1000, 1), g(2, 2456, 7), g(3, 8456, 12), g(4, 12456, 6), g(5, 45456, 17) });
        vd = Sets.newHashSet((Object[])new Integer[] { 9, 12, 13, 14, 15, 16 });
        ve = c.iy();
    }
    
    public static class a implements b
    {
        private static final ResourceLocation vf;
        
        @Override
        public int a(final PotionEffect potionEffect) {
            return potionEffect.func_76456_a();
        }
        
        @Override
        public String b(final PotionEffect potionEffect) {
            return potionEffect.func_76453_d();
        }
        
        @Override
        public int c(final PotionEffect potionEffect) {
            return potionEffect.func_76459_b();
        }
        
        @Override
        public boolean d(final PotionEffect potionEffect) {
            return potionEffect.func_100011_g();
        }
        
        @Override
        public void a(final PotionEffect potionEffect, final is is, final int n, final int n2) {
            final Potion potion = Potion.field_76425_a[potionEffect.func_76456_a()];
            if (!potion.func_76400_d()) {
                return;
            }
            io.a(0, a.vf);
            final int func_76392_e = potion.func_76392_e();
            iM.sU().d(is, n, n2, func_76392_e % 8 * 18, 198 + func_76392_e / 8 * 18, 18, 18);
        }
        
        static {
            vf = new ResourceLocation("minecraft:textures/gui/container/inventory.png");
        }
    }
    
    static class c
    {
        private c() {
        }
        
        public static b iy() {
            return new a();
        }
    }
    
    @ep(fL = bJ.CENTER_LEFT, fJ = 0.0, fK = 17.5)
    @el(fE = true)
    public static class d extends ed
    {
        @ex(fw = "durationBlinkSeconds", fj = "Blink Duration (in seconds)", fY = "10", fo = @es(fU = 0))
        @er(fS = 1, fR = 60)
        public int vg;
        @es(fU = 10)
        public fc mx;
        @ex(fw = "durationColor", fj = "Color Duration (in seconds)", fo = @es(fU = 11))
        public eZ vh;
        @ex(fw = "effectNameColor", fj = "Color Effect Name", fo = @es(fU = 12))
        public eZ vi;
        @ex(fw = "enableBackground", fj = "Background", fo = @es(fU = 13))
        public boolean vj;
        @es(fU = 20)
        public fc rl;
        @ex(fw = "enableEffectName", fj = "Effect Name", fY = "true", fo = @es(fU = 21))
        public boolean vk;
        @ex(fw = "enableIconBlink", fj = "Icon Blink", fY = "true", fo = @es(fU = 22))
        public boolean vl;
        @ex(fw = "hideInventoryStatus", fj = "Hide Inventory Status", fY = "true", fo = @es(fU = 23))
        public boolean vm;
        @ex(fw = "hideVanillaEffects", fj = "Hide Vanilla Effects (1.12.2+)", fY = "true", fo = @es(fU = 24))
        public boolean vn;
        
        public d() {
            this.mx = new fc("Color");
            this.rl = new fc("Show");
        }
    }
    
    interface b
    {
        int a(final PotionEffect p0);
        
        String b(final PotionEffect p0);
        
        int c(final PotionEffect p0);
        
        boolean d(final PotionEffect p0);
        
        void a(final PotionEffect p0, final is p1, final int p2, final int p3);
    }
}
