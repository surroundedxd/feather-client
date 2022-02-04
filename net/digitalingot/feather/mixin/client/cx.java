// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.minecraft.util.ReportedException;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.BlockPos;
import net.minecraft.crash.CrashReport;
import net.minecraft.world.gen.ChunkProviderDebug;
import net.minecraft.init.Blocks;
import net.minecraft.world.WorldType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.chunk.storage.ExtendedBlockStorage;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import org.spongepowered.asm.mixin.Mixin;
import net.digitalingot.feather.kd;

@Mixin({ Chunk.class })
public abstract class cx implements kd
{
    @Shadow
    @Final
    private World field_76637_e;
    @Shadow
    @Final
    private ExtendedBlockStorage[] field_76652_q;
    @Shadow
    @Final
    private int[] field_76634_f;
    @Shadow
    private boolean field_76643_l;
    
    @Shadow
    public abstract void func_76603_b();
    
    @Override
    public int getLightFor(final EnumSkyBlock enumSkyBlock, final int n, final int n2, final int n3) {
        final int n4 = n & 0xF;
        final int n5 = n3 & 0xF;
        final ExtendedBlockStorage extendedBlockStorage = this.field_76652_q[n2 >> 4];
        return (extendedBlockStorage == null) ? (this.canSeeSky(n, n2, n3) ? enumSkyBlock.field_77198_c : 0) : ((enumSkyBlock == EnumSkyBlock.SKY) ? (this.field_76637_e.field_73011_w.func_177495_o() ? 0 : extendedBlockStorage.func_76670_c(n4, n2 & 0xF, n5)) : ((enumSkyBlock == EnumSkyBlock.BLOCK) ? extendedBlockStorage.func_76674_d(n4, n2 & 0xF, n5) : enumSkyBlock.field_77198_c));
    }
    
    @Override
    public int getLightSubtracted(final int n, final int n2, final int n3, final int n4) {
        final int n5 = n & 0xF;
        final int n6 = n3 & 0xF;
        final ExtendedBlockStorage extendedBlockStorage = this.field_76652_q[n2 >> 4];
        if (extendedBlockStorage == null) {
            return (!this.field_76637_e.field_73011_w.func_177495_o() && n4 < EnumSkyBlock.SKY.field_77198_c) ? (EnumSkyBlock.SKY.field_77198_c - n4) : 0;
        }
        int n7 = (this.field_76637_e.field_73011_w.func_177495_o() ? 0 : extendedBlockStorage.func_76670_c(n5, n2 & 0xF, n6)) - n4;
        final int func_76674_d = extendedBlockStorage.func_76674_d(n5, n2 & 0xF, n6);
        if (func_76674_d > n7) {
            n7 = func_76674_d;
        }
        return n7;
    }
    
    @Override
    public boolean canSeeSky(final int n, final int n2, final int n3) {
        return n2 >= this.field_76634_f[(n3 & 0xF) << 4 | (n & 0xF)];
    }
    
    @Override
    public void setLightFor(final EnumSkyBlock enumSkyBlock, final int n, final int n2, final int n3, final int n4) {
        final int n5 = n & 0xF;
        final int n6 = n3 & 0xF;
        ExtendedBlockStorage extendedBlockStorage = this.field_76652_q[n2 >> 4];
        if (extendedBlockStorage == null) {
            final ExtendedBlockStorage[] field_76652_q = this.field_76652_q;
            final int n7 = n2 >> 4;
            final ExtendedBlockStorage extendedBlockStorage2 = new ExtendedBlockStorage(n2 >> 4 << 4, !this.field_76637_e.field_73011_w.func_177495_o());
            field_76652_q[n7] = extendedBlockStorage2;
            extendedBlockStorage = extendedBlockStorage2;
            this.func_76603_b();
        }
        this.field_76643_l = true;
        if (enumSkyBlock == EnumSkyBlock.SKY) {
            if (!this.field_76637_e.field_73011_w.func_177495_o()) {
                extendedBlockStorage.func_76657_c(n5, n2 & 0xF, n6, n4);
            }
        }
        else if (enumSkyBlock == EnumSkyBlock.BLOCK) {
            extendedBlockStorage.func_76677_d(n5, n2 & 0xF, n6, n4);
        }
    }
    
    @Override
    public IBlockState getBlockState(final int n, final int n2, final int n3) {
        if (this.field_76637_e.func_175624_G() == WorldType.field_180272_g) {
            IBlockState blockState = null;
            if (n2 == 60) {
                blockState = Blocks.field_180401_cv.func_176223_P();
            }
            if (n2 == 70) {
                blockState = ChunkProviderDebug.func_177461_b(n, n3);
            }
            return (blockState == null) ? Blocks.field_150350_a.func_176223_P() : blockState;
        }
        try {
            if (n2 >= 0 && n2 >> 4 < this.field_76652_q.length) {
                final ExtendedBlockStorage extendedBlockStorage = this.field_76652_q[n2 >> 4];
                if (extendedBlockStorage != null) {
                    return extendedBlockStorage.func_177485_a(n & 0xF, n2 & 0xF, n3 & 0xF);
                }
            }
            return Blocks.field_150350_a.func_176223_P();
        }
        catch (Throwable t) {
            final CrashReport func_85055_a = CrashReport.func_85055_a(t, "Getting block state");
            func_85055_a.func_85058_a("Block being got").func_71500_a("Location", () -> CrashReportCategory.func_180522_a(new BlockPos(n, n2, n3)));
            throw new ReportedException(func_85055_a);
        }
    }
}
