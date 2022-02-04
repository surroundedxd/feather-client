// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.lwjgl.opengl.GL11;
import java.awt.Color;

public class gw implements gv
{
    @Override
    public void a(final gt.a a, final int n, final int n2, final int n3, final Color color, final is is) {
        final boolean glIsEnabled = GL11.glIsEnabled(2848);
        if (glIsEnabled) {
            GL11.glDisable(2848);
        }
        final boolean glIsEnabled2 = GL11.glIsEnabled(2832);
        if (glIsEnabled2) {
            GL11.glDisable(2832);
        }
        io.lH();
        io.lQ();
        float n4 = 1.0f;
        if (a.qZ) {
            n4 = a.qU + (float)a.my;
            if (n4 != 1.0f) {
                io.j(n4);
            }
            gu.a(is, n - a.qS, n2 + a.qS, n, n2, a.ra);
            gu.a(is, n, n2, n + a.qS, n2 + a.qS, a.ra);
        }
        if (n4 != a.qU) {
            n4 = (float)a.qU;
            io.j(n4);
        }
        gu.a(is, n - a.qS, n2 + a.qS, n, n2, color);
        gu.a(is, n, n2, n + a.qS, n2 + a.qS, color);
        if (n4 != 1.0f) {
            io.j(1.0f);
        }
        if (glIsEnabled2) {
            GL11.glEnable(2832);
        }
        if (glIsEnabled) {
            GL11.glEnable(2848);
        }
    }
}
