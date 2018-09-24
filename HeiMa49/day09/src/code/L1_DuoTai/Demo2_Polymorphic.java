package code.L1_DuoTai;

public class Demo2_Polymorphic {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.num);

        f.print();

        f.method(); //相当于Father.method()
    }
}

/*
成员变量
编译看左边（父类），运行看左边（父类）
成员方法（非静态）
编译看左边（父类），运行看右边（子类）。也叫动态绑定
静态方法
编译看左边（父类），运行看左边（父类）
（静态和类相关，不算重写，所以访问还是右边）
 */

class Father{
    int num = 10;

    public void print(){
        System.out.println("father");
    }

    public static void method(){
        System.out.println("father static");
    }
}

class Son extends Father{
    int num = 20;

    public void print(){
        System.out.println("son");
    }

    public static void method(){
        System.out.println("son static");
    }
}
