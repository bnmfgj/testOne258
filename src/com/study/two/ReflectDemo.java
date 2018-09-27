package com.study.two;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //通过object方法获取字节码对象
        Student s = new Student();
        Class clazz = s.getClass();
        //通过类名获取字节码对象
        Class clazz2=Student.class;
        //通过static Class<?> forName(String className);
        Class clazz3=Class.forName("com.study.two.Student");

        System.out.println(clazz==clazz2);
        System.out.println(clazz2==clazz3);
    }
}
