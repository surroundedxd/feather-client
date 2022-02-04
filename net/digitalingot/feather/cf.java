// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import com.google.gson.annotations.SerializedName;

public class cF implements bY
{
    @SerializedName("channel")
    @NotNull
    private final a a;
    
    public cF(@NotNull final a a) {
        this.a = a;
    }
    
    @NotNull
    public a b() {
        return this.a;
    }
    
    @NotNull
    @Override
    public bV cx() {
        return bV.CALLBACK;
    }
    
    public enum a
    {
        @SerializedName("ide")
        IDE(4), 
        @SerializedName("development")
        DEVELOPMENT(3), 
        @SerializedName("beta")
        BETA(2), 
        @SerializedName("release")
        RELEASE(1);
        
        private final int priority;
        
        private a(final int priority) {
            this.priority = priority;
        }
        
        public int getPriority() {
            return this.priority;
        }
        
        private static /* synthetic */ a[] $values() {
            return new a[] { a.IDE, a.DEVELOPMENT, a.BETA, a.RELEASE };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
