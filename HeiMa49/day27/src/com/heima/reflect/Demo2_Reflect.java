package com.heima.reflect;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo2_Reflect {
    public static void main(String[] args) throws Exception {
        //多态
//        Juicer j = new Juicer();
//        j.run(new Orange());

        //反射和配置文件
        BufferedReader br = new BufferedReader(new FileReader("config.properties"));
        Class clazz = Class.forName(br.readLine());
        Fruit f = (Fruit)clazz.newInstance(); //水果引用指向苹果对象
        Juicer j2 = new Juicer();
        j2.run(f);
    }
}

interface Fruit{
    public void squeeze();
}

class Apple implements Fruit{
    public void squeeze(){
        System.out.println("炸出一杯苹果汁");
    }
}

class Orange implements Fruit{
    public void squeeze(){
        System.out.println("炸出一杯橘子汁");
    }
}

class Juicer{
    public void run(Fruit f){
        f.squeeze();
    }
}