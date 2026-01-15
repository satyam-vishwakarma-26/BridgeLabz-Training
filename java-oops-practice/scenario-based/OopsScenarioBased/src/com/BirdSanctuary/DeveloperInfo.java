package com.BirdSanctuary;
import java.lang.annotation.*;
// Custom annotation for metadata
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DeveloperInfo{
    String developer();
    String version();
}
