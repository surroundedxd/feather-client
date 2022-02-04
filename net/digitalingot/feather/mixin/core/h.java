// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.core;

import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.util.Session;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ Minecraft.class })
public interface h
{
    @Accessor
    @Mutable
    void setSession(final Session p0);
    
    @Accessor("debugFPS")
    default int getFPS() {
        throw new AssertionError();
    }
}
