package com.heima.collection;

import com.heima.bean.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo5_Iterator {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Student("张三",23));
        c.add(new Student("李四",24));
        c.add(new Student("王五",25));
        c.add(new Student("赵六",26));

        Iterator it = c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            Student s = (Student)it.next();
            System.out.println(s.getName() + "..." + s.getAge());
        }

    }
}
