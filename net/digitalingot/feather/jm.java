// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

public class jM implements Runnable
{
    private volatile jM FL;
    private volatile long FM;
    private long FN;
    private final Runnable FO;
    private final int id;
    
    jM() {
        this(null, -1, -1L);
    }
    
    jM(final Runnable runnable) {
        this(runnable, -1, -1L);
    }
    
    jM(final Runnable fo, final int id, final long fm) {
        this.FL = null;
        this.FO = fo;
        this.id = id;
        this.FM = fm;
    }
    
    public final int tD() {
        return this.id;
    }
    
    public boolean tz() {
        return true;
    }
    
    @Override
    public void run() {
        this.FO.run();
    }
    
    long tH() {
        return this.FM;
    }
    
    void k(final long fm) {
        this.FM = fm;
    }
    
    long tI() {
        return this.FN;
    }
    
    void l(final long fn) {
        this.FN = fn;
    }
    
    jM tJ() {
        return this.FL;
    }
    
    void b(final jM fl) {
        this.FL = fl;
    }
    
    Class<? extends Runnable> tK() {
        return this.FO.getClass();
    }
    
    public void tL() {
        c.i().aK(this.id);
    }
    
    boolean tB() {
        this.k(-2L);
        return true;
    }
}
