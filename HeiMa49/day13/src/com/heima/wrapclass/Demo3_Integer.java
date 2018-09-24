package com.heima.wrapclass;

public class Demo3_Integer {
    public static void main(String[] args) {
        //基本数据类型包装类有8种，其中7种都有parseXxx的方法，可以将这7种的字符串表现形式转成基本数据类型
        //char的包装类Character中没有parseXxx的方法
        //字符串转换为字符数组使用toCharArray()
        String s1 = "true";
        boolean b = Boolean.parseBoolean(s1);
        System.out.println(b);
    }
}
