// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.nio.ByteBuffer;

public interface ji
{
    boolean ensureBufferCapacity(final int p0);
    
    ByteBuffer getDirectBuffer();
    
    int getWriterPosition();
    
    void flush(final int p0, final jh p1);
    
    jh getVertexFormat();
}
