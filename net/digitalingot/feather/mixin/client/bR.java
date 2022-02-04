// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.client.renderer.entity.RenderManager;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fX;
import net.digitalingot.feather.dZ;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.EntityLivingBase;

@Mixin({ RendererLivingEntity.class })
public abstract class br<T extends EntityLivingBase> extends Render<T>
{
    @Unique
    private static final dZ<fX> HF;
    
    protected br(final RenderManager renderManager) {
        super(renderManager);
    }
    
    @Shadow
    protected abstract boolean func_177070_b(final T p0);
    
    @Redirect(method = { "renderName(Lnet/minecraft/entity/EntityLivingBase;DDD)V" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/RendererLivingEntity;canRenderName(Lnet/minecraft/entity/EntityLivingBase;)Z"), require = 1, allow = 1)
    public boolean a(final RendererLivingEntity<T> rendererLivingEntity, final T t) {
        return (br.HF.fb().dK().pR && t == this.field_76990_c.field_78734_h && !t.func_82150_aj()) || this.func_177070_b(t);
    }
    
    static {
        HF = ea.a(fX.class);
    }
}
