// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;

@dV(eN = ec.PARTICLES, eO = @eb(fj = "Particles", fk = "https://assets.feathercdn.net/game/mods/particles.svg", fl = "Customize particle settings", fm = { dk.a.PVP }))
public class fH extends dW<a>
{
    private static final Potion oy;
    
    @Override
    public void initialize() {
        boolean b;
        final float n;
        int i = 0;
        N.bk.a((entityPlayer, entityLivingBase) -> {
            if (!(!this.eU())) {
                if (!(!(entityLivingBase instanceof EntityLivingBase))) {
                    b = (entityPlayer.field_70143_R > 0.0f && !entityPlayer.field_70122_E && !entityPlayer.func_70617_f_() && !entityPlayer.func_70090_H() && !entityPlayer.func_70644_a(fH.oy) && entityPlayer.field_70154_o == null);
                    EnchantmentHelper.func_152377_a(entityPlayer.func_70694_bm(), entityLivingBase.func_70668_bt());
                    if (((a)this.jK).oz && n <= 0.0f) {
                        entityPlayer.func_71047_c((Entity)entityLivingBase);
                    }
                    if (b || n > 0.0f || ((a)this.jK).oz) {
                        while (i < ((a)this.jK).multiplier) {
                            if (b) {
                                entityPlayer.func_71009_b((Entity)entityLivingBase);
                            }
                            if (n > 0.0f || ((a)this.jK).oz) {
                                entityPlayer.func_71047_c((Entity)entityLivingBase);
                            }
                            ++i;
                        }
                    }
                }
            }
        });
    }
    
    static {
        oy = Potion.func_180142_b("blindness");
    }
    
    public static class a extends eg
    {
        @ex(fw = "alwaysSharpParticles", fj = "Always Sharp Particles", fo = @es(fU = 0))
        public boolean oz;
        @ex(fw = "multiplier", fj = "Multiplier", fY = "1", fo = @es(fU = 1))
        @er(fS = 1, fR = 25)
        public int multiplier;
    }
}
