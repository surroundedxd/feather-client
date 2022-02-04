// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import java.util.Iterator;
import net.digitalingot.feather.jX;
import java.util.List;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.client.gui.GuiOverlayDebug;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ GuiOverlayDebug.class })
public class bP
{
    @Inject(method = { "call" }, at = { @At("RETURN") })
    private void j(final CallbackInfoReturnable<List<String>> callbackInfoReturnable) {
        final Iterator<jX.a> iterator = jX.tX().iterator();
        while (iterator.hasNext()) {
            ((List)callbackInfoReturnable.getReturnValue()).add(iterator.next().get());
        }
    }
}
