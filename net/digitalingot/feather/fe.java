// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.item.ItemStack;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;

@dV(eN = ec.ITEM_PHYSIC, eO = @eb(fj = "Item Physic", fk = "https://assets.feathercdn.net/game/mods/itemphysic.svg", fl = "", fm = {}))
public class fE extends dW<a>
{
    public static final ItemCameraTransforms.TransformType nP;
    public static Minecraft nQ;
    public static double nR;
    
    public void a(final Entity entity, final float n, final double n2, final double n3, final double n4) {
        fE.nR = System.currentTimeMillis() / 100.0 * ((a)this.jK).nS % 360.0;
        if (!fE.nQ.field_71415_G) {
            fE.nR = 0.0;
        }
        final EntityItem entityItem = (EntityItem)entity;
        final ItemStack func_92059_d = entityItem.func_92059_d();
        final TextureManager func_110434_K = Minecraft.func_71410_x().func_110434_K();
        func_110434_K.func_110577_a(TextureMap.field_110575_b);
        final ITextureObject func_110581_b = func_110434_K.func_110581_b(TextureMap.field_110575_b);
        func_110581_b.func_174936_b(false, false);
        io.lN();
        io.a(516, 0.1f);
        io.lP();
        RenderHelper.func_74519_b();
        io.c(770, 771, 1, 0);
        io.md();
        final IBakedModel func_178089_a = fE.nQ.func_175599_af().func_175037_a().func_178089_a(func_92059_d);
        final boolean func_177556_c = func_178089_a.func_177556_c();
        final boolean func_177556_c2 = func_178089_a.func_177556_c();
        final int g = g(func_92059_d);
        io.b((float)n2, (float)n3, (float)n4);
        if (func_178089_a.func_177556_c()) {
            io.c(0.5f, 0.5f, 0.5f);
        }
        func_178089_a.func_177552_f().func_181689_a(fE.nP);
        io.c(90.0f, 1.0f, 0.0f, 0.0f);
        io.c(entityItem.field_70177_z, 0.0f, 0.0f, 1.0f);
        io.a(0.0, 0.0, func_177556_c2 ? -0.08 : -0.04);
        if (func_177556_c2 || fE.nQ.func_175598_ae().field_78733_k != null) {
            if (func_177556_c2) {
                if (!entityItem.field_70122_E) {
                    bq.a((Entity)entityItem, (float)fE.nR);
                }
            }
            else if (!Double.isNaN(entityItem.field_70169_q) && !Double.isNaN(entityItem.field_70167_r) && !Double.isNaN(entityItem.field_70166_s) && entityItem.field_70170_p != null) {
                if (entityItem.field_70122_E) {
                    bq.a((Entity)entityItem, 0.0f);
                }
                else {
                    bq.a((Entity)entityItem, (float)fE.nR);
                }
            }
            io.c(entityItem.field_70125_A, 1.0f, 0.0f, 0.0f);
        }
        io.a(1.0f, 1.0f, 1.0f, 1.0f);
        for (int i = 0; i < g; ++i) {
            io.md();
            if (func_177556_c) {
                if (i > 0) {
                    final ThreadLocalRandom current = ThreadLocalRandom.current();
                    io.b((current.nextFloat() * 2.0f - 1.0f) * 0.15f, (current.nextFloat() * 2.0f - 1.0f) * 0.15f, (current.nextFloat() * 2.0f - 1.0f) * 0.15f);
                }
                fE.nQ.func_175599_af().func_180454_a(func_92059_d, func_178089_a);
                io.me();
            }
            else {
                fE.nQ.func_175599_af().func_180454_a(func_92059_d, func_178089_a);
                io.me();
                io.b(0.0f, 0.0f, 0.05375f);
            }
        }
        io.me();
        io.lO();
        io.lQ();
        func_110434_K.func_110577_a(TextureMap.field_110575_b);
        func_110581_b.func_174935_a();
    }
    
    public static int g(final ItemStack itemStack) {
        if (itemStack == null) {
            return 0;
        }
        final int field_77994_a = itemStack.field_77994_a;
        if (field_77994_a > 48) {
            return 5;
        }
        if (field_77994_a > 32) {
            return 4;
        }
        if (field_77994_a > 16) {
            return 3;
        }
        if (field_77994_a > 1) {
            return 2;
        }
        return 1;
    }
    
    static {
        nP = ItemCameraTransforms.TransformType.GROUND;
        fE.nQ = Minecraft.func_71410_x();
    }
    
    public static class a extends eg
    {
        @ex(fw = "rotateSpeed", fj = "Rotate Speed", fY = "10", fo = @es(fU = 0))
        @er
        public int nS;
    }
}
