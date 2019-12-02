package su.svn.chap12;

import java.lang.annotation.*;

// Demonstrate several type annotations.
// An annotation that can be applied to a method declaration.

@Target(ElementType.METHOD)
@interface Recommended { }

