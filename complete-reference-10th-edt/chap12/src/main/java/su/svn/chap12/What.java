package su.svn.chap12;

import java.lang.annotation.*;
import java.lang.reflect.*;

//@Retention(RetentionPolicy.RUNTIME)
//@interface What {
//    String description();
//}
// An annotation that can be applied to a type parameter.
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

