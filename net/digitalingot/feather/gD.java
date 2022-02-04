// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.UUID;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class gd
{
    @NotNull
    private final il qE;
    @NotNull
    private final i F;
    private long qF;
    
    public gd(@NotNull final i f) {
        this.qE = new il(new ge(f, this));
        this.F = f;
    }
    
    @Nullable
    public im T(@Nullable final String s) {
        im im = null;
        final List<im> ld = this.qE.lD();
        if (s == null) {
            im = ((ld.size() != 0) ? ld.remove(0) : null);
        }
        else {
            final UUID h = this.F.h(s);
            if (h == null) {
                return null;
            }
            final Iterator<im> iterator = ld.iterator();
            while (iterator.hasNext()) {
                final im im2 = iterator.next();
                if (!im2.lG().equals(h)) {
                    continue;
                }
                im = im2;
                iterator.remove();
                break;
            }
        }
        return im;
    }
    
    @NotNull
    public il hU() {
        return this.qE;
    }
    
    @NotNull
    public i hN() {
        return this.F;
    }
    
    public void c(final long qf) {
        this.qF = qf;
    }
    
    public boolean hV() {
        return System.currentTimeMillis() - this.qF < TimeUnit.SECONDS.toMillis(3L);
    }
}
