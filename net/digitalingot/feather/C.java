// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.List;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import java.nio.file.Path;

public class c
{
    private static final boolean o;
    private static c p;
    @NotNull
    private final Path q;
    private final jK r;
    
    public c(@NotNull final Minecraft minecraft) {
        c.p = this;
        this.q = minecraft.field_71412_D.toPath().resolve("feather");
        this.r = new jK();
        new jL(this.r);
    }
    
    public void a(@NotNull final List<Class<? extends dW<?>>> list) {
        final bj bj = new bj(this.q.toFile());
        final eU f = this.f();
        final ea a = this.a(list, f, bj);
        final d d = new d(new ca(), a, bj, this.q.toFile(), this.q.resolve("misc").toFile(), this.g());
        final e e = new e();
        e.a(d);
        net.digitalingot.feather.e.a(e);
        bu.INSTANCE.initialize();
        a.fc();
        f.b(a.dN());
        av.aM();
        dU.INSTANCE.init();
        this.e();
        kr.Gh.info("Started Feather (" + d.g() + ")");
    }
    
    private void e() {
        final ea m = e.s().m();
        final ca l = e.s().l();
        final bj n = e.s().n();
        l.a(bV.READY_FOR_MESSAGES, (cb<bY, bY, bY>)new bc());
        l.a(bV.RECORD_KEYS, (cb<bY, bY, bY>)new bd());
        l.a(bV.PAGE_UPDATE, (cb<bY, bY, bY>)new ba());
        l.a(bV.PRESS_BUTTON, (cb<bY, bY, bY>)new bb());
        l.a(bV.UPDATE_CLIENT_PREFERENCES, (cb<bY, bY, bY>)new bn(n));
        l.a(bV.CREATE_MOD_PROFILE, (cb<bY, bY, bY>)new fj());
        l.a(bV.DELETE_MOD_PROFILE, (cb<bY, bY, bY>)new fk());
        l.a(bV.RENAME_MOD_PROFILE, (cb<bY, bY, bY>)new fn());
        l.a(bV.CLONE_MOD_PROFILE, (cb<bY, bY, bY>)new fi());
        l.a(bV.SELECT_MOD_PROFILE, (cb<bY, bY, bY>)new fo());
        l.a(bV.RESET_MOD_POSITIONS, (cb<bY, bY, bY>)new ff());
        l.a(bV.RESET_MOD_SETTINGS, (cb<bY, bY, bY>)new fg());
        l.a(bV.UPDATE_MOD_SETTINGS, (cb<bY, bY, bY>)new fh(n));
        l.a(bV.RENDER_MOD, (cb<bY, bY, bY>)new bf());
        l.a(bV.REMOVE_RENDER_MOD, (cb<bY, bY, bY>)new be());
        l.a(bV.RESET_SIDEBAR_SETTINGS, (cb<bY, bY, bY>)new fr());
        l.a(bV.UPDATE_SIDEBAR_SETTINGS, (cb<bY, bY, bY>)new fs());
        l.a(bV.DO_HUD_SELECTION, (cb<bY, bY, bY>)new aW());
        V.bk.a(s -> {
            if (s.equals("featherMods")) {
                bu.INSTANCE.show();
                aZ.d(true);
            }
            return;
        });
        aY.ah();
        bk.a(n);
        fp.a(m);
        fq.a(m);
        fd.a(m);
        fm.a(m);
        fl.a(m);
        bh.a(m);
    }
    
    @NotNull
    private ea a(@NotNull final List<Class<? extends dW<?>>> list, @NotNull final eU eu, final bj bj) {
        final ea ea = new ea(list, eu, bj);
        ea.initialize();
        return ea;
    }
    
    @NotNull
    private eU f() {
        final eU eu = new eU(this.q);
        eu.gG();
        return eu;
    }
    
    @NotNull
    private String g() {
        return jz.aO("git.hash").tv();
    }
    
    public static c h() {
        return c.p;
    }
    
    public static jK i() {
        return c.p.r;
    }
    
    public static boolean j() {
        return Minecraft.func_71410_x().func_152345_ab();
    }
    
    public static boolean k() {
        return c.o;
    }
    
    static {
        o = (System.getenv("FEATHER_TEST") != null);
    }
}
