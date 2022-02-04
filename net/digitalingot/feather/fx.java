// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.awt.Color;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.network.NetworkManager;
import java.net.InetSocketAddress;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiMainMenu;
import java.io.IOException;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@dV(eN = ec.CORE, eO = @eb(fj = "General", fk = "https://assets.feathercdn.net/game/sidebar/general.svg", fl = "General", fm = {}, fn = @eb.a(fj = "General", fo = @es(fU = 0))))
public class fX extends dW<a>
{
    @NotNull
    private final fY pH;
    private Minecraft minecraft;
    @Nullable
    private gs pI;
    @Nullable
    private i F;
    private int pJ;
    private boolean pK;
    private boolean pL;
    private boolean pM;
    
    public fX() {
        this.pH = new fY(this);
    }
    
    @Override
    public void initialize() {
        if (net.digitalingot.feather.a.b() != cF.a.IDE) {
            net.digitalingot.feather.a.a();
        }
        bM.initialize();
        fU.hJ();
        jS.FY.aM();
        bm.a(((a)this.jK).pO);
        jQ.initialize();
        try {
            this.F = new i();
            this.pI = gs.a(this.F);
        }
        catch (IOException | l ex) {
            final Throwable t;
            kr.Gh.error("Error while trying to authenticate with core backend", t);
            kr.Gh.error("For the time being, you need to be authenticated in order to participate in our beta.");
            Minecraft.func_71410_x().func_71400_g();
            return;
        }
        this.minecraft = Minecraft.func_71410_x();
        if (this.minecraft.field_71462_r != null && this.minecraft.field_71462_r instanceof GuiMainMenu) {
            aX.d(true);
            final bv screen = bu.INSTANCE.getScreen();
            screen.e(true);
            this.minecraft.func_147108_a((GuiScreen)screen);
        }
        final bv bv2;
        al.bk.a(bv -> {
            bu.INSTANCE.getScreen();
            if (bv instanceof GuiMainMenu) {
                if (!bv2.bp()) {
                    aX.d(true);
                    bv2.e(true);
                }
                return bv2;
            }
            else {
                if (bv2.bp()) {
                    aX.d(false);
                    bv2.e(false);
                }
                return bv;
            }
        });
        ad.bk.a(void1 -> {
            if (c.k()) {
                return;
            }
            else {
                new ga().a(void1);
                return;
            }
        });
        ag.bp.a((is, c) -> {
            if (c == ag.c.ALL) {
                ag.bw.aH().render(is, c);
            }
            return;
        });
        V.bk.a(s -> {
            if (!this.eU()) {
                return;
            }
            else {
                if (s.equals("cosmetics")) {
                    bu.INSTANCE.show();
                    u.ah();
                }
                return;
            }
        });
        final NetworkManager networkManager;
        final String s2;
        ab.bq.a((p0, netHandlerPlayClient) -> {
            if (aV.aV()) {
                return;
            }
            else {
                netHandlerPlayClient.func_147298_b();
                if (networkManager.func_150731_c()) {
                    return;
                }
                else if (Minecraft.func_71410_x().func_71356_B()) {
                    return;
                }
                else {
                    this.pJ = 40;
                    ((InetSocketAddress)networkManager.func_74430_c()).getHostName();
                    if ((s2.endsWith(".") ? s2.substring(0, s2.length() - 1) : s2).toLowerCase().contains("hypixel.net")) {
                        jP.a(new jP(jO.HYPIXEL));
                    }
                    else {
                        jP.a(new jP(jO.OTHER));
                    }
                    return;
                }
            }
        });
        ab.br.a((p0, p1) -> {
            jP.a(null);
            e.s().m().fd();
            bh.a(e.s().m());
            return;
        });
        ao.bE.a(p0 -> {
            if (this.pJ > 0 && --this.pJ == 0) {
                jS.FY.tV();
            }
            return;
        });
        bM.a(() -> ((a)this.jK).qi, () -> {
            if (this.minecraft.field_71462_r != null) {
                return;
            }
            else {
                this.minecraft.func_147108_a((GuiScreen)new bC());
                return;
            }
        }, null);
        ai.bk.a((entity, a) -> this.pH.a(entity, a.aF(), a.aG()));
        new fZ().initialize();
        this.pK = ((a)this.jK).pS;
        this.pL = ((a)this.jK).pT;
        this.pM = ((a)this.jK).pP;
    }
    
    @Override
    public void eQ() {
        if (this.F != null) {
            this.F.close();
            this.F = null;
        }
    }
    
    @Override
    public void eR() {
        bu.INSTANCE.getScreen().bq();
        final bj n = e.s().n();
        final cT be = n.bd().be();
        be.c(((a)this.jK).qd);
        be.u(((a)this.jK).qe.getURL());
        bk.a(n);
        bm.a(((a)this.jK).pO);
        if (((a)this.jK).pS != this.pK || ((a)this.jK).pT != this.pL) {
            this.minecraft.func_110436_a();
            this.pK = ((a)this.jK).pS;
            this.pL = ((a)this.jK).pT;
        }
        if (((a)this.jK).pP != this.pM) {
            this.pM = ((a)this.jK).pP;
            Minecraft.func_71410_x().func_71352_k();
            Minecraft.func_71410_x().func_71352_k();
        }
    }
    
    @Nullable
    public gs hM() {
        return this.pI;
    }
    
    @Nullable
    public i hN() {
        return this.F;
    }
    
    @NotNull
    public fY hO() {
        return this.pH;
    }
    
    public static class a extends eg
    {
        @es(fU = 0)
        public fc pN;
        @ex(fw = "mainColor", fj = "Main Color", fY = "221/53/56", fo = @es(fU = 1))
        public Color pO;
        @ex(fw = "borderlessFullscreen", fj = "Borderless Fullscreen", fo = @es(fU = 2))
        public boolean pP;
        @ex(fw = "fullBright", fj = "Full Bright", fY = "true", fo = @es(fU = 3))
        public boolean pQ;
        @ex(fw = "alwaysNametag", fj = "Nametag in perspective", fY = "true", fo = @es(fU = 4))
        public boolean pR;
        @ex(fw = "clearGlass", fj = "Clear Glass", fY = "false", fo = @es(fU = 5))
        public boolean pS;
        @ex(fw = "clearColoredGlass", fj = "Clear Colored Glass", fY = "false", gb = @et(fw = "clearGlass"), fo = @es(fU = 6))
        public boolean pT;
        @ex(fw = "minimalViewBobbing", fj = "Minimal View Bobbing", fY = "false", fo = @es(fU = 8))
        public boolean pU;
        @ex(fw = "fireHeight", fj = "Fire Height", fY = "0.3", fo = @es(fU = 9))
        @em(fH = 0.0, fG = 1.0)
        public double pV;
        @es(fU = 20)
        public fc pW;
        @ex(fw = "chromaMode", fj = "Type", fY = "normal", fo = @es(fU = 21))
        public iN pX;
        @ex(fw = "chromaSpeed", fj = "Speed", fY = "10", gb = @et(fw = "chromaMode", fV = { "breathing" }), fo = @es(fU = 22))
        @em(fH = 1.0, fG = 25.0)
        public double pY;
        @es(fU = 30)
        public fc pZ;
        @ex(fw = "showModsInChat", fj = "Show Mods in Chat", fo = @es(fU = 31))
        public boolean qa;
        @ex(fw = "showModsInInventory", fj = "Show Mods in Inventory", fY = "true", fo = @es(fU = 32))
        public boolean qb;
        @es(fU = 40)
        public fc qc;
        @ex(fw = "modPreview", fj = "Mod Preview", fY = "true", fo = @es(fU = 41))
        public boolean qd;
        @ex(fw = "modPreviewBackground", fj = "Background", fY = "mountains", fo = @es(fU = 42), gb = @et(fw = "modPreview"))
        public fX.a.a qe;
        @es(fU = 50)
        public fc qf;
        @ex(fw = "uiQuality", fj = "Quality", fY = "ultra", fo = @es(fU = 52))
        public bz qg;
        @ex(fw = "militaryTime", fj = "24 Hour Close", fo = @es(fU = 53))
        public boolean jj;
        @es(fU = 60)
        public fc qh;
        @ex(fw = "keyHudEditor", fj = "Open HUD Editor", fY = "10016", fo = @es(fU = 61))
        public bK qi;
        @ex(fw = "snappingLineColor", fj = "Line Color", fY = "128/255/255/255", fo = @es(fU = 62))
        public Color qj;
        @ex(fw = "snappingLineWidth", fj = "Line Width", fY = "1", fo = @es(fU = 63))
        @er(fS = 1, fR = 7)
        public int qk;
        @ex(fw = "snappingMagnetRadius", fj = "Magnet Radius", fY = "6", fo = @es(fU = 64))
        @er(fS = 1, fR = 15)
        public int ql;
        @es(fU = 70)
        public fc qm;
        @ex(fw = "menusBlur", fj = "Menu", fY = "false", fo = @es(fU = 72))
        public boolean qn;
        @es(fU = 80)
        public fc qo;
        @ex(fw = "portalSound", fj = "Portal Sounds", fY = "true", fo = @es(fU = 81))
        public boolean qp;
        @es(fU = 90)
        public fc qq;
        @ex(fw = "customDropStack", fj = "Custom Dropstack", fY = "17", fo = @es(fU = 91))
        public bK qr;
        
        public a() {
            this.pN = new fc("General Settings");
            this.pW = new fc("Chroma Settings");
            this.pZ = new fc("Mods");
            this.qc = new fc("Mod Preview");
            this.qf = new fc("UI");
            this.qh = new fc("HUD Editor");
            this.qm = new fc("Blur Settings");
            this.qo = new fc("Sound");
            this.qq = new fc("Keybinds");
        }
        
        @Override
        public boolean dI() {
            return true;
        }
        
        enum a
        {
            @eo(fw = "mountains", fj = "Mountains")
            MOUNTAINS("https://assets.feathercdn.net/game/modpreview/background1.webp"), 
            @eo(fw = "ocean", fj = "Ocean")
            OCEAN("https://assets.feathercdn.net/game/modpreview/background2.webp"), 
            @eo(fw = "skyblock", fj = "Skyblock")
            SKYBLOCK("https://assets.feathercdn.net/game/modpreview/background3.webp"), 
            @eo(fw = "stone", fj = "Stone")
            STONE("https://assets.feathercdn.net/game/modpreview/stone.webp");
            
            private final String url;
            
            private a(final String url) {
                this.url = url;
            }
            
            public String getURL() {
                return this.url;
            }
            
            private static /* synthetic */ a[] $values() {
                return new a[] { a.MOUNTAINS, a.OCEAN, a.SKYBLOCK, a.STONE };
            }
            
            static {
                $VALUES = $values();
            }
        }
    }
}
