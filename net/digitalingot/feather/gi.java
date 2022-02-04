// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBow;
import java.util.List;
import net.minecraft.util.StatCollector;
import net.minecraft.potion.PotionEffect;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.item.ItemPotion;
import java.awt.Color;
import net.minecraft.client.Minecraft;

@dV(eN = ec.ITEM_INFO, eO = @eb(fj = "Item Info", fk = "https://assets.feathercdn.net/game/mods/iteminfo.svg", fl = "Display enchants when picking up an item", fm = { dk.a.PVP, dk.a.HUD }))
public class gI extends dT<a>
{
    private static final String to = "";
    private static final String tp = "14";
    private static final Minecraft minecraft;
    private String tq;
    private long tr;
    private float kH;
    
    @Override
    public void a(final dT.a a, final is is) {
        this.b(is, a == dT.a.MOD_LAYOUT);
    }
    
    @Override
    public void b(final is is) {
        this.kE.a(is, "14", 0.0f, 0.0f, ((a)this.jK).tw, true);
    }
    
    @Override
    public int eH() {
        return 0;
    }
    
    @Override
    public int eI() {
        return 0;
    }
    
    private void b(final is is, final boolean b) {
        float kh = this.kH;
        String il = null;
        String value = null;
        if (((a)this.jK).ty) {
            if (b) {
                il = "";
            }
            else {
                il = this.il();
            }
        }
        if (((a)this.jK).tv) {
            if (b) {
                value = "14";
            }
            else {
                final int im = this.im();
                if (im != -1) {
                    value = String.valueOf(im);
                }
            }
        }
        float n = 1.0f;
        if (!b && ((a)this.jK).tB) {
            final String string = il + "\n" + value;
            long n2 = 0L;
            if (string.equals(this.tq)) {
                n2 = System.currentTimeMillis() - this.tr - ((a)this.jK).tt * 100L;
            }
            else {
                this.tq = string;
                this.tr = System.currentTimeMillis();
            }
            if (n2 >= ((a)this.jK).tC * 100L) {
                return;
            }
            if (n2 > 0L) {
                n = 1.0f - n2 / 100.0f / ((a)this.jK).tC;
            }
        }
        if (il != null) {
            final Color gu = ((a)this.jK).tz.gU();
            this.kE.a(is, il, (this.eD() - this.kE.V(il)) / 2.0f, kh, new Color(gu.getRed(), gu.getGreen(), gu.getBlue(), Math.max(5, (int)(gu.getAlpha() * n))).getRGB(), true, ((a)this.jK).tz.gT());
            kh += 16.0f;
        }
        if (value != null) {
            final Color gu2 = ((a)this.jK).tw.gU();
            this.kE.a(is, value, (this.eD() - this.kE.V(value)) / 2.0f, kh, new Color(gu2.getRed(), gu2.getGreen(), gu2.getBlue(), Math.max(5, (int)(gu2.getAlpha() * n))).getRGB(), true, ((a)this.jK).tw.gT());
        }
    }
    
    @Override
    public int eE() {
        if (((a)this.jK).tv) {
            return ((a)this.jK).ty ? 30 : 14;
        }
        return ((a)this.jK).ty ? 14 : 0;
    }
    
    @Override
    public int eD() {
        return ((a)this.jK).ty ? 120 : 30;
    }
    
    @Override
    public void eR() {
        this.kH = (this.eE() - 8.0f) / 2.0f;
    }
    
    private String il() {
        final EntityPlayerSP field_71439_g = gI.minecraft.field_71439_g;
        if (field_71439_g == null) {
            return "";
        }
        final ItemStack func_70694_bm = field_71439_g.func_70694_bm();
        if (func_70694_bm == null) {
            return "";
        }
        if (func_70694_bm.func_77973_b() instanceof ItemPotion) {
            return this.i(func_70694_bm);
        }
        return this.h(func_70694_bm);
    }
    
    private String h(final ItemStack itemStack) {
        if (!itemStack.func_77948_v()) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        for (final Map.Entry<Integer, V> entry : EnchantmentHelper.func_82781_a(itemStack).entrySet()) {
            sb.append(kt.Gi.get(entry.getKey())).append(" ").append(entry.getValue()).append(" ");
        }
        return sb.toString().trim();
    }
    
    private String i(final ItemStack itemStack) {
        final List func_77832_l = ((ItemPotion)itemStack.func_77973_b()).func_77832_l(itemStack);
        if (func_77832_l == null || func_77832_l.isEmpty()) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        for (final PotionEffect potionEffect : func_77832_l) {
            final int n = potionEffect.func_76459_b() / 20;
            sb.append(StatCollector.func_74838_a(potionEffect.func_76453_d())).append(" ").append(potionEffect.func_76458_c() + 1).append(" (").append(n / 60).append(String.format(":%02d", n % 60)).append(") ");
        }
        return sb.toString().trim();
    }
    
    private int im() {
        final EntityPlayerSP field_71439_g = gI.minecraft.field_71439_g;
        if (field_71439_g == null) {
            return -1;
        }
        final ItemStack func_70694_bm = field_71439_g.func_70694_bm();
        if (func_70694_bm == null) {
            return -1;
        }
        Item item = func_70694_bm.func_77973_b();
        int func_77952_i = func_70694_bm.func_77952_i();
        if (item instanceof ItemBow) {
            item = Items.field_151032_g;
            func_77952_i = 0;
        }
        final int func_150891_b = Item.func_150891_b(item);
        int n = 0;
        for (final ItemStack itemStack : field_71439_g.field_71071_by.field_70462_a) {
            if (itemStack != null) {
                if (Item.func_150891_b(itemStack.func_77973_b()) == func_150891_b && itemStack.func_77952_i() == func_77952_i) {
                    n += itemStack.field_77994_a;
                }
            }
        }
        return n;
    }
    
    static {
        minecraft = Minecraft.func_71410_x();
    }
    
    @ep(fL = bJ.BOTTOM_CENTER, fJ = -1.0, fK = -56.0)
    public static class a extends ed
    {
        @es(fU = 0)
        public fc ts;
        @ex(fw = "showTime", fj = "Show Time", fY = "15", fo = @es(fU = 1))
        @er(fR = 30)
        public int tt;
        @es(fU = 10)
        public fc tu;
        @ex(fw = "count", fj = "Count", fY = "true", fo = @es(fU = 11))
        public boolean tv;
        @ex(fw = "countColor", fj = "Count Color", fY = "false/192/192/192", gb = @et(fw = "count"), fo = @es(fU = 12))
        public eZ tw;
        @es(fU = 20)
        public fc tx;
        @ex(fw = "enchants", fj = "Enchants", fo = @es(fU = 21))
        public boolean ty;
        @ex(fw = "enchantsColor", fj = "Color", fY = "false/192/192/192", gb = @et(fw = "enchants"), fo = @es(fU = 22))
        public eZ tz;
        @es(fU = 30)
        public fc tA;
        @ex(fw = "fadeOut", fj = "Fade Out", fY = "true", fo = @es(fU = 31))
        public boolean tB;
        @ex(fw = "fadeOutTime", fj = "Time", fY = "5", gb = @et(fw = "fadeOut"), fo = @es(fU = 32))
        @er(fR = 20)
        public int tC;
        
        public a() {
            this.ts = new fc("Item Info");
            this.tu = new fc("Count");
            this.tx = new fc("Enchants");
            this.tA = new fc("Fade Out");
        }
        
        @Override
        public double fr() {
            return iv.mw() / 2.0 / iv.mA();
        }
        
        @Override
        public double fs() {
            return iv.mx() / iv.mA() - 50.0;
        }
    }
}
