package com.heima.array;

public class Demo2_Array {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77};

        System.out.println(getIndex(arr,22));
        System.out.println(getIndex(arr,66));
        System.out.println(getIndex(arr,88));
    }

    //二分查找
    public static int getIndex(int[] arr, int value){
        int min = 0;
        int max = arr.length - 1;
        int mid = (min + max) / 2;

        while (arr[mid] != value){      //当中间值不等于要找的值开始循环
            if(arr[mid] < value){       //当中间值小于要找的值，最小的索引改变
                min = mid + 1;
            }else if (arr[mid] > value){    ////当中间值大于要找的值，最大的索引改变
                max = mid - 1;
            }
            mid = (min + max) / 2;      //无论最大还是最小改变，中间索引都要改变

            if(min > max){          //没有找到
                return -1;
            }
        }
        return mid;
    }
}
