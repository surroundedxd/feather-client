// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import java.util.UUID;
import org.jetbrains.annotations.Nullable;

public class hD
{
    @Nullable
    private final hL zY;
    @NotNull
    private final UUID zZ;
    @NotNull
    private final hZ.c Aa;
    private final long Ab;
    private final byte[] Ac;
    
    public hD(@Nullable final hL zy, @NotNull final UUID zz, @NotNull final hZ.c aa, final long ab, final byte[] ac) {
        this.zY = zy;
        this.zZ = zz;
        this.Aa = aa;
        this.Ab = ab;
        this.Ac = ac;
    }
    
    @Nullable
    public hL jX() {
        return this.zY;
    }
    
    @NotNull
    public UUID jY() {
        return this.zZ;
    }
    
    @NotNull
    public hZ.c jZ() {
        return this.Aa;
    }
    
    public long ka() {
        return this.Ab;
    }
    
    public byte[] kb() {
        return this.Ac;
    }
}
