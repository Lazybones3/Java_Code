package code.L3_JuBuNeiBuLei;

public class Demo1_InnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
    }
}

//局部内部类，只能在其方法中使用
class Outer{
    public void method(){
        final int num = 10;
        class Inner{
            public void print(){
                System.out.println(num);
            }
        }

        Inner i = new Inner();
        i.print();
    }
}
