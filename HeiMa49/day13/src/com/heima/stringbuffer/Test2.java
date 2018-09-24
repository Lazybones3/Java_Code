package com.heima.stringbuffer;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //创建键盘录入对象
        String line = sc.nextLine();                //将录入字符存入line中

        StringBuffer sb = new StringBuffer(line);
        sb.reverse();       //将缓冲区内容反转
        System.out.println(sb.toString());
    }
}
