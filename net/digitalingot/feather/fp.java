// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.Objects;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public class fP
{
    @SerializedName("name")
    @NotNull
    private String name;
    @SerializedName("command")
    @NotNull
    private String command;
    @SerializedName("key")
    @NotNull
    private bK px;
    
    public fP(@NotNull final String name, @NotNull final String command, @NotNull final bK px) {
        this.name = name;
        this.command = command;
        this.px = px;
    }
    
    public void hG() {
        Minecraft.func_71410_x().field_71439_g.func_71165_d(this.command);
    }
    
    @NotNull
    public String getName() {
        return this.name;
    }
    
    public void Q(@NotNull final String name) {
        this.name = name;
    }
    
    @NotNull
    public String hH() {
        return this.command;
    }
    
    public void R(@NotNull final String command) {
        this.command = command;
    }
    
    @NotNull
    public bK hI() {
        return this.px;
    }
    
    public void b(@NotNull final bK px) {
        this.px = px;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.name.equals(((fP)o).name));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
}
