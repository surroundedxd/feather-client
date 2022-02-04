// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import java.awt.Color;
import net.minecraft.client.renderer.WorldRenderer;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fM;
import net.digitalingot.feather.dZ;
import net.minecraft.client.renderer.EntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.client.resources.IResourceManagerReloadListener;

@Mixin({ EntityRenderer.class })
public abstract class bJ implements IResourceManagerReloadListener
{
    @Unique
    private static final dZ<fM> Ip;
    
    @Redirect(method = { "renderRainSnow" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/WorldRenderer;color(FFFF)Lnet/minecraft/client/renderer/WorldRenderer;"), require = 8, allow = 8)
    public WorldRenderer a(final WorldRenderer worldRenderer, final float n, final float n2, final float n3, final float n4) {
        final fM fm = bJ.Ip.fb();
        if (fm == null || !fm.eU()) {
            return worldRenderer.func_181666_a(n, n2, n3, n4);
        }
        final Color pi = fm.dK().pi;
        return worldRenderer.func_181669_b(pi.getRed(), pi.getGreen(), pi.getBlue(), (int)(n4 * 255.0f));
    }
    
    static {
        Ip = ea.a(fM.class);
    }
}
