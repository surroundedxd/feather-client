// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.awt.Color;

public class gA implements gv
{
    @Override
    public void a(final gt.a a, final int n, final int n2, final int n3, final Color color, final is is) {
        final int n4 = -a.qU / 2;
        if (a.qZ) {
            gu.a(is, n4 + n - a.qS - a.my, n4 + n2 - a.qS - a.my, n4 + n + a.qS + a.qU, n4 + n2 + a.qS + a.qU, a.ra, a.my);
            gu.a(is, n4 + n - a.qS + a.qU, n4 + n2 - a.qS + a.qU, n4 + n + a.qS - a.my, n4 + n2 + a.qS - a.my, a.ra, a.my);
        }
        gu.a(is, n4 + n - a.qS, n4 + n2 - a.qS, n4 + n + a.qS, n4 + n2 + a.qS, color, a.qU);
    }
}
