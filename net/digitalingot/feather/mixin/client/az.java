// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fw;
import net.digitalingot.feather.dZ;
import net.minecraft.client.renderer.EntityRenderer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ EntityRenderer.class })
public class aZ
{
    @Unique
    private static final dZ<fw> HV;
    @Unique
    private static final int Ib = 6;
    
    @Unique
    private static void uK() {
        final Minecraft func_71410_x = Minecraft.func_71410_x();
        final EntityPlayerSP field_71439_g = func_71410_x.field_71439_g;
        if (field_71439_g.func_71052_bv() != 0) {
            final GameSettings field_71474_y = func_71410_x.field_71474_y;
            if (field_71474_y.field_74312_F.func_151470_d() && field_71474_y.field_74313_G.func_151470_d()) {
                final MovingObjectPosition field_71476_x = func_71410_x.field_71476_x;
                if (field_71476_x != null && field_71476_x.field_72313_a == MovingObjectPosition.MovingObjectType.BLOCK) {
                    c((EntityLivingBase)field_71439_g);
                }
            }
        }
    }
    
    @Unique
    private static void c(final EntityLivingBase entityLivingBase) {
        if (!entityLivingBase.field_82175_bq || entityLivingBase.field_110158_av >= d(entityLivingBase) / 2 || entityLivingBase.field_110158_av < 0) {
            entityLivingBase.field_110158_av = -1;
            entityLivingBase.field_82175_bq = true;
        }
    }
    
    @Unique
    private static int d(final EntityLivingBase entityLivingBase) {
        int n = 6;
        final PotionEffect func_70660_b = entityLivingBase.func_70660_b(Potion.field_76422_e);
        if (func_70660_b != null) {
            n -= func_70660_b.func_76458_c() + 1;
        }
        final PotionEffect func_70660_b2 = entityLivingBase.func_70660_b(Potion.field_76419_f);
        if (func_70660_b2 != null) {
            n += (func_70660_b2.func_76458_c() + 1) * 2;
        }
        return n;
    }
    
    @Inject(method = { "renderWorldPass(IFJ)V" }, at = { @At("TAIL") }, require = 1, allow = 1)
    private void j(final CallbackInfo callbackInfo) {
        final fw fw = aZ.HV.fb();
        if (fw.eU() && fw.dK().mf) {
            uK();
        }
    }
    
    @Inject(method = { "renderWorldDirections(F)V" }, at = { @At("HEAD") }, cancellable = true, require = 1, allow = 1)
    private void k(final CallbackInfo callbackInfo) {
        final fw fw = aZ.HV.fb();
        if (fw.eU() && fw.dK().mq) {
            callbackInfo.cancel();
        }
    }
    
    static {
        HV = ea.a(fw.class);
    }
}
