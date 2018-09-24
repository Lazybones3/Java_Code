package com.heima.string;

public class Test7 {
    //统计大串中小串出现的次数
    public static void main(String[] args) {
        String max = "wos345heima,sfsf452dfheima_fiefheima4542";
        String min = "heima";

        //计数器
        int count = 0;
        //索引
        int index = 0;
        while((index = max.indexOf(min)) != -1){
            count++;
            max = max.substring(index + min.length());
        }
        System.out.println(count);
    }
}
