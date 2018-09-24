package code;

public class Demo01_Code {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("================================");
        Student s2 = new Student();
    }
}

class Student{
    static {
        System.out.println("Student静态代码块");   //用于给类进行初始化，一般用于驱动加载
    }

    {
        System.out.println("Student构造代码块");
    }

    public Student(){
        System.out.println("Student构造方法");
    }

}
