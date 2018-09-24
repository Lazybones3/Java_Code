package code;

public class Test3_Array {
    public static void main(String[] args) {
        //基本数据类型的值传递，不改变原值，因为调用后就会弹栈，局部变量随之消失
        int a = 10;
        int b = 20;
        System.out.println("a:"+a+",b:"+b);
        change1(a,b);
        System.out.println("a:"+a+",b:"+b);

        //引用数据类型的值传递，改变原值，因为即使方法弹栈，但是堆内存数组对象还在，可以通过地址继续访问
        int[] arr = {1,2,3,4,5};
        change2(arr);
        System.out.println(arr[1]);
    }

    public static void change1(int a,int b){
        System.out.println("a:"+a+",b:"+b);
        a = b;
        b = a + b;
        System.out.println("a:"+a+",b:"+b);
    }

    public static void change2(int[] arr){
        for(int x=0;x<arr.length;x++){
            if(arr[x]%2==0)
                arr[x]*=2;
        }
    }
}
