// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.command.ICommand;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraft.command.ICommandSender;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import net.minecraft.command.CommandBase;

public abstract class h extends CommandBase
{
    @NotNull
    private final String A;
    @NotNull
    private final List<String> B;
    
    public h(@NotNull final String a, @NotNull final List<String> b) {
        this.A = a;
        this.B = b;
    }
    
    @NotNull
    public String func_71517_b() {
        return this.A;
    }
    
    @NotNull
    public List<String> func_71514_a() {
        return this.B;
    }
    
    @NotNull
    public String func_71518_a(final ICommandSender commandSender) {
        return "";
    }
    
    public int func_82362_a() {
        return 0;
    }
    
    public void func_71515_b(final ICommandSender commandSender, final String[] array) {
        this.c(array);
    }
    
    public void a(final Void void1) {
        ClientCommandHandler.instance.func_71560_a((ICommand)this);
    }
    
    public abstract void c(@NotNull final String[] p0);
}
