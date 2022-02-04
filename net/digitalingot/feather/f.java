// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.lwjgl.opengl.GL11;
import java.nio.IntBuffer;

public class F implements AutoCloseable
{
    private final IntBuffer aW;
    private final int aA;
    private final a aX;
    private final int aE;
    private int aY;
    private int aZ;
    
    public F(final IntBuffer aw, final int aa, final a ax, final int ae) {
        this.aW = aw;
        this.aA = aa;
        this.aX = ax;
        this.aE = ae;
    }
    
    public int ax() {
        return this.aY;
    }
    
    public void d(final int ay) {
        this.aY = ay;
    }
    
    public int ay() {
        return this.aZ;
    }
    
    public void e(final int az) {
        this.aZ = az;
    }
    
    public int an() {
        return this.aA;
    }
    
    public int f(final int n) {
        return this.aW.get(n / this.aE);
    }
    
    public int g(final int n) {
        return this.aX.g(n);
    }
    
    public int az() {
        return this.aE;
    }
    
    @Override
    public void close() {
        GL11.glDeleteTextures(this.aW);
    }
    
    public static class b implements a
    {
        private final int ba;
        
        public b(final int ba) {
            this.ba = ba;
        }
        
        @Override
        public int g(final int n) {
            return this.ba;
        }
    }
    
    public static class c implements a
    {
        private final int[] bb;
        
        public c(final int[] bb) {
            this.bb = bb;
        }
        
        @Override
        public int g(final int n) {
            return this.bb[n];
        }
    }
    
    public interface a
    {
        int g(final int p0);
    }
}
