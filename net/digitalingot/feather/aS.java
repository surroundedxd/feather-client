// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.Arrays;
import java.util.Objects;
import java.lang.reflect.Array;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.util.function.Function;

class as<T> extends ap<T>
{
    private final Function<T[], T> bK;
    private final Lock bL;
    private T[] bM;
    
    as(final Class<? super T> componentType, final Function<T[], T> bk) {
        this.bL = new ReentrantLock();
        this.bK = bk;
        this.bM = (T[])Array.newInstance(componentType, 0);
        this.aK();
    }
    
    void aK() {
        this.bI = this.bK.apply(this.bM);
    }
    
    @Override
    public void a(final T obj) {
        Objects.requireNonNull(obj, "Tried to register a null listener!");
        this.bL.lock();
        try {
            (this.bM = Arrays.copyOf(this.bM, this.bM.length + 1))[this.bM.length - 1] = obj;
            this.aK();
        }
        finally {
            this.bL.unlock();
        }
    }
}
