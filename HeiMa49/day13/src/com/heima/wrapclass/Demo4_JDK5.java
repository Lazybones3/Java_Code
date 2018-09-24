package com.heima.wrapclass;

public class Demo4_JDK5 {
    public static void main(String[] args) {
        int x = 100;
        Integer i1 = new Integer(x);    //装箱：将基本数据类型包装成对象
        int y = i1.intValue();  //拆箱：将对象转换成基本数据类型

        Integer i2 = 100;   //自动装箱
        int z = i2 + 200;   //自动拆箱
        System.out.println(z);
    }
}
