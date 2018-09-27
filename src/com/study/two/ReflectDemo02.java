package com.study.two;

import java.lang.reflect.Constructor;

public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class clazz = Class.forName("com.study.two.Student");
       /* Constructor<T> getConstructor(Class<?>... parameterTypes)
        Constructor<?>[] getConstructors() */
        method(clazz);
        //Constructor<T> getConstructor(Class<?>... parameterTypes)
        Constructor constructor = clazz.getConstructor();
        System.out.println(constructor);
    }

    private static void method(Class clazz) {
        //Constructor<?>[] getConstructors() */
        Constructor[] constructors = clazz.getConstructors();
        for (int i = 0; i < constructors.length; i++) {
            System.out.println(constructors[i]);

        }
    }
}
