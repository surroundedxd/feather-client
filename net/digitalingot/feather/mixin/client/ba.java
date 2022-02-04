// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.client.gui.GuiTextField;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fF;
import net.digitalingot.feather.dZ;
import net.minecraft.client.gui.GuiChat;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ GuiChat.class })
public abstract class bA
{
    @Unique
    private static final dZ<fF> Ik;
    @Shadow
    protected GuiTextField field_146415_a;
    
    @ModifyVariable(method = { "onAutocompleteResponse" }, at = @At("HEAD"))
    public String[] f(final String[] array) {
        final fF ff = bA.Ik.fb();
        return (ff != null && ff.eU()) ? ff.a(array, this.field_146415_a.func_146179_b()) : array;
    }
    
    static {
        Ik = ea.a(fF.class);
    }
}
