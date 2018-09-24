package code.L4_NiMingNeiBuLei;

public class Demo1_NoNameInnerClass {
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        o.method();
    }
}

interface Inter1{
    public void print();
}

class Outer1{
    public void method(){
        new Inter1(){                    //实现接口
            public void print(){        //重写抽象方法
                System.out.println("print");
            }
        }.print();                      //子类对象调用print方法
    }
}
