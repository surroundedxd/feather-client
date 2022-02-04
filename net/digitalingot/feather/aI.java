// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import net.minecraft.entity.Entity;

public interface ai
{
    public static final ap<ai> bk = aq.a((Class<? super ai>)ai.class, array -> (entity, a) -> {
        for (length = array.length; i < length; ++i) {
            array[i].render(entity, a);
        }
    });
    
    void render(@NotNull final Entity p0, @NotNull final a p1);
    
    default static {
        int length;
        int i = 0;
    }
    
    public static class a
    {
        private int by;
        private int bz;
        
        public a(final int by, final int bz) {
            this.by = by;
            this.bz = bz;
        }
        
        public int aF() {
            return this.by;
        }
        
        public void o(final int by) {
            this.by = by;
        }
        
        public int aG() {
            return this.bz;
        }
        
        public void p(final int bz) {
            this.bz = bz;
        }
    }
}
