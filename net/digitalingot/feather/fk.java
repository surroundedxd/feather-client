// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.item.ItemStack;
import net.minecraft.client.Minecraft;

@dV(eN = ec.SCROLLABLE_TOOLTIPS, eO = @eb(fj = "Scrollable Tooltips", fk = "https://assets.feathercdn.net/game/mods/scrollabletooltips.svg", fl = "Makes tooltips scrollable", fm = {}))
public class fK extends dW<a>
{
    private static final int pa;
    private boolean pb;
    private int pc;
    private int pd;
    
    public fK() {
        this.pc = 0;
        this.pd = 0;
    }
    
    @Override
    public void eP() {
        int field_146295_m;
        final int n3;
        aj.bA.a((p0, p1, p2, n, p4, n2) -> {
            if (!this.eU()) {
                return;
            }
            else {
                field_146295_m = Minecraft.func_71410_x().field_71462_r.field_146295_m;
                if (!this.pb) {
                    this.pc = 0;
                    this.pd = 0;
                }
                this.pb = (n < 0);
                if (this.pb) {
                    it.mo();
                    if (g.a(fK.pa)) {
                        if (n3 < 0) {
                            this.pc += 10;
                        }
                        else if (n3 > 0) {
                            this.pc -= 10;
                        }
                    }
                    else if (n3 < 0) {
                        this.pd -= 10;
                    }
                    else if (n3 > 0) {
                        this.pd += 10;
                    }
                    if (this.pd + n > 6) {
                        this.pd = -n + 6;
                    }
                    else if (this.pd + n + n2 + 6 < field_146295_m) {
                        this.pd = field_146295_m - 6 - n - n2;
                    }
                }
                if (this.pc != 0 || this.pd != 0) {
                    io.md();
                    io.b((float)this.pc, (float)this.pd, 0.0f);
                }
                return;
            }
        });
        aj.bv.a((p0, p1, p2, p3, p4, p5) -> {
            if (this.eU() && (this.pc != 0 || this.pd != 0)) {
                io.me();
            }
        });
    }
    
    static {
        pa = bQ.K(16).cq();
    }
    
    @el(fE = true)
    public static class a extends eg
    {
    }
}
