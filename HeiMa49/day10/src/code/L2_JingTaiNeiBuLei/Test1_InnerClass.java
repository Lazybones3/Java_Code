package code.L2_JingTaiNeiBuLei;

public class Test1_InnerClass {
    public static void main(String[] args) {
        Outer2.Inner oi = new Outer2().new Inner();
        oi.show();
    }
}

//内部类能获取到外部类的成员，是因为他能获取到外部类的引用，外部类名.this
class Outer2{
    public int num = 10;
    class Inner{
        public int num = 20;
        public void show(){
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer2.this.num);
        }
    }
}
