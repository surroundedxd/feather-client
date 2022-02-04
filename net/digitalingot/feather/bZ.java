// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

public enum bz
{
    @eo(fw = "ultra", fj = "Ultra")
    ULTRA(1.0f), 
    @eo(fw = "high", fj = "High")
    HIGH(0.85f), 
    @eo(fw = "medium", fj = "Medium")
    MEDIUM(0.75f), 
    @eo(fw = "low", fj = "Low")
    LOW(0.6f);
    
    private final float scale;
    
    private bz(final float scale) {
        this.scale = scale;
    }
    
    public float getScale() {
        return this.scale;
    }
    
    private static /* synthetic */ bz[] $values() {
        return new bz[] { bz.ULTRA, bz.HIGH, bz.MEDIUM, bz.LOW };
    }
    
    static {
        $VALUES = $values();
    }
}
