package code.L1_DuoTai;

public class Demo1_Polymorphic {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();

        Animal a = new Cat();   //父类引用指向子类对象
        a.eat();
    }
}

/*多态前提：
1.要有继承关系
2.要有方法重写
3.要有父类引用指向子类对象
* */
class Animal{
    public void eat(){
        System.out.println("动物吃饭");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }
}