// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.ea;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import java.util.Iterator;
import net.digitalingot.feather.ko;
import net.minecraft.util.MathHelper;
import java.util.Collection;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraftforge.common.ForgeChunkManager;
import com.google.common.collect.ImmutableSetMultimap;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import org.spongepowered.asm.mixin.Final;
import net.minecraft.profiler.Profiler;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.world.ChunkCoordIntPair;
import java.util.Set;
import org.spongepowered.asm.mixin.Unique;
import net.digitalingot.feather.fI;
import net.digitalingot.feather.dZ;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ World.class })
public abstract class cP
{
    @Unique
    private static final dZ<fI> PERFORMANCE;
    @Shadow
    protected Set<ChunkCoordIntPair> field_72993_I;
    @Shadow
    @Final
    public Profiler field_72984_F;
    @Shadow
    @Final
    public List<EntityPlayer> field_73010_i;
    @Shadow
    private int field_72990_M;
    @Shadow
    @Final
    public Random field_73012_v;
    
    @Shadow
    public abstract ImmutableSetMultimap<ChunkCoordIntPair, ForgeChunkManager.Ticket> getPersistentChunks();
    
    @Shadow
    protected abstract int func_152379_p();
    
    @Inject(method = { "setActivePlayerChunksAndCheckLight" }, at = { @At("HEAD") }, cancellable = true)
    private void x(final CallbackInfo callbackInfo) {
        if (cP.PERFORMANCE.fb().dK().oI) {
            callbackInfo.cancel();
            this.field_72993_I.clear();
            this.field_72984_F.func_76320_a("buildList");
            this.field_72993_I.addAll((Collection<? extends ChunkCoordIntPair>)this.getPersistentChunks().keySet());
            for (final EntityPlayer entityPlayer : this.field_73010_i) {
                final int func_76128_c = MathHelper.func_76128_c(entityPlayer.field_70165_t / 16.0);
                final int func_76128_c2 = MathHelper.func_76128_c(entityPlayer.field_70161_v / 16.0);
                for (int func_152379_p = this.func_152379_p(), i = -func_152379_p; i <= func_152379_p; ++i) {
                    for (int j = -func_152379_p; j <= func_152379_p; ++j) {
                        this.field_72993_I.add(new ChunkCoordIntPair(i + func_76128_c, j + func_76128_c2));
                    }
                }
            }
            this.field_72984_F.func_76319_b();
            if (this.field_72990_M > 0) {
                --this.field_72990_M;
            }
            this.field_72984_F.func_76320_a("playerCheckLight");
            if (!this.field_73010_i.isEmpty()) {
                final EntityPlayer entityPlayer2 = this.field_73010_i.get(this.field_73012_v.nextInt(this.field_73010_i.size()));
                ((ko)this).checkLight(MathHelper.func_76128_c(entityPlayer2.field_70165_t) + this.field_73012_v.nextInt(11) - 5, MathHelper.func_76128_c(entityPlayer2.field_70163_u) + this.field_73012_v.nextInt(11) - 5, MathHelper.func_76128_c(entityPlayer2.field_70161_v) + this.field_73012_v.nextInt(11) - 5);
            }
            this.field_72984_F.func_76319_b();
        }
    }
    
    static {
        PERFORMANCE = ea.a(fI.class);
    }
}
