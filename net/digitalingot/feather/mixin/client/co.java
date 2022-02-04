// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.util.MathHelper;
import net.digitalingot.feather.ko;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fI;
import net.digitalingot.feather.dZ;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ Entity.class })
public abstract class cO
{
    @Unique
    private static final dZ<fI> PERFORMANCE;
    @Shadow
    public World field_70170_p;
    @Shadow
    public double field_70165_t;
    @Shadow
    public double field_70163_u;
    @Shadow
    public double field_70161_v;
    
    @Shadow
    public abstract float func_70047_e();
    
    @Inject(method = { "getBrightnessForRender" }, at = { @At("HEAD") }, cancellable = true)
    private void a(final float n, final CallbackInfoReturnable<Integer> callbackInfoReturnable) {
        if (cO.PERFORMANCE.fb().dK().oJ) {
            final ko ko = (ko)this.field_70170_p;
            final int func_76128_c = MathHelper.func_76128_c(this.field_70165_t);
            final int func_76128_c2 = MathHelper.func_76128_c(this.field_70163_u + this.func_70047_e());
            final int func_76128_c3 = MathHelper.func_76128_c(this.field_70161_v);
            callbackInfoReturnable.setReturnValue((Object)(ko.isBlockLoaded(func_76128_c, func_76128_c2, func_76128_c3) ? ko.getCombinedLight(func_76128_c, func_76128_c2, func_76128_c3, 0) : 0));
        }
    }
    
    @Inject(method = { "getBrightness" }, at = { @At("HEAD") }, cancellable = true)
    public void b(final float n, final CallbackInfoReturnable<Float> callbackInfoReturnable) {
        if (cO.PERFORMANCE.fb().dK().oJ) {
            final ko ko = (ko)this.field_70170_p;
            final int func_76128_c = MathHelper.func_76128_c(this.field_70165_t);
            final int func_76128_c2 = MathHelper.func_76128_c(this.field_70163_u + this.func_70047_e());
            final int func_76128_c3 = MathHelper.func_76128_c(this.field_70161_v);
            callbackInfoReturnable.setReturnValue((Object)(ko.isBlockLoaded(func_76128_c, func_76128_c2, func_76128_c3) ? ko.getLightBrightness(func_76128_c, func_76128_c2, func_76128_c3) : 0.0f));
        }
    }
    
    static {
        PERFORMANCE = ea.a(fI.class);
    }
}
