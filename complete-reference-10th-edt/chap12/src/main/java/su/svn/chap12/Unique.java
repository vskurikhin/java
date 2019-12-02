package su.svn.chap12;

import java.lang.annotation.*;
import java.lang.reflect.*;
// Demonstrate several type annotations.
// Still another marker annotation that can be applied to a type.
@Target( ElementType.TYPE_USE )
@interface Unique { }

