// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

public class ii
{
    public static class b implements cb<dF, co, cn>
    {
        @NotNull
        private final ih Bb;
        
        public b(@NotNull final ih bb) {
            this.Bb = bb;
        }
        
        @Override
        public void a(final dF df, final Consumer<co> consumer, final Consumer<cn> consumer2) {
            this.Bb.lx().put(df.ek(), new ih.b(df.eg(), System.currentTimeMillis()));
            final ix ia = this.Bb.ia();
            final iy iy = (ia != null) ? ia.hR() : null;
            if (iy == null) {
                consumer2.accept(new cn("redstone connection not established"));
                return;
            }
            e.s().l().b(new dD(), (Consumer<bY>)new Consumer<dG>() {
                public void a(final dG dg) {
                    iy.c(df.ek(), dg.el());
                }
            }, (Consumer<bY>)consumer2);
        }
    }
    
    public static class a implements cb<dB, co, cn>
    {
        @NotNull
        private final ih Bb;
        
        public a(@NotNull final ih bb) {
            this.Bb = bb;
        }
        
        @Override
        public void a(final dB db, final Consumer<co> consumer, final Consumer<cn> consumer2) {
            this.Bb.ly().put(db.ee(), new ih.a(System.currentTimeMillis(), db.ef()));
        }
    }
}
