// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.Overwrite;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.client.settings.GameSettings;
import net.minecraftforge.common.ForgeModContainer;
import net.minecraft.client.Minecraft;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraftforge.client.ForgeHooksClient;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ ForgeHooksClient.class })
public class cq
{
    @Shadow
    private static int skyX;
    @Shadow
    private static int skyZ;
    @Shadow
    private static boolean skyInit;
    @Shadow
    private static int skyRGBMultiplier;
    
    @Overwrite(remap = false)
    public static int getSkyBlendColour(final World world, final BlockPos blockPos) {
        if (blockPos.func_177958_n() == cq.skyX && blockPos.func_177952_p() == cq.skyZ && cq.skyInit) {
            return cq.skyRGBMultiplier;
        }
        cq.skyInit = true;
        final GameSettings field_71474_y = Minecraft.func_71410_x().field_71474_y;
        final int[] blendRanges = ForgeModContainer.blendRanges;
        int n = 0;
        if (field_71474_y.field_74347_j && field_71474_y.field_151451_c >= 0 && field_71474_y.field_151451_c < blendRanges.length) {
            n = blendRanges[field_71474_y.field_151451_c];
        }
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                final BlockPos func_177982_a = blockPos.func_177982_a(i, 0, j);
                final BiomeGenBase func_180494_b = world.func_180494_b(func_177982_a);
                final int func_76731_a = func_180494_b.func_76731_a(func_180494_b.func_180626_a(func_177982_a));
                n2 += (func_76731_a & 0xFF0000) >> 16;
                n3 += (func_76731_a & 0xFF00) >> 8;
                n4 += (func_76731_a & 0xFF);
                ++n5;
            }
        }
        final int skyRGBMultiplier = (n2 / n5 & 0xFF) << 16 | (n3 / n5 & 0xFF) << 8 | (n4 / n5 & 0xFF);
        cq.skyX = blockPos.func_177958_n();
        cq.skyZ = blockPos.func_177952_p();
        return cq.skyRGBMultiplier = skyRGBMultiplier;
    }
}
