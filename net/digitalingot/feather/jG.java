// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

public class jg
{
    public static final ju<jp> ER;
    public static final ju<jo> ES;
    public static final ju<jr> ET;
    public static final ju<jq> EU;
    public static final ju<jn> EV;
    public static final ju<jm> EW;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: getstatic       net/digitalingot/feather/jp.Fe:Lnet/minecraft/client/renderer/vertex/VertexFormat;
        //     7: aconst_null    
        //     8: invokedynamic   BootstrapMethod #0, apply:()Lnet/digitalingot/feather/ju$a;
        //    13: invokespecial   net/digitalingot/feather/ju.<init>:(Lnet/minecraft/client/renderer/vertex/VertexFormat;Ljava/util/function/Function;Lnet/digitalingot/feather/ju$a;)V
        //    16: putstatic       net/digitalingot/feather/jg.ER:Lnet/digitalingot/feather/ju;
        //    19: new             Lnet/digitalingot/feather/ju;
        //    22: dup            
        //    23: getstatic       net/digitalingot/feather/jo.Fe:Lnet/minecraft/client/renderer/vertex/VertexFormat;
        //    26: aconst_null    
        //    27: invokedynamic   BootstrapMethod #1, apply:()Lnet/digitalingot/feather/ju$a;
        //    32: invokespecial   net/digitalingot/feather/ju.<init>:(Lnet/minecraft/client/renderer/vertex/VertexFormat;Ljava/util/function/Function;Lnet/digitalingot/feather/ju$a;)V
        //    35: putstatic       net/digitalingot/feather/jg.ES:Lnet/digitalingot/feather/ju;
        //    38: new             Lnet/digitalingot/feather/ju;
        //    41: dup            
        //    42: getstatic       net/digitalingot/feather/jr.Fe:Lnet/minecraft/client/renderer/vertex/VertexFormat;
        //    45: aconst_null    
        //    46: invokedynamic   BootstrapMethod #2, apply:()Lnet/digitalingot/feather/ju$a;
        //    51: invokespecial   net/digitalingot/feather/ju.<init>:(Lnet/minecraft/client/renderer/vertex/VertexFormat;Ljava/util/function/Function;Lnet/digitalingot/feather/ju$a;)V
        //    54: putstatic       net/digitalingot/feather/jg.ET:Lnet/digitalingot/feather/ju;
        //    57: new             Lnet/digitalingot/feather/ju;
        //    60: dup            
        //    61: getstatic       net/digitalingot/feather/jq.Fe:Lnet/minecraft/client/renderer/vertex/VertexFormat;
        //    64: aconst_null    
        //    65: invokedynamic   BootstrapMethod #3, apply:()Lnet/digitalingot/feather/ju$a;
        //    70: invokespecial   net/digitalingot/feather/ju.<init>:(Lnet/minecraft/client/renderer/vertex/VertexFormat;Ljava/util/function/Function;Lnet/digitalingot/feather/ju$a;)V
        //    73: putstatic       net/digitalingot/feather/jg.EU:Lnet/digitalingot/feather/ju;
        //    76: new             Lnet/digitalingot/feather/ju;
        //    79: dup            
        //    80: getstatic       net/digitalingot/feather/jn.Fe:Lnet/minecraft/client/renderer/vertex/VertexFormat;
        //    83: aconst_null    
        //    84: invokedynamic   BootstrapMethod #4, apply:()Lnet/digitalingot/feather/ju$a;
        //    89: invokespecial   net/digitalingot/feather/ju.<init>:(Lnet/minecraft/client/renderer/vertex/VertexFormat;Ljava/util/function/Function;Lnet/digitalingot/feather/ju$a;)V
        //    92: putstatic       net/digitalingot/feather/jg.EV:Lnet/digitalingot/feather/ju;
        //    95: new             Lnet/digitalingot/feather/ju;
        //    98: dup            
        //    99: getstatic       net/digitalingot/feather/jm.Fe:Lnet/minecraft/client/renderer/vertex/VertexFormat;
        //   102: aconst_null    
        //   103: invokedynamic   BootstrapMethod #5, apply:()Lnet/digitalingot/feather/ju$a;
        //   108: invokespecial   net/digitalingot/feather/ju.<init>:(Lnet/minecraft/client/renderer/vertex/VertexFormat;Ljava/util/function/Function;Lnet/digitalingot/feather/ju$a;)V
        //   111: putstatic       net/digitalingot/feather/jg.EW:Lnet/digitalingot/feather/ju;
        //   114: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.NameVariables.generateNameForVariable(NameVariables.java:264)
        //     at com.strobel.decompiler.languages.java.ast.NameVariables.assignNamesToVariables(NameVariables.java:188)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:276)
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
}
