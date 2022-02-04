// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.MathHelper;
import net.minecraft.item.ItemBow;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;

@dV(eN = ec.FOV_CHANGER, eO = @eb(fj = "FOV Changer", fk = "https://assets.feathercdn.net/game/mods/fovchanger.svg", fl = "Customize field of view", fm = {}))
public class fB extends dW<a>
{
    public static final Potion nj;
    public static final Potion nk;
    
    @Override
    public void initialize() {
        EntityPlayerSP field_71439_g;
        float n3 = 0.0f;
        final ItemStack itemStack;
        U.bk.a((n, n2) -> {
            if (!this.eU()) {
                return n2;
            }
            else {
                field_71439_g = Minecraft.func_71410_x().field_71439_g;
                if (((EntityPlayer)field_71439_g).func_70051_ag()) {
                    n3 += (float)((a)this.jK).no;
                }
                if (((EntityPlayer)field_71439_g).field_71075_bZ.field_75100_b) {
                    n3 += (float)((a)this.jK).nm;
                }
                if (((EntityPlayer)field_71439_g).func_70644_a(fB.nj)) {
                    n3 += (float)((a)this.jK).np;
                }
                if (((EntityPlayer)field_71439_g).func_70644_a(fB.nk)) {
                    n3 -= (float)((a)this.jK).nn;
                }
                ((EntityPlayer)field_71439_g).func_70694_bm();
                if (((a)this.jK).nl > 0.0 && itemStack != null && itemStack.func_77973_b() instanceof ItemBow) {
                    n3 -= (float)(MathHelper.func_76131_a((float)Math.pow((itemStack.func_77988_m() - ((EntityPlayer)field_71439_g).func_71052_bv()) / 20.0f, 2.0), 0.0f, 1.0f) * ((a)this.jK).nl);
                }
                return n * n3 / 100.0f;
            }
        });
    }
    
    static {
        nj = Potion.func_180142_b("speed");
        nk = Potion.func_180142_b("slowness");
    }
    
    public static class a extends eg
    {
        @ex(fw = "bowZoomModifier", fj = "Bow Zoom", fo = @es(fU = 0))
        @em(fH = -50.0, fG = 50.0)
        public double nl;
        @ex(fw = "flyingModifier", fj = "Flying Modifier", fo = @es(fU = 1))
        @em(fH = -50.0, fG = 50.0)
        public double nm;
        @ex(fw = "slownessModifier", fj = "Slowness Modifier", fo = @es(fU = 2))
        @em(fH = -50.0, fG = 50.0)
        public double nn;
        @ex(fw = "sprintModifier", fj = "Sprint Modifier", fo = @es(fU = 3))
        @em(fH = -50.0, fG = 50.0)
        public double no;
        @ex(fw = "swiftnessModifier", fj = "Swiftness Modifier", fo = @es(fU = 4))
        @em(fH = -50.0, fG = 50.0)
        public double np;
    }
}
