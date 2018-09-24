package com.heima.array;


public class Demo1_Array {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        //bubbleSort(arr);
        selectSort(arr);
        print(arr);
    }

    public static  void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //冒泡排序
    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
                    swap(arr,j,j+1);
                }
            }
        }
    }

    //选择排序
    private static void selectSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
                    swap(arr,i,j);
                }
            }
        }
    }
}
