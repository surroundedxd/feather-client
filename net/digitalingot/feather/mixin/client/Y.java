// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fx;
import net.digitalingot.feather.dZ;
import net.minecraft.client.renderer.EntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.client.resources.IResourceManagerReloadListener;

@Mixin({ EntityRenderer.class })
public abstract class y implements IResourceManagerReloadListener
{
    @Unique
    private static final dZ<fx> HE;
    @Shadow
    @Final
    private Minecraft field_78531_r;
    
    @Inject(method = { "isDrawBlockOutline" }, at = { @At("HEAD") }, cancellable = true)
    private void a(final CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        final fx fx = y.HE.fb();
        if (!fx.eU() || !fx.dK().mA) {
            return;
        }
        if (!(this.field_78531_r.func_175606_aa() instanceof EntityPlayer) || this.field_78531_r.field_71474_y.field_74319_N) {
            callbackInfoReturnable.setReturnValue((Object)false);
            return;
        }
        final MovingObjectPosition field_71476_x = this.field_78531_r.field_71476_x;
        final MovingObjectPosition.MovingObjectType block = MovingObjectPosition.MovingObjectType.BLOCK;
        if (field_71476_x == null || field_71476_x.field_72313_a != block) {
            callbackInfoReturnable.setReturnValue((Object)false);
            return;
        }
        callbackInfoReturnable.setReturnValue((Object)true);
    }
    
    static {
        HE = ea.a(fx.class);
    }
}
