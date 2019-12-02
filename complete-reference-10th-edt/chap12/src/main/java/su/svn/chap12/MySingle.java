package su.svn.chap12;

import java.lang.annotation.*;

// A single-member annotation.

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
    int value(); // this variable name must be value
}

