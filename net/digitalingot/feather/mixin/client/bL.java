// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fX;
import net.digitalingot.feather.dZ;
import net.minecraft.block.BlockPortal;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ BlockPortal.class })
public class bl
{
    @Unique
    private static final dZ<fX> HF;
    
    @Redirect(method = { "randomDisplayTick" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;playSound(DDDLjava/lang/String;FFZ)V"))
    public void a(final World world, final double n, final double n2, final double n3, final String s, final float n4, final float n5, final boolean b) {
        if (bl.HF.fb().dK().qp) {
            world.func_72980_b(n, n2, n3, s, n4, n5, b);
        }
    }
    
    static {
        HF = ea.a(fX.class);
    }
}
