// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.digitalingot.feather.iR;
import net.digitalingot.feather.kh;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fI;
import net.digitalingot.feather.dZ;
import net.minecraft.client.particle.EntityFirework;
import net.minecraft.client.particle.EntityBreakingFX;
import net.minecraft.client.particle.Barrier;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.client.particle.EntityFX;

@Mixin({ Barrier.class, EntityBreakingFX.class, EntityFirework.OverlayFX.class })
public abstract class ch extends EntityFX
{
    @Unique
    private static final dZ<fI> PERFORMANCE;
    
    protected ch(final World world, final double n, final double n2, final double n3) {
        super(world, n, n2, n3);
    }
    
    @Inject(method = { "renderParticle" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/WorldRenderer;pos(DDD)Lnet/minecraft/client/renderer/WorldRenderer;", ordinal = 0) }, locals = LocalCapture.CAPTURE_FAILHARD, cancellable = true)
    private void a(final WorldRenderer worldRenderer, final Entity entity, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final CallbackInfo callbackInfo, final float n7, final float n8, final float n9, final float n10, final float n11, final float n12, final float n13, final float n14, final int n15, final int n16, final int n17) {
        if (ch.PERFORMANCE.fb().dK().oC) {
            ((kh)this).addVertices(n12, n13, n14, n2, n3, n4, n5, n6, n7, n8, n9, n10, n15, iR.d(this.field_70552_h, this.field_70553_i, this.field_70551_j, this.field_82339_as), n11);
            callbackInfo.cancel();
        }
    }
    
    static {
        PERFORMANCE = ea.a(fI.class);
    }
}
