// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.client.renderer.vertex.VertexFormat;

public interface jh
{
    default jh b(final VertexFormat vertexFormat) {
        return (jh)vertexFormat;
    }
    
    int getStride();
}
