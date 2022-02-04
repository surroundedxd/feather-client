// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.core;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.client.shader.ShaderGroup;
import org.spongepowered.asm.mixin.gen.Invoker;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.EntityRenderer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ EntityRenderer.class })
public interface d
{
    @Invoker("loadShader")
    void feather$loadShader(final ResourceLocation p0);
    
    @Accessor("theShaderGroup")
    ShaderGroup feather$getEffect();
}
