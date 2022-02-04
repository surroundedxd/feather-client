// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fF;
import net.digitalingot.feather.dZ;
import net.minecraft.client.gui.FontRenderer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ FontRenderer.class })
public class bz
{
    @Unique
    private static final dZ<fF> Ik;
    
    @ModifyArg(method = { "renderString" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/FontRenderer;renderStringAtPos(Ljava/lang/String;Z)V"))
    public String aX(final String s) {
        final fF ff = bz.Ik.fb();
        return (ff != null && ff.eU()) ? ff.L(s) : s;
    }
    
    @ModifyVariable(method = { "getStringWidth" }, at = @At("HEAD"))
    public String aY(final String s) {
        final fF ff = bz.Ik.fb();
        return (ff != null && ff.eU()) ? ff.L(s) : s;
    }
    
    static {
        Ik = ea.a(fF.class);
    }
}
