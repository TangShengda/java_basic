package com.tsd.basic.array;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,6,4,3,7};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("最大值" + max);
    }
}
