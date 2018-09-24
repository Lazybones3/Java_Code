package code.L1_DuoTai;

public class Demo4_Animal {
    public static void main(String[] args) {
        method(new Cat2());
        method(new Dog2());
    }

    public static void method(Animal2 a){
        if(a instanceof Cat2){
            Cat2 c = (Cat2)a;
            c.eat();
            c.catchMouse();
        }else if(a instanceof Dog2){
            Dog2 d = (Dog2)a;
            d.eat();
            d.lookHome();
        }else {
            a.eat();
        }
    }
}

class Animal2{
    public void eat(){
        System.out.println("动物吃饭");
    }
}

class Cat2 extends Animal2 {
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}

class Dog2 extends Animal2{
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void lookHome(){
        System.out.println("看家");
    }
}
