// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.Nullable;
import java.util.Iterator;
import java.util.Collection;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.entity.EntityPlayerSP;
import java.util.Set;
import net.minecraft.client.network.NetworkPlayerInfo;
import java.util.UUID;
import java.util.HashSet;
import net.minecraft.client.Minecraft;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

public class gs
{
    @NotNull
    private final ix qK;
    @NotNull
    private final gb qD;
    @NotNull
    private final gd qG;
    private int qN;
    
    private gs(@NotNull final ix qk, @NotNull final gb qd, @NotNull final gd qg) {
        this.qK = qk;
        this.qD = qd;
        this.qG = qg;
    }
    
    @Nullable
    public static gs a(@NotNull final i i) {
        final gq gq = new gq();
        final gb gb = new gb();
        final gd gd = new gd(i);
        final ih lv = ih.lv();
        final ig ig = new ig(lv);
        final k h = i.H();
        if (h.K() == null) {
            return null;
        }
        final ix a = ix.a(gq, gb.hS().Y(), gd.hU().lC(), ig, h);
        lv.a(a);
        final gs gs = new gs(a, gb, gd);
        gb.a(gs);
        new gr(a).init();
        final gf gf = new gf(gd.hN(), a, gd);
        final ap<ad> bk = ad.bk;
        final gf obj = gf;
        Objects.requireNonNull(obj);
        bk.a(obj::a);
        final EntityPlayerSP field_71439_g;
        final ix ix;
        ab.br.a((p1, p2) -> {
            field_71439_g = Minecraft.func_71410_x().field_71439_g;
            if (field_71439_g == null) {
                ix.mD().clear();
            }
            else {
                ix.mD().keySet().removeIf(uuid -> !uuid.equals(field_71439_g.func_110124_au()));
            }
            return;
        });
        final gs gs2;
        final NetHandlerPlayClient netHandlerPlayClient;
        final Collection<NetworkPlayerInfo> collection;
        HashSet<UUID> set;
        final Iterator<NetworkPlayerInfo> iterator;
        final ix ix2;
        final iy iy;
        ao.bE.a(c -> {
            if (c != ao.c.START) {
                return;
            }
            else if (++gs2.qN != 20) {
                return;
            }
            else {
                gs2.qN = 0;
                Minecraft.func_71410_x().func_147114_u();
                if (netHandlerPlayClient == null) {
                    return;
                }
                else {
                    netHandlerPlayClient.func_175106_d();
                    set = new HashSet<UUID>(collection.size());
                    collection.iterator();
                    while (iterator.hasNext()) {
                        set.add(iterator.next().func_178845_a().getId());
                    }
                    ix2.hR();
                    if (iy != null) {
                        iy.b(set);
                    }
                    return;
                }
            }
        });
        return gs;
    }
    
    @NotNull
    public ix ia() {
        return this.qK;
    }
    
    @NotNull
    public gb ib() {
        return this.qD;
    }
    
    @NotNull
    public gd ic() {
        return this.qG;
    }
}
