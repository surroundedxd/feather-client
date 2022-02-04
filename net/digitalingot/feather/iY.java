// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.net.InetSocketAddress;
import org.capnproto.TextList;
import org.capnproto.Text;
import java.util.Iterator;
import org.capnproto.DataList;
import org.capnproto.Data;
import java.util.Collection;
import java.util.Set;
import org.capnproto.Void;
import org.capnproto.MessageBuilder;
import java.util.function.Consumer;
import java.util.ArrayList;
import io.netty.channel.Channel;
import org.jetbrains.annotations.NotNull;
import java.util.UUID;
import java.util.List;

public class iy extends iz
{
    @NotNull
    private List<UUID> Cl;
    
    iy(@NotNull final Channel channel, @NotNull final ix ix) {
        super(channel, ix);
        this.Cl = new ArrayList<UUID>();
    }
    
    public void a(final Consumer<iK.f.e.a> consumer) {
        final MessageBuilder messageBuilder = new MessageBuilder();
        consumer.accept(this.c(messageBuilder).rE().py().qm());
        this.a(messageBuilder);
    }
    
    public void a(@NotNull final String s, final short n) {
        final MessageBuilder messageBuilder = new MessageBuilder();
        final iK.f.d.a qp = this.c(messageBuilder).rE().py().qp();
        qp.aG(s);
        qp.b(n);
        this.a(messageBuilder);
    }
    
    public void mI() {
        final MessageBuilder messageBuilder = new MessageBuilder();
        this.c(messageBuilder).rE().py().d(Void.VOID);
        this.a(messageBuilder);
    }
    
    public void mJ() {
        final MessageBuilder messageBuilder = new MessageBuilder();
        this.c(messageBuilder).rH().rd().g(Void.VOID);
        this.Cl.clear();
        this.a(messageBuilder);
    }
    
    public void a(@NotNull final List<UUID> list, @NotNull final Set<UUID> set) {
        final ArrayList<UUID> c = new ArrayList<UUID>(list);
        c.removeAll(this.Cl);
        final ArrayList<Object> list2 = new ArrayList<Object>(this.Cl);
        list2.removeAll(list);
        if (list2.isEmpty() && c.isEmpty()) {
            return;
        }
        if (!c.isEmpty()) {
            final ArrayList list3 = new ArrayList<UUID>(c);
            list3.removeAll(set);
            if (!set.isEmpty()) {
                this.l((List<UUID>)list3);
            }
        }
        final MessageBuilder messageBuilder = new MessageBuilder();
        final iK.p.c.a rq = this.c(messageBuilder).rH().rd().rq();
        final DataList.Builder ab = rq.aB(c.size());
        for (int i = 0; i < c.size(); ++i) {
            ab.set(i, new Data.Reader(kx.r((UUID)c.get(i))));
        }
        final DataList.Builder ac = rq.aC(list2.size());
        for (int j = 0; j < list2.size(); ++j) {
            ac.set(j, new Data.Reader(kx.r(list2.get(j))));
        }
        this.Cl = list;
        this.a(messageBuilder);
    }
    
    public void b(@NotNull final Set<UUID> set) {
        this.qK.mD().keySet().removeIf(uuid -> !set.contains(uuid));
        set.removeAll(this.qK.mD().keySet());
        if (set.isEmpty()) {
            return;
        }
        final MessageBuilder messageBuilder = new MessageBuilder();
        final DataList.Builder ap = this.c(messageBuilder).rK().ap(set.size());
        int n = 0;
        final Iterator<UUID> iterator = set.iterator();
        while (iterator.hasNext()) {
            ap.set(n, new Data.Reader(kx.r(iterator.next())));
            ++n;
        }
        this.a(messageBuilder);
    }
    
    public void k(@NotNull final List<p> list) {
        final MessageBuilder messageBuilder = new MessageBuilder();
        final TextList.Builder ag = this.c(messageBuilder).rP().ag(list.size());
        for (int i = 0; i < list.size(); ++i) {
            ag.set(i, new Text.Reader(list.get(i).getSlug()));
        }
        this.a(messageBuilder);
    }
    
    public void l(@NotNull final List<UUID> list) {
        final MessageBuilder messageBuilder = new MessageBuilder();
        final DataList.Builder ap = this.c(messageBuilder).rN().ap(list.size());
        for (int i = 0; i < list.size(); ++i) {
            ap.set(i, new Data.Reader(kx.r(list.get(i))));
        }
        this.a(messageBuilder);
    }
    
    public void a(@NotNull final t t) {
        final MessageBuilder messageBuilder = new MessageBuilder();
        this.c(messageBuilder).rS().aE(t.getSlug());
        this.a(messageBuilder);
    }
    
    public void mK() {
        final MessageBuilder messageBuilder = new MessageBuilder();
        this.c(messageBuilder).rV();
        this.a(messageBuilder);
    }
    
    public void o(@NotNull final UUID uuid) {
        final MessageBuilder messageBuilder = new MessageBuilder();
        this.c(messageBuilder).rY().j(kx.r(uuid));
        this.a(messageBuilder);
    }
    
    public void p(@NotNull final UUID uuid) {
        final MessageBuilder messageBuilder = new MessageBuilder();
        this.c(messageBuilder).sa().j(kx.r(uuid));
        this.a(messageBuilder);
    }
    
    public void b(final int n, final boolean b) {
        final MessageBuilder messageBuilder = new MessageBuilder();
        final iK.k.a sd = this.c(messageBuilder).sd();
        sd.am(n);
        sd.u(b);
        this.a(messageBuilder);
    }
    
    public void mL() {
        final MessageBuilder messageBuilder = new MessageBuilder();
        this.c(messageBuilder).sf().qK().e(Void.VOID);
        this.a(messageBuilder);
    }
    
    public void q(@NotNull final UUID uuid) {
        final MessageBuilder messageBuilder = new MessageBuilder();
        this.c(messageBuilder).sf().qK().j(kx.r(uuid));
        this.a(messageBuilder);
    }
    
    public void a(@NotNull final iL.b b) {
        final MessageBuilder messageBuilder = new MessageBuilder();
        this.c(messageBuilder).si().qU().a(b);
        this.a(messageBuilder);
    }
    
    public void c(@NotNull final UUID uuid, @NotNull final dG.a a) {
        final MessageBuilder messageBuilder = new MessageBuilder();
        final iK.h.a sk = this.c(messageBuilder).sk();
        this.a(sk.nC(), a);
        sk.j(kx.r(uuid));
        this.a(messageBuilder);
    }
    
    public void d(@NotNull final UUID uuid, @NotNull final dG.a a) {
        final MessageBuilder messageBuilder = new MessageBuilder();
        final iK.g.a sm = this.c(messageBuilder).sm();
        this.a(sm.nC(), a);
        sm.i(kx.r(uuid));
        this.a(messageBuilder);
    }
    
    private void a(@NotNull final iL.a.a a, @NotNull final dG.a a2) {
        final InetSocketAddress em = a2.em();
        a.aL(em.getAddress().getHostAddress() + ":" + em.getPort());
        a.k(a2.ej());
    }
}
