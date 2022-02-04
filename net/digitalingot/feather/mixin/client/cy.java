// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.client.renderer.RenderGlobal;
import org.spongepowered.asm.mixin.Mixin;
import net.digitalingot.feather.ki;

@Mixin({ RenderGlobal.class })
public abstract class cy implements ki
{
    @Shadow
    protected abstract void func_72725_b(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    
    @Override
    public void notifyLightSet(final int n, final int n2, final int n3) {
        this.func_72725_b(n - 1, n2 - 1, n3 - 1, n + 1, n2 + 1, n3 + 1);
    }
}
