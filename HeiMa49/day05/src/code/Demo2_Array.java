package code;

public class Demo2_Array {
    public static void main(String[] args) {
        char[] crr = new char[5];
        System.out.println(crr[0]);
        //char数组默认初始化值'\u0000',四个0代表16个二进制位

        int[] arr = new int[5];
        arr[0] = 10;
        System.out.println(arr[0]);
        System.out.println(arr);
        //[I@1540e19d
        /*
        * [代表数组维数
        * I代表int类型
        * 1540e19d代表十六进制的地址值
        * */
    }
}
