// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.Minecraft;

@dV(eN = ec.SNAPLOOK, eO = @eb(fj = "Snaplook", fk = "https://assets.feathercdn.net/game/mods/snaplook.svg", fl = "Snap to a particular perspective", fm = {}))
public class fL extends dW<a>
{
    private boolean pe;
    private int oV;
    
    public fL() {
        this.oV = 0;
    }
    
    @Override
    public void initialize() {
        ab.br.a((p0, p1) -> {
            if (!this.eU()) {
                return;
            }
            else {
                this.pe = false;
                return;
            }
        });
        final Minecraft minecraft;
        GameSettings field_71474_y;
        EntityPlayerSP field_71439_g;
        GameSettings field_71474_y2;
        bM.a(() -> ((a)this.jK).pf, () -> {
            if (!(!this.eU())) {
                this.pe = true;
                Minecraft.func_71410_x();
                field_71474_y = minecraft.field_71474_y;
                field_71439_g = minecraft.field_71439_g;
                if (this.pe) {
                    this.oV = field_71474_y.field_74320_O;
                    field_71474_y.field_74320_O = ((((a)this.jK).pg == a.a.THIRD) ? 1 : 2);
                }
                else {
                    field_71474_y.field_74320_O = this.oV;
                }
                this.hy();
            }
        }, () -> {
            if (this.eU() && this.pe) {
                field_71474_y2 = Minecraft.func_71410_x().field_71474_y;
                this.pe = false;
                field_71474_y2.field_74320_O = this.oV;
                this.hy();
            }
        });
    }
    
    private void hy() {
        final GameSettings field_71474_y = Minecraft.func_71410_x().field_71474_y;
    }
    
    public static class a extends eg
    {
        @ex(fw = "keyBind", fY = "0", fj = "Keybind", fo = @es(fU = 0))
        public bK pf;
        @ex(fw = "viewMode", fY = "third", fj = "View Mode", fo = @es(fU = 1))
        public fL.a.a pg;
        
        public enum a
        {
            @eo(fw = "third", fj = "Third")
            THIRD, 
            @eo(fw = "forward", fj = "Forward")
            FORWARD;
            
            private static /* synthetic */ a[] $values() {
                return new a[] { a.THIRD, a.FORWARD };
            }
            
            static {
                $VALUES = $values();
            }
        }
    }
}
