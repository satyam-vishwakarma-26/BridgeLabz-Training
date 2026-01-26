
package com.annotations.repeatableannotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Container annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface BugReports {
    BugReport[] value();
}
