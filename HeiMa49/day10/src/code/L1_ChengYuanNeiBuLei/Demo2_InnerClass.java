package code.L1_ChengYuanNeiBuLei;

public class Demo2_InnerClass {
    public static void main(String[] args) {
        //访问私有内部类的方法
        Outer2 o = new Outer2();
        o.print();
    }
}

class Outer2{
    private int num = 10;
    private class Inner2{
        public void method(){
            System.out.println(num);
        }
    }

    public void print(){
        Inner2 i = new Inner2();
        i.method();
    }
}
