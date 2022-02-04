// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.client.network.NetHandlerPlayClient;
import org.jetbrains.annotations.Nullable;
import java.util.Iterator;
import net.minecraft.world.World;
import net.minecraft.client.entity.EntityPlayerSP;
import java.util.ArrayList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.Minecraft;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class gb
{
    private gs pI;
    @NotNull
    private final r ab;
    @NotNull
    private final Map<UUID, List<p>> qB;
    private int qC;
    
    public gb() {
        this.qB = new HashMap<UUID, List<p>>();
        this.qC = 0;
        this.ab = r.a(this);
        final ca l = e.s().l();
        l.a(bV.RESET_COSMETICS_SETTINGS, (cb<bY, bY, bY>)new J(this.ab));
        l.a(bV.UPDATE_COSMETICS, (cb<bY, bY, bY>)new K(this));
        H.b(this);
        final iy iy;
        net.digitalingot.feather.ab.br.a((p0, p1) -> {
            this.qB.keySet().removeIf(uuid -> !uuid.equals(Minecraft.func_71410_x().func_110432_I().func_148256_e().getId()));
            this.hR();
            if (iy != null) {
                iy.mJ();
            }
            return;
        });
        EntityPlayerSP field_71439_g;
        final iy iy2;
        World field_70170_p;
        final List<EntityPlayer> list2;
        ArrayList<UUID> list;
        final Iterator<EntityPlayer> iterator;
        EntityPlayer entityPlayer;
        ao.bE.a(c -> {
            if (c == ao.c.START) {
                field_71439_g = Minecraft.func_71410_x().field_71439_g;
                if (field_71439_g != null) {
                    if (++this.qC == 20) {
                        this.qC = 0;
                        this.hR();
                        if (iy2 != null) {
                            field_70170_p = field_71439_g.field_70170_p;
                            if (field_70170_p != null) {
                                field_70170_p.func_175661_b((Class)EntityPlayer.class, entityPlayer -> entityPlayer != field_71439_g);
                                list = new ArrayList<UUID>(list2.size());
                                list2.iterator();
                                while (iterator.hasNext()) {
                                    entityPlayer = iterator.next();
                                    if (entityPlayer == field_71439_g) {
                                        continue;
                                    }
                                    else {
                                        list.add(entityPlayer.func_110124_au());
                                    }
                                }
                                iy2.a(list, this.qB.keySet());
                            }
                        }
                    }
                }
            }
        });
    }
    
    public void a(@NotNull final gs pi) {
        this.pI = pi;
    }
    
    @Nullable
    public iy hR() {
        return this.pI.ia().hR();
    }
    
    @NotNull
    public r hS() {
        return this.ab;
    }
    
    @NotNull
    public Map<UUID, List<p>> hT() {
        return this.qB;
    }
}
