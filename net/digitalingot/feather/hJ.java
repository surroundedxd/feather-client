// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.Locale;
import net.minecraft.client.resources.SimpleReloadableResourceManager;
import net.digitalingot.feather.mixin.core.k;
import net.minecraft.client.resources.FallbackResourceManager;
import java.util.Map;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.util.ResourceLocation;
import net.digitalingot.feather.mixin.core.d;
import net.minecraft.client.Minecraft;

@dV(eN = ec.MOTION_BLUR, eO = @eb(fj = "Motion Blur", fk = "https://assets.feathercdn.net/game/mods/motionblur.svg", fl = "", fm = { dk.a.PVP }))
public class hj extends dW<a>
{
    private static final String yk = "{\"targets\":[\"swap\",\"previous\"],\"passes\":[{\"name\":\"phosphor\",\"intarget\":\"minecraft:main\",\"outtarget\":\"swap\",\"auxtargets\":[{\"name\":\"PrevSampler\",\"id\":\"previous\"}],\"uniforms\":[{\"name\":\"Phosphor\",\"values\":[%.2f, %.2f, %.2f]}]},{\"name\":\"blit\",\"intarget\":\"swap\",\"outtarget\":\"previous\"},{\"name\":\"blit\",\"intarget\":\"swap\",\"outtarget\":\"minecraft:main\"}]}";
    private static final String yl = "fmblur";
    private boolean ym;
    private Object yn;
    
    public hj() {
        this.ym = false;
        this.yn = null;
    }
    
    @Override
    public void initialize() {
        final Minecraft minecraft;
        ao.bE.a(c -> {
            if (c != ao.c.START) {
                return;
            }
            else if (!this.eU()) {
                return;
            }
            else {
                Minecraft.func_71410_x();
                if (minecraft.field_71441_e == null || minecraft.field_71462_r != null) {
                    return;
                }
                else {
                    this.ji();
                    this.jg();
                    return;
                }
            }
        });
        ae.bk.a(() -> {
            if (this.eU()) {
                this.ym = false;
                this.yn = null;
            }
        });
    }
    
    @Override
    public void eP() {
        this.ym = false;
        this.yn = null;
    }
    
    @Override
    public void eQ() {
        this.jh();
        this.jj();
    }
    
    @Override
    public void eR() {
        c.i().b(() -> {
            if (this.eU()) {
                this.yn = null;
            }
        }, 1L);
    }
    
    private void jg() {
        final d d = (d)Minecraft.func_71410_x().field_71460_t;
        if (this.yn == null || d.feather$getEffect() != this.yn) {
            d.feather$loadShader(new ResourceLocation("fmblur", ""));
            this.yn = d.feather$getEffect();
        }
    }
    
    private void jh() {
        final EntityRenderer field_71460_t = Minecraft.func_71410_x().field_71460_t;
        final d d = (d)field_71460_t;
        if (this.yn != null) {
            if (d.feather$getEffect() == this.yn) {
                field_71460_t.func_181022_b();
            }
            this.yn = null;
        }
    }
    
    private void ji() {
        if (!this.ym) {
            getDomainResourceManagers().put("fmblur", new hk(this));
            this.ym = true;
        }
    }
    
    private void jj() {
        getDomainResourceManagers().remove("fmblur");
    }
    
    private static Map<String, FallbackResourceManager> getDomainResourceManagers() {
        return ((k)Minecraft.func_71410_x().func_110442_L()).getDomainResourceManagers();
    }
    
    hl jk() {
        return new hl(this.jl());
    }
    
    private String jl() {
        final double d = 0.6 + ((a)this.jK).yo / 251.0;
        return String.format(Locale.ROOT, "{\"targets\":[\"swap\",\"previous\"],\"passes\":[{\"name\":\"phosphor\",\"intarget\":\"minecraft:main\",\"outtarget\":\"swap\",\"auxtargets\":[{\"name\":\"PrevSampler\",\"id\":\"previous\"}],\"uniforms\":[{\"name\":\"Phosphor\",\"values\":[%.2f, %.2f, %.2f]}]},{\"name\":\"blit\",\"intarget\":\"swap\",\"outtarget\":\"previous\"},{\"name\":\"blit\",\"intarget\":\"swap\",\"outtarget\":\"minecraft:main\"}]}", d, d, d);
    }
    
    public static class a extends eg
    {
        @ex(fw = "blurAmount", fj = "Blur Amount", fY = "50", fo = @es(fU = 0))
        @em(fH = 0.0, fG = 100.0)
        public double yo;
    }
}
