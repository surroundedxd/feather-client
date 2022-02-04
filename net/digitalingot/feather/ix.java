// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.world.World;
import net.minecraft.client.renderer.chunk.RenderChunk;
import java.util.Iterator;
import net.minecraft.entity.Entity;
import net.digitalingot.feather.mixin.client.bT;
import java.util.ConcurrentModificationException;
import net.digitalingot.feather.mixin.core.i;
import net.minecraft.util.MathHelper;
import java.util.Objects;
import net.minecraft.util.AxisAlignedBB;
import java.util.BitSet;
import net.minecraft.client.Minecraft;

public class iX
{
    private static final dZ<fI> PERFORMANCE;
    public static int Ex;
    public static int Ey;
    private final Minecraft nQ;
    private final iW Ez;
    private final jb EA;
    private final int EB = 128;
    private final double EC = 0.5;
    private long qJ;
    private int ED;
    private final BitSet EE;
    private final iZ EF;
    private final iY EG;
    private final iY[] EH;
    private boolean EI;
    
    public iX(final iW ez, final jb ea) {
        this.EI = false;
        this.nQ = Minecraft.func_71410_x();
        this.Ez = ez;
        this.EA = ea;
        this.EE = new BitSet();
        this.EF = new iZ();
        this.EG = new iY();
        this.EH = new iY[8];
        for (int i = 0; i < this.EH.length; ++i) {
            this.EH[i] = new iY();
        }
        final int ex;
        jX.a(() -> {
            ex = iX.Ex;
            iX.Ex = 0;
            return "[Feather Culling] Skipped entities: " + ex;
        });
        jX.a(() -> {
            if (iX.Ey != 0) {
                this.ED = iX.Ey;
                iX.Ey = 0;
            }
            return "[Feather Culling] Skipped part ticks: " + this.ED;
        });
        jX.tW();
    }
    
    public void te() {
        ao.bF.a((p0, p1) -> this.EI = true);
    }
    
    public void tf() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_0        
        //     5: invokedynamic   BootstrapMethod #3, run:(Lnet/digitalingot/feather/iX;)Ljava/lang/Runnable;
        //    10: ldc             "Culling Thread"
        //    12: invokespecial   java/lang/Thread.<init>:(Ljava/lang/Runnable;Ljava/lang/String;)V
        //    15: astore_1       
        //    16: aload_1        
        //    17: invokedynamic   BootstrapMethod #4, uncaughtException:()Ljava/lang/Thread$UncaughtExceptionHandler;
        //    22: invokevirtual   java/lang/Thread.setUncaughtExceptionHandler:(Ljava/lang/Thread$UncaughtExceptionHandler;)V
        //    25: aload_1        
        //    26: invokevirtual   java/lang/Thread.start:()V
        //    29: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.trySimplifyGoto(GotoRemoval.java:248)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:66)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void tg() {
        ++iX.Ex;
    }
    
    public boolean a(final AxisAlignedBB axisAlignedBB, final iY iy) {
        final double field_72340_a = axisAlignedBB.field_72340_a;
        Objects.requireNonNull(this);
        final int func_76128_c = MathHelper.func_76128_c(field_72340_a - 0.5);
        final double field_72338_b = axisAlignedBB.field_72338_b;
        Objects.requireNonNull(this);
        final int func_76128_c2 = MathHelper.func_76128_c(field_72338_b - 0.5);
        final double field_72339_c = axisAlignedBB.field_72339_c;
        Objects.requireNonNull(this);
        final int func_76128_c3 = MathHelper.func_76128_c(field_72339_c - 0.5);
        final double field_72336_d = axisAlignedBB.field_72336_d;
        Objects.requireNonNull(this);
        final int func_76128_c4 = MathHelper.func_76128_c(field_72336_d + 0.5);
        final double field_72337_e = axisAlignedBB.field_72337_e;
        Objects.requireNonNull(this);
        final int func_76128_c5 = MathHelper.func_76128_c(field_72337_e + 0.5);
        final double field_72334_f = axisAlignedBB.field_72334_f;
        Objects.requireNonNull(this);
        final int func_76128_c6 = MathHelper.func_76128_c(field_72334_f + 0.5);
        this.EF.aF(MathHelper.func_76128_c(iy.eB()));
        this.EF.aG(MathHelper.func_76128_c(iy.eC()));
        this.EF.aH(MathHelper.func_76128_c(iy.tk()));
        final a from = a.from(func_76128_c, func_76128_c4, this.EF.cZ());
        final a from2 = a.from(func_76128_c2, func_76128_c5, this.EF.da());
        final a from3 = a.from(func_76128_c3, func_76128_c6, this.EF.ln());
        if (from == a.INSIDE && from2 == a.INSIDE && from3 == a.INSIDE) {
            return true;
        }
        this.EE.clear();
        int bitIndex = 0;
        for (int i = func_76128_c; i <= func_76128_c4; ++i) {
            for (int j = func_76128_c2; j <= func_76128_c5; ++j) {
                for (int k = func_76128_c3; k <= func_76128_c6; ++k) {
                    final int l = this.i(i, j, k);
                    if (l == 1) {
                        return true;
                    }
                    if (l != 0) {
                        this.EE.set(bitIndex);
                    }
                    ++bitIndex;
                }
            }
        }
        int bitIndex2 = 0;
        for (int n = func_76128_c; n <= func_76128_c4; ++n) {
            final boolean b = n == func_76128_c;
            final boolean b2 = n == func_76128_c4;
            for (int n2 = func_76128_c2; n2 <= func_76128_c5; ++n2) {
                final boolean b3 = n2 == func_76128_c2;
                final boolean b4 = n2 == func_76128_c5;
                for (int n3 = func_76128_c3; n3 <= func_76128_c6; ++n3) {
                    final boolean b5 = n3 == func_76128_c3;
                    final boolean b6 = n3 == func_76128_c6;
                    if (!this.EE.get(bitIndex2)) {
                        if (((b && from == a.POSITIVE) || (b2 && from == a.NEGATIVE) || (b3 && from2 == a.POSITIVE) || (b4 && from2 == a.NEGATIVE) || (b5 && from3 == a.POSITIVE) || (b6 && from3 == a.NEGATIVE)) && this.a(iy, n, n2, n3)) {
                            return true;
                        }
                        ++bitIndex2;
                    }
                }
            }
        }
        return false;
    }
    
    private boolean a(final iY iy, final double n, final double n2, final double n3) {
        int n4 = 0;
        this.EH[n4++].f(0.05 + n, 0.05 + n2, 0.05 + n3);
        this.EH[n4++].f(0.95 + n, 0.05 + n2, 0.05 + n3);
        this.EH[n4++].f(0.05 + n, 0.95 + n2, 0.05 + n3);
        this.EH[n4++].f(0.05 + n, 0.05 + n2, 0.95 + n3);
        this.EH[n4++].f(0.95 + n, 0.95 + n2, 0.05 + n3);
        this.EH[n4++].f(0.05 + n, 0.95 + n2, 0.95 + n3);
        this.EH[n4++].f(0.95 + n, 0.05 + n2, 0.95 + n3);
        this.EH[n4++].f(0.95 + n, 0.95 + n2, 0.95 + n3);
        return this.a(iy, this.EH, n4);
    }
    
    private boolean a(final iY iy, final iY[] array, final int n) {
        final int cz = this.EF.cZ();
        final int da = this.EF.da();
        final int ln = this.EF.ln();
        for (final iY iy2 : array) {
            final double a = iy.eB() - iy2.eB();
            final double a2 = iy.eC() - iy2.eC();
            final double a3 = iy.tk() - iy2.tk();
            final double abs = Math.abs(a);
            final double abs2 = Math.abs(a2);
            final double abs3 = Math.abs(a3);
            final double n2 = 1.0 / abs;
            final double n3 = 1.0 / abs2;
            final double n4 = 1.0 / abs3;
            int n5 = 1;
            int n6;
            double n7;
            if (abs == 0.0) {
                n6 = 0;
                n7 = n2;
            }
            else if (iy2.eB() > iy.eB()) {
                n6 = 1;
                n5 += this.c(iy2.eB()) - cz;
                n7 = (float)((cz + 1 - iy.eB()) * n2);
            }
            else {
                n6 = -1;
                n5 += cz - this.c(iy2.eB());
                n7 = (float)((iy.eB() - cz) * n2);
            }
            int n8;
            double n9;
            if (abs2 == 0.0) {
                n8 = 0;
                n9 = n3;
            }
            else if (iy2.eC() > iy.eC()) {
                n8 = 1;
                n5 += this.c(iy2.eC()) - da;
                n9 = (float)((da + 1 - iy.eC()) * n3);
            }
            else {
                n8 = -1;
                n5 += da - this.c(iy2.eC());
                n9 = (float)((iy.eC() - da) * n3);
            }
            int n10;
            double n11;
            if (abs3 == 0.0) {
                n10 = 0;
                n11 = n4;
            }
            else if (iy2.tk() > iy.tk()) {
                n10 = 1;
                n5 += this.c(iy2.tk()) - ln;
                n11 = (float)((ln + 1 - iy.tk()) * n4);
            }
            else {
                n10 = -1;
                n5 += ln - this.c(iy2.tk());
                n11 = (float)((iy.tk() - ln) * n4);
            }
            if (this.a(iy, cz, da, ln, n2, n3, n4, n5, n6, n8, n10, n7, n9, n11)) {
                final int n12 = this.c(array[0].eB()) - this.EF.cZ();
                Objects.requireNonNull(this);
                final int n13 = n12 + 128;
                final int n14 = this.c(array[0].eC()) - this.EF.da();
                Objects.requireNonNull(this);
                final int n15 = n14 + 128;
                final int n16 = this.c(array[0].tk()) - this.EF.ln();
                Objects.requireNonNull(this);
                this.EA.j(n13, n15, n16 + 128);
                return true;
            }
        }
        final int n17 = this.c(array[0].eB()) - this.EF.cZ();
        Objects.requireNonNull(this);
        final int n18 = n17 + 128;
        final int n19 = this.c(array[0].eC()) - this.EF.da();
        Objects.requireNonNull(this);
        final int n20 = n19 + 128;
        final int n21 = this.c(array[0].tk()) - this.EF.ln();
        Objects.requireNonNull(this);
        this.EA.k(n18, n20, n21 + 128);
        return false;
    }
    
    private boolean a(final iY iy, int n, int n2, int n3, final double n4, final double n5, final double n6, int i, final int n7, final int n8, final int n9, double n10, double n11, double n12) {
        while (i > 1) {
            final int j = this.i(n, n2, n3);
            if (j == 2) {
                return false;
            }
            if (j == 0) {
                if (!this.Ez.q(n >> 4, n3 >> 4)) {
                    return false;
                }
                if (this.Ez.d(n, n2, n3)) {
                    this.EA.tm();
                    return false;
                }
                this.EA.tl();
            }
            if (n11 < n10 && n11 < n12) {
                n2 += n8;
                n11 += n5;
            }
            else if (n10 < n11 && n10 < n12) {
                n += n7;
                n10 += n4;
            }
            else {
                n3 += n9;
                n12 += n6;
            }
            --i;
        }
        return true;
    }
    
    private int i(int a, int a2, int a3) {
        a -= this.EF.cZ();
        a2 -= this.EF.da();
        a3 -= this.EF.ln();
        if (Math.abs(a) > 126 || Math.abs(a2) > 126 || Math.abs(a3) > 126) {
            return -1;
        }
        return this.EA.l(a + 128, a2 + 128, a3 + 128);
    }
    
    private int c(final double n) {
        final int n2 = (int)n;
        return (n < n2) ? (n2 - 1) : n2;
    }
    
    static {
        PERFORMANCE = ea.a(fI.class);
        iX.Ex = 0;
        iX.Ey = 0;
    }
    
    enum a
    {
        INSIDE, 
        POSITIVE, 
        NEGATIVE;
        
        public static a from(final int n, final int n2, final int n3) {
            if (n2 > n3 && n > n3) {
                return a.POSITIVE;
            }
            if (n < n3 && n2 < n3) {
                return a.NEGATIVE;
            }
            return a.INSIDE;
        }
        
        private static /* synthetic */ a[] $values() {
            return new a[] { a.INSIDE, a.POSITIVE, a.NEGATIVE };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
