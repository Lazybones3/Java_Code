package com.heima.stringbuffer;

public class Demo5_StringMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("woaiheima");
        //String str = sb.substring(4);   //截取从指定位置到结尾
        //System.out.println(str);

        String str3 = sb.substring(4,7);
        System.out.println(str3);
    }
}
