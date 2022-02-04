// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class jJ<T> extends jM implements Future<T>
{
    private final Callable<T> Fx;
    private T Fy;
    private Exception Fz;
    
    jJ(final Callable<T> fx, final int n) {
        super(null, n, -1L);
        this.Fz = null;
        this.Fx = fx;
    }
    
    @Override
    public synchronized boolean cancel(final boolean b) {
        if (this.tH() != -1L) {
            return false;
        }
        this.k(-2L);
        return true;
    }
    
    @Override
    public boolean isCancelled() {
        return this.tH() == -2L;
    }
    
    @Override
    public boolean isDone() {
        final long th = this.tH();
        return th != -1L && th != -3L;
    }
    
    @Override
    public T get() {
        try {
            return this.get(0L, TimeUnit.MILLISECONDS);
        }
        catch (TimeoutException cause) {
            throw new Error(cause);
        }
    }
    
    @Override
    public synchronized T get(long millis, final TimeUnit timeUnit) {
        millis = timeUnit.toMillis(millis);
        long lng = this.tH();
        long currentTimeMillis = (millis > 0L) ? System.currentTimeMillis() : 0L;
        while (lng == -1L || lng == -3L) {
            this.wait(millis);
            lng = this.tH();
            if (lng != -1L && lng != -3L) {
                break;
            }
            if (millis == 0L) {
                continue;
            }
            millis += currentTimeMillis - (currentTimeMillis = System.currentTimeMillis());
            if (millis > 0L) {
                continue;
            }
            throw new TimeoutException();
        }
        if (lng == -2L) {
            throw new CancellationException();
        }
        if (lng != -4L) {
            throw new IllegalStateException("Unexpected state " + lng);
        }
        if (this.Fz == null) {
            return this.Fy;
        }
        throw new ExecutionException(this.Fz);
    }
    
    @Override
    public void run() {
        synchronized (this) {
            if (this.tH() == -2L) {
                return;
            }
            this.k(-3L);
        }
        try {
            this.Fy = this.Fx.call();
        }
        catch (Exception fz) {
            this.Fz = fz;
            synchronized (this) {
                this.k(-4L);
                this.notifyAll();
            }
        }
        finally {
            synchronized (this) {
                this.k(-4L);
                this.notifyAll();
            }
        }
    }
    
    @Override
    synchronized boolean tB() {
        if (this.tH() != -1L) {
            return false;
        }
        this.k(-2L);
        this.notifyAll();
        return true;
    }
}
