// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.capnproto.GeneratedClassSupport;
import org.capnproto.Data;
import org.capnproto.DataList;
import org.capnproto.Void;
import org.capnproto.TextList;
import org.capnproto.FromPointerReaderBlobDefault;
import java.nio.ByteBuffer;
import org.capnproto.FromPointerBuilderBlobDefault;
import org.capnproto.Text;
import org.capnproto.FromPointerReaderRefDefault;
import org.capnproto.FromPointerBuilder;
import org.capnproto.SetPointerBuilder;
import org.capnproto.FromPointerBuilderRefDefault;
import org.capnproto.StructBuilder;
import org.capnproto.StructReader;
import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructFactory;
import org.capnproto.StructList;
import org.capnproto.StructSize;

public final class iK
{
    public static class q
    {
        public static final StructSize Av;
        public static final b DW;
        public static final StructList.Factory<a, d> Ax;
        
        static {
            Av = new StructSize((short)1, (short)1);
            DW = new b();
            Ax = new StructList.Factory((StructFactory)q.DW);
        }
        
        public static final class b extends StructFactory<a, d>
        {
            public final d Y(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                return new d(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final a Y(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                return new a(segmentBuilder, n, n2, n3, n4);
            }
            
            public final StructSize structSize() {
                return q.Av;
            }
            
            public final d a(final a a) {
                return a.rv();
            }
        }
        
        public static final class a extends StructBuilder
        {
            a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                super(segmentBuilder, n, n2, n3, n4);
            }
            
            public final d rv() {
                return new d((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }
            
            public final c.a rw() {
                return new c.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
            }
            
            public final c.a rx() {
                this._setShortField(0, (short)0);
                this._clearPointerField(0);
                return new c.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
            }
        }
        
        public static final class d extends StructReader
        {
            d(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                super(segmentReader, n, n2, n3, n4, n5);
            }
            
            public c.c sL() {
                return new c.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
            }
        }
        
        public static class c
        {
            public static final StructSize Av;
            public static final b DX;
            public static final StructList.Factory<a, q.c.c> Ax;
            
            static {
                Av = new StructSize((short)1, (short)1);
                DX = new b();
                Ax = new StructList.Factory((StructFactory)q.c.DX);
            }
            
            public static final class b extends StructFactory<a, q.c.c>
            {
                public final q.c.c Z(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                    return new q.c.c(segmentReader, n, n2, n3, n4, n5);
                }
                
                public final a Z(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                    return new a(segmentBuilder, n, n2, n3, n4);
                }
                
                public final StructSize structSize() {
                    return q.c.Av;
                }
                
                public final q.c.c a(final a a) {
                    return a.rz();
                }
            }
            
            public static final class a extends StructBuilder
            {
                static final /* synthetic */ boolean ac;
                
                a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                    super(segmentBuilder, n, n2, n3, n4);
                }
                
                public d ry() {
                    switch (this._getShortField(0)) {
                        case 0: {
                            return d.HANDSHAKE;
                        }
                        case 1: {
                            return d.METRICS;
                        }
                        case 2: {
                            return d.TRACKING_UPDATE;
                        }
                        case 3: {
                            return d.BULK_OPTION_REQUEST;
                        }
                        case 4: {
                            return d.COSMETIC_REQUEST;
                        }
                        case 5: {
                            return d.COSMETIC_SET;
                        }
                        case 6: {
                            return d.EMOTE_EXECUTE;
                        }
                        case 7: {
                            return d.PARTY_CREATE;
                        }
                        case 8: {
                            return d.PARTY_SET_OWNER;
                        }
                        case 9: {
                            return d.PARTY_INVITE;
                        }
                        case 10: {
                            return d.PARTY_INVITE_RESPONSE;
                        }
                        case 11: {
                            return d.PARTY_LEAVE;
                        }
                        case 12: {
                            return d.PARTY_SETTINGS;
                        }
                        case 13: {
                            return d.P2P_JOIN_REQUEST;
                        }
                        case 14: {
                            return d.P2P_JOIN_ACCEPTED;
                        }
                        default: {
                            return d._NOT_IN_SCHEMA;
                        }
                    }
                }
                
                public final q.c.c rz() {
                    return new q.c.c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
                }
                
                public final boolean kY() {
                    return this.ry() == d.HANDSHAKE;
                }
                
                public final e.a rA() {
                    if (!a.ac && this.ry() != d.HANDSHAKE) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (e.a)this._getPointerField((FromPointerBuilderRefDefault)e.De, 0, (SegmentReader)null, 0);
                }
                
                public final void a(final e.c c) {
                    this._setShortField(0, (short)d.HANDSHAKE.ordinal());
                    this._setPointerField((SetPointerBuilder)e.De, 0, (Object)c);
                }
                
                public final e.a rB() {
                    this._setShortField(0, (short)d.HANDSHAKE.ordinal());
                    return (e.a)this._initPointerField((FromPointerBuilder)e.De, 0, 0);
                }
                
                public final boolean rC() {
                    return this.ry() == d.METRICS;
                }
                
                public final f.a rD() {
                    if (!a.ac && this.ry() != d.METRICS) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (f.a)this._getPointerField((FromPointerBuilderRefDefault)f.Df, 0, (SegmentReader)null, 0);
                }
                
                public final void a(final f.c c) {
                    this._setShortField(0, (short)d.METRICS.ordinal());
                    this._setPointerField((SetPointerBuilder)f.Df, 0, (Object)c);
                }
                
                public final f.a rE() {
                    this._setShortField(0, (short)d.METRICS.ordinal());
                    return (f.a)this._initPointerField((FromPointerBuilder)f.Df, 0, 0);
                }
                
                public final boolean rF() {
                    return this.ry() == d.TRACKING_UPDATE;
                }
                
                public final p.a rG() {
                    if (!a.ac && this.ry() != d.TRACKING_UPDATE) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (p.a)this._getPointerField((FromPointerBuilderRefDefault)p.DT, 0, (SegmentReader)null, 0);
                }
                
                public final void a(final p.d d) {
                    this._setShortField(0, (short)q.c.d.TRACKING_UPDATE.ordinal());
                    this._setPointerField((SetPointerBuilder)p.DT, 0, (Object)d);
                }
                
                public final p.a rH() {
                    this._setShortField(0, (short)d.TRACKING_UPDATE.ordinal());
                    return (p.a)this._initPointerField((FromPointerBuilder)p.DT, 0, 0);
                }
                
                public final boolean rI() {
                    return this.ry() == d.BULK_OPTION_REQUEST;
                }
                
                public final iK.a.a rJ() {
                    if (!a.ac && this.ry() != d.BULK_OPTION_REQUEST) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (iK.a.a)this._getPointerField((FromPointerBuilderRefDefault)iK.a.Da, 0, (SegmentReader)null, 0);
                }
                
                public final void a(final iK.a.c c) {
                    this._setShortField(0, (short)d.BULK_OPTION_REQUEST.ordinal());
                    this._setPointerField((SetPointerBuilder)iK.a.Da, 0, (Object)c);
                }
                
                public final iK.a.a rK() {
                    this._setShortField(0, (short)d.BULK_OPTION_REQUEST.ordinal());
                    return (iK.a.a)this._initPointerField((FromPointerBuilder)iK.a.Da, 0, 0);
                }
                
                public final boolean rL() {
                    return this.ry() == d.COSMETIC_REQUEST;
                }
                
                public final iK.b.a rM() {
                    if (!a.ac && this.ry() != d.COSMETIC_REQUEST) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (iK.b.a)this._getPointerField((FromPointerBuilderRefDefault)iK.b.Db, 0, (SegmentReader)null, 0);
                }
                
                public final void a(final iK.b.c c) {
                    this._setShortField(0, (short)d.COSMETIC_REQUEST.ordinal());
                    this._setPointerField((SetPointerBuilder)iK.b.Db, 0, (Object)c);
                }
                
                public final iK.b.a rN() {
                    this._setShortField(0, (short)d.COSMETIC_REQUEST.ordinal());
                    return (iK.b.a)this._initPointerField((FromPointerBuilder)iK.b.Db, 0, 0);
                }
                
                public final boolean or() {
                    return this.ry() == d.COSMETIC_SET;
                }
                
                public final iK.c.a rO() {
                    if (!a.ac && this.ry() != d.COSMETIC_SET) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (iK.c.a)this._getPointerField((FromPointerBuilderRefDefault)iK.c.Dc, 0, (SegmentReader)null, 0);
                }
                
                public final void a(final iK.c.c c) {
                    this._setShortField(0, (short)d.COSMETIC_SET.ordinal());
                    this._setPointerField((SetPointerBuilder)iK.c.Dc, 0, (Object)c);
                }
                
                public final iK.c.a rP() {
                    this._setShortField(0, (short)d.COSMETIC_SET.ordinal());
                    return (iK.c.a)this._initPointerField((FromPointerBuilder)iK.c.Dc, 0, 0);
                }
                
                public final boolean rQ() {
                    return this.ry() == d.EMOTE_EXECUTE;
                }
                
                public final iK.d.a rR() {
                    if (!a.ac && this.ry() != d.EMOTE_EXECUTE) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (iK.d.a)this._getPointerField((FromPointerBuilderRefDefault)iK.d.Dd, 0, (SegmentReader)null, 0);
                }
                
                public final void a(final iK.d.c c) {
                    this._setShortField(0, (short)d.EMOTE_EXECUTE.ordinal());
                    this._setPointerField((SetPointerBuilder)iK.d.Dd, 0, (Object)c);
                }
                
                public final iK.d.a rS() {
                    this._setShortField(0, (short)d.EMOTE_EXECUTE.ordinal());
                    return (iK.d.a)this._initPointerField((FromPointerBuilder)iK.d.Dd, 0, 0);
                }
                
                public final boolean rT() {
                    return this.ry() == d.PARTY_CREATE;
                }
                
                public final i.a rU() {
                    if (!a.ac && this.ry() != d.PARTY_CREATE) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (i.a)this._getPointerField((FromPointerBuilderRefDefault)i.Dm, 0, (SegmentReader)null, 0);
                }
                
                public final void a(final i.c c) {
                    this._setShortField(0, (short)d.PARTY_CREATE.ordinal());
                    this._setPointerField((SetPointerBuilder)i.Dm, 0, (Object)c);
                }
                
                public final i.a rV() {
                    this._setShortField(0, (short)d.PARTY_CREATE.ordinal());
                    return (i.a)this._initPointerField((FromPointerBuilder)i.Dm, 0, 0);
                }
                
                public final boolean rW() {
                    return this.ry() == d.PARTY_SET_OWNER;
                }
                
                public final m.a rX() {
                    if (!a.ac && this.ry() != d.PARTY_SET_OWNER) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (m.a)this._getPointerField((FromPointerBuilderRefDefault)m.Dr, 0, (SegmentReader)null, 0);
                }
                
                public final void a(final m.c c) {
                    this._setShortField(0, (short)d.PARTY_SET_OWNER.ordinal());
                    this._setPointerField((SetPointerBuilder)m.Dr, 0, (Object)c);
                }
                
                public final m.a rY() {
                    this._setShortField(0, (short)d.PARTY_SET_OWNER.ordinal());
                    return (m.a)this._initPointerField((FromPointerBuilder)m.Dr, 0, 0);
                }
                
                public final boolean oA() {
                    return this.ry() == d.PARTY_INVITE;
                }
                
                public final j.a rZ() {
                    if (!a.ac && this.ry() != d.PARTY_INVITE) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (j.a)this._getPointerField((FromPointerBuilderRefDefault)j.Dn, 0, (SegmentReader)null, 0);
                }
                
                public final void a(final j.c c) {
                    this._setShortField(0, (short)d.PARTY_INVITE.ordinal());
                    this._setPointerField((SetPointerBuilder)j.Dn, 0, (Object)c);
                }
                
                public final j.a sa() {
                    this._setShortField(0, (short)d.PARTY_INVITE.ordinal());
                    return (j.a)this._initPointerField((FromPointerBuilder)j.Dn, 0, 0);
                }
                
                public final boolean sb() {
                    return this.ry() == d.PARTY_INVITE_RESPONSE;
                }
                
                public final k.a sc() {
                    if (!a.ac && this.ry() != d.PARTY_INVITE_RESPONSE) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (k.a)this._getPointerField((FromPointerBuilderRefDefault)k.Do, 0, (SegmentReader)null, 0);
                }
                
                public final void a(final k.c c) {
                    this._setShortField(0, (short)d.PARTY_INVITE_RESPONSE.ordinal());
                    this._setPointerField((SetPointerBuilder)k.Do, 0, (Object)c);
                }
                
                public final k.a sd() {
                    this._setShortField(0, (short)d.PARTY_INVITE_RESPONSE.ordinal());
                    return (k.a)this._initPointerField((FromPointerBuilder)k.Do, 0, 0);
                }
                
                public final boolean oG() {
                    return this.ry() == d.PARTY_LEAVE;
                }
                
                public final l.a se() {
                    if (!a.ac && this.ry() != d.PARTY_LEAVE) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (l.a)this._getPointerField((FromPointerBuilderRefDefault)l.Dp, 0, (SegmentReader)null, 0);
                }
                
                public final void a(final l.c c) {
                    this._setShortField(0, (short)d.PARTY_LEAVE.ordinal());
                    this._setPointerField((SetPointerBuilder)l.Dp, 0, (Object)c);
                }
                
                public final l.a sf() {
                    this._setShortField(0, (short)d.PARTY_LEAVE.ordinal());
                    return (l.a)this._initPointerField((FromPointerBuilder)l.Dp, 0, 0);
                }
                
                public final boolean sg() {
                    return this.ry() == d.PARTY_SETTINGS;
                }
                
                public final n.a sh() {
                    if (!a.ac && this.ry() != d.PARTY_SETTINGS) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (n.a)this._getPointerField((FromPointerBuilderRefDefault)n.Ds, 0, (SegmentReader)null, 0);
                }
                
                public final void a(final n.c c) {
                    this._setShortField(0, (short)d.PARTY_SETTINGS.ordinal());
                    this._setPointerField((SetPointerBuilder)n.Ds, 0, (Object)c);
                }
                
                public final n.a si() {
                    this._setShortField(0, (short)d.PARTY_SETTINGS.ordinal());
                    return (n.a)this._initPointerField((FromPointerBuilder)n.Ds, 0, 0);
                }
                
                public final boolean oJ() {
                    return this.ry() == d.P2P_JOIN_REQUEST;
                }
                
                public final h.a sj() {
                    if (!a.ac && this.ry() != d.P2P_JOIN_REQUEST) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (h.a)this._getPointerField((FromPointerBuilderRefDefault)h.Dl, 0, (SegmentReader)null, 0);
                }
                
                public final void a(final h.c c) {
                    this._setShortField(0, (short)d.P2P_JOIN_REQUEST.ordinal());
                    this._setPointerField((SetPointerBuilder)h.Dl, 0, (Object)c);
                }
                
                public final h.a sk() {
                    this._setShortField(0, (short)d.P2P_JOIN_REQUEST.ordinal());
                    return (h.a)this._initPointerField((FromPointerBuilder)h.Dl, 0, 0);
                }
                
                public final boolean oM() {
                    return this.ry() == d.P2P_JOIN_ACCEPTED;
                }
                
                public final g.a sl() {
                    if (!a.ac && this.ry() != d.P2P_JOIN_ACCEPTED) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (g.a)this._getPointerField((FromPointerBuilderRefDefault)g.Dk, 0, (SegmentReader)null, 0);
                }
                
                public final void a(final g.c c) {
                    this._setShortField(0, (short)d.P2P_JOIN_ACCEPTED.ordinal());
                    this._setPointerField((SetPointerBuilder)g.Dk, 0, (Object)c);
                }
                
                public final g.a sm() {
                    this._setShortField(0, (short)d.P2P_JOIN_ACCEPTED.ordinal());
                    return (g.a)this._initPointerField((FromPointerBuilder)g.Dk, 0, 0);
                }
                
                static {
                    ac = !iK.class.desiredAssertionStatus();
                }
            }
            
            public static final class c extends StructReader
            {
                static final /* synthetic */ boolean ac;
                
                c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                    super(segmentReader, n, n2, n3, n4, n5);
                }
                
                public d ry() {
                    switch (this._getShortField(0)) {
                        case 0: {
                            return d.HANDSHAKE;
                        }
                        case 1: {
                            return d.METRICS;
                        }
                        case 2: {
                            return d.TRACKING_UPDATE;
                        }
                        case 3: {
                            return d.BULK_OPTION_REQUEST;
                        }
                        case 4: {
                            return d.COSMETIC_REQUEST;
                        }
                        case 5: {
                            return d.COSMETIC_SET;
                        }
                        case 6: {
                            return d.EMOTE_EXECUTE;
                        }
                        case 7: {
                            return d.PARTY_CREATE;
                        }
                        case 8: {
                            return d.PARTY_SET_OWNER;
                        }
                        case 9: {
                            return d.PARTY_INVITE;
                        }
                        case 10: {
                            return d.PARTY_INVITE_RESPONSE;
                        }
                        case 11: {
                            return d.PARTY_LEAVE;
                        }
                        case 12: {
                            return d.PARTY_SETTINGS;
                        }
                        case 13: {
                            return d.P2P_JOIN_REQUEST;
                        }
                        case 14: {
                            return d.P2P_JOIN_ACCEPTED;
                        }
                        default: {
                            return d._NOT_IN_SCHEMA;
                        }
                    }
                }
                
                public final boolean kY() {
                    return this.ry() == d.HANDSHAKE;
                }
                
                public boolean le() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public e.c sn() {
                    if (!c.ac && this.ry() != d.HANDSHAKE) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (e.c)this._getPointerField((FromPointerReaderRefDefault)e.De, 0, (SegmentReader)null, 0);
                }
                
                public final boolean rC() {
                    return this.ry() == d.METRICS;
                }
                
                public boolean so() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public f.c sp() {
                    if (!c.ac && this.ry() != d.METRICS) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (f.c)this._getPointerField((FromPointerReaderRefDefault)f.Df, 0, (SegmentReader)null, 0);
                }
                
                public final boolean rF() {
                    return this.ry() == d.TRACKING_UPDATE;
                }
                
                public boolean sq() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public p.d sr() {
                    if (!c.ac && this.ry() != d.TRACKING_UPDATE) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (p.d)this._getPointerField((FromPointerReaderRefDefault)p.DT, 0, (SegmentReader)null, 0);
                }
                
                public final boolean rI() {
                    return this.ry() == d.BULK_OPTION_REQUEST;
                }
                
                public boolean ss() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public iK.a.c st() {
                    if (!c.ac && this.ry() != d.BULK_OPTION_REQUEST) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (iK.a.c)this._getPointerField((FromPointerReaderRefDefault)iK.a.Da, 0, (SegmentReader)null, 0);
                }
                
                public final boolean rL() {
                    return this.ry() == d.COSMETIC_REQUEST;
                }
                
                public boolean su() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public iK.b.c sv() {
                    if (!c.ac && this.ry() != d.COSMETIC_REQUEST) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (iK.b.c)this._getPointerField((FromPointerReaderRefDefault)iK.b.Db, 0, (SegmentReader)null, 0);
                }
                
                public final boolean or() {
                    return this.ry() == d.COSMETIC_SET;
                }
                
                public boolean oX() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public iK.c.c sw() {
                    if (!c.ac && this.ry() != d.COSMETIC_SET) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (iK.c.c)this._getPointerField((FromPointerReaderRefDefault)iK.c.Dc, 0, (SegmentReader)null, 0);
                }
                
                public final boolean rQ() {
                    return this.ry() == d.EMOTE_EXECUTE;
                }
                
                public boolean sx() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public iK.d.c sy() {
                    if (!c.ac && this.ry() != d.EMOTE_EXECUTE) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (iK.d.c)this._getPointerField((FromPointerReaderRefDefault)iK.d.Dd, 0, (SegmentReader)null, 0);
                }
                
                public final boolean rT() {
                    return this.ry() == d.PARTY_CREATE;
                }
                
                public boolean sz() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public i.c sA() {
                    if (!c.ac && this.ry() != d.PARTY_CREATE) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (i.c)this._getPointerField((FromPointerReaderRefDefault)i.Dm, 0, (SegmentReader)null, 0);
                }
                
                public final boolean rW() {
                    return this.ry() == d.PARTY_SET_OWNER;
                }
                
                public boolean sB() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public m.c sC() {
                    if (!c.ac && this.ry() != d.PARTY_SET_OWNER) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (m.c)this._getPointerField((FromPointerReaderRefDefault)m.Dr, 0, (SegmentReader)null, 0);
                }
                
                public final boolean oA() {
                    return this.ry() == d.PARTY_INVITE;
                }
                
                public boolean pd() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public j.c sD() {
                    if (!c.ac && this.ry() != d.PARTY_INVITE) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (j.c)this._getPointerField((FromPointerReaderRefDefault)j.Dn, 0, (SegmentReader)null, 0);
                }
                
                public final boolean sb() {
                    return this.ry() == d.PARTY_INVITE_RESPONSE;
                }
                
                public boolean sE() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public k.c sF() {
                    if (!c.ac && this.ry() != d.PARTY_INVITE_RESPONSE) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (k.c)this._getPointerField((FromPointerReaderRefDefault)k.Do, 0, (SegmentReader)null, 0);
                }
                
                public final boolean oG() {
                    return this.ry() == d.PARTY_LEAVE;
                }
                
                public boolean ph() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public l.c sG() {
                    if (!c.ac && this.ry() != d.PARTY_LEAVE) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (l.c)this._getPointerField((FromPointerReaderRefDefault)l.Dp, 0, (SegmentReader)null, 0);
                }
                
                public final boolean sg() {
                    return this.ry() == d.PARTY_SETTINGS;
                }
                
                public boolean sH() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public n.c sI() {
                    if (!c.ac && this.ry() != d.PARTY_SETTINGS) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (n.c)this._getPointerField((FromPointerReaderRefDefault)n.Ds, 0, (SegmentReader)null, 0);
                }
                
                public final boolean oJ() {
                    return this.ry() == d.P2P_JOIN_REQUEST;
                }
                
                public boolean pj() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public h.c sJ() {
                    if (!c.ac && this.ry() != d.P2P_JOIN_REQUEST) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (h.c)this._getPointerField((FromPointerReaderRefDefault)h.Dl, 0, (SegmentReader)null, 0);
                }
                
                public final boolean oM() {
                    return this.ry() == d.P2P_JOIN_ACCEPTED;
                }
                
                public boolean pl() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public g.c sK() {
                    if (!c.ac && this.ry() != d.P2P_JOIN_ACCEPTED) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (g.c)this._getPointerField((FromPointerReaderRefDefault)g.Dk, 0, (SegmentReader)null, 0);
                }
                
                static {
                    ac = !iK.class.desiredAssertionStatus();
                }
            }
            
            public enum d
            {
                HANDSHAKE, 
                METRICS, 
                TRACKING_UPDATE, 
                BULK_OPTION_REQUEST, 
                COSMETIC_REQUEST, 
                COSMETIC_SET, 
                EMOTE_EXECUTE, 
                PARTY_CREATE, 
                PARTY_SET_OWNER, 
                PARTY_INVITE, 
                PARTY_INVITE_RESPONSE, 
                PARTY_LEAVE, 
                PARTY_SETTINGS, 
                P2P_JOIN_REQUEST, 
                P2P_JOIN_ACCEPTED, 
                _NOT_IN_SCHEMA;
                
                private static /* synthetic */ d[] $values() {
                    return new d[] { d.HANDSHAKE, d.METRICS, d.TRACKING_UPDATE, d.BULK_OPTION_REQUEST, d.COSMETIC_REQUEST, d.COSMETIC_SET, d.EMOTE_EXECUTE, d.PARTY_CREATE, d.PARTY_SET_OWNER, d.PARTY_INVITE, d.PARTY_INVITE_RESPONSE, d.PARTY_LEAVE, d.PARTY_SETTINGS, d.P2P_JOIN_REQUEST, d.P2P_JOIN_ACCEPTED, d._NOT_IN_SCHEMA };
                }
                
                static {
                    $VALUES = $values();
                }
            }
        }
    }
    
    public static class e
    {
        public static final StructSize Av;
        public static final b De;
        public static final StructList.Factory<a, c> Ax;
        
        static {
            Av = new StructSize((short)0, (short)1);
            De = new b();
            Ax = new StructList.Factory((StructFactory)e.De);
        }
        
        public static final class b extends StructFactory<a, c>
        {
            public final c F(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                return new c(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final a F(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                return new a(segmentBuilder, n, n2, n3, n4);
            }
            
            public final StructSize structSize() {
                return e.Av;
            }
            
            public final c a(final a a) {
                return a.pv();
            }
        }
        
        public static final class a extends StructBuilder
        {
            a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                super(segmentBuilder, n, n2, n3, n4);
            }
            
            public final c pv() {
                return new c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }
            
            public final boolean kM() {
                return !this._pointerFieldIsNull(0);
            }
            
            public final Text.Builder kN() {
                return (Text.Builder)this._getPointerField((FromPointerBuilderBlobDefault)Text.factory, 0, (ByteBuffer)null, 0, 0);
            }
            
            public final void a(final Text.Reader reader) {
                this._setPointerField((SetPointerBuilder)Text.factory, 0, (Object)reader);
            }
            
            public final void av(final String s) {
                this._setPointerField((SetPointerBuilder)Text.factory, 0, (Object)new Text.Reader(s));
            }
            
            public final Text.Builder X(final int n) {
                return (Text.Builder)this._initPointerField((FromPointerBuilder)Text.factory, 0, n);
            }
        }
        
        public static final class c extends StructReader
        {
            c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                super(segmentReader, n, n2, n3, n4, n5);
            }
            
            public boolean kM() {
                return !this._pointerFieldIsNull(0);
            }
            
            public Text.Reader kO() {
                return (Text.Reader)this._getPointerField((FromPointerReaderBlobDefault)Text.factory, 0, (ByteBuffer)null, 0, 0);
            }
        }
    }
    
    public static class f
    {
        public static final StructSize Av;
        public static final b Df;
        public static final StructList.Factory<a, c> Ax;
        
        static {
            Av = new StructSize((short)1, (short)1);
            Df = new b();
            Ax = new StructList.Factory((StructFactory)iK.f.Df);
        }
        
        public static final class b extends StructFactory<a, c>
        {
            public final c G(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                return new c(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final a G(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                return new a(segmentBuilder, n, n2, n3, n4);
            }
            
            public final StructSize structSize() {
                return iK.f.Av;
            }
            
            public final c a(final a a) {
                return a.pw();
            }
        }
        
        public static final class a extends StructBuilder
        {
            a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                super(segmentBuilder, n, n2, n3, n4);
            }
            
            public final c pw() {
                return new c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }
            
            public final iK.f.f.a px() {
                return new iK.f.f.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
            }
            
            public final iK.f.f.a py() {
                this._setShortField(0, (short)0);
                this._clearPointerField(0);
                return new iK.f.f.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
            }
        }
        
        public static final class c extends StructReader
        {
            c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                super(segmentReader, n, n2, n3, n4, n5);
            }
            
            public iK.f.f.c pz() {
                return new iK.f.f.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
            }
        }
        
        public static class e
        {
            public static final StructSize Av;
            public static final b Dh;
            public static final StructList.Factory<a, d> Ax;
            
            static {
                Av = new StructSize((short)0, (short)5);
                Dh = new b();
                Ax = new StructList.Factory((StructFactory)e.Dh);
            }
            
            public static final class b extends StructFactory<a, d>
            {
                public final d I(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                    return new d(segmentReader, n, n2, n3, n4, n5);
                }
                
                public final a I(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                    return new a(segmentBuilder, n, n2, n3, n4);
                }
                
                public final StructSize structSize() {
                    return e.Av;
                }
                
                public final d f(final a a) {
                    return a.pF();
                }
            }
            
            public static final class a extends StructBuilder
            {
                a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                    super(segmentBuilder, n, n2, n3, n4);
                }
                
                public final d pF() {
                    return new d((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
                }
                
                public final c.a pG() {
                    return (c.a)this._getPointerField((FromPointerBuilderRefDefault)c.Di, 0, (SegmentReader)null, 0);
                }
                
                public final void a(final c.c c) {
                    this._setPointerField((SetPointerBuilder)e.c.Di, 0, (Object)c);
                }
                
                public final c.a pH() {
                    return (c.a)this._initPointerField((FromPointerBuilder)c.Di, 0, 0);
                }
                
                public final boolean pI() {
                    return !this._pointerFieldIsNull(1);
                }
                
                public final Text.Builder pJ() {
                    return (Text.Builder)this._getPointerField((FromPointerBuilderBlobDefault)Text.factory, 1, (ByteBuffer)null, 0, 0);
                }
                
                public final void e(final Text.Reader reader) {
                    this._setPointerField((SetPointerBuilder)Text.factory, 1, (Object)reader);
                }
                
                public final void aH(final String s) {
                    this._setPointerField((SetPointerBuilder)Text.factory, 1, (Object)new Text.Reader(s));
                }
                
                public final Text.Builder ar(final int n) {
                    return (Text.Builder)this._initPointerField((FromPointerBuilder)Text.factory, 1, n);
                }
                
                public final boolean pK() {
                    return !this._pointerFieldIsNull(2);
                }
                
                public final TextList.Builder pL() {
                    return (TextList.Builder)this._getPointerField((FromPointerBuilderRefDefault)TextList.factory, 2, (SegmentReader)null, 0);
                }
                
                public final void b(final TextList.Reader reader) {
                    this._setPointerField((SetPointerBuilder)TextList.factory, 2, (Object)reader);
                }
                
                public final TextList.Builder as(final int n) {
                    return (TextList.Builder)this._initPointerField((FromPointerBuilder)TextList.factory, 2, n);
                }
                
                public final boolean pM() {
                    return !this._pointerFieldIsNull(3);
                }
                
                public final TextList.Builder pN() {
                    return (TextList.Builder)this._getPointerField((FromPointerBuilderRefDefault)TextList.factory, 3, (SegmentReader)null, 0);
                }
                
                public final void c(final TextList.Reader reader) {
                    this._setPointerField((SetPointerBuilder)TextList.factory, 3, (Object)reader);
                }
                
                public final TextList.Builder at(final int n) {
                    return (TextList.Builder)this._initPointerField((FromPointerBuilder)TextList.factory, 3, n);
                }
                
                public final boolean pO() {
                    return !this._pointerFieldIsNull(4);
                }
                
                public final TextList.Builder pP() {
                    return (TextList.Builder)this._getPointerField((FromPointerBuilderRefDefault)TextList.factory, 4, (SegmentReader)null, 0);
                }
                
                public final void d(final TextList.Reader reader) {
                    this._setPointerField((SetPointerBuilder)TextList.factory, 4, (Object)reader);
                }
                
                public final TextList.Builder au(final int n) {
                    return (TextList.Builder)this._initPointerField((FromPointerBuilder)TextList.factory, 4, n);
                }
            }
            
            public static final class d extends StructReader
            {
                d(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                    super(segmentReader, n, n2, n3, n4, n5);
                }
                
                public boolean qc() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public c.c qd() {
                    return (c.c)this._getPointerField((FromPointerReaderRefDefault)c.Di, 0, (SegmentReader)null, 0);
                }
                
                public boolean pI() {
                    return !this._pointerFieldIsNull(1);
                }
                
                public Text.Reader qe() {
                    return (Text.Reader)this._getPointerField((FromPointerReaderBlobDefault)Text.factory, 1, (ByteBuffer)null, 0, 0);
                }
                
                public final boolean pK() {
                    return !this._pointerFieldIsNull(2);
                }
                
                public final TextList.Reader qf() {
                    return (TextList.Reader)this._getPointerField((FromPointerReaderRefDefault)TextList.factory, 2, (SegmentReader)null, 0);
                }
                
                public final boolean pM() {
                    return !this._pointerFieldIsNull(3);
                }
                
                public final TextList.Reader qg() {
                    return (TextList.Reader)this._getPointerField((FromPointerReaderRefDefault)TextList.factory, 3, (SegmentReader)null, 0);
                }
                
                public final boolean pO() {
                    return !this._pointerFieldIsNull(4);
                }
                
                public final TextList.Reader qh() {
                    return (TextList.Reader)this._getPointerField((FromPointerReaderRefDefault)TextList.factory, 4, (SegmentReader)null, 0);
                }
            }
            
            public static class c
            {
                public static final StructSize Av;
                public static final b Di;
                public static final StructList.Factory<a, e.c.c> Ax;
                
                static {
                    Av = new StructSize((short)1, (short)3);
                    Di = new b();
                    Ax = new StructList.Factory((StructFactory)e.c.Di);
                }
                
                public static final class b extends StructFactory<a, e.c.c>
                {
                    public final e.c.c J(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                        return new e.c.c(segmentReader, n, n2, n3, n4, n5);
                    }
                    
                    public final a J(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                        return new a(segmentBuilder, n, n2, n3, n4);
                    }
                    
                    public final StructSize structSize() {
                        return e.c.Av;
                    }
                    
                    public final e.c.c a(final a a) {
                        return a.pQ();
                    }
                }
                
                public static final class a extends StructBuilder
                {
                    a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                        super(segmentBuilder, n, n2, n3, n4);
                    }
                    
                    public final e.c.c pQ() {
                        return new e.c.c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
                    }
                    
                    public final boolean pR() {
                        return !this._pointerFieldIsNull(0);
                    }
                    
                    public final Text.Builder pS() {
                        return (Text.Builder)this._getPointerField((FromPointerBuilderBlobDefault)Text.factory, 0, (ByteBuffer)null, 0, 0);
                    }
                    
                    public final void f(final Text.Reader reader) {
                        this._setPointerField((SetPointerBuilder)Text.factory, 0, (Object)reader);
                    }
                    
                    public final void aI(final String s) {
                        this._setPointerField((SetPointerBuilder)Text.factory, 0, (Object)new Text.Reader(s));
                    }
                    
                    public final Text.Builder av(final int n) {
                        return (Text.Builder)this._initPointerField((FromPointerBuilder)Text.factory, 0, n);
                    }
                    
                    public final short pT() {
                        return this._getShortField(0);
                    }
                    
                    public final void c(final short n) {
                        this._setShortField(0, n);
                    }
                    
                    public final int pU() {
                        return this._getIntField(1);
                    }
                    
                    public final void aw(final int n) {
                        this._setIntField(1, n);
                    }
                    
                    public final boolean pV() {
                        return !this._pointerFieldIsNull(1);
                    }
                    
                    public final Text.Builder pW() {
                        return (Text.Builder)this._getPointerField((FromPointerBuilderBlobDefault)Text.factory, 1, (ByteBuffer)null, 0, 0);
                    }
                    
                    public final void g(final Text.Reader reader) {
                        this._setPointerField((SetPointerBuilder)Text.factory, 1, (Object)reader);
                    }
                    
                    public final void aJ(final String s) {
                        this._setPointerField((SetPointerBuilder)Text.factory, 1, (Object)new Text.Reader(s));
                    }
                    
                    public final Text.Builder ax(final int n) {
                        return (Text.Builder)this._initPointerField((FromPointerBuilder)Text.factory, 1, n);
                    }
                    
                    public final boolean pX() {
                        return !this._pointerFieldIsNull(2);
                    }
                    
                    public final Text.Builder pY() {
                        return (Text.Builder)this._getPointerField((FromPointerBuilderBlobDefault)Text.factory, 2, (ByteBuffer)null, 0, 0);
                    }
                    
                    public final void h(final Text.Reader reader) {
                        this._setPointerField((SetPointerBuilder)Text.factory, 2, (Object)reader);
                    }
                    
                    public final void aK(final String s) {
                        this._setPointerField((SetPointerBuilder)Text.factory, 2, (Object)new Text.Reader(s));
                    }
                    
                    public final Text.Builder ay(final int n) {
                        return (Text.Builder)this._initPointerField((FromPointerBuilder)Text.factory, 2, n);
                    }
                }
                
                public static final class c extends StructReader
                {
                    c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                        super(segmentReader, n, n2, n3, n4, n5);
                    }
                    
                    public boolean pR() {
                        return !this._pointerFieldIsNull(0);
                    }
                    
                    public Text.Reader pZ() {
                        return (Text.Reader)this._getPointerField((FromPointerReaderBlobDefault)Text.factory, 0, (ByteBuffer)null, 0, 0);
                    }
                    
                    public final short pT() {
                        return this._getShortField(0);
                    }
                    
                    public final int pU() {
                        return this._getIntField(1);
                    }
                    
                    public boolean pV() {
                        return !this._pointerFieldIsNull(1);
                    }
                    
                    public Text.Reader qa() {
                        return (Text.Reader)this._getPointerField((FromPointerReaderBlobDefault)Text.factory, 1, (ByteBuffer)null, 0, 0);
                    }
                    
                    public boolean pX() {
                        return !this._pointerFieldIsNull(2);
                    }
                    
                    public Text.Reader qb() {
                        return (Text.Reader)this._getPointerField((FromPointerReaderBlobDefault)Text.factory, 2, (ByteBuffer)null, 0, 0);
                    }
                }
            }
        }
        
        public static class d
        {
            public static final StructSize Av;
            public static final b Dg;
            public static final StructList.Factory<a, c> Ax;
            
            static {
                Av = new StructSize((short)1, (short)1);
                Dg = new b();
                Ax = new StructList.Factory((StructFactory)d.Dg);
            }
            
            public static final class b extends StructFactory<a, c>
            {
                public final c H(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                    return new c(segmentReader, n, n2, n3, n4, n5);
                }
                
                public final a H(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                    return new a(segmentBuilder, n, n2, n3, n4);
                }
                
                public final StructSize structSize() {
                    return d.Av;
                }
                
                public final c a(final a a) {
                    return a.pA();
                }
            }
            
            public static final class a extends StructBuilder
            {
                a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                    super(segmentBuilder, n, n2, n3, n4);
                }
                
                public final c pA() {
                    return new c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
                }
                
                public final boolean pB() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public final Text.Builder pC() {
                    return (Text.Builder)this._getPointerField((FromPointerBuilderBlobDefault)Text.factory, 0, (ByteBuffer)null, 0, 0);
                }
                
                public final void d(final Text.Reader reader) {
                    this._setPointerField((SetPointerBuilder)Text.factory, 0, (Object)reader);
                }
                
                public final void aG(final String s) {
                    this._setPointerField((SetPointerBuilder)Text.factory, 0, (Object)new Text.Reader(s));
                }
                
                public final Text.Builder aq(final int n) {
                    return (Text.Builder)this._initPointerField((FromPointerBuilder)Text.factory, 0, n);
                }
                
                public final short pD() {
                    return this._getShortField(0);
                }
                
                public final void b(final short n) {
                    this._setShortField(0, n);
                }
            }
            
            public static final class c extends StructReader
            {
                c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                    super(segmentReader, n, n2, n3, n4, n5);
                }
                
                public boolean pB() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public Text.Reader pE() {
                    return (Text.Reader)this._getPointerField((FromPointerReaderBlobDefault)Text.factory, 0, (ByteBuffer)null, 0, 0);
                }
                
                public final short pD() {
                    return this._getShortField(0);
                }
            }
        }
        
        public static class f
        {
            public static final StructSize Av;
            public static final b Dj;
            public static final StructList.Factory<a, c> Ax;
            
            static {
                Av = new StructSize((short)1, (short)1);
                Dj = new b();
                Ax = new StructList.Factory((StructFactory)f.Dj);
            }
            
            public static final class b extends StructFactory<a, c>
            {
                public final c K(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                    return new c(segmentReader, n, n2, n3, n4, n5);
                }
                
                public final a K(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                    return new a(segmentBuilder, n, n2, n3, n4);
                }
                
                public final StructSize structSize() {
                    return f.Av;
                }
                
                public final c a(final a a) {
                    return a.qj();
                }
            }
            
            public static final class a extends StructBuilder
            {
                static final /* synthetic */ boolean ac;
                
                a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                    super(segmentBuilder, n, n2, n3, n4);
                }
                
                public d qi() {
                    switch (this._getShortField(0)) {
                        case 0: {
                            return d.START_METRICS;
                        }
                        case 1: {
                            return d.SERVER_JOIN;
                        }
                        case 2: {
                            return d.SERVER_QUIT;
                        }
                        default: {
                            return d._NOT_IN_SCHEMA;
                        }
                    }
                }
                
                public final c qj() {
                    return new c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
                }
                
                public final boolean qk() {
                    return this.qi() == d.START_METRICS;
                }
                
                public final e.a ql() {
                    if (!a.ac && this.qi() != d.START_METRICS) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (e.a)this._getPointerField((FromPointerBuilderRefDefault)e.Dh, 0, (SegmentReader)null, 0);
                }
                
                public final void a(final e.d d) {
                    this._setShortField(0, (short)f.d.START_METRICS.ordinal());
                    this._setPointerField((SetPointerBuilder)e.Dh, 0, (Object)d);
                }
                
                public final e.a qm() {
                    this._setShortField(0, (short)d.START_METRICS.ordinal());
                    return (e.a)this._initPointerField((FromPointerBuilder)e.Dh, 0, 0);
                }
                
                public final boolean qn() {
                    return this.qi() == d.SERVER_JOIN;
                }
                
                public final iK.f.d.a qo() {
                    if (!a.ac && this.qi() != d.SERVER_JOIN) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (iK.f.d.a)this._getPointerField((FromPointerBuilderRefDefault)iK.f.d.Dg, 0, (SegmentReader)null, 0);
                }
                
                public final void a(final iK.f.d.c c) {
                    this._setShortField(0, (short)d.SERVER_JOIN.ordinal());
                    this._setPointerField((SetPointerBuilder)iK.f.d.Dg, 0, (Object)c);
                }
                
                public final iK.f.d.a qp() {
                    this._setShortField(0, (short)d.SERVER_JOIN.ordinal());
                    return (iK.f.d.a)this._initPointerField((FromPointerBuilder)iK.f.d.Dg, 0, 0);
                }
                
                public final boolean qq() {
                    return this.qi() == d.SERVER_QUIT;
                }
                
                public final Void qr() {
                    if (!a.ac && this.qi() != d.SERVER_QUIT) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return Void.VOID;
                }
                
                public final void d(final Void void1) {
                    this._setShortField(0, (short)d.SERVER_QUIT.ordinal());
                }
                
                static {
                    ac = !iK.class.desiredAssertionStatus();
                }
            }
            
            public static final class c extends StructReader
            {
                static final /* synthetic */ boolean ac;
                
                c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                    super(segmentReader, n, n2, n3, n4, n5);
                }
                
                public d qi() {
                    switch (this._getShortField(0)) {
                        case 0: {
                            return d.START_METRICS;
                        }
                        case 1: {
                            return d.SERVER_JOIN;
                        }
                        case 2: {
                            return d.SERVER_QUIT;
                        }
                        default: {
                            return d._NOT_IN_SCHEMA;
                        }
                    }
                }
                
                public final boolean qk() {
                    return this.qi() == d.START_METRICS;
                }
                
                public boolean qs() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public e.d qt() {
                    if (!c.ac && this.qi() != d.START_METRICS) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (e.d)this._getPointerField((FromPointerReaderRefDefault)e.Dh, 0, (SegmentReader)null, 0);
                }
                
                public final boolean qn() {
                    return this.qi() == d.SERVER_JOIN;
                }
                
                public boolean qu() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public iK.f.d.c qv() {
                    if (!c.ac && this.qi() != d.SERVER_JOIN) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (iK.f.d.c)this._getPointerField((FromPointerReaderRefDefault)iK.f.d.Dg, 0, (SegmentReader)null, 0);
                }
                
                public final boolean qq() {
                    return this.qi() == d.SERVER_QUIT;
                }
                
                public final Void qr() {
                    if (!c.ac && this.qi() != d.SERVER_QUIT) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return Void.VOID;
                }
                
                static {
                    ac = !iK.class.desiredAssertionStatus();
                }
            }
            
            public enum d
            {
                START_METRICS, 
                SERVER_JOIN, 
                SERVER_QUIT, 
                _NOT_IN_SCHEMA;
                
                private static /* synthetic */ d[] $values() {
                    return new d[] { d.START_METRICS, d.SERVER_JOIN, d.SERVER_QUIT, d._NOT_IN_SCHEMA };
                }
                
                static {
                    $VALUES = $values();
                }
            }
        }
    }
    
    public static class p
    {
        public static final StructSize Av;
        public static final b DT;
        public static final StructList.Factory<a, d> Ax;
        
        static {
            Av = new StructSize((short)1, (short)1);
            DT = new b();
            Ax = new StructList.Factory((StructFactory)p.DT);
        }
        
        public static final class b extends StructFactory<a, d>
        {
            public final d V(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                return new d(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final a V(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                return new a(segmentBuilder, n, n2, n3, n4);
            }
            
            public final StructSize structSize() {
                return p.Av;
            }
            
            public final d a(final a a) {
                return a.rb();
            }
        }
        
        public static final class a extends StructBuilder
        {
            a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                super(segmentBuilder, n, n2, n3, n4);
            }
            
            public final d rb() {
                return new d((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }
            
            public final e.a rc() {
                return new e.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
            }
            
            public final e.a rd() {
                this._setShortField(0, (short)0);
                this._clearPointerField(0);
                return new e.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
            }
        }
        
        public static final class d extends StructReader
        {
            d(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                super(segmentReader, n, n2, n3, n4, n5);
            }
            
            public e.c rl() {
                return new e.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
            }
        }
        
        public static class c
        {
            public static final StructSize Av;
            public static final b DU;
            public static final StructList.Factory<a, p.c.c> Ax;
            
            static {
                Av = new StructSize((short)0, (short)2);
                DU = new b();
                Ax = new StructList.Factory((StructFactory)p.c.DU);
            }
            
            public static final class b extends StructFactory<a, p.c.c>
            {
                public final p.c.c W(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                    return new p.c.c(segmentReader, n, n2, n3, n4, n5);
                }
                
                public final a W(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                    return new a(segmentBuilder, n, n2, n3, n4);
                }
                
                public final StructSize structSize() {
                    return p.c.Av;
                }
                
                public final p.c.c a(final a a) {
                    return a.re();
                }
            }
            
            public static final class a extends StructBuilder
            {
                a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                    super(segmentBuilder, n, n2, n3, n4);
                }
                
                public final p.c.c re() {
                    return new p.c.c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
                }
                
                public final boolean rf() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public final DataList.Builder rg() {
                    return (DataList.Builder)this._getPointerField((FromPointerBuilderRefDefault)DataList.factory, 0, (SegmentReader)null, 0);
                }
                
                public final void d(final DataList.Reader reader) {
                    this._setPointerField((SetPointerBuilder)DataList.factory, 0, (Object)reader);
                }
                
                public final DataList.Builder aB(final int n) {
                    return (DataList.Builder)this._initPointerField((FromPointerBuilder)DataList.factory, 0, n);
                }
                
                public final boolean rh() {
                    return !this._pointerFieldIsNull(1);
                }
                
                public final DataList.Builder ri() {
                    return (DataList.Builder)this._getPointerField((FromPointerBuilderRefDefault)DataList.factory, 1, (SegmentReader)null, 0);
                }
                
                public final void e(final DataList.Reader reader) {
                    this._setPointerField((SetPointerBuilder)DataList.factory, 1, (Object)reader);
                }
                
                public final DataList.Builder aC(final int n) {
                    return (DataList.Builder)this._initPointerField((FromPointerBuilder)DataList.factory, 1, n);
                }
            }
            
            public static final class c extends StructReader
            {
                c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                    super(segmentReader, n, n2, n3, n4, n5);
                }
                
                public final boolean rf() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public final DataList.Reader rj() {
                    return (DataList.Reader)this._getPointerField((FromPointerReaderRefDefault)DataList.factory, 0, (SegmentReader)null, 0);
                }
                
                public final boolean rh() {
                    return !this._pointerFieldIsNull(1);
                }
                
                public final DataList.Reader rk() {
                    return (DataList.Reader)this._getPointerField((FromPointerReaderRefDefault)DataList.factory, 1, (SegmentReader)null, 0);
                }
            }
        }
        
        public static class e
        {
            public static final StructSize Av;
            public static final b DV;
            public static final StructList.Factory<a, c> Ax;
            
            static {
                Av = new StructSize((short)1, (short)1);
                DV = new b();
                Ax = new StructList.Factory((StructFactory)e.DV);
            }
            
            public static final class b extends StructFactory<a, c>
            {
                public final c X(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                    return new c(segmentReader, n, n2, n3, n4, n5);
                }
                
                public final a X(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                    return new a(segmentBuilder, n, n2, n3, n4);
                }
                
                public final StructSize structSize() {
                    return e.Av;
                }
                
                public final c a(final a a) {
                    return a.rn();
                }
            }
            
            public static final class a extends StructBuilder
            {
                static final /* synthetic */ boolean ac;
                
                a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                    super(segmentBuilder, n, n2, n3, n4);
                }
                
                public d rm() {
                    switch (this._getShortField(0)) {
                        case 0: {
                            return d.LIST_UPDATE;
                        }
                        case 1: {
                            return d.REMOVE_ALL;
                        }
                        default: {
                            return d._NOT_IN_SCHEMA;
                        }
                    }
                }
                
                public final c rn() {
                    return new c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
                }
                
                public final boolean ro() {
                    return this.rm() == d.LIST_UPDATE;
                }
                
                public final p.c.a rp() {
                    if (!a.ac && this.rm() != d.LIST_UPDATE) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (p.c.a)this._getPointerField((FromPointerBuilderRefDefault)p.c.DU, 0, (SegmentReader)null, 0);
                }
                
                public final void a(final p.c.c c) {
                    this._setShortField(0, (short)d.LIST_UPDATE.ordinal());
                    this._setPointerField((SetPointerBuilder)p.c.DU, 0, (Object)c);
                }
                
                public final p.c.a rq() {
                    this._setShortField(0, (short)d.LIST_UPDATE.ordinal());
                    return (p.c.a)this._initPointerField((FromPointerBuilder)p.c.DU, 0, 0);
                }
                
                public final boolean rr() {
                    return this.rm() == d.REMOVE_ALL;
                }
                
                public final Void rs() {
                    if (!a.ac && this.rm() != d.REMOVE_ALL) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return Void.VOID;
                }
                
                public final void g(final Void void1) {
                    this._setShortField(0, (short)d.REMOVE_ALL.ordinal());
                }
                
                static {
                    ac = !iK.class.desiredAssertionStatus();
                }
            }
            
            public static final class c extends StructReader
            {
                static final /* synthetic */ boolean ac;
                
                c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                    super(segmentReader, n, n2, n3, n4, n5);
                }
                
                public d rm() {
                    switch (this._getShortField(0)) {
                        case 0: {
                            return d.LIST_UPDATE;
                        }
                        case 1: {
                            return d.REMOVE_ALL;
                        }
                        default: {
                            return d._NOT_IN_SCHEMA;
                        }
                    }
                }
                
                public final boolean ro() {
                    return this.rm() == d.LIST_UPDATE;
                }
                
                public boolean rt() {
                    return !this._pointerFieldIsNull(0);
                }
                
                public p.c.c ru() {
                    if (!c.ac && this.rm() != d.LIST_UPDATE) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return (p.c.c)this._getPointerField((FromPointerReaderRefDefault)p.c.DU, 0, (SegmentReader)null, 0);
                }
                
                public final boolean rr() {
                    return this.rm() == d.REMOVE_ALL;
                }
                
                public final Void rs() {
                    if (!c.ac && this.rm() != d.REMOVE_ALL) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return Void.VOID;
                }
                
                static {
                    ac = !iK.class.desiredAssertionStatus();
                }
            }
            
            public enum d
            {
                LIST_UPDATE, 
                REMOVE_ALL, 
                _NOT_IN_SCHEMA;
                
                private static /* synthetic */ d[] $values() {
                    return new d[] { d.LIST_UPDATE, d.REMOVE_ALL, d._NOT_IN_SCHEMA };
                }
                
                static {
                    $VALUES = $values();
                }
            }
        }
    }
    
    public static class a
    {
        public static final StructSize Av;
        public static final b Da;
        public static final StructList.Factory<iK.a.a, c> Ax;
        
        static {
            Av = new StructSize((short)0, (short)1);
            Da = new b();
            Ax = new StructList.Factory((StructFactory)iK.a.Da);
        }
        
        public static final class b extends StructFactory<iK.a.a, c>
        {
            public final c B(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                return new c(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final iK.a.a B(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                return new iK.a.a(segmentBuilder, n, n2, n3, n4);
            }
            
            public final StructSize structSize() {
                return iK.a.Av;
            }
            
            public final c a(final iK.a.a a) {
                return a.po();
            }
        }
        
        public static final class a extends StructBuilder
        {
            a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                super(segmentBuilder, n, n2, n3, n4);
            }
            
            public final c po() {
                return new c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }
            
            public final boolean pp() {
                return !this._pointerFieldIsNull(0);
            }
            
            public final DataList.Builder pq() {
                return (DataList.Builder)this._getPointerField((FromPointerBuilderRefDefault)DataList.factory, 0, (SegmentReader)null, 0);
            }
            
            public final void c(final DataList.Reader reader) {
                this._setPointerField((SetPointerBuilder)DataList.factory, 0, (Object)reader);
            }
            
            public final DataList.Builder ap(final int n) {
                return (DataList.Builder)this._initPointerField((FromPointerBuilder)DataList.factory, 0, n);
            }
        }
        
        public static final class c extends StructReader
        {
            c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                super(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final boolean pp() {
                return !this._pointerFieldIsNull(0);
            }
            
            public final DataList.Reader pr() {
                return (DataList.Reader)this._getPointerField((FromPointerReaderRefDefault)DataList.factory, 0, (SegmentReader)null, 0);
            }
        }
    }
    
    public static class b
    {
        public static final StructSize Av;
        public static final iK.b.b Db;
        public static final StructList.Factory<a, c> Ax;
        
        static {
            Av = new StructSize((short)0, (short)1);
            Db = new iK.b.b();
            Ax = new StructList.Factory((StructFactory)iK.b.Db);
        }
        
        public static final class b extends StructFactory<a, c>
        {
            public final c C(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                return new c(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final a C(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                return new a(segmentBuilder, n, n2, n3, n4);
            }
            
            public final StructSize structSize() {
                return iK.b.Av;
            }
            
            public final c a(final a a) {
                return a.ps();
            }
        }
        
        public static final class a extends StructBuilder
        {
            a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                super(segmentBuilder, n, n2, n3, n4);
            }
            
            public final c ps() {
                return new c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }
            
            public final boolean pp() {
                return !this._pointerFieldIsNull(0);
            }
            
            public final DataList.Builder pq() {
                return (DataList.Builder)this._getPointerField((FromPointerBuilderRefDefault)DataList.factory, 0, (SegmentReader)null, 0);
            }
            
            public final void c(final DataList.Reader reader) {
                this._setPointerField((SetPointerBuilder)DataList.factory, 0, (Object)reader);
            }
            
            public final DataList.Builder ap(final int n) {
                return (DataList.Builder)this._initPointerField((FromPointerBuilder)DataList.factory, 0, n);
            }
        }
        
        public static final class c extends StructReader
        {
            c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                super(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final boolean pp() {
                return !this._pointerFieldIsNull(0);
            }
            
            public final DataList.Reader pr() {
                return (DataList.Reader)this._getPointerField((FromPointerReaderRefDefault)DataList.factory, 0, (SegmentReader)null, 0);
            }
        }
    }
    
    public static class c
    {
        public static final StructSize Av;
        public static final b Dc;
        public static final StructList.Factory<a, iK.c.c> Ax;
        
        static {
            Av = new StructSize((short)0, (short)1);
            Dc = new b();
            Ax = new StructList.Factory((StructFactory)iK.c.Dc);
        }
        
        public static final class b extends StructFactory<a, iK.c.c>
        {
            public final iK.c.c D(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                return new iK.c.c(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final a D(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                return new a(segmentBuilder, n, n2, n3, n4);
            }
            
            public final StructSize structSize() {
                return iK.c.Av;
            }
            
            public final iK.c.c a(final a a) {
                return a.pt();
            }
        }
        
        public static final class a extends StructBuilder
        {
            a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                super(segmentBuilder, n, n2, n3, n4);
            }
            
            public final iK.c.c pt() {
                return new iK.c.c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }
            
            public final boolean nl() {
                return !this._pointerFieldIsNull(0);
            }
            
            public final TextList.Builder nm() {
                return (TextList.Builder)this._getPointerField((FromPointerBuilderRefDefault)TextList.factory, 0, (SegmentReader)null, 0);
            }
            
            public final void a(final TextList.Reader reader) {
                this._setPointerField((SetPointerBuilder)TextList.factory, 0, (Object)reader);
            }
            
            public final TextList.Builder ag(final int n) {
                return (TextList.Builder)this._initPointerField((FromPointerBuilder)TextList.factory, 0, n);
            }
        }
        
        public static final class c extends StructReader
        {
            c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                super(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final boolean nl() {
                return !this._pointerFieldIsNull(0);
            }
            
            public final TextList.Reader nn() {
                return (TextList.Reader)this._getPointerField((FromPointerReaderRefDefault)TextList.factory, 0, (SegmentReader)null, 0);
            }
        }
    }
    
    public static class d
    {
        public static final StructSize Av;
        public static final b Dd;
        public static final StructList.Factory<a, c> Ax;
        
        static {
            Av = new StructSize((short)0, (short)1);
            Dd = new b();
            Ax = new StructList.Factory((StructFactory)d.Dd);
        }
        
        public static final class b extends StructFactory<a, c>
        {
            public final c E(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                return new c(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final a E(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                return new a(segmentBuilder, n, n2, n3, n4);
            }
            
            public final StructSize structSize() {
                return d.Av;
            }
            
            public final c a(final a a) {
                return a.pu();
            }
        }
        
        public static final class a extends StructBuilder
        {
            a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                super(segmentBuilder, n, n2, n3, n4);
            }
            
            public final c pu() {
                return new c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }
            
            public final boolean nu() {
                return !this._pointerFieldIsNull(0);
            }
            
            public final Text.Builder nv() {
                return (Text.Builder)this._getPointerField((FromPointerBuilderBlobDefault)Text.factory, 0, (ByteBuffer)null, 0, 0);
            }
            
            public final void b(final Text.Reader reader) {
                this._setPointerField((SetPointerBuilder)Text.factory, 0, (Object)reader);
            }
            
            public final void aE(final String s) {
                this._setPointerField((SetPointerBuilder)Text.factory, 0, (Object)new Text.Reader(s));
            }
            
            public final Text.Builder ai(final int n) {
                return (Text.Builder)this._initPointerField((FromPointerBuilder)Text.factory, 0, n);
            }
        }
        
        public static final class c extends StructReader
        {
            c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                super(segmentReader, n, n2, n3, n4, n5);
            }
            
            public boolean nu() {
                return !this._pointerFieldIsNull(0);
            }
            
            public Text.Reader nw() {
                return (Text.Reader)this._getPointerField((FromPointerReaderBlobDefault)Text.factory, 0, (ByteBuffer)null, 0, 0);
            }
        }
    }
    
    public static class i
    {
        public static final StructSize Av;
        public static final b Dm;
        public static final StructList.Factory<a, c> Ax;
        
        static {
            Av = new StructSize((short)0, (short)0);
            Dm = new b();
            Ax = new StructList.Factory((StructFactory)i.Dm);
        }
        
        public static final class b extends StructFactory<a, c>
        {
            public final c N(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                return new c(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final a N(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                return new a(segmentBuilder, n, n2, n3, n4);
            }
            
            public final StructSize structSize() {
                return i.Av;
            }
            
            public final c a(final a a) {
                return a.qE();
            }
        }
        
        public static final class a extends StructBuilder
        {
            a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                super(segmentBuilder, n, n2, n3, n4);
            }
            
            public final c qE() {
                return new c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }
        }
        
        public static final class c extends StructReader
        {
            c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                super(segmentReader, n, n2, n3, n4, n5);
            }
        }
    }
    
    public static class j
    {
        public static final StructSize Av;
        public static final b Dn;
        public static final StructList.Factory<a, c> Ax;
        
        static {
            Av = new StructSize((short)0, (short)1);
            Dn = new b();
            Ax = new StructList.Factory((StructFactory)j.Dn);
        }
        
        public static final class b extends StructFactory<a, c>
        {
            public final c O(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                return new c(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final a O(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                return new a(segmentBuilder, n, n2, n3, n4);
            }
            
            public final StructSize structSize() {
                return j.Av;
            }
            
            public final c a(final a a) {
                return a.qF();
            }
        }
        
        public static final class a extends StructBuilder
        {
            a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                super(segmentBuilder, n, n2, n3, n4);
            }
            
            public final c qF() {
                return new c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }
            
            public final boolean qB() {
                return !this._pointerFieldIsNull(0);
            }
            
            public final Data.Builder qC() {
                return (Data.Builder)this._getPointerField((FromPointerBuilderBlobDefault)Data.factory, 0, (ByteBuffer)null, 0, 0);
            }
            
            public final void h(final Data.Reader reader) {
                this._setPointerField((SetPointerBuilder)Data.factory, 0, (Object)reader);
            }
            
            public final void j(final byte[] array) {
                this._setPointerField((SetPointerBuilder)Data.factory, 0, (Object)new Data.Reader(array));
            }
            
            public final Data.Builder aA(final int n) {
                return (Data.Builder)this._initPointerField((FromPointerBuilder)Data.factory, 0, n);
            }
        }
        
        public static final class c extends StructReader
        {
            c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                super(segmentReader, n, n2, n3, n4, n5);
            }
            
            public boolean qB() {
                return !this._pointerFieldIsNull(0);
            }
            
            public Data.Reader qD() {
                return (Data.Reader)this._getPointerField((FromPointerReaderBlobDefault)Data.factory, 0, (ByteBuffer)null, 0, 0);
            }
        }
    }
    
    public static class m
    {
        public static final StructSize Av;
        public static final b Dr;
        public static final StructList.Factory<a, c> Ax;
        
        static {
            Av = new StructSize((short)0, (short)1);
            Dr = new b();
            Ax = new StructList.Factory((StructFactory)m.Dr);
        }
        
        public static final class b extends StructFactory<a, c>
        {
            public final c S(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                return new c(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final a S(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                return new a(segmentBuilder, n, n2, n3, n4);
            }
            
            public final StructSize structSize() {
                return m.Av;
            }
            
            public final c a(final a a) {
                return a.qR();
            }
        }
        
        public static final class a extends StructBuilder
        {
            a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                super(segmentBuilder, n, n2, n3, n4);
            }
            
            public final c qR() {
                return new c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }
            
            public final boolean qB() {
                return !this._pointerFieldIsNull(0);
            }
            
            public final Data.Builder qC() {
                return (Data.Builder)this._getPointerField((FromPointerBuilderBlobDefault)Data.factory, 0, (ByteBuffer)null, 0, 0);
            }
            
            public final void h(final Data.Reader reader) {
                this._setPointerField((SetPointerBuilder)Data.factory, 0, (Object)reader);
            }
            
            public final void j(final byte[] array) {
                this._setPointerField((SetPointerBuilder)Data.factory, 0, (Object)new Data.Reader(array));
            }
            
            public final Data.Builder aA(final int n) {
                return (Data.Builder)this._initPointerField((FromPointerBuilder)Data.factory, 0, n);
            }
        }
        
        public static final class c extends StructReader
        {
            c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                super(segmentReader, n, n2, n3, n4, n5);
            }
            
            public boolean qB() {
                return !this._pointerFieldIsNull(0);
            }
            
            public Data.Reader qD() {
                return (Data.Reader)this._getPointerField((FromPointerReaderBlobDefault)Data.factory, 0, (ByteBuffer)null, 0, 0);
            }
        }
    }
    
    public static class k
    {
        public static final StructSize Av;
        public static final b Do;
        public static final StructList.Factory<a, c> Ax;
        
        static {
            Av = new StructSize((short)1, (short)0);
            Do = new b();
            Ax = new StructList.Factory((StructFactory)k.Do);
        }
        
        public static final class b extends StructFactory<a, c>
        {
            public final c P(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                return new c(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final a P(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                return new a(segmentBuilder, n, n2, n3, n4);
            }
            
            public final StructSize structSize() {
                return k.Av;
            }
            
            public final c a(final a a) {
                return a.qG();
            }
        }
        
        public static final class a extends StructBuilder
        {
            a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                super(segmentBuilder, n, n2, n3, n4);
            }
            
            public final c qG() {
                return new c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }
            
            public final int lF() {
                return this._getIntField(0);
            }
            
            public final void am(final int n) {
                this._setIntField(0, n);
            }
            
            public final boolean qH() {
                return this._getBooleanField(32);
            }
            
            public final void u(final boolean b) {
                this._setBooleanField(32, b);
            }
        }
        
        public static final class c extends StructReader
        {
            c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                super(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final int lF() {
                return this._getIntField(0);
            }
            
            public final boolean qH() {
                return this._getBooleanField(32);
            }
        }
    }
    
    public static class l
    {
        public static final StructSize Av;
        public static final b Dp;
        public static final StructList.Factory<a, c> Ax;
        
        static {
            Av = new StructSize((short)1, (short)1);
            Dp = new b();
            Ax = new StructList.Factory((StructFactory)l.Dp);
        }
        
        public static final class b extends StructFactory<a, c>
        {
            public final c Q(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                return new c(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final a Q(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                return new a(segmentBuilder, n, n2, n3, n4);
            }
            
            public final StructSize structSize() {
                return l.Av;
            }
            
            public final c a(final a a) {
                return a.qI();
            }
        }
        
        public static final class a extends StructBuilder
        {
            a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                super(segmentBuilder, n, n2, n3, n4);
            }
            
            public final c qI() {
                return new c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }
            
            public final d.a qJ() {
                return new d.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
            }
            
            public final d.a qK() {
                this._setShortField(0, (short)0);
                this._clearPointerField(0);
                return new d.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
            }
        }
        
        public static final class c extends StructReader
        {
            c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                super(segmentReader, n, n2, n3, n4, n5);
            }
            
            public d.c qL() {
                return new d.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
            }
        }
        
        public static class d
        {
            public static final StructSize Av;
            public static final b Dq;
            public static final StructList.Factory<a, c> Ax;
            
            static {
                Av = new StructSize((short)1, (short)1);
                Dq = new b();
                Ax = new StructList.Factory((StructFactory)l.d.Dq);
            }
            
            public static final class b extends StructFactory<a, c>
            {
                public final c R(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                    return new c(segmentReader, n, n2, n3, n4, n5);
                }
                
                public final a R(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                    return new a(segmentBuilder, n, n2, n3, n4);
                }
                
                public final StructSize structSize() {
                    return l.d.Av;
                }
                
                public final c a(final a a) {
                    return a.qN();
                }
            }
            
            public static final class a extends StructBuilder
            {
                static final /* synthetic */ boolean ac;
                
                a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                    super(segmentBuilder, n, n2, n3, n4);
                }
                
                public l.d.d qM() {
                    switch (this._getShortField(0)) {
                        case 0: {
                            return l.d.d.ME;
                        }
                        case 1: {
                            return l.d.d.TARGET;
                        }
                        default: {
                            return l.d.d._NOT_IN_SCHEMA;
                        }
                    }
                }
                
                public final c qN() {
                    return new c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
                }
                
                public final boolean qO() {
                    return this.qM() == l.d.d.ME;
                }
                
                public final Void qP() {
                    if (!a.ac && this.qM() != l.d.d.ME) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return Void.VOID;
                }
                
                public final void e(final Void void1) {
                    this._setShortField(0, (short)l.d.d.ME.ordinal());
                }
                
                public final boolean qQ() {
                    return this.qM() == l.d.d.TARGET;
                }
                
                public final boolean qB() {
                    return this.qM() == l.d.d.TARGET && !this._pointerFieldIsNull(0);
                }
                
                public final Data.Builder qC() {
                    return (Data.Builder)this._getPointerField((FromPointerBuilderBlobDefault)Data.factory, 0, (ByteBuffer)null, 0, 0);
                }
                
                public final void h(final Data.Reader reader) {
                    this._setShortField(0, (short)l.d.d.TARGET.ordinal());
                    this._setPointerField((SetPointerBuilder)Data.factory, 0, (Object)reader);
                }
                
                public final void j(final byte[] array) {
                    this._setShortField(0, (short)l.d.d.TARGET.ordinal());
                    this._setPointerField((SetPointerBuilder)Data.factory, 0, (Object)new Data.Reader(array));
                }
                
                public final Data.Builder aA(final int n) {
                    return (Data.Builder)this._initPointerField((FromPointerBuilder)Data.factory, 0, n);
                }
                
                static {
                    ac = !iK.class.desiredAssertionStatus();
                }
            }
            
            public static final class c extends StructReader
            {
                static final /* synthetic */ boolean ac;
                
                c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                    super(segmentReader, n, n2, n3, n4, n5);
                }
                
                public l.d.d qM() {
                    switch (this._getShortField(0)) {
                        case 0: {
                            return l.d.d.ME;
                        }
                        case 1: {
                            return l.d.d.TARGET;
                        }
                        default: {
                            return l.d.d._NOT_IN_SCHEMA;
                        }
                    }
                }
                
                public final boolean qO() {
                    return this.qM() == l.d.d.ME;
                }
                
                public final Void qP() {
                    if (!c.ac && this.qM() != l.d.d.ME) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return Void.VOID;
                }
                
                public final boolean qQ() {
                    return this.qM() == l.d.d.TARGET;
                }
                
                public boolean qB() {
                    return this.qM() == l.d.d.TARGET && !this._pointerFieldIsNull(0);
                }
                
                public Data.Reader qD() {
                    return (Data.Reader)this._getPointerField((FromPointerReaderBlobDefault)Data.factory, 0, (ByteBuffer)null, 0, 0);
                }
                
                static {
                    ac = !iK.class.desiredAssertionStatus();
                }
            }
            
            public enum d
            {
                ME, 
                TARGET, 
                _NOT_IN_SCHEMA;
                
                private static /* synthetic */ d[] $values() {
                    return new d[] { d.ME, d.TARGET, d._NOT_IN_SCHEMA };
                }
                
                static {
                    $VALUES = $values();
                }
            }
        }
    }
    
    public static class n
    {
        public static final StructSize Av;
        public static final b Ds;
        public static final StructList.Factory<a, c> Ax;
        
        static {
            Av = new StructSize((short)1, (short)0);
            Ds = new b();
            Ax = new StructList.Factory((StructFactory)n.Ds);
        }
        
        public static final class b extends StructFactory<a, c>
        {
            public final c T(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                return new c(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final a T(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                return new a(segmentBuilder, n, n2, n3, n4);
            }
            
            public final StructSize structSize() {
                return n.Av;
            }
            
            public final c a(final a a) {
                return a.qS();
            }
        }
        
        public static final class a extends StructBuilder
        {
            a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                super(segmentBuilder, n, n2, n3, n4);
            }
            
            public final c qS() {
                return new c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }
            
            public final d.a qT() {
                return new d.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
            }
            
            public final d.a qU() {
                this._setShortField(0, (short)0);
                this._setShortField(1, (short)0);
                return new d.a(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
            }
        }
        
        public static final class c extends StructReader
        {
            c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                super(segmentReader, n, n2, n3, n4, n5);
            }
            
            public d.c qV() {
                return new d.c(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
            }
        }
        
        public static class d
        {
            public static final StructSize Av;
            public static final b Dt;
            public static final StructList.Factory<a, c> Ax;
            
            static {
                Av = new StructSize((short)1, (short)0);
                Dt = new b();
                Ax = new StructList.Factory((StructFactory)n.d.Dt);
            }
            
            public static final class b extends StructFactory<a, c>
            {
                public final c U(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                    return new c(segmentReader, n, n2, n3, n4, n5);
                }
                
                public final a U(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                    return new a(segmentBuilder, n, n2, n3, n4);
                }
                
                public final StructSize structSize() {
                    return n.d.Av;
                }
                
                public final c a(final a a) {
                    return a.qX();
                }
            }
            
            public static final class a extends StructBuilder
            {
                static final /* synthetic */ boolean ac;
                
                a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                    super(segmentBuilder, n, n2, n3, n4);
                }
                
                public n.d.d qW() {
                    switch (this._getShortField(1)) {
                        case 0: {
                            return n.d.d.SPEECH_MODE;
                        }
                        case 1: {
                            return n.d.d.PLACEHOLDER;
                        }
                        default: {
                            return n.d.d._NOT_IN_SCHEMA;
                        }
                    }
                }
                
                public final c qX() {
                    return new c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
                }
                
                public final boolean qY() {
                    return this.qW() == n.d.d.SPEECH_MODE;
                }
                
                public final iL.b lB() {
                    if (!a.ac && this.qW() != n.d.d.SPEECH_MODE) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    switch (this._getShortField(0)) {
                        case 0: {
                            return iL.b.EVERYONE;
                        }
                        case 1: {
                            return iL.b.PROXIMITY;
                        }
                        default: {
                            return iL.b._NOT_IN_SCHEMA;
                        }
                    }
                }
                
                public final void a(final iL.b b) {
                    this._setShortField(1, (short)n.d.d.SPEECH_MODE.ordinal());
                    this._setShortField(0, (short)b.ordinal());
                }
                
                public final boolean qZ() {
                    return this.qW() == n.d.d.PLACEHOLDER;
                }
                
                public final Void ra() {
                    if (!a.ac && this.qW() != n.d.d.PLACEHOLDER) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return Void.VOID;
                }
                
                public final void f(final Void void1) {
                    this._setShortField(1, (short)n.d.d.PLACEHOLDER.ordinal());
                }
                
                static {
                    ac = !iK.class.desiredAssertionStatus();
                }
            }
            
            public static final class c extends StructReader
            {
                static final /* synthetic */ boolean ac;
                
                c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                    super(segmentReader, n, n2, n3, n4, n5);
                }
                
                public n.d.d qW() {
                    switch (this._getShortField(1)) {
                        case 0: {
                            return n.d.d.SPEECH_MODE;
                        }
                        case 1: {
                            return n.d.d.PLACEHOLDER;
                        }
                        default: {
                            return n.d.d._NOT_IN_SCHEMA;
                        }
                    }
                }
                
                public final boolean qY() {
                    return this.qW() == n.d.d.SPEECH_MODE;
                }
                
                public final iL.b lB() {
                    if (!c.ac && this.qW() != n.d.d.SPEECH_MODE) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    switch (this._getShortField(0)) {
                        case 0: {
                            return iL.b.EVERYONE;
                        }
                        case 1: {
                            return iL.b.PROXIMITY;
                        }
                        default: {
                            return iL.b._NOT_IN_SCHEMA;
                        }
                    }
                }
                
                public final boolean qZ() {
                    return this.qW() == n.d.d.PLACEHOLDER;
                }
                
                public final Void ra() {
                    if (!c.ac && this.qW() != n.d.d.PLACEHOLDER) {
                        throw new AssertionError((Object)"Must check which() before get()ing a union member.");
                    }
                    return Void.VOID;
                }
                
                static {
                    ac = !iK.class.desiredAssertionStatus();
                }
            }
            
            public enum d
            {
                SPEECH_MODE, 
                PLACEHOLDER, 
                _NOT_IN_SCHEMA;
                
                private static /* synthetic */ d[] $values() {
                    return new d[] { d.SPEECH_MODE, d.PLACEHOLDER, d._NOT_IN_SCHEMA };
                }
                
                static {
                    $VALUES = $values();
                }
            }
        }
    }
    
    public static class h
    {
        public static final StructSize Av;
        public static final b Dl;
        public static final StructList.Factory<a, c> Ax;
        
        static {
            Av = new StructSize((short)0, (short)2);
            Dl = new b();
            Ax = new StructList.Factory((StructFactory)h.Dl);
        }
        
        public static final class b extends StructFactory<a, c>
        {
            public final c M(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                return new c(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final a M(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                return new a(segmentBuilder, n, n2, n3, n4);
            }
            
            public final StructSize structSize() {
                return h.Av;
            }
            
            public final c a(final a a) {
                return a.qA();
            }
        }
        
        public static final class a extends StructBuilder
        {
            a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                super(segmentBuilder, n, n2, n3, n4);
            }
            
            public final c qA() {
                return new c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }
            
            public final boolean qB() {
                return !this._pointerFieldIsNull(0);
            }
            
            public final Data.Builder qC() {
                return (Data.Builder)this._getPointerField((FromPointerBuilderBlobDefault)Data.factory, 0, (ByteBuffer)null, 0, 0);
            }
            
            public final void h(final Data.Reader reader) {
                this._setPointerField((SetPointerBuilder)Data.factory, 0, (Object)reader);
            }
            
            public final void j(final byte[] array) {
                this._setPointerField((SetPointerBuilder)Data.factory, 0, (Object)new Data.Reader(array));
            }
            
            public final Data.Builder aA(final int n) {
                return (Data.Builder)this._initPointerField((FromPointerBuilder)Data.factory, 0, n);
            }
            
            public final iL.a.a nB() {
                return (iL.a.a)this._getPointerField((FromPointerBuilderRefDefault)iL.a.DY, 1, (SegmentReader)null, 0);
            }
            
            public final void b(final iL.a.c c) {
                this._setPointerField((SetPointerBuilder)iL.a.DY, 1, (Object)c);
            }
            
            public final iL.a.a nC() {
                return (iL.a.a)this._initPointerField((FromPointerBuilder)iL.a.DY, 1, 0);
            }
        }
        
        public static final class c extends StructReader
        {
            c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                super(segmentReader, n, n2, n3, n4, n5);
            }
            
            public boolean qB() {
                return !this._pointerFieldIsNull(0);
            }
            
            public Data.Reader qD() {
                return (Data.Reader)this._getPointerField((FromPointerReaderBlobDefault)Data.factory, 0, (ByteBuffer)null, 0, 0);
            }
            
            public boolean nE() {
                return !this._pointerFieldIsNull(1);
            }
            
            public iL.a.c nF() {
                return (iL.a.c)this._getPointerField((FromPointerReaderRefDefault)iL.a.DY, 1, (SegmentReader)null, 0);
            }
        }
    }
    
    public static class g
    {
        public static final StructSize Av;
        public static final b Dk;
        public static final StructList.Factory<a, c> Ax;
        
        static {
            Av = new StructSize((short)0, (short)2);
            Dk = new b();
            Ax = new StructList.Factory((StructFactory)g.Dk);
        }
        
        public static final class b extends StructFactory<a, c>
        {
            public final c L(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                return new c(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final a L(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                return new a(segmentBuilder, n, n2, n3, n4);
            }
            
            public final StructSize structSize() {
                return g.Av;
            }
            
            public final c a(final a a) {
                return a.qw();
            }
        }
        
        public static final class a extends StructBuilder
        {
            a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                super(segmentBuilder, n, n2, n3, n4);
            }
            
            public final c qw() {
                return new c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }
            
            public final boolean qx() {
                return !this._pointerFieldIsNull(0);
            }
            
            public final Data.Builder qy() {
                return (Data.Builder)this._getPointerField((FromPointerBuilderBlobDefault)Data.factory, 0, (ByteBuffer)null, 0, 0);
            }
            
            public final void g(final Data.Reader reader) {
                this._setPointerField((SetPointerBuilder)Data.factory, 0, (Object)reader);
            }
            
            public final void i(final byte[] array) {
                this._setPointerField((SetPointerBuilder)Data.factory, 0, (Object)new Data.Reader(array));
            }
            
            public final Data.Builder az(final int n) {
                return (Data.Builder)this._initPointerField((FromPointerBuilder)Data.factory, 0, n);
            }
            
            public final iL.a.a nB() {
                return (iL.a.a)this._getPointerField((FromPointerBuilderRefDefault)iL.a.DY, 1, (SegmentReader)null, 0);
            }
            
            public final void b(final iL.a.c c) {
                this._setPointerField((SetPointerBuilder)iL.a.DY, 1, (Object)c);
            }
            
            public final iL.a.a nC() {
                return (iL.a.a)this._initPointerField((FromPointerBuilder)iL.a.DY, 1, 0);
            }
        }
        
        public static final class c extends StructReader
        {
            c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                super(segmentReader, n, n2, n3, n4, n5);
            }
            
            public boolean qx() {
                return !this._pointerFieldIsNull(0);
            }
            
            public Data.Reader qz() {
                return (Data.Reader)this._getPointerField((FromPointerReaderBlobDefault)Data.factory, 0, (ByteBuffer)null, 0, 0);
            }
            
            public boolean nE() {
                return !this._pointerFieldIsNull(1);
            }
            
            public iL.a.c nF() {
                return (iL.a.c)this._getPointerField((FromPointerReaderRefDefault)iL.a.DY, 1, (SegmentReader)null, 0);
            }
        }
    }
    
    public static final class o
    {
        public static final SegmentReader Du;
        public static final SegmentReader Dv;
        public static final SegmentReader Dw;
        public static final SegmentReader Dx;
        public static final SegmentReader Dy;
        public static final SegmentReader Dz;
        public static final SegmentReader DA;
        public static final SegmentReader DB;
        public static final SegmentReader DC;
        public static final SegmentReader DD;
        public static final SegmentReader DE;
        public static final SegmentReader DF;
        public static final SegmentReader DG;
        public static final SegmentReader DH;
        public static final SegmentReader DI;
        public static final SegmentReader DJ;
        public static final SegmentReader DK;
        public static final SegmentReader DL;
        public static final SegmentReader DM;
        public static final SegmentReader DN;
        public static final SegmentReader DO;
        public static final SegmentReader DP;
        public static final SegmentReader DQ;
        public static final SegmentReader DR;
        public static final SegmentReader DS;
        
        static {
            Du = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\f\u00f1\u008bf\u00f3\u00e3\u009c\u00ad#\u0000\u0000\u0000\u0001\u0000\u0001\u0000d©\u00ef\u00f5\u00e8²\u00d8\u00c3\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000Z\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:Wrapper\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001A+3KS\r\u00f0\r\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000packetType\u0000\u0000\u0000\u0000\u0000\u0000");
            Dv = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u0001A+3KS\r\u00f0+\u0000\u0000\u0000\u0001\u0000\u0001\u0000\f\u00f1\u008bf\u00f3\u00e3\u009c\u00ad\u0001\u0000\u0007\u0000\u0001\u0000\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000²\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000O\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:Wrapper.packetType\u0000\u0000\u0000<\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u00ff\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0095\u0001\u0000\u0000R\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0094\u0001\u0000\u0000\u0003\u0000\u0001\u0000 \u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u00fe\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u009d\u0001\u0000\u0000B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0098\u0001\u0000\u0000\u0003\u0000\u0001\u0000¤\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0002\u0000\u00fd\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000¡\u0001\u0000\u0000z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \u0001\u0000\u0000\u0003\u0000\u0001\u0000¬\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0003\u0000\u00fc\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000©\u0001\u0000\u0000\u0092\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000¬\u0001\u0000\u0000\u0003\u0000\u0001\u0000¸\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0004\u0000\u00fb\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000µ\u0001\u0000\u0000\u0082\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000´\u0001\u0000\u0000\u0003\u0000\u0001\u0000\u00c0\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0005\u0000\u00fa\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0005\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000½\u0001\u0000\u0000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000¼\u0001\u0000\u0000\u0003\u0000\u0001\u0000\u00c8\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0006\u0000\u00f9\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0006\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00c5\u0001\u0000\u0000j\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00c4\u0001\u0000\u0000\u0003\u0000\u0001\u0000\u00d0\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u0007\u0000\u00f8\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00cd\u0001\u0000\u0000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00cc\u0001\u0000\u0000\u0003\u0000\u0001\u0000\u00d8\u0001\u0000\u0000\u0002\u0000\u0001\u0000\b\u0000\u00f7\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00d5\u0001\u0000\u0000r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00d4\u0001\u0000\u0000\u0003\u0000\u0001\u0000\u00e0\u0001\u0000\u0000\u0002\u0000\u0001\u0000\t\u0000\u00f6\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\t\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00dd\u0001\u0000\u0000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00dc\u0001\u0000\u0000\u0003\u0000\u0001\u0000\u00e8\u0001\u0000\u0000\u0002\u0000\u0001\u0000\n\u0000\u00f5\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00e5\u0001\u0000\u0000¢\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00e8\u0001\u0000\u0000\u0003\u0000\u0001\u0000\u00f4\u0001\u0000\u0000\u0002\u0000\u0001\u0000\u000b\u0000\u00f4\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00f1\u0001\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00f0\u0001\u0000\u0000\u0003\u0000\u0001\u0000\u00fc\u0001\u0000\u0000\u0002\u0000\u0001\u0000\f\u0000\u00f3\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00f9\u0001\u0000\u0000r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00f8\u0001\u0000\u0000\u0003\u0000\u0001\u0000\u0004\u0002\u0000\u0000\u0002\u0000\u0001\u0000\r\u0000\u00f2\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0002\u0000\u0000\u0003\u0000\u0001\u0000\f\u0002\u0000\u0000\u0002\u0000\u0001\u0000\u000e\u0000\u00f1\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\t\u0002\u0000\u0000\u0082\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0002\u0000\u0000\u0003\u0000\u0001\u0000\u0014\u0002\u0000\u0000\u0002\u0000\u0001\u0000handshake\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001½\u008d,\u000e¨\u008d\u00de\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000metrics\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00f5?\u0015\u009bLPj\u00ec\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000trackingUpdate\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008cN$\u0088S\u00d7¹\u0097\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000bulkOptionRequest\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0017\u00e1\u0013\u008aL\u0087O\u0096\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000cosmeticRequest\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u00002<&·\u0010\u00c9\u000e\u0093\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000cosmeticSet\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00c2[e\u00c2\u0096<\u0082\u00ca\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000emoteExecute\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000bZ\u0006\u00f7\u00f8\u0014\u0085\u00c7\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000partyCreate\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0012}²)\u000f/\u0098ª\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000partySetOwner\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000F\u001d\u00e6¬¢^\u00e9·\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000partyInvite\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00e6\u00e1±~\b\u0001=¿\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000partyInviteResponse\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000y\u0001ª@9?\u00f4\u00d1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000partyLeave\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\"\u00f2`\u007f\u0016H\u00f4\u00cc\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000partySettings\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0099BwJ\u00e7t¤\u0098\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000p2pJoinRequest\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u00005jº\u0097n\u0010%\u00e4\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000p2pJoinAccepted\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000]o0l9b¶\u00ee\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            Dw = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u0001½\u008d,\u000e¨\u008d\u00de#\u0000\u0000\u0000\u0001\u0000\u0000\u0000d©\u00ef\u00f5\u00e8²\u00d8\u00c3\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000j\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:Handshake\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000J\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0018\u0000\u0000\u0000\u0002\u0000\u0001\u0000jwtToken\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            Dx = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u00f5?\u0015\u009bLPj\u00ec#\u0000\u0000\u0000\u0001\u0000\u0001\u0000d©\u00ef\u00f5\u00e8²\u00d8\u00c3\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000Z\u0001\u0000\u0000)\u0000\u0000\u0000'\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000A\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:Metrics\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u007f?\u0081\u0004\u0098\u001b\u0094\u00fb\t\u0000\u0000\u0000j\u0000\u0000\u0000\tO=[ x\u0016\u008f\t\u0000\u0000\u0000:\u0000\u0000\u0000StartMetrics\u0000\u0000\u0000\u0000Server\u0000\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000©?A2¢Q-\u00c8\r\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000type\u0000\u0000\u0000\u0000");
            Dy = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u007f?\u0081\u0004\u0098\u001b\u0094\u00fb+\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u00f5?\u0015\u009bLPj\u00ec\u0005\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u00c2\u0001\u0000\u0000-\u0000\u0000\u0000\u0017\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00009\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:Metrics.StartMetrics\u0000\u0004\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0086A\u00f8R\u00f3\u00ee\u00df\u00e6\u0001\u0000\u0000\u0000b\u0000\u0000\u0000MachineInfo\u0000\u0000\u0000\u0000\u0000\u0014\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000}\u0000\u0000\u0000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000|\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0088\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0085\u0000\u0000\u0000\u008a\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0088\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0094\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0091\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008c\u0000\u0000\u0000\u0003\u0000\u0001\u0000¨\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0003\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000¥\u0000\u0000\u0000r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000¤\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u00c0\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000½\u0000\u0000\u0000z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000¼\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u00d8\u0000\u0000\u0000\u0002\u0000\u0001\u0000machineInfo\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0086A\u00f8R\u00f3\u00ee\u00df\u00e6\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000minecraftVersion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000mods\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000resourcePacks\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000enabledModules\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            Dz = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u0086A\u00f8R\u00f3\u00ee\u00df\u00e68\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u007f?\u0081\u0004\u0098\u001b\u0094\u00fb\u0003\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\"\u0002\u0000\u00005\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00001\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:Metrics.StartMetrics.MachineInfo\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0014\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000}\u0000\u0000\u0000\u0082\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000|\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0088\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0085\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0084\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0090\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008d\u0000\u0000\u0000R\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008c\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0098\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0095\u0000\u0000\u0000J\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0094\u0000\u0000\u0000\u0003\u0000\u0001\u0000 \u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u009d\u0000\u0000\u0000J\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u009c\u0000\u0000\u0000\u0003\u0000\u0001\u0000¨\u0000\u0000\u0000\u0002\u0000\u0001\u0000operatingSystem\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000jvmThreads\u0000\u0000\u0000\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000jvmMemory\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000cpuModel\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000gpuModel\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            DA = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\tO=[ x\u0016\u008f+\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u00f5?\u0015\u009bLPj\u00ec\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0092\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:Metrics.Server\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$\u0000\u0000\u0000\u0003\u0000\u0001\u00000\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000(\u0000\u0000\u0000\u0003\u0000\u0001\u00004\u0000\u0000\u0000\u0002\u0000\u0001\u0000address\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000port\u0000\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            DB = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000©?A2¢Q-\u00c8+\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u00f5?\u0015\u009bLPj\u00ec\u0001\u0000\u0007\u0000\u0001\u0000\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0082\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0000\u0000\u0000¯\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:Metrics.type\u0000\f\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u00ff\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000E\u0000\u0000\u0000j\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000D\u0000\u0000\u0000\u0003\u0000\u0001\u0000P\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u00fe\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000M\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000L\u0000\u0000\u0000\u0003\u0000\u0001\u0000X\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0002\u0000\u00fd\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000U\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000T\u0000\u0000\u0000\u0003\u0000\u0001\u0000`\u0000\u0000\u0000\u0002\u0000\u0001\u0000startMetrics\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u007f?\u0081\u0004\u0098\u001b\u0094\u00fb\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000serverJoin\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\tO=[ x\u0016\u008f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000serverQuit\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            DC = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u008cN$\u0088S\u00d7¹\u0097#\u0000\u0000\u0000\u0001\u0000\u0001\u0000d©\u00ef\u00f5\u00e8²\u00d8\u00c3\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0092\u0001\u0000\u0000-\u0000\u0000\u0000\u0017\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00009\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:TrackingUpdate\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0018§\u00dcM\u00ca-z¥\u0001\u0000\u0000\u0000Z\u0000\u0000\u0000ListUpdate\u0000\u0000\u0000\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000Ui¹\u00cd\u009e\u00d0º»\r\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000updateType\u0000\u0000\u0000\u0000\u0000\u0000");
            DD = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u0018§\u00dcM\u00ca-z¥2\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u008cN$\u0088S\u00d7¹\u0097\u0002\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u00ea\u0001\u0000\u00001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:TrackingUpdate.ListUpdate\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u00002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$\u0000\u0000\u0000\u0003\u0000\u0001\u0000@\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000=\u0000\u0000\u0000B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00008\u0000\u0000\u0000\u0003\u0000\u0001\u0000T\u0000\u0000\u0000\u0002\u0000\u0001\u0000added\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000removed\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            DE = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000Ui¹\u00cd\u009e\u00d0º»2\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u008cN$\u0088S\u00d7¹\u0097\u0001\u0000\u0007\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u00ea\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:TrackingUpdate.updateType\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u00ff\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000(\u0000\u0000\u0000\u0003\u0000\u0001\u00004\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u00fe\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00001\u0000\u0000\u0000R\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00000\u0000\u0000\u0000\u0003\u0000\u0001\u0000<\u0000\u0000\u0000\u0002\u0000\u0001\u0000listUpdate\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0018§\u00dcM\u00ca-z¥\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000removeAll\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            DF = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u0017\u00e1\u0013\u008aL\u0087O\u0096#\u0000\u0000\u0000\u0001\u0000\u0000\u0000d©\u00ef\u00f5\u00e8²\u00d8\u00c3\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000ª\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:BulkOptionRequest\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u00002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0001\u0000$\u0000\u0000\u0000\u0002\u0000\u0001\u0000uuids\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            DG = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u00002<&·\u0010\u00c9\u000e\u0093#\u0000\u0000\u0000\u0001\u0000\u0000\u0000d©\u00ef\u00f5\u00e8²\u00d8\u00c3\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u009a\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:CosmeticRequest\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u00002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0001\u0000$\u0000\u0000\u0000\u0002\u0000\u0001\u0000uuids\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            DH = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u00c2[e\u00c2\u0096<\u0082\u00ca#\u0000\u0000\u0000\u0001\u0000\u0000\u0000d©\u00ef\u00f5\u00e8²\u00d8\u00c3\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000z\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:CosmeticSet\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u00002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0001\u0000$\u0000\u0000\u0000\u0002\u0000\u0001\u0000slugs\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            DI = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u000bZ\u0006\u00f7\u00f8\u0014\u0085\u00c7#\u0000\u0000\u0000\u0001\u0000\u0000\u0000d©\u00ef\u00f5\u00e8²\u00d8\u00c3\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0082\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:EmoteExecute\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0014\u0000\u0000\u0000\u0002\u0000\u0001\u0000slug\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            DJ = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u0012}²)\u000f/\u0098ª#\u0000\u0000\u0000\u0001\u0000\u0000\u0000d©\u00ef\u00f5\u00e8²\u00d8\u00c3\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000z\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:PartyCreate\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000");
            DK = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u00e6\u00e1±~\b\u0001=¿#\u0000\u0000\u0000\u0001\u0000\u0000\u0000d©\u00ef\u00f5\u00e8²\u00d8\u00c3\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000z\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:PartyInvite\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000:\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0014\u0000\u0000\u0000\u0002\u0000\u0001\u0000target\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            DL = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000F\u001d\u00e6¬¢^\u00e9·#\u0000\u0000\u0000\u0001\u0000\u0000\u0000d©\u00ef\u00f5\u00e8²\u00d8\u00c3\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u008a\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:PartySetOwner\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000:\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0001\u0000\u0014\u0000\u0000\u0000\u0002\u0000\u0001\u0000target\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            DM = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000y\u0001ª@9?\u00f4\u00d1#\u0000\u0000\u0000\u0001\u0000\u0001\u0000d©\u00ef\u00f5\u00e8²\u00d8\u00c3\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000º\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:PartyInviteResponse\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$\u0000\u0000\u0000\u0003\u0000\u0001\u00000\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000 \u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000:\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000(\u0000\u0000\u0000\u0003\u0000\u0001\u00004\u0000\u0000\u0000\u0002\u0000\u0001\u0000partyId\u0000\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000accept\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            DN = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\"\u00f2`\u007f\u0016H\u00f4\u00cc#\u0000\u0000\u0000\u0001\u0000\u0001\u0000d©\u00ef\u00f5\u00e8²\u00d8\u00c3\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000r\u0001\u0000\u0000)\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:PartyLeave\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000Y\u0089\u0080\u0004\t\u00adW\u00f1\r\u0000\u0000\u0000:\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000target\u0000\u0000");
            DO = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000Y\u0089\u0080\u0004\t\u00adW\u00f1.\u0000\u0000\u0000\u0001\u0000\u0001\u0000\"\u00f2`\u007f\u0016H\u00f4\u00cc\u0001\u0000\u0007\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000ª\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:PartyLeave.target\u0000\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u00ff\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000\u001a\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$\u0000\u0000\u0000\u0003\u0000\u0001\u00000\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u00fe\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000:\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000(\u0000\u0000\u0000\u0003\u0000\u0001\u00004\u0000\u0000\u0000\u0002\u0000\u0001\u0000me\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000target\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            DP = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u0099BwJ\u00e7t¤\u0098#\u0000\u0000\u0000\u0001\u0000\u0001\u0000d©\u00ef\u00f5\u00e8²\u00d8\u00c3\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u008a\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:PartySettings\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u007f\u00c29i\u0000s\u00c8\u0097\r\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000type\u0000\u0000\u0000\u0000");
            DQ = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u007f\u00c29i\u0000s\u00c8\u00971\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0099BwJ\u00e7t¤\u0098\u0000\u0000\u0007\u0000\u0001\u0000\u0002\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000²\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000%\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:PartySettings.type\u0000\u0000\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u00ff\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000(\u0000\u0000\u0000\u0003\u0000\u0001\u00004\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u00fe\u00ff\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00001\u0000\u0000\u0000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00000\u0000\u0000\u0000\u0003\u0000\u0001\u0000<\u0000\u0000\u0000\u0002\u0000\u0001\u0000speechMode\u0000\u0000\u0000\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0018\u00fb\u00ce\u00ec\u00d6«S\u00cf\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000placeholder\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            DR = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u00005jº\u0097n\u0010%\u00e4#\u0000\u0000\u0000\u0001\u0000\u0000\u0000d©\u00ef\u00f5\u00e8²\u00d8\u00c3\u0002\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0092\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:P2pJoinRequest\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000:\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$\u0000\u0000\u0000\u0003\u0000\u0001\u00000\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0003\u0000\u0001\u00008\u0000\u0000\u0000\u0002\u0000\u0001\u0000target\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000rendezvousInfo\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001e\u00171I#)T¶\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            DS = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000]o0l9b¶\u00ee#\u0000\u0000\u0000\u0001\u0000\u0000\u0000d©\u00ef\u00f5\u00e8²\u00d8\u00c3\u0002\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u009a\u0001\u0000\u0000-\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/serverbound_wrapper.capnp:P2pJoinAccepted\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000:\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$\u0000\u0000\u0000\u0003\u0000\u0001\u00000\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000z\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0003\u0000\u0001\u00008\u0000\u0000\u0000\u0002\u0000\u0001\u0000origin\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000rendezvousInfo\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001e\u00171I#)T¶\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        }
    }
}
