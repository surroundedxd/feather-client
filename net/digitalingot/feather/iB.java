// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.client.multiplayer.ServerData;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.multiplayer.WorldClient;
import java.util.Iterator;
import net.minecraft.client.entity.EntityPlayerSP;
import java.util.Collection;
import com.google.common.reflect.TypeToken;
import net.minecraft.client.Minecraft;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import java.util.Set;
import java.io.File;

@dV(eN = ec.WAYPOINTS, eO = @eb(fj = "Waypoints", fk = "https://assets.feathercdn.net/game/mods/waypoints.svg", fl = "", fm = {}))
public class ib extends dW<a>
{
    private File AT;
    @NotNull
    private final Set<ia> AU;
    @NotNull
    private final List<ia> AV;
    
    public ib() {
        this.AU = new LinkedHashSet<ia>();
        this.AV = new ArrayList<ia>();
    }
    
    @Override
    public void initialize() {
        final ca l = e.s().l();
        l.a(bV.CREATE_UPDATE_WAYPOINT, (cb<bY, bY, bY>)new ic(this));
        l.a(bV.DELETE_WAYPOINT, (cb<bY, bY, bY>)new id(this));
        ag.bw.a((p0, p1) -> {
            if (!this.eU()) {
                return;
            }
            else {
                return;
            }
        });
        bM.a(() -> ((a)this.jK).AY, () -> {
            if (!this.eU()) {
                return;
            }
            else if (Minecraft.func_71410_x().field_71439_g == null) {
                return;
            }
            else {
                bu.INSTANCE.show();
                if.a(true, this);
                return;
            }
        }, null);
        bM.a(() -> ((a)this.jK).AZ, () -> {
            if (!this.eU()) {
                return;
            }
            else if (Minecraft.func_71410_x().field_71439_g == null) {
                return;
            }
            else {
                bu.INSTANCE.show();
                if.a(false, this);
                return;
            }
        }, null);
        V.bk.a(s -> {
            if (!this.eU()) {
                return;
            }
            else {
                if (s.equals(ec.WAYPOINTS.getSlug())) {
                    bu.INSTANCE.show();
                    if.a(false, this);
                }
                return;
            }
        });
        S.bk.a((entityPlayerSP, p1) -> {
            if (!(!this.eU())) {
                if (entityPlayerSP == Minecraft.func_71410_x().field_71439_g) {
                    this.lo();
                    ie.j(this.AV);
                }
            }
        });
    }
    
    @Override
    public void eP() {
        this.AT = new File(e.s().p(), "waypoints.json");
        if (this.AT.exists()) {
            this.AU.addAll(jz.m(this.AT).a(new TypeToken<LinkedHashSet<ia>>() {}.getType()));
        }
        final EntityPlayerSP field_71439_g = Minecraft.func_71410_x().field_71439_g;
        if (field_71439_g != null && ((EntityPlayer)field_71439_g).field_70170_p != null) {
            this.lo();
            ie.j(this.AV);
        }
    }
    
    @Override
    public void eQ() {
        this.AU.clear();
        this.AV.clear();
    }
    
    public void lo() {
        this.AV.clear();
        for (final ia ia : this.AU) {
            if (ia.a(this)) {
                this.AV.add(ia);
            }
        }
    }
    
    public void a(@NotNull final ia ia) {
        this.AU.remove(ia);
        this.AU.add(ia);
        this.lo();
        this.bb();
    }
    
    public void b(@NotNull final ia ia) {
        this.AU.remove(ia);
        this.lo();
        this.bb();
    }
    
    private void bb() {
        this.AT.getParentFile().mkdirs();
        jz.m(this.AT).ty().i(this.AU);
    }
    
    @Nullable
    public String lp() {
        final WorldClient field_71441_e = Minecraft.func_71410_x().field_71441_e;
        if (field_71441_e == null) {
            return null;
        }
        return field_71441_e.field_73011_w.func_80007_l();
    }
    
    @Nullable
    public String lq() {
        if (Minecraft.func_71410_x().func_71356_B()) {
            return null;
        }
        final ServerData func_147104_D = Minecraft.func_71410_x().func_147104_D();
        if (func_147104_D == null) {
            return null;
        }
        return func_147104_D.field_78845_b;
    }
    
    @NotNull
    public Set<ia> lr() {
        return this.AU;
    }
    
    @NotNull
    public List<ia> ls() {
        return this.AV;
    }
    
    @el(fF = @eq(fP = "waypoints", fj = "Waypoints", fk = "https://assets.feathercdn.net/game/hudselection/waypoints.svg", fQ = 0))
    public static class a extends eg
    {
        @es(fU = 0)
        public fc AX;
        @ex(fw = "waypointCreateKey", fj = "Create Waypoint", fY = "59", fo = @es(fU = 1))
        public bK AY;
        @ex(fw = "waypointMenuKey", fj = "Menu", fY = "192", fo = @es(fU = 2))
        public bK AZ;
        
        public a() {
            this.AX = new fc("Key Settings");
        }
    }
}
