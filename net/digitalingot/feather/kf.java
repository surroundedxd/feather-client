// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.Objects;

public class kF
{
    private final String kK;
    private float width;
    private final float height;
    private final float GI;
    private final float GJ;
    private final float GK;
    private final float GL;
    private final int GM;
    
    public kF(final String kk, final float width, final float height, final float gi, final float gj, final float gk, final float gl, final int gm) {
        this.kK = kk;
        this.width = width;
        this.height = height;
        this.GI = gi;
        this.GJ = gj;
        this.GK = gk;
        this.GL = gl;
        this.GM = gm;
    }
    
    public float uf() {
        return this.width;
    }
    
    public void p(final float width) {
        this.width = width;
    }
    
    public float ug() {
        return this.height;
    }
    
    public int uh() {
        return this.GM;
    }
    
    public static class a
    {
        private final int GN;
        private final Object[] GO;
        
        public a(final String s, final float n, final float n2, final float n3, final float n4, final boolean b) {
            this.GN = Objects.hash(s, n, n2, n3, n4, b);
            this.GO = new Object[] { s, n, n2, n3, n4, b };
        }
        
        public int ui() {
            return this.GN;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (!(o instanceof a)) {
                return false;
            }
            final Object[] go = this.GO;
            final Object[] go2 = ((a)o).GO;
            if (go == go2) {
                return true;
            }
            if (go == null || go2 == null) {
                return false;
            }
            final int length = go.length;
            if (go2.length != length) {
                return false;
            }
            for (int i = 0; i < length; ++i) {
                if (go[i] != go2[i] && !go[i].equals(go2[i])) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public int hashCode() {
            return this.GN;
        }
    }
}
