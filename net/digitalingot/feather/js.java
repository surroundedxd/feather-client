// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.digitalingot.featherserverapi.proto.ServerboundWrapper;
import net.digitalingot.featherserverapi.proto.ClientHello;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import net.digitalingot.featherserverapi.proto.models.PacketType;
import net.digitalingot.featherserverapi.proto.SetWaypoints;
import java.util.List;
import net.digitalingot.featherserverapi.proto.DisableMods;
import java.nio.charset.StandardCharsets;
import net.digitalingot.featherserverapi.proto.ClientboundWrapper;
import net.minecraft.client.Minecraft;
import com.google.gson.Gson;
import org.jetbrains.annotations.NotNull;

public class jS
{
    @NotNull
    public static final jS FY;
    @NotNull
    private static final String FZ = "feather:client";
    @NotNull
    private final Gson Ga;
    
    public jS() {
        this.Ga = new Gson();
    }
    
    public void aM() {
        jR.a("feather:client", this::m);
    }
    
    private void m(final byte[] bytes) {
        ClientboundWrapper clientboundWrapper;
        DisableMods disableMods;
        SetWaypoints setWaypoints;
        Minecraft.func_71410_x().func_152344_a(() -> {
            try {
                clientboundWrapper = (ClientboundWrapper)this.Ga.fromJson(new String(bytes, StandardCharsets.UTF_8), (Class)ClientboundWrapper.class);
                switch (jS$1.Gb[clientboundWrapper.getPacketType().ordinal()]) {
                    case 1: {
                        disableMods = (DisableMods)this.Ga.fromJson(clientboundWrapper.getPayload(), (Class)DisableMods.class);
                        e.s().m().h(disableMods.getMods());
                        kr.Gh.info("Received instruction to disable mods from server: " + disableMods.getMods());
                        break;
                    }
                    case 2: {
                        setWaypoints = (SetWaypoints)this.Ga.fromJson(clientboundWrapper.getPayload(), (Class)SetWaypoints.class);
                        break;
                    }
                    case 3: {
                        jP.tN().ifPresent(jp -> jp.v(true));
                        kr.Gh.info("Received instruction to disable hit delay from server");
                        break;
                    }
                }
            }
            catch (Exception ex) {
                kr.Gh.error("Exception during feather packet receive from server", (Throwable)ex);
            }
        });
    }
    
    public void tV() {
        this.a(PacketType.Serverbound.CLIENT_HELLO, new ClientHello((List)e.s().m().dN().values().stream().filter(dW::eU).map((Function<? super dW<?>, ?>)dW::eT).map((Function<? super Object, ?>)dV::eN).map((Function<? super Object, ?>)ec::getSlug).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList())));
    }
    
    private void a(@NotNull final PacketType.Serverbound obj, @NotNull final Object o) {
        if (Minecraft.func_71410_x().func_147114_u() == null) {
            return;
        }
        kr.Gh.debug("Sending " + obj + " to server over plugin messaging channel");
        jR.a("feather:client", this.Ga.toJson((Object)new ServerboundWrapper(obj, this.Ga.toJsonTree(o))).getBytes(StandardCharsets.UTF_8));
    }
    
    static {
        FY = new jS();
    }
}
