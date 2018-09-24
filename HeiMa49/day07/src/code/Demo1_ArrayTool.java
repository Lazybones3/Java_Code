package code;

public class Demo1_ArrayTool {
    public static void main(String[] args) {
        int[] arr = {33,11,22,66,55,44};

        int max = ArrayTool.getMax(arr);
        System.out.println("max = " + max);
        ArrayTool.print(arr);
    }
}
