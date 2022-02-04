// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

public enum bJ
{
    @eo(fw = "top_left", fj = "Top left")
    TOP_LEFT, 
    @eo(fw = "top_right", fj = "Top right")
    TOP_RIGHT, 
    @eo(fw = "top_center", fj = "Top center")
    TOP_CENTER, 
    @eo(fw = "bottom_left", fj = "Bottom left")
    BOTTOM_LEFT, 
    @eo(fw = "bottom_right", fj = "Bottom right")
    BOTTOM_RIGHT, 
    @eo(fw = "bottom_center", fj = "Bottom center")
    BOTTOM_CENTER, 
    @eo(fw = "center_left", fj = "Center left")
    CENTER_LEFT, 
    @eo(fw = "center_right", fj = "Center right")
    CENTER_RIGHT;
    
    public double getX(final double n) {
        switch (bJ$1.hP[this.ordinal()]) {
            case 1:
            case 2:
            case 3: {
                return n;
            }
            case 4:
            case 5: {
                return n / 2.0;
            }
            default: {
                return 0.0;
            }
        }
    }
    
    public double getY(final double n) {
        switch (bJ$1.hP[this.ordinal()]) {
            case 2:
            case 5:
            case 6: {
                return n;
            }
            case 3:
            case 7: {
                return n / 2.0;
            }
            default: {
                return 0.0;
            }
        }
    }
    
    public boolean isLeft() {
        return this == bJ.CENTER_LEFT || this == bJ.TOP_LEFT || this == bJ.BOTTOM_LEFT;
    }
    
    public boolean isRightSide() {
        switch (bJ$1.hP[this.ordinal()]) {
            case 1:
            case 2:
            case 3: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    public boolean isTop() {
        return this == bJ.TOP_LEFT || this == bJ.TOP_RIGHT || this == bJ.TOP_CENTER;
    }
    
    public boolean isBottomSide() {
        switch (bJ$1.hP[this.ordinal()]) {
            case 2:
            case 5:
            case 6: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    private static /* synthetic */ bJ[] $values() {
        return new bJ[] { bJ.TOP_LEFT, bJ.TOP_RIGHT, bJ.TOP_CENTER, bJ.BOTTOM_LEFT, bJ.BOTTOM_RIGHT, bJ.BOTTOM_CENTER, bJ.CENTER_LEFT, bJ.CENTER_RIGHT };
    }
    
    static {
        $VALUES = $values();
    }
}
