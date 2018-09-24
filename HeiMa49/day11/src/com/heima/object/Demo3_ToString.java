package com.heima.object;

import com.heima.ban.Student;

public class Demo3_ToString {
    public static void main(String[] args) {
        Student s = new Student("张三", 23);
        String str = s.toString();
        System.out.println(str);

        System.out.println(s);      //直接打印对象，默认调用toString方法
    }
}
