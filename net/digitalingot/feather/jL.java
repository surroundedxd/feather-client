// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

public abstract class jl extends jj
{
    protected long Fd;
    
    protected jl(final ji ji, final jt<?> jt) {
        super(ji, jt);
    }
    
    @Override
    protected void tp() {
        this.Fd = iS.a(this.EX.getDirectBuffer(), this.EX.getWriterPosition());
    }
    
    @Override
    protected void to() {
        this.Fd += this.EZ;
        super.to();
    }
}
