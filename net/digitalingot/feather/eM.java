// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Annotation;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface em {
    double fG() default 5.0;
    
    double fH() default 0.0;
    
    double fI() default 0.05;
}
