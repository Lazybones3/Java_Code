package com.heima.object;

public class Demo1_HashCode {
    public static void main(String[] args) {
        Object obj1 = new Object();
        int hashCode = obj1.hashCode();
        System.out.println(hashCode);
    }
}
