package code;

public class ArrayTool {
    //如果一个类中所有方法都是静态的，需要创建私有构造方法，目的是不让其他类创建本类
    private ArrayTool(){}

    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "");
        }
    }

    public static void revArray(int[] arr){
        for(int i = 0; i<arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }


}
