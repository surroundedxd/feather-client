// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.nio.FloatBuffer;
import java.io.Serializable;

public abstract class kU implements Serializable, kQ
{
    protected kU() {
    }
    
    @Override
    public final float uD() {
        return (float)Math.sqrt(this.uz());
    }
    
    @Override
    public abstract float uz();
    
    public abstract kU g(final FloatBuffer p0);
    
    public abstract kU uA();
    
    public final kU uE() {
        final float ud = this.uD();
        if (ud != 0.0f) {
            return this.r(1.0f / ud);
        }
        throw new IllegalStateException("Zero length vector");
    }
    
    @Override
    public abstract kU h(final FloatBuffer p0);
    
    public abstract kU r(final float p0);
}
