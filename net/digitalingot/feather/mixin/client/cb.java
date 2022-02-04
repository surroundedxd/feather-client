// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.minecraft.util.EnumFacing;
import org.spongepowered.asm.mixin.Overwrite;
import net.minecraft.util.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.util.Vec3i;

@Mixin({ BlockPos.class })
public abstract class cB extends Vec3i
{
    public cB(final int n, final int n2, final int n3) {
        super(n, n2, n3);
    }
    
    @Overwrite
    public BlockPos func_177984_a() {
        return new BlockPos(this.func_177958_n(), this.func_177956_o() + 1, this.func_177952_p());
    }
    
    @Overwrite
    public BlockPos func_177981_b(final int n) {
        return new BlockPos(this.func_177958_n(), this.func_177956_o() + n, this.func_177952_p());
    }
    
    @Overwrite
    public BlockPos func_177977_b() {
        return new BlockPos(this.func_177958_n(), this.func_177956_o() - 1, this.func_177952_p());
    }
    
    @Overwrite
    public BlockPos func_177979_c(final int n) {
        return new BlockPos(this.func_177958_n(), this.func_177956_o() - n, this.func_177952_p());
    }
    
    @Overwrite
    public BlockPos func_177978_c() {
        return new BlockPos(this.func_177958_n(), this.func_177956_o(), this.func_177952_p() - 1);
    }
    
    @Overwrite
    public BlockPos func_177964_d(final int n) {
        return new BlockPos(this.func_177958_n(), this.func_177956_o(), this.func_177952_p() - n);
    }
    
    @Overwrite
    public BlockPos func_177968_d() {
        return new BlockPos(this.func_177958_n(), this.func_177956_o(), this.func_177952_p() + 1);
    }
    
    @Overwrite
    public BlockPos func_177970_e(final int n) {
        return new BlockPos(this.func_177958_n(), this.func_177956_o(), this.func_177952_p() + n);
    }
    
    @Overwrite
    public BlockPos func_177976_e() {
        return new BlockPos(this.func_177958_n() - 1, this.func_177956_o(), this.func_177952_p());
    }
    
    @Overwrite
    public BlockPos func_177985_f(final int n) {
        return new BlockPos(this.func_177958_n() - n, this.func_177956_o(), this.func_177952_p());
    }
    
    @Overwrite
    public BlockPos func_177974_f() {
        return new BlockPos(this.func_177958_n() + 1, this.func_177956_o(), this.func_177952_p());
    }
    
    @Overwrite
    public BlockPos func_177965_g(final int n) {
        return new BlockPos(this.func_177958_n() + n, this.func_177956_o(), this.func_177952_p());
    }
    
    @Overwrite
    public BlockPos func_177972_a(final EnumFacing enumFacing) {
        return new BlockPos(this.func_177958_n() + enumFacing.func_82601_c(), this.func_177956_o() + enumFacing.func_96559_d(), this.func_177952_p() + enumFacing.func_82599_e());
    }
    
    @Overwrite
    public BlockPos func_177967_a(final EnumFacing enumFacing, final int n) {
        return new BlockPos(this.func_177958_n() + enumFacing.func_82601_c() * n, this.func_177956_o() + enumFacing.func_96559_d() * n, this.func_177952_p() + enumFacing.func_82599_e() * n);
    }
}
