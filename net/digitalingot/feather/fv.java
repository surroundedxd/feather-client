// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.awt.Dimension;
import net.minecraft.client.settings.GameSettings;
import net.digitalingot.feather.mixin.client.A;
import java.awt.Toolkit;
import net.minecraft.client.Minecraft;
import java.awt.Point;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

public class fV
{
    private static Rectangle pE;
    private static boolean pF;
    
    private static Rectangle l(final int x, final int y) {
        final GraphicsDevice[] screenDevices = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();
        for (int length = screenDevices.length, i = 0; i < length; ++i) {
            final Rectangle bounds = screenDevices[i].getDefaultConfiguration().getBounds();
            if (bounds.contains(x, y)) {
                return bounds;
            }
        }
        return new Rectangle(0, 0, g.v(), g.w());
    }
    
    private static Rectangle P(final int n) {
        if (n < 1) {
            return null;
        }
        final GraphicsDevice[] screenDevices = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();
        if (screenDevices == null || screenDevices.length == 0 || screenDevices.length < n) {
            return null;
        }
        return screenDevices[n - 1].getDefaultConfiguration().getBounds();
    }
    
    private static Rectangle b(final Rectangle rectangle) {
        final Point point = new Point((int)(rectangle.getMinX() + rectangle.getWidth() / 2.0), (int)(rectangle.getMinY() + rectangle.getHeight() / 2.0));
        return l((int)point.getX(), (int)point.getY());
    }
    
    public static void n(final boolean pf) {
        if (g.B()) {
            fV.pF = true;
        }
        if (fV.pF == pf && !g.B() && g.C() == pf) {
            return;
        }
        final Rectangle pe = new Rectangle(g.x(), g.y(), g.z(), g.A());
        if (pf && !g.B()) {
            fV.pE = pe;
        }
        final Minecraft func_71410_x = Minecraft.func_71410_x();
        final boolean mp = it.mp();
        if (mp) {
            it.t(false);
        }
        g.a(pf);
        final Rectangle b = b(pe);
        Rectangle rectangle = pf ? b : fV.pE;
        if (rectangle == null) {
            rectangle = b;
        }
        fV.pF = pf;
        final GameSettings field_71474_y = func_71410_x.field_71474_y;
        if (field_71474_y.field_74353_u != fV.pF) {
            field_71474_y.field_74353_u = fV.pF;
            field_71474_y.func_74303_b();
        }
        g.a(false, rectangle.x, rectangle.y, (int)rectangle.getWidth(), (int)rectangle.getHeight(), field_71474_y.field_74352_v);
        g.b(!pf);
        if (!pf) {
            g.b(false);
            g.b(true);
            final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            g.a((int)((screenSize.getWidth() - g.z()) / 2.0), (int)((screenSize.getHeight() - g.A()) / 2.0));
        }
        func_71410_x.field_71443_c = (int)rectangle.getWidth();
        func_71410_x.field_71440_d = (int)rectangle.getHeight();
        if (func_71410_x.field_71462_r != null) {
            func_71410_x.func_71370_a((int)rectangle.getWidth(), (int)rectangle.getHeight());
        }
        else {
            ((A)func_71410_x).invokeUpdateFramebufferSize();
        }
        func_71410_x.func_175601_h();
        it.p(g.x() + g.z() >> 1, g.y() + g.A() >> 1);
        if (mp) {
            it.t(true);
        }
        g.b(false);
        g.b(true);
    }
}
