package code;

public class Demo33_final {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.print();
    }
}

class Demo{
    //final修饰变量的初始化时机：显示初始化；在对象构造完毕之前
//    final int num = 10;
    final int num;
    public Demo(){
        num = 10;
    }

    public void print(){
        System.out.println(num);
    }

}
