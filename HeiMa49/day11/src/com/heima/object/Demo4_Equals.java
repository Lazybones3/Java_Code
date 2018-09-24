package com.heima.object;

import com.heima.ban.Student;

public class Demo4_Equals {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("张三", 23);
        boolean b = s1.equals(s2);
        //Object的equals方法是比较对象的地址值，实际开发中需要重写
        System.out.println(b);
        System.out.println(s1 == s2);
        //==号是比较运算符，基本数据类型比较的是值，引用数据类型比较的是地址值
        //equals方法只能比较引用数据类型，比较的是地址值，重写之后比较的是对象的属性值
    }
}
