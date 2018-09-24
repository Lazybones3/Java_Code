package code.L4_NiMingNeiBuLei;

public class Test2_NoNameInnerClass {
    public static void main(String[] args) {
        Outer.method().show();
        //链式编程，每次调用方法后还能继续调用方法，说明调用方法返回的是对象
    }
}

interface Inter {
    void show();
}

class Outer {
    public static Inter method() {
        return new Inter() {
            @Override
            public void show() {
                System.out.println("Hello Word");
            }
        };
    }
}
