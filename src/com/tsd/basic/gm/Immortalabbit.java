package com.tsd.basic.gm;

import com.tsd.basic.func.FuncTest1;

// 不死神兔子 实际是斐波那切数列
public class Immortalabbit {
    public static void main(String[] args) {
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        FuncTest1.printArray(arr);
    }
}
