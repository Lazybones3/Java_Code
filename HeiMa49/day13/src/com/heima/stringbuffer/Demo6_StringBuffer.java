package com.heima.stringbuffer;

public class Demo6_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("heima");

        String s1 = new String(sb);     //通过构造方法将StringBuffer转为String
        System.out.println(s1);

        String s2 = sb.toString();      //通过toString将StringBuffer转为String
        System.out.println(s2);

        String s3 = sb.substring(0,sb.length());        //通过截取字符串将StringBuffer转为String
        System.out.println(s3);

        StringBuffer sb1 = new StringBuffer("heima");       //通过构造方法将String转为StringBuffer
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer();      //通过append方法将String转为StringBuffer
        sb2.append("heima");
        System.out.println(sb2);

    }
}
