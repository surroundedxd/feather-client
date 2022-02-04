// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiSelectWorld;
import net.minecraft.client.gui.GuiMainMenu;
import java.util.Arrays;
import net.minecraft.client.Minecraft;
import java.util.function.Consumer;

public class bb implements cb<da, cp, cn>
{
    @Override
    public void a(final da da, final Consumer<cp> consumer, final Consumer<cn> consumer2) {
        final Minecraft func_71410_x = Minecraft.func_71410_x();
        final cR cr2 = Arrays.stream(cR.values()).filter(cr -> cr.getSlug().equals(da.dw())).findAny().orElse(null);
        if (cr2 != null) {
            switch (bb$1.ca[cr2.ordinal()]) {
                case 1: {
                    func_71410_x.func_147108_a((GuiScreen)new GuiSelectWorld((GuiScreen)new GuiMainMenu()));
                    break;
                }
                case 2: {
                    func_71410_x.func_147108_a((GuiScreen)new GuiMultiplayer((GuiScreen)new GuiMainMenu()));
                    break;
                }
                case 3: {
                    u.ah();
                    break;
                }
                case 4: {
                    Minecraft.func_71410_x().func_71400_g();
                    break;
                }
            }
            consumer.accept(new cp("success"));
            return;
        }
        final cQ cq2 = Arrays.stream(cQ.values()).filter(cq -> cq.getSlug().equals(da.dw())).findAny().orElse(null);
        if (cq2 != null) {
            switch (bb$1.cb[cq2.ordinal()]) {
                case 1: {
                    func_71410_x.func_147108_a((GuiScreen)new GuiOptions((GuiScreen)new GuiMainMenu(), func_71410_x.field_71474_y));
                    break;
                }
                case 2: {
                    throw new IllegalStateException("Realms only supported on the latest minecraft version");
                }
                case 3: {
                    aV.aU();
                    break;
                }
            }
            consumer.accept(new cp("success"));
            return;
        }
        final cS cs2 = Arrays.stream(cS.values()).filter(cs -> cs.getSlug().equals(da.dw())).findAny().orElse(null);
        if (cs2 != null) {
            switch (bb$1.cc[cs2.ordinal()]) {
                case 1: {
                    Minecraft.func_71410_x().func_147108_a((GuiScreen)new bC());
                    break;
                }
            }
            consumer.accept(new cp("success"));
            return;
        }
        throw new IllegalStateException("Selection not found");
    }
}
