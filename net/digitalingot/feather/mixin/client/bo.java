// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.Overwrite;
import net.minecraft.util.ChatComponentText;
import java.util.UUID;
import net.minecraft.event.HoverEvent;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import net.minecraft.util.IChatComponent;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ Entity.class })
public abstract class bO
{
    @Unique
    private IChatComponent Ir;
    @Unique
    private long Is;
    
    @Shadow
    public abstract String func_70005_c_();
    
    @Shadow
    protected abstract HoverEvent func_174823_aP();
    
    @Shadow
    public abstract UUID func_110124_au();
    
    @Overwrite
    public IChatComponent func_145748_c_() {
        final long currentTimeMillis = System.currentTimeMillis();
        if (this.Ir == null || this.Is + 50L < currentTimeMillis) {
            this.Is = currentTimeMillis;
            final ChatComponentText ir = new ChatComponentText(this.func_70005_c_());
            ir.func_150256_b().func_179989_a(this.func_110124_au().toString());
            return this.Ir = (IChatComponent)ir;
        }
        return this.Ir;
    }
}
