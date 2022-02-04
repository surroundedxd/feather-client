// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.client.renderer.GlStateManager;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.resources.ResourcePackRepository;

public class kw implements kl<ResourcePackRepository.Entry>
{
    private final ResourceLocation GC;
    
    public kw() {
        this.GC = new ResourceLocation("textures/misc/unknown_pack.png");
    }
    
    @Override
    public void a(final iM im, final is is, final ResourcePackRepository.Entry entry, final float n, final float n2, final eZ ez, final boolean b) {
        im.a(is, entry.func_110515_d(), n, n2, ez, b);
    }
    
    @Override
    public void a(final iM im, final is is, final ResourcePackRepository.Entry entry, final float n, final float n2, final int n3, final boolean b) {
        final List func_78271_c = Minecraft.func_71410_x().field_71466_p.func_78271_c(entry.func_110519_e(), 157);
        int n4 = 0;
        final Iterator<String> iterator = func_78271_c.iterator();
        while (iterator.hasNext()) {
            im.a(is, iterator.next(), n, n2 + n4, n3, b, false);
            n4 += 12;
        }
    }
    
    public void a(final ResourcePackRepository.Entry entry) {
        entry.func_110518_a(Minecraft.func_71410_x().func_110434_K());
    }
    
    @Override
    public void tZ() {
        Minecraft.func_71410_x().func_110434_K().func_110577_a(this.GC);
    }
    
    @Override
    public void a(final iM im, final is is, final int n, final int n2, final int n3) {
        GlStateManager.func_179147_l();
        GlStateManager.func_179112_b(770, 771);
        GlStateManager.func_179090_x();
        im.a(is, n, n2, 0.0f, 0.0f, n3, n3, n3, n3, (float)n3, (float)n3);
        GlStateManager.func_179098_w();
    }
}
