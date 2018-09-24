package code.L1_ChengYuanNeiBuLei;

public class Demo1_InnerClass {
    public static void main(String[] args) {
        //创建内部类对象
        //外部类名.内部类名 = 外部类对象.内部类对象
        Outer1.Inner1 oi = new Outer1().new Inner1();
        oi.method();
    }
}

class Outer1{
    private int num = 10;
    class Inner1{
        public void method(){
            System.out.println(num);
        }
    }
}
