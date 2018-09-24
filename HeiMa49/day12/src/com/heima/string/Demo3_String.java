package com.heima.string;

public class Demo3_String {
    public static void main(String[] args) {
        // "abc"在常量池
        String s1 = "abc";              //记录常量池的地址值
        String s2 = "abc";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        // new String()在堆中开辟内存空间
        String s3 = new String("abc");      //记录堆内存的地址值
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        //java中有常量优化机制，在编译时就变成了"abc"
        String s4 = "a" + "b" + "c";
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));

        String s5 = "ab";
        String s6 = s5 + "c";
        System.out.println(s1 == s6);
        System.out.println(s1.equals(s6));
    }
}
