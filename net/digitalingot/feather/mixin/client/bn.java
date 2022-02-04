// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fI;
import net.digitalingot.feather.dZ;
import net.minecraft.client.renderer.chunk.ChunkRenderDispatcher;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ ChunkRenderDispatcher.class })
public class bN
{
    @Unique
    private static final dZ<fI> PERFORMANCE;
    
    @Inject(method = { "getNextChunkUpdate" }, at = { @At("HEAD") })
    private void i(final CallbackInfoReturnable<ChunkCompileTaskGenerator> callbackInfoReturnable) {
        if (bN.PERFORMANCE.fb() != null && bN.PERFORMANCE.fb().q() && bN.PERFORMANCE.fb().dK().oG != fI.a.a.OFF) {
            Thread.sleep(bN.PERFORMANCE.fb().dK().oG.getValue());
        }
    }
    
    static {
        PERFORMANCE = ea.a(fI.class);
    }
}
