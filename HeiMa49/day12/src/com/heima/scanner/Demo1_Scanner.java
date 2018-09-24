package com.heima.scanner;

import java.util.Scanner;

public class Demo1_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //判断输入是否是int类型
        if(sc.hasNextInt()){
            int i = sc.nextInt();
            System.out.println(i);
        }else {
            System.out.println("输入类型错误");
        }
    }

}
