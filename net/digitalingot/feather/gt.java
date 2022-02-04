// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class gT
{
    private static final long wy = 1000L;
    private static final double wz = 0.01;
    private final a wA;
    private final b wB;
    private final b wC;
    
    public gT(@NotNull final dW<?> dw) {
        this(dw, null);
    }
    
    public gT(@NotNull final dW<?> dw, @Nullable final a wa) {
        this.wB = new b();
        this.wC = new b();
        this.wA = wa;
        ao.bE.a(c -> {
            if (!dw.eU()) {
                return;
            }
            else if (c != ao.c.END) {
                return;
            }
            else {
                this.iK();
                return;
            }
        });
        final long n3;
        W.bm.a((n, n2, p3) -> {
            if (!(!dw.eU())) {
                if (n2 != 0) {
                    System.currentTimeMillis();
                    if (n == 0) {
                        this.wB.e(n3);
                    }
                    else if (n == 1) {
                        this.wC.e(n3);
                    }
                }
            }
        });
    }
    
    private void iK() {
        final long n = System.currentTimeMillis() - 1000L;
        final double a = this.wB.f(n);
        final double a2 = this.wC.f(n);
        if ((a != 0.0 || a2 != 0.0) && this.wA != null) {
            this.wA.b(a, a2);
        }
    }
    
    public double iL() {
        return this.wB.wD.size();
    }
    
    public double iM() {
        return this.wC.wD.size();
    }
    
    static class b
    {
        private final List<Long> wD;
        private double wE;
        
        private b() {
            this.wD = new ArrayList<Long>();
        }
        
        private void e(final long l) {
            this.wD.add(l);
        }
        
        private double f(final long n) {
            this.wD.removeIf(n2 -> n2 < n);
            final double we = this.wD.size();
            if (we != this.wE) {
                final double a = we - this.wE;
                if (Math.abs(a) > 0.01) {
                    this.wE = we;
                    return a;
                }
            }
            return 0.0;
        }
    }
    
    public interface a
    {
        void b(final double p0, final double p1);
    }
}
