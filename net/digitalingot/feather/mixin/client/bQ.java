// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.Redirect;
import net.digitalingot.feather.fV;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import com.google.common.util.concurrent.ListenableFutureTask;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.Final;
import java.util.concurrent.FutureTask;
import java.util.Queue;
import net.minecraft.client.entity.EntityPlayerSP;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fX;
import net.digitalingot.feather.dZ;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.util.IThreadListener;
import net.minecraft.profiler.IPlayerUsage;

@Mixin({ Minecraft.class })
public abstract class bq implements IPlayerUsage, IThreadListener
{
    @Unique
    private static final dZ<fX> HF;
    @Shadow
    public GuiScreen field_71462_r;
    @Shadow
    public EntityPlayerSP field_71439_g;
    @Shadow
    private boolean field_71431_Q;
    @Shadow
    @Final
    private Queue<FutureTask<?>> field_152351_aB;
    
    @Shadow
    public abstract void func_71352_k();
    
    @Inject(method = { "toggleFullscreen()V" }, at = { @At("HEAD") }, cancellable = true, require = 1, allow = 1)
    private void r(final CallbackInfo callbackInfo) {
        if (bq.HF.fb() == null) {
            callbackInfo.cancel();
            this.field_152351_aB.add((FutureTask<?>)ListenableFutureTask.create(this::func_71352_k, (Object)null));
        }
    }
    
    @Inject(method = { "toggleFullscreen()V" }, at = { @At(value = "FIELD", target = "Lnet/minecraft/client/settings/GameSettings;fullScreen:Z", ordinal = 0, opcode = 181, shift = At.Shift.AFTER) }, cancellable = true, require = 1, allow = 1)
    private void s(final CallbackInfo callbackInfo) {
        if (bq.HF.fb().dK().pP) {
            fV.n(this.field_71431_Q);
            callbackInfo.cancel();
        }
    }
    
    @Redirect(method = { "runTick" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiScreen;isCtrlKeyDown()Z"))
    public boolean uL() {
        final fX fx = bq.HF.fb();
        return fx != null && fx.dK().qr.ck();
    }
    
    static {
        HF = ea.a(fX.class);
    }
}
