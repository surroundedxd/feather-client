// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import java.nio.IntBuffer;

public class E extends C implements AutoCloseable
{
    private static final int aO = 0;
    private static final int aP = 1;
    protected final IntBuffer aQ;
    private final int aR;
    private final int aS;
    protected final int aT;
    protected final long aU;
    protected final long aV;
    
    protected E(final IntBuffer aq, final int at, final long au, final long av) {
        this.aQ = aq;
        this.aR = aq.get(0);
        this.aS = aq.get(1);
        this.aT = at;
        this.aU = au;
        this.aV = av;
    }
    
    public int as() {
        return this.aR;
    }
    
    public int at() {
        return this.aS;
    }
    
    public int au() {
        return this.aT;
    }
    
    public long av() {
        return this.aU;
    }
    
    public long aw() {
        return this.aV;
    }
    
    @Override
    public void close() {
        GL15.glDeleteBuffers(this.aQ);
    }
    
    public static E a(final B b) {
        final IntBuffer an = jU.aN(2);
        GL15.glGenBuffers(an);
        GL15.glBindBuffer(34962, an.get(0));
        GL15.glBufferData(34962, b.aF, 35044);
        GL15.glBindBuffer(34962, 0);
        GL15.glBindBuffer(34963, an.get(1));
        GL15.glBufferData(34963, b.aG, 35044);
        GL15.glBindBuffer(34963, 0);
        if (GL11.glGetError() != 0) {}
        final int capacity = b.ap().capacity();
        final int n = b.aH * 3 * 4;
        return new E(an, capacity, n, 2L * n);
    }
}
