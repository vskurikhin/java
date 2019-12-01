package su.svn.reflection;

import su.svn.ClassA;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ClassA a = new ClassA();
        Field f = ClassA.class.getDeclaredField("id");
        f.setAccessible(true);
        System.out.println("f.getInt() = " + f.getInt(a));
        f.setInt(a, 13);
        System.out.println("stop");
    }
}
