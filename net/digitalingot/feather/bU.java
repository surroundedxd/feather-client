// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import net.minecraft.client.gui.GuiScreen;
import org.cef.ICefRenderer;
import org.cef.ICefPlatform;
import org.cef.handler.CefMessageRouterHandler;
import org.cef.callback.CefQueryCallback;
import org.cef.handler.CefMessageRouterHandlerAdapter;
import org.cef.handler.CefLifeSpanHandler;
import org.cef.handler.CefLifeSpanHandlerAdapter;
import org.cef.handler.CefContextMenuHandler;
import org.cef.callback.CefMenuModel;
import org.cef.callback.CefContextMenuParams;
import org.cef.browser.CefFrame;
import org.cef.handler.CefContextMenuHandlerAdapter;
import org.cef.handler.CefAppHandler;
import org.cef.handler.CefAppHandlerAdapter;
import java.io.File;
import org.cef.CefSettings;
import org.cef.Async;
import org.cef.browser.CefMessageRouter;
import org.cef.browser.CefBrowser;
import org.cef.CefClient;
import org.cef.CefApp;
import net.minecraft.client.Minecraft;

public enum bu implements ao.a
{
    INSTANCE;
    
    private static final String URL;
    private final dZ<fX> coreGetter;
    private Minecraft minecraft;
    private CefApp cefApp;
    private CefClient cefClient;
    private CefBrowser cefBrowser;
    private bt renderer;
    private CefMessageRouter messageRouter;
    private bv screen;
    private int tickCount;
    
    private bu() {
        this.coreGetter = ea.a(fX.class);
        this.tickCount = 0;
    }
    
    private static String getUrl() {
        if (net.digitalingot.feather.c.k()) {
            if (System.getenv("FEATHER_LOCAL_TEST") != null) {
                return "http://127.0.0.1:4200/";
            }
            return "https://ig-client.feathermc.com/";
        }
        else {
            switch (bu$7.cu[net.digitalingot.feather.a.b().ordinal()]) {
                case 1: {
                    return "https://ig-client.feathermc.com/";
                }
                case 2: {
                    return "https://dev.mc-webapp.feathermc.com/";
                }
                case 3: {
                    return "https://beta.mc-webapp.feathermc.com/";
                }
                default: {
                    return "https://mc-webapp.feathermc.com/";
                }
            }
        }
    }
    
    public void initialize() {
        this.minecraft = Minecraft.func_71410_x();
        this.initializeCef();
        this.registerEvents();
    }
    
    private void initializeCef() {
        Async.setImpl((Async.Impl)new Async.Impl() {
            public void invokeLater(final Runnable runnable) {
                bu.this.minecraft.func_152344_a(runnable);
            }
            
            public void invokeAndWait(final Runnable runnable) {
                if (bu.this.minecraft.func_152345_ab()) {
                    runnable.run();
                }
                else {
                    bu.this.minecraft.func_152344_a(runnable).get();
                }
            }
        });
        if (!CefApp.startup((String[])null)) {
            throw new RuntimeException();
        }
        final CefSettings cefSettings = new CefSettings();
        cefSettings.windowless_rendering_enabled = true;
        cefSettings.cache_path = new File(net.digitalingot.feather.e.s().o(), "cef_cache").getAbsolutePath();
        cefSettings.locale = "en-US";
        if (net.digitalingot.feather.c.k()) {
            cefSettings.remote_debugging_port = 9222;
        }
        this.cefApp = CefApp.getInstance((String[])null, cefSettings);
        CefApp.addAppHandler((CefAppHandler)new CefAppHandlerAdapter(new String[] { "--external-message-pump", "--disable-threaded-scrolling=1", "--disable-features=TouchpadAndWheelScrollLatching,AsyncWheelEvents" }) {
            public void onScheduleMessagePumpWork(final long n) {
            }
        });
        (this.cefClient = this.cefApp.createClient()).addContextMenuHandler((CefContextMenuHandler)new CefContextMenuHandlerAdapter() {
            public void onBeforeContextMenu(final CefBrowser cefBrowser, final CefFrame cefFrame, final CefContextMenuParams cefContextMenuParams, final CefMenuModel cefMenuModel) {
                cefMenuModel.clear();
            }
        });
        this.cefClient.removeLifeSpanHandler();
        this.cefClient.addLifeSpanHandler((CefLifeSpanHandler)new CefLifeSpanHandlerAdapter() {
            public void onAfterCreated(final CefBrowser cefBrowser) {
                cefBrowser.setWindowlessFrameRate(144);
                super.onAfterCreated(cefBrowser);
            }
        });
        this.messageRouter = CefMessageRouter.create(new CefMessageRouter.CefMessageRouterConfig());
        this.cefClient.addMessageRouter(this.messageRouter);
        this.messageRouter.addHandler((CefMessageRouterHandler)new CefMessageRouterHandlerAdapter() {
            public boolean onQuery(final CefBrowser cefBrowser, final CefFrame cefFrame, final long n, final String s, final boolean b, final CefQueryCallback cefQueryCallback) {
                bX.s(s);
                return true;
            }
        }, true);
        this.renderer = new bt();
        (this.cefBrowser = this.cefClient.createBrowser(bu.URL, true, true, (ICefRenderer)this.renderer, (ICefPlatform)new ICefPlatform() {})).createImmediately();
        this.screen = new bv(this.cefApp, this.cefBrowser, (ICefRenderer)this.renderer);
    }
    
    private void registerEvents() {
        ao.bE.a(this);
        an.bD.a(() -> {
            if (this.isOpen()) {
                this.renderer.render();
            }
        });
    }
    
    public void show() {
        this.minecraft.func_147108_a((GuiScreen)this.screen);
        if (net.digitalingot.feather.e.s().m().b(fG.class).ht()) {
            fd.a(net.digitalingot.feather.e.s().m());
        }
    }
    
    @Override
    public void tick(@NotNull final ao.c c) {
        if (c == ao.c.END && this.cefBrowser != null && !(this.minecraft.field_71462_r instanceof bv) && ++this.tickCount % 20 == 0) {
            this.screen.bq();
            this.cefApp.N_DoMessageLoopWork();
        }
    }
    
    public int getPreferredWidth() {
        final int mw = iv.mw();
        final fX fx = this.coreGetter.fb();
        return (int)(mw * ((fx != null) ? fx.dK().qg.getScale() : 1.0f));
    }
    
    public int getPreferredHeight() {
        final int mx = iv.mx();
        final fX fx = this.coreGetter.fb();
        return (int)(mx * ((fx != null) ? fx.dK().qg.getScale() : 1.0f));
    }
    
    public CefBrowser getCefBrowser() {
        return this.cefBrowser;
    }
    
    public bv getScreen() {
        return this.screen;
    }
    
    public boolean isOpen() {
        return this.minecraft != null && (this.minecraft.field_71462_r instanceof bv || this.minecraft.field_71462_r instanceof bC);
    }
    
    private static /* synthetic */ bu[] $values() {
        return new bu[] { bu.INSTANCE };
    }
    
    static {
        $VALUES = $values();
        URL = getUrl();
    }
}
