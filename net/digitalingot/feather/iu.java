// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.Tessellator;

public final class iU implements jd, je
{
    public static final iU Et;
    private final Tessellator Eu;
    private final WorldRenderer Ev;
    private final iX Ew;
    
    public iU() {
        this.Eu = Tessellator.func_178181_a();
        this.Ev = this.Eu.func_178180_c();
        this.Ew = new iX(new jc(), new ja(128));
    }
    
    public static je tb() {
        return je.a(iU.Et);
    }
    
    @Override
    public <T extends jf> T createSink(final jv<T> jv) {
        return ((je)this.Ev).createSink(jv);
    }
    
    public static void a(final int n, final VertexFormat vertexFormat) {
        Tessellator.func_178181_a().func_178180_c().func_181668_a(n, vertexFormat);
    }
    
    public static void mb() {
        Tessellator.func_178181_a().func_78381_a();
    }
    
    public void tc() {
        this.Ew.te();
    }
    
    public void td() {
        this.Ew.tf();
    }
    
    static {
        Et = new iU();
    }
}
