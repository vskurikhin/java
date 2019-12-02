package su.svn.chap12;

import java.lang.annotation.*;

// An annotation type declaration.
// Make MyAnno repeatable

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno {
    String str() default "Testing";
    int val() default 9000;
}

