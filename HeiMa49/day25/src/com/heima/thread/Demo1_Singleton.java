package com.heima.thread;

public class Demo1_Singleton {

    public static void main(String[] args) {
        Singleton s1 = Singleton.s;
        Singleton s2 = Singleton.s;
        System.out.println(s1 == s2);
//        Singleton s1 = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
    }
}

//饿汉式
//class Singleton{
//    private Singleton(){}
//
//    private static Singleton s = new Singleton();
//
//    public static Singleton getInstance(){
//        return s;
//    }
//}

//懒汉式
//class Singleton{
//    private Singleton(){}
//
//    private static Singleton s;
//
//    public static Singleton getInstance(){
//        if(s==null){
//            s = new Singleton();
//        }
//        return s;
//    }
//}


//第三种设计模式
class Singleton{
    private Singleton(){}

    public static final Singleton s = new Singleton();
}
