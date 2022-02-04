// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.capnproto.GeneratedClassSupport;
import org.capnproto.FromPointerReaderBlobDefault;
import org.capnproto.Data;
import org.capnproto.FromPointerBuilder;
import org.capnproto.SetPointerBuilder;
import java.nio.ByteBuffer;
import org.capnproto.FromPointerBuilderBlobDefault;
import org.capnproto.Text;
import org.capnproto.StructBuilder;
import org.capnproto.StructReader;
import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructFactory;
import org.capnproto.StructList;
import org.capnproto.StructSize;

public final class iL
{
    public enum b
    {
        EVERYONE, 
        PROXIMITY, 
        _NOT_IN_SCHEMA;
        
        private static /* synthetic */ b[] $values() {
            return new b[] { b.EVERYONE, b.PROXIMITY, b._NOT_IN_SCHEMA };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    public static class a
    {
        public static final StructSize Av;
        public static final b DY;
        public static final StructList.Factory<iL.a.a, c> Ax;
        
        static {
            Av = new StructSize((short)0, (short)2);
            DY = new b();
            Ax = new StructList.Factory((StructFactory)iL.a.DY);
        }
        
        public static final class b extends StructFactory<iL.a.a, c>
        {
            public final c aa(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                return new c(segmentReader, n, n2, n3, n4, n5);
            }
            
            public final iL.a.a aa(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                return new iL.a.a(segmentBuilder, n, n2, n3, n4);
            }
            
            public final StructSize structSize() {
                return iL.a.Av;
            }
            
            public final c a(final iL.a.a a) {
                return a.sM();
            }
        }
        
        public static final class a extends StructBuilder
        {
            a(final SegmentBuilder segmentBuilder, final int n, final int n2, final int n3, final short n4) {
                super(segmentBuilder, n, n2, n3, n4);
            }
            
            public final c sM() {
                return new c((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }
            
            public final boolean sN() {
                return !this._pointerFieldIsNull(0);
            }
            
            public final Text.Builder sO() {
                return (Text.Builder)this._getPointerField((FromPointerBuilderBlobDefault)Text.factory, 0, (ByteBuffer)null, 0, 0);
            }
            
            public final void i(final Text.Reader reader) {
                this._setPointerField((SetPointerBuilder)Text.factory, 0, (Object)reader);
            }
            
            public final void aL(final String s) {
                this._setPointerField((SetPointerBuilder)Text.factory, 0, (Object)new Text.Reader(s));
            }
            
            public final Text.Builder aD(final int n) {
                return (Text.Builder)this._initPointerField((FromPointerBuilder)Text.factory, 0, n);
            }
            
            public final boolean sP() {
                return !this._pointerFieldIsNull(1);
            }
            
            public final Data.Builder sQ() {
                return (Data.Builder)this._getPointerField((FromPointerBuilderBlobDefault)Data.factory, 1, (ByteBuffer)null, 0, 0);
            }
            
            public final void i(final Data.Reader reader) {
                this._setPointerField((SetPointerBuilder)Data.factory, 1, (Object)reader);
            }
            
            public final void k(final byte[] array) {
                this._setPointerField((SetPointerBuilder)Data.factory, 1, (Object)new Data.Reader(array));
            }
            
            public final Data.Builder aE(final int n) {
                return (Data.Builder)this._initPointerField((FromPointerBuilder)Data.factory, 1, n);
            }
        }
        
        public static final class c extends StructReader
        {
            c(final SegmentReader segmentReader, final int n, final int n2, final int n3, final short n4, final int n5) {
                super(segmentReader, n, n2, n3, n4, n5);
            }
            
            public boolean sN() {
                return !this._pointerFieldIsNull(0);
            }
            
            public Text.Reader sR() {
                return (Text.Reader)this._getPointerField((FromPointerReaderBlobDefault)Text.factory, 0, (ByteBuffer)null, 0, 0);
            }
            
            public boolean sP() {
                return !this._pointerFieldIsNull(1);
            }
            
            public Data.Reader sS() {
                return (Data.Reader)this._getPointerField((FromPointerReaderBlobDefault)Data.factory, 1, (ByteBuffer)null, 0, 0);
            }
        }
    }
    
    public static final class c
    {
        public static final SegmentReader DZ;
        public static final SegmentReader Ea;
        
        static {
            DZ = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u0018\u00fb\u00ce\u00ec\u00d6«S\u00cf\u0015\u0000\u0000\u0000\u0002\u0000\u0000\u00006g\u00faB\u0087>\u00d9\u00f2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000*\u0001\u0000\u0000%\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0000\u0000\u00007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/types.capnp:PartySpeechMode\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\b\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0011\u0000\u0000\u0000J\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000R\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000everyone\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000proximity\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            Ea = GeneratedClassSupport.decodeRawBytes("\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000\u001e\u00171I#)T¶\u0015\u0000\u0000\u0000\u0001\u0000\u0000\u00006g\u00faB\u0087>\u00d9\u00f2\u0002\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0015\u0000\u0000\u0000:\u0001\u0000\u0000%\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0000\u0000\u0000w\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000protocol/types.capnp:P2pRendezvousInfo\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\b\u0000\u0000\u0000\u0003\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000)\u0000\u0000\u0000\u0082\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000(\u0000\u0000\u0000\u0003\u0000\u0001\u00004\u0000\u0000\u0000\u0002\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00001\u0000\u0000\u0000R\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00000\u0000\u0000\u0000\u0003\u0000\u0001\u0000<\u0000\u0000\u0000\u0002\u0000\u0001\u0000externalAddress\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000publicKey\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        }
    }
}
