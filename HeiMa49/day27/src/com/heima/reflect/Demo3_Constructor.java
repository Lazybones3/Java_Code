package com.heima.reflect;

import com.heima.bean.Person;

import java.lang.reflect.Constructor;

public class Demo3_Constructor {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.heima.bean.Person");
        //通过无参构造创建对象
//        Person p = (Person) clazz.newInstance();
//        System.out.println(p);
        //通过有参构造创建对象
        Constructor c = clazz.getConstructor(String.class, int.class);
        Person p = (Person) c.newInstance("张三", 23);
        System.out.println(p);
    }
}
