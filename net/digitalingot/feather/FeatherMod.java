// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(modid = "feather", name = "Feather Client", version = "1.0.0-SNAPSHOT", clientSideOnly = true, acceptedMinecraftVersions = "[1.8.9]")
public class FeatherMod
{
    @Mod.EventHandler
    public void a(final FMLInitializationEvent fmlInitializationEvent) {
        if (fmlInitializationEvent.getSide() != Side.CLIENT) {
            return;
        }
        new c(Minecraft.func_71410_x()).a(ft.mc);
    }
    
    @Mod.EventHandler
    public void a(final FMLPostInitializationEvent fmlPostInitializationEvent) {
        if (fmlPostInitializationEvent.getSide() != Side.CLIENT) {
            return;
        }
        ad.bk.aH().registerCommands(null);
    }
}
