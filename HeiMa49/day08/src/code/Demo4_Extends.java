package code;

public class Demo4_Extends {
    public static void main(String[] args) {
        Son s = new Son();
        s.print();
    }
}

class Father{
    int num1 = 10;
    int num2 = 30;
}

class Son extends Father{
    int num2 = 20;

    public void print(){
        System.out.println(this.num1);   //this代表当前对象的子类引用
        System.out.println(this.num2);
        System.out.println(super.num2);  //super代表当前对象的父类引用
    }
}