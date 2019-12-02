package su.svn.chap12;

import java.lang.annotation.*;

// A parameterized annotation that can be applied to a type.
@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}

