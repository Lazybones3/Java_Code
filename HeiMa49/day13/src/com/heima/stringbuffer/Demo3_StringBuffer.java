package com.heima.stringbuffer;

public class Demo3_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("heima");
        //sb.deleteCharAt(4);     //根据索引删除
        sb.delete(0,2);         //删除的时候包含头，不包含尾
        System.out.println(sb);
    }
}
