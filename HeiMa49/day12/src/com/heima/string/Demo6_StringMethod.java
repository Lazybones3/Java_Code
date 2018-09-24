package com.heima.string;

public class Demo6_StringMethod {
    public static void main(String[] args) {
        String s1 = "你好";
        //编码：将我们看得懂的转换成计算机看的懂的
        //通过gbk码表将字符串转换成字节数组
        byte[] arr1 = s1.getBytes();
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
