// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.core;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.client.renderer.chunk.RenderChunk;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(targets = { "net.minecraft.client.renderer.RenderGlobal$ContainerLocalRenderInformation" })
public interface c
{
    @Accessor("renderChunk")
    RenderChunk getRenderChunk();
}
