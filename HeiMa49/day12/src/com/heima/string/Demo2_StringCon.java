package com.heima.string;

public class Demo2_StringCon {
    public static void main(String[] args) {
        //把字节数组转成字符串
        byte[] arr1 = {97,98,99};
        String s1 = new String(arr1);       //解码，将计算机看得懂的转成我们看得懂的
        System.out.println(s1);

        byte[] arr2 = {97,98,99,100,101,102};
        String s2 = new String(arr2,2,3);  //从第3个开始，长度为3
        System.out.println(s2);

        //把字符数组转成字符串
        char[] arr3 = {'a','b','c','d','e'};
        String s3 = new String(arr3);
        System.out.println(s3);

        String s4 = new String(arr3,1,3);
        System.out.println(s4);
    }
}
