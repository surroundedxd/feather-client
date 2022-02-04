// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather.mixin.client;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import net.minecraft.util.ClassInheritanceMultiMap;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = { ClassInheritanceMultiMap.class }, targets = { "net.minecraft.util.ClassInheritanceMultiMap$1" })
public class ay
{
    @Redirect(method = { "iterator()Ljava/util/Iterator;" }, at = @At(value = "INVOKE", target = "Lcom/google/common/collect/Iterators;emptyIterator()Lcom/google/common/collect/UnmodifiableIterator;", opcode = 184), remap = false)
    private <T> UnmodifiableIterator<T> uI() {
        return (UnmodifiableIterator<T>)ImmutableSet.of().iterator();
    }
}
