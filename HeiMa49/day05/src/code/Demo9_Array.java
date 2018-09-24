package code;

public class Demo9_Array {
    public static void main(String[] args) {
        int[] arr = {33,11,22,44,55};
        int max = getMax(arr);
        System.out.println(max);
    }

    //获取数组最大值
    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){   //从第二个元素开始遍历
            if(max<arr[i])
                max = arr[i];
        }
        return max;
    }
}
