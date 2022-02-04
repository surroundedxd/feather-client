// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ke;
import net.minecraft.world.IBlockAccess;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import net.digitalingot.feather.kc;

@Mixin({ Block.class })
public abstract class cw implements kc
{
    @Shadow
    public abstract int func_149750_m();
    
    @Shadow
    public abstract int func_149717_k();
    
    @Override
    public int getLightValue(final IBlockAccess blockAccess, final int n, final int n2, final int n3) {
        final Block func_177230_c = ((ke)blockAccess).getBlockState(n, n2, n3).func_177230_c();
        if (func_177230_c != this) {
            return ((cw)func_177230_c).getLightValue(blockAccess, n, n2, n3);
        }
        return this.func_149750_m();
    }
    
    @Override
    public int getLightOpacity(final IBlockAccess blockAccess, final int n, final int n2, final int n3) {
        return this.func_149717_k();
    }
}
