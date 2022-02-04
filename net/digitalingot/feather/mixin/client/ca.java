// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.minecraft.world.WorldManager;
import org.spongepowered.asm.mixin.Mixin;
import net.digitalingot.feather.ki;

@Mixin({ WorldManager.class })
public abstract class cA implements ki
{
    @Override
    public void notifyLightSet(final int n, final int n2, final int n3) {
    }
}
