// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.nio.ByteBuffer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.vertex.VertexFormat;

public interface jn extends jf
{
    public static final VertexFormat Fe = DefaultVertexFormats.field_181704_d;
    
    void a(final float p0, final float p1, final float p2, final float p3, final float p4, final int p5, final int p6);
    
    public static class a extends jk implements jn
    {
        public a(final ji ji) {
            super(ji, jg.EV);
        }
        
        @Override
        public void a(final float n, final float n2, final float n3, final float n4, final float n5, final int n6, final int n7) {
            final int fc = this.Fc;
            final ByteBuffer fb = this.Fb;
            fb.putFloat(fc, n);
            fb.putFloat(fc + 4, n2);
            fb.putFloat(fc + 8, n3);
            fb.putFloat(fc + 12, n4);
            fb.putFloat(fc + 16, n5);
            fb.putInt(fc + 20, n6);
            fb.putInt(fc + 24, n7);
            this.to();
        }
    }
    
    public static class b extends jl implements jn
    {
        public b(final ji ji) {
            super(ji, jg.EV);
        }
        
        @Override
        public void a(final float n, final float n2, final float n3, final float n4, final float n5, final int n6, final int n7) {
            final long fd = this.Fd;
            iS.a(fd, n);
            iS.a(fd + 4L, n2);
            iS.a(fd + 8L, n3);
            iS.a(fd + 12L, n4);
            iS.a(fd + 16L, n5);
            iS.a(fd + 20L, n6);
            iS.a(fd + 24L, n7);
            this.to();
        }
    }
}
