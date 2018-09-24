package com.heima.stringbuffer;

public class Demo2_StringBuffer {

    public static void main(String[] args) {
        //StringBuffer是字符串缓冲区，new的时候在堆内存创建一个对象，底层是一个长度为16的字符数组
        //append可以把任意类型数据添加到字符串缓冲区，并返回字符串缓冲区本身
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = sb.append(true);
        StringBuffer sb3 = sb.append("heima");

        System.out.println(sb.toString());
        System.out.println(sb2.toString());
        System.out.println(sb3.toString());

        //insert在指定位置插入到字符串缓冲区，并返回字符串缓冲区本身
        StringBuffer sb4 = new StringBuffer("1234");
        sb4.insert(3, "heima");
        System.out.println(sb4);
    }
}
