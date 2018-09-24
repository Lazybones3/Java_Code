package com.heima.stringbuffer;

public class Demo7_StringBuffer {
    public static void main(String[] args) {
        //String是引用数据类型，但当作参数传递时和基本数据类型一样
        String s = "heima";
        System.out.println(s);
        change(s);
        System.out.println(s);

        StringBuffer sb = new StringBuffer();
        sb.append("heima");
        System.out.println(sb);;
        change(sb);
        System.out.println(sb);
    }

    public static void change(String s) {
        s += "itcast";
    }

    public static void change(StringBuffer sb) {
        sb.append("itcast");
    }
}
