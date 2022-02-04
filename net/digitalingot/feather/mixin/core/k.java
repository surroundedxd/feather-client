// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.core;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.client.resources.FallbackResourceManager;
import java.util.Map;
import net.minecraft.client.resources.SimpleReloadableResourceManager;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ SimpleReloadableResourceManager.class })
public interface k
{
    @Accessor
    Map<String, FallbackResourceManager> getDomainResourceManagers();
}
