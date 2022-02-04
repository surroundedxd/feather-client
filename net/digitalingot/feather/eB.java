// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import java.lang.annotation.Inherited;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
@Inherited
public @interface eb {
    @NotNull
    String fj();
    
    @NotNull
    String fk();
    
    @NotNull
    String fl();
    
    @NotNull
    dk.a[] fm();
    
    @NotNull
    a fn() default @a;
    
    public @interface a {
        @NotNull
        String fj() default "";
        
        @NotNull
        es fo() default @es(fU = 0);
    }
}
