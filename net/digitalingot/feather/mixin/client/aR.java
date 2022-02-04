// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import java.util.concurrent.Semaphore;
import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraftforge.fml.client.SplashProgress;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = { SplashProgress.class }, remap = false)
public interface ar
{
    @Accessor(value = "done", remap = false)
    default boolean isDone() {
        throw new IllegalStateException();
    }
    
    @Accessor(value = "pause", remap = false)
    default boolean isPaused() {
        throw new IllegalStateException();
    }
    
    @Accessor(value = "mutex", remap = false)
    default Semaphore getMutex() {
        throw new IllegalStateException();
    }
}
