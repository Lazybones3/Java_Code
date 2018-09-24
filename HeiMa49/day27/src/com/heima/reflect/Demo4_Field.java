package com.heima.reflect;

import com.heima.bean.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demo4_Field {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.heima.bean.Person");
        Constructor c = clazz.getConstructor(String.class, int.class);
        Person p = (Person) c.newInstance("张三", 23);

        //获取name属性
//        Field f = clazz.getField("name");
//        f.set(p,"李四");
        //获取私有属性
        Field f = clazz.getDeclaredField("name");
        //去除私有权限
        f.setAccessible(true);
        f.set(p,"李四");

        System.out.println(p);
    }
}
