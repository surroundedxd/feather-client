// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.Map;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public class jK
{
    private final AtomicInteger FA;
    private volatile jM FB;
    private final AtomicReference<jM> FC;
    private final Queue<jM> FD;
    private final List<jM> FE;
    private final Map<Integer, jM> Fu;
    private volatile int FF;
    private final Executor nb;
    private jH FG;
    private jH FH;
    private static final int FI;
    
    public jK() {
        this.FA = new AtomicInteger(1);
        this.FB = new jM();
        this.FC = new AtomicReference<jM>(this.FB);
        this.FD = new PriorityQueue<jM>(10, (jm, jm2) -> (int)(jm.tI() - jm2.tI()));
        this.FE = new ArrayList<jM>();
        this.Fu = new ConcurrentHashMap<Integer, jM>();
        this.FF = 0;
        this.nb = Executors.newCachedThreadPool();
        this.FG = new jH(-1, (Class)null) {
            @Override
            StringBuilder a(final StringBuilder sb) {
                return sb;
            }
        };
        this.FH = this.FG;
    }
    
    public int b(final Runnable runnable) {
        return this.a(runnable, 0L);
    }
    
    public jM c(final Runnable runnable) {
        return this.b(runnable, 0L);
    }
    
    public jM d(final Runnable runnable) {
        return this.c(runnable, 0L);
    }
    
    public int a(final Runnable runnable, final long n) {
        return this.a(runnable, n, -1L);
    }
    
    public jM b(final Runnable runnable, final long n) {
        return this.b(runnable, n, -1L);
    }
    
    public jM c(final Runnable runnable, final long n) {
        return this.c(runnable, n, -1L);
    }
    
    public int a(final Runnable runnable, final long n, final long n2) {
        return this.b(runnable, n, n2).tD();
    }
    
    public jM b(final Runnable runnable, long n, long n2) {
        if (n < 0L) {
            n = 0L;
        }
        if (n2 == 0L) {
            n2 = 1L;
        }
        else if (n2 < -1L) {
            n2 = -1L;
        }
        return this.a(new jM(runnable, this.tF(), n2), n);
    }
    
    public jM c(final Runnable runnable, long n, long n2) {
        if (n < 0L) {
            n = 0L;
        }
        if (n2 == 0L) {
            n2 = 1L;
        }
        else if (n2 < -1L) {
            n2 = -1L;
        }
        return this.a(new jI(this.Fu, runnable, this.tF(), n2), n);
    }
    
    public <T> Future<T> a(final Callable<T> callable) {
        final jJ<T> jj = new jJ<T>(callable, this.tF());
        this.a(jj, 0L);
        return jj;
    }
    
    public void aK(final int i) {
        if (i <= 0) {
            return;
        }
        final jM jm = this.Fu.get(i);
        if (jm != null) {
            jm.tB();
        }
        final jM jm2 = new jM(new Runnable() {
            @Override
            public void run() {
                if (!this.a(jK.this.FE)) {
                    this.a(jK.this.FD);
                }
            }
            
            private boolean a(final Iterable<jM> iterable) {
                final Iterator<jM> iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    final jM jm = iterator.next();
                    if (jm.tD() == i) {
                        jm.tB();
                        iterator.remove();
                        if (jm.tz()) {
                            jK.this.Fu.remove(i);
                        }
                        return true;
                    }
                }
                return false;
            }
        });
        this.a(jm2, 0L);
        for (jM jm3 = this.FB.tJ(); jm3 != null; jm3 = jm3.tJ()) {
            if (jm3 == jm2) {
                return;
            }
            if (jm3.tD() == i) {
                jm3.tB();
            }
        }
    }
    
    void tE() {
        final int ff = this.FF + 1;
        this.FF = ff;
        final List<jM> fe = this.FE;
        this.tG();
        while (this.aL(ff)) {
            final jM value = this.FD.remove();
            if (value.tH() < -1L) {
                if (value.tz()) {
                    this.Fu.remove(value.tD(), value);
                }
                this.tG();
            }
            else {
                if (value.tz()) {
                    try {
                        value.run();
                    }
                    catch (Throwable t) {
                        kr.Gh.warn(String.format("Unhandled exception while running task #%d", value.tD()), t);
                    }
                    this.tG();
                }
                else {
                    this.FH = this.FH.a(new jH(ff + jK.FI, value.tK()));
                    this.nb.execute(value);
                }
                final long th = value.tH();
                if (th > 0L) {
                    value.l(ff + th);
                    fe.add(value);
                }
                else {
                    if (!value.tz()) {
                        continue;
                    }
                    this.Fu.remove(value.tD());
                }
            }
        }
        this.FD.addAll((Collection<?>)fe);
        fe.clear();
        this.FG = this.FG.aJ(ff);
    }
    
    private void a(final jM newValue) {
        AtomicReference<jM> fc;
        jM expectedValue;
        for (fc = this.FC, expectedValue = fc.get(); !fc.compareAndSet(expectedValue, newValue); expectedValue = fc.get()) {}
        expectedValue.b(newValue);
    }
    
    private jM a(final jM jm, final long n) {
        jm.l(this.FF + n);
        this.a(jm);
        return jm;
    }
    
    private int tF() {
        return this.FA.incrementAndGet();
    }
    
    private void tG() {
        final jM fb = this.FB;
        jM jm = fb.tJ();
        jM fb2 = fb;
        while (jm != null) {
            if (jm.tD() == -1) {
                jm.run();
            }
            else if (jm.tH() >= -1L) {
                this.FD.add(jm);
                this.Fu.put(jm.tD(), jm);
            }
            jm = (fb2 = jm).tJ();
        }
        jM tj;
        for (jM jm2 = fb; jm2 != fb2; jm2 = tj) {
            tj = jm2.tJ();
            jm2.b(null);
        }
        this.FB = fb2;
    }
    
    private boolean aL(final int n) {
        return !this.FD.isEmpty() && this.FD.peek().tI() <= n;
    }
    
    @Override
    public String toString() {
        final int ff = this.FF;
        final StringBuilder append = new StringBuilder("Task list ").append(ff - jK.FI).append('-').append(ff).append('{');
        this.FG.a(append);
        return append.append('}').toString();
    }
    
    static {
        FI = 30;
    }
}
