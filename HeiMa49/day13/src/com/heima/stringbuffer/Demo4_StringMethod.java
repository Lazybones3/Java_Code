package com.heima.stringbuffer;

public class Demo4_StringMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("heima");
        sb.replace(0, 3, "bai");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
