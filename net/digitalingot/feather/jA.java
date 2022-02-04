// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.Arrays;

public class ja implements jb
{
    private final int EM;
    private final byte[] EN;
    private int EO;
    private int EP;
    private int EQ;
    
    public ja(final int n) {
        this.EM = n * 2;
        this.EN = new byte[this.EM * this.EM * this.EM / 4];
    }
    
    @Override
    public void reset() {
        Arrays.fill(this.EN, (byte)0);
    }
    
    @Override
    public void j(final int n, final int n2, final int n3) {
        this.EO = n + n2 * this.EM + n3 * this.EM * this.EM;
        this.EP = this.EO / 4;
        this.EQ = this.EO % 4 * 2;
        final byte[] en = this.EN;
        final int ep = this.EP;
        en[ep] |= (byte)(1 << this.EQ);
    }
    
    @Override
    public void k(final int n, final int n2, final int n3) {
        this.EO = n + n2 * this.EM + n3 * this.EM * this.EM;
        this.EP = this.EO / 4;
        this.EQ = this.EO % 4 * 2;
        final byte[] en = this.EN;
        final int ep = this.EP;
        en[ep] |= (byte)(1 << this.EQ + 1);
    }
    
    @Override
    public int l(final int n, final int n2, final int n3) {
        this.EO = n + n2 * this.EM + n3 * this.EM * this.EM;
        this.EP = this.EO / 4;
        this.EQ = this.EO % 4 * 2;
        return this.EN[this.EP] >> this.EQ & 0x3;
    }
    
    @Override
    public void tl() {
        final byte[] en = this.EN;
        final int ep = this.EP;
        en[ep] |= (byte)(1 << this.EQ);
    }
    
    @Override
    public void tm() {
        final byte[] en = this.EN;
        final int ep = this.EP;
        en[ep] |= (byte)(1 << this.EQ + 1);
    }
}
