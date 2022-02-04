// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.net.SocketAddress;
import org.jetbrains.annotations.NotNull;
import java.net.InetSocketAddress;
import org.jetbrains.annotations.Nullable;
import com.google.gson.annotations.SerializedName;

public class dE implements bY
{
    @SerializedName("id")
    private final int id;
    @SerializedName("server_port")
    @Nullable
    private final Integer kg;
    @SerializedName("peer")
    @NotNull
    private final InetSocketAddress kh;
    @SerializedName("peer_enc_pk")
    private final byte[] ki;
    
    public dE(final int id, @Nullable final Integer kg, @NotNull final InetSocketAddress kh, final byte[] ki) {
        this.id = id;
        this.kg = kg;
        this.kh = kh;
        this.ki = ki;
    }
    
    public int eg() {
        return this.id;
    }
    
    @Nullable
    public Integer eh() {
        return this.kg;
    }
    
    @NotNull
    public SocketAddress ei() {
        return this.kh;
    }
    
    public byte[] ej() {
        return this.ki;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.PUNCH_HOLE;
    }
}
