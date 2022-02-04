// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Annotation;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ev {
    String fX();
    
    String fY() default "";
    
    String fZ() default "";
    
    int fS() default -9999;
    
    int fR() default -9999;
    
    boolean ga() default false;
}
