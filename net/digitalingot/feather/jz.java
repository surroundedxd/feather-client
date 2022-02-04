// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

public enum jZ
{
    @eo(fw = "outExpo", fj = "Out Exponential")
    OUT_EXPONENTIAL(0) {
        @Override
        public float calculate(final float n) {
            return (Math.abs(n - 1.0f) < 1.0E-12) ? 1.0f : (1.0f - (float)Math.pow(2.0, -10.0f * n));
        }
    }, 
    @eo(fw = "inOutQuad", fj = "In Out Quadratic")
    IN_OUT_QUADRATIC(1) {
        @Override
        public float calculate(final float n) {
            return (n < 0.5) ? (2.0f * n * n) : ((float)(1.0 - Math.pow(-2.0f * n + 2.0f, 2.0) / 2.0));
        }
    }, 
    @eo(fw = "inOutCirc", fj = "In Out Circular")
    IN_OUR_CIRCULAR(2) {
        @Override
        public float calculate(final float n) {
            return (float)((n < 0.5) ? ((1.0 - Math.sqrt(1.0 - Math.pow(2.0f * n, 2.0))) / 2.0) : ((Math.sqrt(1.0 - Math.pow(-2.0f * n + 2.0f, 2.0)) + 1.0) / 2.0));
        }
    }, 
    @eo(fw = "outQuint", fj = "Out Quintic")
    OUT_QUINTIC(3) {
        @Override
        public float calculate(final float n) {
            return (float)(1.0 - Math.pow(1.0f - n, 5.0));
        }
    };
    
    public abstract float calculate(final float p0);
    
    private static /* synthetic */ jZ[] $values() {
        return new jZ[] { jZ.OUT_EXPONENTIAL, jZ.IN_OUT_QUADRATIC, jZ.IN_OUR_CIRCULAR, jZ.OUT_QUINTIC };
    }
    
    static {
        $VALUES = $values();
    }
}
