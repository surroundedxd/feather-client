// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fw;
import net.digitalingot.feather.dZ;
import net.minecraft.client.model.ModelBiped;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.client.model.ModelBase;

@Mixin({ ModelBiped.class })
public abstract class bf extends ModelBase
{
    @Unique
    private static final dZ<fw> HV;
    
    @ModifyConstant(method = { "setRotationAngles(FFFFFFLnet/minecraft/entity/Entity;)V" }, constant = { @Constant(floatValue = -0.5235988f) }, require = 1, allow = 1)
    private float z(final float n) {
        final fw fw = bf.HV.fb();
        return (fw.eU() && fw.dK().ml) ? 0.0f : n;
    }
    
    static {
        HV = ea.a(fw.class);
    }
}
