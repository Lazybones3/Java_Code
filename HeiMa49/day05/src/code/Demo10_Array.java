package code;

public class Demo10_Array {

    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        reverseArray(arr);
        print(arr);
    }

    public static void reverseArray(int[] arr){
        for(int i = 0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }

    public static void print(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
