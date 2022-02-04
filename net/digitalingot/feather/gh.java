// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.awt.Color;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import org.jetbrains.annotations.NotNull;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@dV(eN = ec.ITEM_COUNTER, eO = @eb(fj = "Item Counter", fk = "https://assets.feathercdn.net/game/mods/itemcounter.svg", fl = "Count items in your inventory", fm = { dk.a.PVP, dk.a.HUD }))
public class gH extends dT<a>
{
    private static final int sG = 16;
    private static final int sH = 16;
    private static final int kS = 2;
    private static final int sI = 2;
    private static final ItemStack sJ;
    private static final ItemStack sK;
    private static final Item sL;
    private static final ItemStack sM;
    private static final ItemStack sN;
    private static final ItemStack sO;
    private static final ItemStack sP;
    private static final Minecraft minecraft;
    private int sQ;
    
    public gH() {
        this.sQ = 0;
    }
    
    private static void a(final ItemStack itemStack, final String s) {
    }
    
    @NotNull
    private static ItemStack a(@NotNull final Item item, final int n, final int n2) {
        final ItemStack itemStack = new ItemStack(item, n);
        itemStack.func_77964_b(n2);
        switch (n2) {
            case 8197:
            case 16389: {
                a(itemStack, "minecraft:healing");
                break;
            }
            case 8229:
            case 16421: {
                a(itemStack, "minecraft:strong_healing");
                break;
            }
        }
        return itemStack;
    }
    
    private void a(final is is, final boolean b) {
        final int n = b ? 0 : kb.a((EntityPlayer)gH.minecraft.field_71439_g, Items.field_151032_g);
        final int n2 = b ? 0 : kb.a((EntityPlayer)gH.minecraft.field_71439_g, Items.field_151083_be, Items.field_151157_am, Items.field_151150_bK);
        final int n3 = b ? 0 : kb.a((EntityPlayer)gH.minecraft.field_71439_g, gH.sO);
        final int n4 = b ? 0 : kb.a((EntityPlayer)gH.minecraft.field_71439_g, gH.sP);
        final int n5 = b ? 0 : kb.a((EntityPlayer)gH.minecraft.field_71439_g, gH.sJ, gH.sK, gH.sM, gH.sN);
        final int n6 = b ? 0 : kb.a((EntityPlayer)gH.minecraft.field_71439_g, Items.field_151009_A);
        if (((a)this.jK).rZ) {
            this.kE.b(is, 0, 0, this.eD(), this.eE(), ((a)this.jK).li.getRGB());
        }
        switch (gH$1.sR[((a)this.jK).sU.ordinal()]) {
            case 1: {
                int sq = 0;
                if (((a)this.jK).sX) {
                    this.a(is, sq, 2, Items.field_151032_g, n, ((a)this.jK).sV, ((a)this.jK).sY);
                    sq += this.R(n) + 2;
                }
                if (((a)this.jK).ta) {
                    this.a(is, sq, 2, Items.field_151083_be, n2, ((a)this.jK).sV, ((a)this.jK).tb);
                    sq += this.R(n2) + 2;
                }
                if (((a)this.jK).tg) {
                    this.a(is, sq, 2, Items.field_151153_ao, n3, ((a)this.jK).sV, ((a)this.jK).th);
                    sq += this.R(n3) + 2;
                }
                if (((a)this.jK).tj) {
                    this.a(is, sq, 2, gH.sP, n4, ((a)this.jK).sV, ((a)this.jK).tk);
                    sq += this.R(n4) + 2;
                }
                if (((a)this.jK).td) {
                    this.a(is, sq, 2, gH.sK, n5, ((a)this.jK).sV, ((a)this.jK).te);
                    sq += this.R(n5) + 2;
                }
                if (((a)this.jK).tm) {
                    this.a(is, sq, 2, Items.field_151009_A, n6, ((a)this.jK).sV, ((a)this.jK).tn);
                    sq += this.R(n6);
                }
                this.sQ = sq;
                break;
            }
            case 2: {
                int n7 = 0;
                if (((a)this.jK).sX) {
                    this.a(is, 0, n7, Items.field_151032_g, n, ((a)this.jK).sV, ((a)this.jK).sY);
                    n7 += this.ij();
                }
                if (((a)this.jK).ta) {
                    this.a(is, 0, n7, Items.field_151083_be, n2, ((a)this.jK).sV, ((a)this.jK).tb);
                    n7 += this.ij();
                }
                if (((a)this.jK).tg) {
                    this.a(is, 0, n7, Items.field_151153_ao, n3, ((a)this.jK).sV, ((a)this.jK).th);
                    n7 += this.ij();
                }
                if (((a)this.jK).tj) {
                    this.a(is, 0, n7, gH.sP, n4, ((a)this.jK).sV, ((a)this.jK).tk);
                    n7 += this.ij();
                }
                if (((a)this.jK).td) {
                    this.a(is, 0, n7, gH.sK, n5, ((a)this.jK).sV, ((a)this.jK).te);
                    n7 += this.ij();
                }
                if (((a)this.jK).tm) {
                    this.a(is, 0, n7, Items.field_151009_A, n6, ((a)this.jK).sV, ((a)this.jK).tn);
                    break;
                }
                break;
            }
        }
    }
    
    @Override
    public void a(final dT.a a, final is is) {
        this.a(is, false);
    }
    
    @Override
    public void b(final is is) {
        this.a(is, true);
    }
    
    @Override
    public int eE() {
        if (((a)this.jK).sU == a.a.HORIZONTAL) {
            return (((a)this.jK).sV == a.b.TOP || ((a)this.jK).sV == a.b.BOTTOM) ? 30 : 16;
        }
        return (((a)this.jK).sV == a.b.TOP || ((a)this.jK).sV == a.b.BOTTOM) ? (this.ik() * 30 - 2) : (this.ik() * 18 - 2);
    }
    
    @Override
    public int eD() {
        return (((a)this.jK).sU == a.a.HORIZONTAL) ? this.sQ : this.R(99);
    }
    
    private int ij() {
        return (((a)this.jK).sV == a.b.BOTTOM || ((a)this.jK).sV == a.b.TOP) ? 30 : 18;
    }
    
    private int Q(final int i) {
        return (16 - this.kE.V(String.valueOf(i))) / 2;
    }
    
    private int R(final int i) {
        return (((a)this.jK).sV == a.b.BOTTOM || ((a)this.jK).sV == a.b.TOP) ? 16 : (18 + this.kE.V(String.valueOf(i)));
    }
    
    public void a(final is is, final int n, final int n2, final Item item, final int n3, final a.b b, final eZ ez) {
        this.a(is, n, n2, new ItemStack(item), n3, b, ez);
    }
    
    public void a(final is is, final int n, final int n2, final ItemStack itemStack, final int n3, final a.b b, final eZ ez) {
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        switch (gH$1.sS[b.ordinal()]) {
            case 1: {
                n4 = n;
                n5 = n2;
                n6 = n + this.Q(n3);
                n7 = n2 + 16;
                break;
            }
            case 2: {
                n4 = n;
                n5 = n2 + 12;
                n6 = n + this.Q(n3);
                n7 = n2;
                break;
            }
            case 3: {
                n4 = n + this.kE.V(String.valueOf(n3)) + 2;
                n5 = n2;
                n6 = n;
                n7 = n2 + 2;
                break;
            }
            case 4: {
                n4 = n;
                n5 = n2;
                n6 = n + 16 + 2;
                n7 = n2 + 2;
                break;
            }
            default: {
                throw new IllegalStateException();
            }
        }
        this.kE.a(is, itemStack, n4, n5, false, false);
        this.kE.a(is, String.valueOf(n3), (float)n6, (float)n7, ez, !((a)this.jK).rZ);
        io.a(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    public int ik() {
        int n = 0;
        final boolean[] array = { ((a)this.jK).sX, ((a)this.jK).ta, ((a)this.jK).td, ((a)this.jK).tg, ((a)this.jK).tj, ((a)this.jK).tm };
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i]) {
                ++n;
            }
        }
        return n;
    }
    
    static {
        sJ = a((Item)Items.field_151068_bn, 1, 8197);
        sK = a((Item)Items.field_151068_bn, 1, 8229);
        sL = (Item)Items.field_151068_bn;
        sM = a(gH.sL, 1, 16389);
        sN = a(gH.sL, 1, 16421);
        sO = a(Items.field_151153_ao, 1, 0);
        sP = a(Items.field_151153_ao, 1, 1);
        minecraft = Minecraft.func_71410_x();
    }
    
    @ep(fL = bJ.BOTTOM_CENTER, fJ = 151.0, fK = 0.0)
    public static class a extends ed
    {
        @es(fU = 0)
        public fc sT;
        @ex(fw = "displayMode", fj = "Display Mode", fY = "horizontal", fo = @es(fU = 1))
        public gH.a.a sU;
        @ex(fw = "textAlignment", fj = "Text Alignment", fY = "top", fo = @es(fU = 2))
        public b sV;
        @es(fU = 10)
        public fc rY;
        @ex(fw = "background", fj = "Background", fo = @es(fU = 11))
        public boolean rZ;
        @ex(fw = "backgroundColor", fj = "Color", gb = @et(fw = "background"), fY = "7/7/7/146", fo = @es(fU = 12))
        public Color li;
        @es(fU = 20)
        public fc sW;
        @ex(fw = "arrows", fj = "Arrows", fY = "true", fo = @es(fU = 21))
        public boolean sX;
        @ex(fw = "arrowsColor", fj = "Color", gb = @et(fw = "arrows"), fo = @es(fU = 22))
        public eZ sY;
        @es(fU = 30)
        public fc sZ;
        @ex(fw = "food", fj = "Food", fY = "true", fo = @es(fU = 31))
        public boolean ta;
        @ex(fw = "foodColor", fj = "Color", gb = @et(fw = "food"), fo = @es(fU = 32))
        public eZ tb;
        @es(fU = 40)
        public fc tc;
        @ex(fw = "potions", fj = "Potions", fY = "true", fo = @es(fU = 41))
        public boolean td;
        @ex(fw = "potionsColor", fj = "Color", gb = @et(fw = "potions"), fo = @es(fU = 42))
        public eZ te;
        @es(fU = 50)
        public fc tf;
        @ex(fw = "goldenApples", fj = "Golden Apples", fY = "true", fo = @es(fU = 51))
        public boolean tg;
        @ex(fw = "goldenApplesColor", fj = "Color", gb = @et(fw = "goldenApples"), fo = @es(fU = 52))
        public eZ th;
        @es(fU = 60)
        public fc ti;
        @ex(fw = "godApples", fj = "God Apples", fY = "true", fo = @es(fU = 61))
        public boolean tj;
        @ex(fw = "godApplesColor", fj = "Color", gb = @et(fw = "godApples"), fo = @es(fU = 62))
        public eZ tk;
        @es(fU = 70)
        public fc tl;
        @ex(fw = "soup", fj = "Soup", fY = "true", fo = @es(fU = 71))
        public boolean tm;
        @ex(fw = "soupColor", fj = "Color", gb = @et(fw = "soup"), fo = @es(fU = 72))
        public eZ tn;
        
        public a() {
            this.sT = new fc("Item Counter");
            this.rY = new fc("Background");
            this.sW = new fc("Arrows");
            this.sZ = new fc("Food");
            this.tc = new fc("Potions");
            this.tf = new fc("Golden Apples");
            this.ti = new fc("God Apples");
            this.tl = new fc("Soup");
        }
        
        public enum b
        {
            @eo(fw = "bottom", fj = "Bottom")
            BOTTOM, 
            @eo(fw = "left", fj = "Left")
            LEFT, 
            @eo(fw = "right", fj = "Right")
            RIGHT, 
            @eo(fw = "top", fj = "Top")
            TOP;
            
            private static /* synthetic */ b[] $values() {
                return new b[] { b.BOTTOM, b.LEFT, b.RIGHT, b.TOP };
            }
            
            static {
                $VALUES = $values();
            }
        }
        
        public enum a
        {
            @eo(fw = "horizontal", fj = "Horizontal")
            HORIZONTAL, 
            @eo(fw = "vertical", fj = "Vertical")
            VERTICAL;
            
            private static /* synthetic */ a[] $values() {
                return new a[] { a.HORIZONTAL, a.VERTICAL };
            }
            
            static {
                $VALUES = $values();
            }
        }
    }
}
