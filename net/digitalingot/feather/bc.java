// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import net.minecraft.client.gui.GuiScreen;

public class bC extends GuiScreen
{
    private final bE gI;
    private final bv gJ;
    private boolean gK;
    
    public bC() {
        this.gI = new bE();
        this.gJ = bu.INSTANCE.getScreen();
    }
    
    public void func_73866_w_() {
        this.gI.e(this.field_146294_l, this.field_146295_m);
        this.gJ.func_73866_w_();
    }
    
    public void func_146281_b() {
        this.gI.bB();
        this.gJ.func_146281_b();
    }
    
    public void func_73863_a(final int n, final int n2, final float n3) {
        this.gI.a(new is());
        this.gJ.func_73863_a(n, n2, n3);
    }
    
    protected void func_73869_a(final char c, final int n) {
        super.func_73869_a(c, n);
        this.gI.a(c, n);
    }
    
    protected void func_73864_a(final int n, final int n2, final int n3) {
        if (this.gI.b(n, n2, n3)) {
            this.gK = true;
        }
    }
    
    protected void func_146286_b(final int n, final int n2, final int n3) {
        this.gI.c(n, n2, n3);
    }
    
    protected void func_146273_a(final int n, final int n2, final int n3, final long n4) {
        this.gI.d(n, n2, n3);
    }
    
    public void func_146274_d() {
        super.func_146274_d();
        if (Mouse.getEventButton() == -1) {
            this.gI.a(Mouse.getEventX() * this.field_146294_l / this.field_146297_k.field_71443_c, (double)(this.field_146295_m - Mouse.getEventY() * this.field_146295_m / this.field_146297_k.field_71440_d - 1));
        }
        if (this.gK) {
            this.gK = false;
            return;
        }
        this.gJ.func_146274_d();
    }
    
    public void func_146280_a(@NotNull final Minecraft minecraft, final int n, final int n2) {
        super.func_146280_a(minecraft, n, n2);
        this.gJ.func_146280_a(minecraft, n, n2);
    }
    
    public boolean func_73868_f() {
        return false;
    }
}
