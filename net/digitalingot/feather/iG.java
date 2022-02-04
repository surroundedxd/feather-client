// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.GuiConnecting;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.client.Minecraft;
import java.util.function.Consumer;
import java.util.concurrent.TimeUnit;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public class ig implements iE
{
    @NotNull
    private final ih Bb;
    
    public ig(@NotNull final ih bb) {
        this.Bb = bb;
    }
    
    @Override
    public void a(@NotNull final UUID uuid, @NotNull final dG.a a) {
        final ih.a a2 = this.Bb.ly().remove(uuid);
        if (a2 == null || a2.jt() - TimeUnit.MINUTES.toMillis(10L) > System.currentTimeMillis()) {
            kr.Gh.error("Received P2P Join Request from {} while it was never accepted or the request has timed out", new Object[] { uuid });
            return;
        }
        final ca l = e.s().l();
        l.b(new dD(), (Consumer<bY>)new Consumer<dG>() {
            public void a(final dG dg) {
                final ix ia = ig.this.Bb.ia();
                if (ia == null) {
                    return;
                }
                final iy hr = ia.hR();
                if (hr == null) {
                    return;
                }
                final int eg = dg.eg();
                hr.d(uuid, dg.el());
                l.b(new dE(eg, a2.ef(), a.em(), a.ej()), (Consumer<bY>)new Consumer<dH>() {
                    public void a(final dH dh) {
                        ig.this.Bb.lw().add(eg);
                    }
                }, (Consumer<bY>)null);
            }
        }, (Consumer<bY>)null);
    }
    
    @Override
    public void b(@NotNull final UUID uuid, @NotNull final dG.a a) {
        final ih.b b = this.Bb.lx().remove(uuid);
        if (b == null || b.jt() - TimeUnit.MINUTES.toMillis(10L) > System.currentTimeMillis()) {
            kr.Gh.error("Received P2P Join Accepted from {} while it was never requested or the request has timed out", new Object[] { uuid });
            return;
        }
        e.s().l().b(new dE(b.eg(), null, a.em(), a.ej()), (Consumer<bY>)new Consumer<dH>() {
            public void a(final dH dh) {
                final Integer en = dh.en();
                if (en == null) {
                    throw new NullPointerException("Client port not expected to be null when accepting P2P Join without providing server port");
                }
                ig.this.Bb.lw().add(b.eg());
                kr.Gh.info("Created local P2P tunnel - port to connect to: {}", new Object[] { en });
                final Minecraft func_71410_x = Minecraft.func_71410_x();
                final NetHandlerPlayClient func_147114_u = func_71410_x.func_147114_u();
                if (func_147114_u != null) {
                    func_147114_u.func_147298_b().func_150718_a((IChatComponent)new ChatComponentText(""));
                }
                func_71410_x.func_147108_a((GuiScreen)new GuiConnecting((GuiScreen)new GuiMainMenu(), func_71410_x, "127.0.0.1", (int)en));
            }
        }, (Consumer<bY>)null);
    }
}
