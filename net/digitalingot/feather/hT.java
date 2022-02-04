// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.datatransfer.DataFlavor;
import org.jetbrains.annotations.NotNull;
import java.awt.image.BufferedImage;
import java.awt.datatransfer.Transferable;

public class ht implements Transferable
{
    @NotNull
    private final BufferedImage yY;
    
    public ht(@NotNull final BufferedImage yy) {
        this.yY = yy;
    }
    
    @Override
    public DataFlavor[] getTransferDataFlavors() {
        return new DataFlavor[] { DataFlavor.imageFlavor };
    }
    
    @Override
    public boolean isDataFlavorSupported(final DataFlavor that) {
        return DataFlavor.imageFlavor.equals(that);
    }
    
    @Override
    public Object getTransferData(final DataFlavor dataFlavor) {
        if (DataFlavor.imageFlavor.equals(dataFlavor)) {
            return this.yY;
        }
        throw new UnsupportedFlavorException(dataFlavor);
    }
}
