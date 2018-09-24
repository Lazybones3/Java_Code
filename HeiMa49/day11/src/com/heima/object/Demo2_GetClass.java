package com.heima.object;

import com.heima.ban.Student;

public class Demo2_GetClass {
    public static void main(String[] args) {
        Student s = new Student("张三",23);
        Class clazz = s.getClass();         //获取该对象的字节码文件
        System.out.println(clazz);
        String name = clazz.getName();      //获取名称
        System.out.println(name);
    }
}
