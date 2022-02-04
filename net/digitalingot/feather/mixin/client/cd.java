// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import java.util.Random;
import org.spongepowered.asm.mixin.Overwrite;
import net.digitalingot.feather.ka;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.util.EnumFacing;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ EnumFacing.class })
public class cD
{
    @Shadow
    @Final
    private int field_176759_h;
    
    @Overwrite
    public EnumFacing func_176734_d() {
        return ka.Gf[this.field_176759_h];
    }
    
    @Overwrite
    public static EnumFacing func_82600_a(final int n) {
        return ka.Gf[n % EnumFacing.field_82609_l.length];
    }
    
    @Overwrite
    public static EnumFacing func_176741_a(final Random random) {
        return ka.Gf[random.nextInt(ka.Gf.length)];
    }
    
    @Overwrite
    public static EnumFacing func_176737_a(final float n, final float n2, final float n3) {
        EnumFacing north = EnumFacing.NORTH;
        float n4 = Float.MIN_VALUE;
        for (final EnumFacing enumFacing : ka.Gf) {
            final float n5 = n * enumFacing.func_176730_m().func_177958_n() + n2 * enumFacing.func_176730_m().func_177956_o() + n3 * enumFacing.func_176730_m().func_177952_p();
            if (n5 > n4) {
                n4 = n5;
                north = enumFacing;
            }
        }
        return north;
    }
    
    @Overwrite
    public static EnumFacing func_181076_a(final EnumFacing.AxisDirection obj, final EnumFacing.Axis obj2) {
        for (final EnumFacing enumFacing : ka.Gf) {
            if (enumFacing.func_176743_c() == obj && enumFacing.func_176740_k() == obj2) {
                return enumFacing;
            }
        }
        throw new IllegalArgumentException("No such direction: " + obj + " " + obj2);
    }
}
