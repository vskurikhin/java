package su.svn.chap12;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

