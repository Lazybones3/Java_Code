package com.heima.string;

public class Demo7_StringMethod {
    public static void main(String[] args) {
        String s1 = "abb";      //按照ascii码表值比较
        String s2 = "bcd";
        //String s11 = "a";       //字母一样按长度比较
        //String s22 = "aaa";

        int num = s1.compareTo(s2);
        System.out.println(num);

        String s3 = "黑";
        String s4 = "马";
        int num2 = s3.compareTo(s4);        //char字符查找的是unicode码表
        System.out.println('黑' + 0);
        System.out.println('马' + 0);
        System.out.println(num2);

        String s5 = "HEIMA";
        String s6 = "heima";
        int num3 = s5.compareToIgnoreCase(s6);
        System.out.println(num3);
    }
}
