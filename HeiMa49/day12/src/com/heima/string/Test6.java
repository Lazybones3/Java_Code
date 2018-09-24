package com.heima.string;

import java.util.Scanner;

public class Test6 {
    //字符串反转
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String line = sc.nextLine();

        char[] arr = line.toCharArray();

        String s = "";
        for(int i = arr.length-1; i >= 0; i--){
            s = s + arr[i];
        }
        System.out.println(s);
    }
}
