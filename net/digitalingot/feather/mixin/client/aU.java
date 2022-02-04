// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import java.util.Iterator;
import net.digitalingot.fwebp.WebPAnimFrame;
import net.digitalingot.fwebp.WebPException;
import net.digitalingot.fwebp.WebPAnimDecoder;
import net.digitalingot.fwebp.WebPImage;
import net.digitalingot.feather.jz;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.Shadow;
import net.digitalingot.fwebp.WebPAnimInfo;
import java.nio.ByteBuffer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(targets = { "net.minecraftforge.fml.client.SplashProgress$3" }, remap = false)
public abstract class au implements Runnable
{
    private ByteBuffer[] HI;
    private int[] HJ;
    private WebPAnimInfo HK;
    
    @Shadow
    protected abstract void setGL();
    
    @Shadow
    protected abstract void clearGL();
    
    @Inject(method = { "run()V" }, at = { @At("HEAD") }, remap = false, cancellable = true)
    private void c(final CallbackInfo callbackInfo) {
        callbackInfo.cancel();
        this.setGL();
        GL11.glClearColor(0.01176f, 0.06666f, 0.10196f, 1.0f);
        this.uH();
        final ByteBuffer[] hi = this.HI;
        final int[] hj = this.HJ;
        final int frameCount = this.HK.getFrameCount();
        final int canvasWidth = this.HK.getCanvasWidth();
        final int canvasHeight = this.HK.getCanvasHeight();
        this.HI = null;
        this.HJ = null;
        this.HK = null;
        int n = -1;
        long currentTimeMillis = 0L;
        int n2 = 0;
        int n3 = 84;
        int n4 = 212;
        GL11.glEnable(3553);
        final int s = this.s(canvasWidth, canvasHeight);
        GL11.glDisable(3553);
        while (true) {
            if (n2 != 0) {
                if (n == frameCount - 1) {
                    break;
                }
            }
            else if (ar.isDone()) {
                n3 = 212;
                n4 = frameCount;
                n = n3 - 1;
                n2 = 1;
            }
            GL11.glClear(16384);
            final int width = Display.getWidth();
            final int height = Display.getHeight();
            GL11.glViewport(0, 0, width, height);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glOrtho(0.0, (double)width, (double)height, 0.0, -1.0, 1.0);
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glEnable(3553);
            GL11.glBindTexture(3553, s);
            if (n == -1 || System.currentTimeMillis() - currentTimeMillis >= hj[n]) {
                if (++n >= n4) {
                    n = n3;
                }
                GL11.glTexSubImage2D(3553, 0, 0, 0, canvasWidth, canvasHeight, 6408, 5121, hi[n]);
                currentTimeMillis = System.currentTimeMillis();
            }
            GL11.glBegin(7);
            GL11.glTexCoord2f(0.0f, 0.0f);
            GL11.glVertex2f(0.0f, 0.0f);
            GL11.glTexCoord2f(1.0f, 0.0f);
            GL11.glVertex2f((float)width, 0.0f);
            GL11.glTexCoord2f(1.0f, 1.0f);
            GL11.glVertex2f((float)width, (float)height);
            GL11.glTexCoord2f(0.0f, 1.0f);
            GL11.glVertex2f(0.0f, (float)height);
            GL11.glEnd();
            GL11.glBindTexture(3553, 0);
            GL11.glDisable(3553);
            ar.getMutex().acquireUninterruptibly();
            Display.update();
            ar.getMutex().release();
            if (ar.isPaused()) {
                this.clearGL();
                this.setGL();
            }
            Display.sync(100);
        }
        GL11.glDeleteTextures(s);
        this.clearGL();
    }
    
    private void uH() {
        WebPAnimDecoder webPAnimDecoder;
        try {
            webPAnimDecoder = new WebPAnimDecoder(new WebPImage(jz.aO("assets/feather/textures/loading.webp").tu()));
        }
        catch (WebPException ex) {
            throw new AssertionError();
        }
        final int frameCount = webPAnimDecoder.getInfo().getFrameCount();
        final ByteBuffer[] hi = new ByteBuffer[frameCount];
        final int[] hj = new int[frameCount];
        int n = 0;
        for (final WebPAnimFrame webPAnimFrame : webPAnimDecoder) {
            final ByteBuffer pixels = webPAnimFrame.getPixels();
            final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pixels.capacity());
            allocateDirect.put(pixels);
            allocateDirect.rewind();
            hi[n] = allocateDirect;
            hj[n] = webPAnimFrame.getDuration();
            ++n;
        }
        this.HI = hi;
        this.HJ = hj;
        this.HK = webPAnimDecoder.getInfo();
    }
    
    private int s(final int n, final int n2) {
        final int glGenTextures = GL11.glGenTextures();
        GL11.glBindTexture(3553, glGenTextures);
        GL11.glTexParameteri(3553, 33085, 0);
        GL11.glTexParameteri(3553, 33082, 0);
        GL11.glTexParameteri(3553, 33083, 0);
        GL11.glTexParameterf(3553, 34049, 0.0f);
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        GL11.glTexParameteri(3553, 10242, 33071);
        GL11.glTexParameteri(3553, 10243, 33071);
        GL11.glPixelStorei(3314, 0);
        GL11.glPixelStorei(3316, 0);
        GL11.glPixelStorei(3315, 0);
        GL11.glPixelStorei(3317, 4);
        GL11.glTexImage2D(3553, 0, 6408, n, n2, 0, 6408, 5121, (ByteBuffer)null);
        GL11.glBindTexture(3553, 0);
        return glGenTextures;
    }
}
