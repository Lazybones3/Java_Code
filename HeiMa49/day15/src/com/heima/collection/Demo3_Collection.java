package com.heima.collection;

import com.heima.bean.Student;

import java.util.ArrayList;
import java.util.Collection;

public class Demo3_Collection {

    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Student("张三",23));   //Object obj = new Student("张三",23)类型提升，父类引用指向子类对象
        c.add(new Student("李四",24));
        c.add(new Student("王五",25));
        System.out.println(c);

        Object[] arr = c.toArray();     //集合转数组
        for(int i=0;i<arr.length;i++){
            Student s = (Student)arr[i];   //向下转型
            System.out.println(s.getName()+"..."+s.getAge());
        }
    }
}
