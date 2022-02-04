// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.digitalingot.feather.mixin.core.j;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.inventory.IInventory;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.IChatComponent;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderManager;
import net.digitalingot.feather.mixin.core.a;
import org.jetbrains.annotations.NotNull;
import net.minecraft.client.gui.Gui;

public class bq
{
    public static int a(@NotNull final Gui gui) {
        return (int)((a)gui).getBlitOffset();
    }
    
    public static Entity a(@NotNull final RenderManager renderManager) {
        return renderManager.field_78734_h;
    }
    
    public static boolean a(@NotNull final Minecraft minecraft) {
        return minecraft.field_71474_y.field_74320_O != 0;
    }
    
    public static float b(@NotNull final Minecraft minecraft) {
        return minecraft.field_71439_g.field_71109_bG;
    }
    
    public static float c(@NotNull final Minecraft minecraft) {
        return minecraft.field_71439_g.field_70726_aT;
    }
    
    public static boolean a(@NotNull final ItemStack itemStack) {
        return itemStack.func_77973_b() instanceof ItemFood;
    }
    
    public static boolean a(@NotNull final Item item) {
        return item instanceof ItemFood;
    }
    
    public static boolean a(@NotNull final EntityPlayer entityPlayer) {
        return entityPlayer.field_71075_bZ.field_75098_d;
    }
    
    public static void d(@NotNull final Minecraft minecraft) {
        minecraft.func_175601_h();
    }
    
    public static void a(@NotNull final KeyBinding keyBinding, final int n) {
        keyBinding.func_151462_b(n);
    }
    
    public static boolean a(@NotNull final Entity entity) {
        return entity.field_70122_E;
    }
    
    public static int a(@NotNull final KeyBinding keyBinding) {
        return keyBinding.func_151463_i();
    }
    
    public static boolean b(@NotNull final KeyBinding keyBinding) {
        return keyBinding.func_151463_i() < 0;
    }
    
    public static void a(@NotNull final EntityPlayerSP entityPlayerSP, final IChatComponent chatComponent) {
        entityPlayerSP.func_145747_a(chatComponent);
    }
    
    public static boolean e(@NotNull final Minecraft minecraft) {
        return minecraft.field_71415_G;
    }
    
    public static int a(@NotNull final Enchantment enchantment) {
        return enchantment.field_77352_x;
    }
    
    public static double f(@NotNull final Minecraft minecraft) {
        return new ScaledResolution(minecraft).func_78326_a();
    }
    
    public static int g(@NotNull final Minecraft minecraft) {
        return new ScaledResolution(minecraft).func_78328_b();
    }
    
    public static double h(@NotNull final Minecraft minecraft) {
        return new ScaledResolution(minecraft).func_78325_e();
    }
    
    public static int i(@NotNull final Minecraft minecraft) {
        return minecraft.field_71443_c;
    }
    
    public static int j(@NotNull final Minecraft minecraft) {
        return minecraft.field_71440_d;
    }
    
    public static int b(@NotNull final ItemStack itemStack) {
        return itemStack.field_77994_a;
    }
    
    public static ItemStack a(@NotNull final EntityLivingBase entityLivingBase) {
        return entityLivingBase.func_70694_bm();
    }
    
    public static Entity b(@NotNull final Entity entity) {
        return entity.field_70154_o;
    }
    
    public static String a(@NotNull final BiomeGenBase biomeGenBase) {
        return biomeGenBase.field_76791_y;
    }
    
    public static Object b(@NotNull final EntityPlayer entityPlayer) {
        return entityPlayer.field_71075_bZ;
    }
    
    public static void a(@NotNull final Entity entity, final float field_70125_A) {
        entity.field_70125_A = field_70125_A;
    }
    
    public static float c(@NotNull final Entity entity) {
        return entity.field_70125_A;
    }
    
    public static void b(@NotNull final Entity entity, final float field_70177_z) {
        entity.field_70177_z = field_70177_z;
    }
    
    public static float d(@NotNull final Entity entity) {
        return entity.field_70177_z;
    }
    
    public static IInventory c(@NotNull final EntityPlayer entityPlayer) {
        return (IInventory)entityPlayer.field_71071_by;
    }
    
    public static boolean c(final ItemStack itemStack) {
        return itemStack == null;
    }
    
    public static <T extends GuiButton> T a(@NotNull final GuiScreen guiScreen, final T t) {
        ((j)guiScreen).getRenderables().add(t);
        return t;
    }
}
