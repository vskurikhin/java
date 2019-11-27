package su.svn.reflection;

import su.svn.ClassA;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ClassA a = new ClassA();
        Class<?> aClass = a.getClass();
        Field f = aClass.getDeclaredField("id");
        f.setAccessible(true);
        System.out.println("f.getInt() = " + f.getInt(a));
    }
}
