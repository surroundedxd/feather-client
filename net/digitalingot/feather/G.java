// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.Display;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class g
{
    public static void u() {
        Mouse.poll();
    }
    
    public static boolean a(final int n) {
        return Keyboard.isKeyDown(n);
    }
    
    public static int v() {
        return Display.getDesktopDisplayMode().getWidth();
    }
    
    public static int w() {
        return Display.getDesktopDisplayMode().getHeight();
    }
    
    public static int x() {
        return Display.getX();
    }
    
    public static int y() {
        return Display.getY();
    }
    
    public static int z() {
        return Display.getWidth();
    }
    
    public static int A() {
        return Display.getHeight();
    }
    
    public static boolean B() {
        return Display.isFullscreen();
    }
    
    public static boolean C() {
        final String property = System.getProperty("org.lwjgl.opengl.Window.undecorated");
        if (property == null) {
            System.setProperty("org.lwjgl.opengl.Window.undecorated", "false");
            return C();
        }
        return property.equals("false");
    }
    
    public static void a(final boolean b) {
        System.setProperty("org.lwjgl.opengl.Window.undecorated", Boolean.toString(b));
    }
    
    public static void a(final boolean fullscreen, final int n, final int n2, final int n3, final int n4, final boolean vSyncEnabled) {
        try {
            Display.setFullscreen(fullscreen);
            Display.setDisplayMode(new DisplayMode(n3, n4));
            Display.setLocation(n, n2);
            Display.setVSyncEnabled(vSyncEnabled);
        }
        catch (LWJGLException cause) {
            throw new RuntimeException((Throwable)cause);
        }
    }
    
    public static void a(final int n, final int n2) {
        Display.setLocation(n, n2);
    }
    
    public static void b(final boolean resizable) {
        Display.setResizable(resizable);
    }
}
