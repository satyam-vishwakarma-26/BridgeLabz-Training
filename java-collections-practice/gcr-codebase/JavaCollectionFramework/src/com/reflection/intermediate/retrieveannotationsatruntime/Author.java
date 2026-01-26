
package com.reflection.intermediate.retrieveannotationsatruntime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Annotation available at runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    String name();
}
