package com.heima.reflect;

import com.heima.bean.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo5_Method {
    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName("com.heima.bean.Person");
        Constructor c = clazz.getConstructor(String.class, int.class);
        Person p = (Person) c.newInstance("张三", 23);

        //获取eat方法
        Method m = clazz.getMethod("eat", int.class);
        m.invoke(p, 10);
    }
}
