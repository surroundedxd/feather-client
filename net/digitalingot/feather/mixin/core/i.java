// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.core;

import java.util.List;
import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.client.renderer.ViewFrustum;
import net.minecraft.client.renderer.RenderGlobal;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ RenderGlobal.class })
public interface i
{
    @Accessor
    ViewFrustum getViewFrustum();
    
    @Accessor
    List<Object> getRenderInfos();
}
