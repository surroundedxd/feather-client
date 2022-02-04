// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.Overwrite;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.event.ClickEvent;
import net.minecraft.util.ChatComponentText;
import java.awt.image.RenderedImage;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import org.lwjgl.BufferUtils;
import net.minecraft.client.renderer.OpenGlHelper;
import net.digitalingot.feather.an;
import net.minecraft.util.IChatComponent;
import net.minecraft.client.shader.Framebuffer;
import java.io.File;
import java.nio.IntBuffer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Shadow;
import org.apache.logging.log4j.Logger;
import net.minecraft.util.ScreenShotHelper;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ ScreenShotHelper.class })
public abstract class aW
{
    @Shadow
    @Final
    private static Logger field_148261_a;
    @Shadow
    private static IntBuffer field_74293_b;
    @Shadow
    private static int[] field_74294_c;
    
    @Shadow
    private static File func_74290_a(final File file) {
        return null;
    }
    
    @Overwrite
    public static IChatComponent func_148259_a(final File parent, final String child, int field_147622_a, int field_147620_b, final Framebuffer framebuffer) {
        an.bD.aH().screenshot();
        try {
            final File parent2 = new File(parent, "screenshots");
            parent2.mkdir();
            if (OpenGlHelper.func_148822_b()) {
                field_147622_a = framebuffer.field_147622_a;
                field_147620_b = framebuffer.field_147620_b;
            }
            final int n = field_147622_a * field_147620_b;
            if (aW.field_74293_b == null || aW.field_74293_b.capacity() < n) {
                aW.field_74293_b = BufferUtils.createIntBuffer(n);
                aW.field_74294_c = new int[n];
            }
            GL11.glPixelStorei(3333, 1);
            GL11.glPixelStorei(3317, 1);
            aW.field_74293_b.clear();
            if (OpenGlHelper.func_148822_b()) {
                GlStateManager.func_179144_i(framebuffer.field_147617_g);
                GL11.glGetTexImage(3553, 0, 32993, 33639, aW.field_74293_b);
            }
            else {
                GL11.glReadPixels(0, 0, field_147622_a, field_147620_b, 32993, 33639, aW.field_74293_b);
            }
            aW.field_74293_b.get(aW.field_74294_c);
            TextureUtil.func_147953_a(aW.field_74294_c, field_147622_a, field_147620_b);
            BufferedImage im;
            if (OpenGlHelper.func_148822_b()) {
                im = new BufferedImage(framebuffer.field_147621_c, framebuffer.field_147618_d, 1);
                int i;
                for (int n2 = i = framebuffer.field_147620_b - framebuffer.field_147618_d; i < framebuffer.field_147620_b; ++i) {
                    for (int j = 0; j < framebuffer.field_147621_c; ++j) {
                        im.setRGB(j, i - n2, aW.field_74294_c[i * framebuffer.field_147622_a + j]);
                    }
                }
            }
            else {
                im = new BufferedImage(field_147622_a, field_147620_b, 1);
                im.setRGB(0, 0, field_147622_a, field_147620_b, aW.field_74294_c, 0, field_147622_a);
            }
            File func_74290_a;
            if (child == null) {
                func_74290_a = func_74290_a(parent2);
            }
            else {
                func_74290_a = new File(parent2, child);
            }
            ImageIO.write(im, "png", func_74290_a);
            final ChatComponentText chatComponentText = new ChatComponentText(func_74290_a.getName());
            ((IChatComponent)chatComponentText).func_150256_b().func_150241_a(new ClickEvent(ClickEvent.Action.OPEN_FILE, func_74290_a.getAbsolutePath()));
            ((IChatComponent)chatComponentText).func_150256_b().func_150228_d(Boolean.TRUE);
            Object screenshot = an.bv.aH().screenshot(func_74290_a, (IChatComponent)new ChatComponentTranslation("screenshot.success", new Object[] { chatComponentText }));
            if (screenshot == null) {
                screenshot = new ChatComponentText("");
            }
            return (IChatComponent)screenshot;
        }
        catch (Exception ex) {
            aW.field_148261_a.warn("Couldn't save screenshot", (Throwable)ex);
            return (IChatComponent)new ChatComponentTranslation("screenshot.failure", new Object[] { ex.getMessage() });
        }
    }
}
