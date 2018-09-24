package code.L4_NiMingNeiBuLei;

public class Test1_NoNameInnerClass {
    public static void main(String[] args) {
        PersonDemo pd = new PersonDemo();
        //1.
        //pd.method(new Student());
        //2.
        pd.method(new Person() {        //匿名内部类当作参数传递（本质是把匿名内部类看作一个对象）
            @Override
            public void show() {
                System.out.println("show");
            }
        });
    }
}

abstract class Person{
    public abstract void show();
}

class PersonDemo{
    /*
    //父类引用指向子类对象
    1.Person p = new Student();
    2.Person p = new Person() {
        public void show() {
            System.out.println("show");
        }
    };
    */
    public void method(Person p){
        p.show();
    }
}

class Student extends Person{
    public void show() {
        System.out.println("show");
    }
}