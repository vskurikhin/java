package su.svn.chap12;

import java.lang.annotation.*;
import java.lang.reflect.*;
// Demonstrate a repeated annotation.
// This is the container annotation.
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    MyAnno[] value();
}

