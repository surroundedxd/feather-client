// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

public class fQ implements cb<cu, cp, cn>
{
    @NotNull
    private final fO py;
    
    public fQ(@NotNull final fO py) {
        this.py = py;
    }
    
    @Override
    public void a(final cu cu, final Consumer<cp> consumer, final Consumer<cn> consumer2) {
        final fP cl = cu.cL();
        if (cu.cK() != null) {
            final fP fp2 = this.py.cM().stream().filter(fp -> fp.getName().equals(cu.cK())).findAny().orElse(null);
            if (fp2 == null) {
                throw new IllegalArgumentException("Macro not found");
            }
            fp2.Q(cl.getName());
            fp2.R(cl.hH());
            fp2.b(cl.hI());
            this.py.bb();
        }
        else {
            this.py.a(cl);
        }
        consumer.accept(new cp("success"));
    }
}
