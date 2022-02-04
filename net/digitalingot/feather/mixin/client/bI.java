// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.client.renderer.entity.RenderManager;
import org.spongepowered.asm.mixin.Shadow;
import java.nio.FloatBuffer;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fw;
import net.digitalingot.feather.dZ;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.EntityLivingBase;

@Mixin({ RendererLivingEntity.class })
public abstract class bi<T extends EntityLivingBase> extends Render<T>
{
    @Unique
    private static final dZ<fw> HV;
    @Shadow
    protected FloatBuffer field_177095_g;
    
    protected bi(final RenderManager renderManager) {
        super(renderManager);
    }
    
    @Inject(method = { "setBrightness(Lnet/minecraft/entity/EntityLivingBase;FZ)Z" }, at = { @At(value = "INVOKE", target = "Ljava/nio/FloatBuffer;put(F)Ljava/nio/FloatBuffer;", remap = false, ordinal = 3, shift = At.Shift.AFTER) }, require = 1, allow = 1)
    private void a(final T t, final float n, final boolean b, final CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        final fw fw = bi.HV.fb();
        if (fw.eU() && fw.dK().ms != net.digitalingot.feather.fw.a.a.DEFAULT) {
            this.field_177095_g.position(0);
            fw.a(this.field_177095_g);
        }
    }
    
    static {
        HV = ea.a(fw.class);
    }
}
