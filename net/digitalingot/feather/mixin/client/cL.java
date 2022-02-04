// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import net.minecraft.util.EnumFacing;
import net.digitalingot.feather.ka;
import net.minecraft.util.BlockPos;
import net.minecraft.block.Block;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.model.pipeline.BlockInfo;
import org.spongepowered.asm.mixin.Mixin;
import net.digitalingot.feather.kJ;

@Mixin({ BlockInfo.class })
public class cl implements kJ
{
    @Shadow(remap = false)
    private IBlockAccess world;
    @Shadow
    private Block block;
    @Shadow
    private BlockPos blockPos;
    @Shadow(remap = false)
    private int cachedTint;
    @Shadow(remap = false)
    private int cachedMultiplier;
    private final int[] Iz;
    private boolean IA;
    
    public cl() {
        this.Iz = new int[7];
    }
    
    @Override
    public void updateFlatLighting() {
        this.IA = this.block.func_149686_d();
        this.Iz[0] = this.block.func_176207_c(this.world, this.blockPos);
        for (final EnumFacing enumFacing : ka.Gf) {
            this.Iz[enumFacing.ordinal() + 1] = this.block.func_176207_c(this.world, this.blockPos.func_177972_a(enumFacing));
        }
    }
    
    @Override
    public void reset() {
        this.world = null;
        this.block = null;
        this.blockPos = null;
        this.cachedTint = -1;
        this.cachedMultiplier = -1;
    }
    
    @Override
    public int[] getPackedLight() {
        return this.Iz;
    }
    
    @Override
    public boolean isFull() {
        return this.IA;
    }
    
    @Redirect(method = { "updateLightMatrix" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/util/EnumFacing;values()[Lnet/minecraft/util/EnumFacing;"))
    private EnumFacing[] uN() {
        return ka.Gf;
    }
}
