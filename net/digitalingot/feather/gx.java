// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.Arrays;
import net.minecraft.util.IChatComponent;
import java.util.stream.Stream;
import java.util.function.Predicate;
import java.util.Objects;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import java.util.regex.Pattern;
import java.util.List;

public class gX extends ha<gZ.a>
{
    private static final List<String> wK;
    private static final Pattern wL;
    private static final Pattern wM;
    private static final Pattern wN;
    private static final Pattern wO;
    private static final Pattern wP;
    private static final Pattern wQ;
    private int qN;
    
    gX(@NotNull final dW<gZ.a> dw) {
        super(dw);
        this.qN = -1;
    }
    
    @Override
    public boolean iN() {
        return ((gZ.a)this.xu.dK()).xc;
    }
    
    @Override
    public void initialize() {
        final String s;
        Q.bk.a(chatComponent -> {
            if (!this.eU()) {
                return chatComponent;
            }
            else {
                chatComponent.func_150260_c();
                if (s.isEmpty()) {
                    return chatComponent;
                }
                else {
                    if (!this.Z(s) && this.Y(s)) {
                        this.qN = ((gZ.a)this.xu.dK()).xd;
                    }
                    return chatComponent;
                }
            }
        });
        EntityPlayerSP field_71439_g;
        ao.bE.a(c -> {
            if (!(!this.eU())) {
                if (c == ao.c.START) {
                    field_71439_g = Minecraft.func_71410_x().field_71439_g;
                    if (field_71439_g != null) {
                        if (this.qN == 0) {
                            field_71439_g.func_71165_d("/ac gg");
                            this.qN = -1;
                        }
                        else if (this.qN > 0) {
                            --this.qN;
                        }
                    }
                }
            }
        });
    }
    
    private boolean Y(final String obj) {
        final Stream<Object> stream = gX.wK.stream();
        Objects.requireNonNull(obj);
        return stream.anyMatch((Predicate<? super Object>)obj::contains);
    }
    
    private boolean Z(final String s) {
        return gX.wQ.matcher(s).matches() || gX.wM.matcher(s).matches() || gX.wN.matcher(s).matches() || gX.wL.matcher(s).matches() || gX.wO.matcher(s).matches() || gX.wP.matcher(s).matches();
    }
    
    static {
        wK = Arrays.asList("1st Killer - ", "1st Place - ", "Winner: ", " - Damage Dealt - ", "Winning Team - ", "1st - ", "Winners: ", "Winner: ", "Winning Team: ", " won the game!", "Top Seeker: ", "1st Place: ", "Last team standing!", "Winner #1 (", "Top Survivors", "Winners - ");
        wL = Pattern.compile("(?<rank>\\.get(.+) )?(?<player>\\S{1,16}): (?<message>.*)");
        wM = Pattern.compile("Guild > (?<rank>\\.get(.+) )?(?<player>\\S{1,16}): (?<message>.*)");
        wN = Pattern.compile("Party > (?<rank>\\.get(.+) )?(?<player>\\S{1,16}): (?<message>.*)");
        wO = Pattern.compile("\\.get(SHOUT) (?<rank>\\.get(.+) )?(?<player>\\S{1,16}): (?<message>.*)");
        wP = Pattern.compile("\\.get(SPECTATOR) (?<rank>\\.get(.+) )?(?<player>\\S{1,16}): (?<message>.*)");
        wQ = Pattern.compile("\\.get(TEAM) (?<rank>\\.get(.+) )?(?<player>\\S{1,16}): (?<message>.*)");
    }
}
