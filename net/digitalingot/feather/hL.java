// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.Nullable;
import net.minecraft.client.resources.data.IMetadataSection;
import org.jetbrains.annotations.NotNull;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.IOUtils;
import java.nio.charset.StandardCharsets;
import java.io.InputStream;
import net.minecraft.client.resources.IResource;

class hl implements IResource
{
    private final InputStream yq;
    
    public hl(final String s) {
        this.yq = IOUtils.toInputStream(s, StandardCharsets.UTF_8);
    }
    
    public ResourceLocation func_177241_a() {
        return null;
    }
    
    @NotNull
    public InputStream func_110527_b() {
        return this.yq;
    }
    
    public boolean func_110528_c() {
        return false;
    }
    
    @Nullable
    public <T extends IMetadataSection> T func_110526_a(final String s) {
        return null;
    }
    
    public String func_177240_d() {
        return null;
    }
}
