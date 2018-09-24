package code;

import java.util.Scanner;

public class Test1_GuessNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数，范围在1-100之间");
        int guessNum = (int)(Math.random() * 100) + 1;
        while (true){
            int result = sc.nextInt();
            if(result > guessNum){
                System.out.println("大了");
            }else if(result < guessNum){
                System.out.println("小了");
            }else {
                System.out.println("中了");
                break;
            }
        }
    }
}
