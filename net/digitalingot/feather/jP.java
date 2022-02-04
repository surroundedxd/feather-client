// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.nio.ByteBuffer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.vertex.VertexFormat;

public interface jp extends jf
{
    public static final VertexFormat Fe = DefaultVertexFormats.field_181705_e;
    
    void e(final float p0, final float p1, final float p2);
    
    default void d(final float n, final float n2) {
        this.e(n, n2, 0.0f);
    }
    
    public static class a extends jk implements jp
    {
        public a(final ji ji) {
            super(ji, jg.ER);
        }
        
        @Override
        public void e(final float n, final float n2, final float n3) {
            final int fc = this.Fc;
            final ByteBuffer fb = this.Fb;
            fb.putFloat(fc, n);
            fb.putFloat(fc + 4, n2);
            fb.putFloat(fc + 8, n3);
            this.to();
        }
    }
    
    public static class b extends jl implements jp
    {
        public b(final ji ji) {
            super(ji, jg.ER);
        }
        
        @Override
        public void e(final float n, final float n2, final float n3) {
            final long fd = this.Fd;
            iS.a(fd, n);
            iS.a(fd + 4L, n2);
            iS.a(fd + 8L, n3);
            this.to();
        }
    }
}
