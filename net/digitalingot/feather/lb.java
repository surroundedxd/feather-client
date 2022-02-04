// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class lb
{
    public static final int HB = 64;
    
    public static BufferedImage b(final BufferedImage bufferedImage) {
        if (bufferedImage == null) {
            return null;
        }
        if (bufferedImage.getHeight() <= 64 && bufferedImage.getWidth() <= 64) {
            return bufferedImage;
        }
        kr.Gh.debug("Scaling resource pack icon from " + bufferedImage.getWidth() + " to " + 64);
        final BufferedImage bufferedImage2 = new BufferedImage(64, 64, 2);
        final Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, 0, 0, 64, 64, null);
        graphics.dispose();
        return bufferedImage2;
    }
}
