package com.tsd.basic.array;

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 3, 22, 33, 78, 96, 102, 999, 123, 1001, 2002, 1000, 1234, 2345, 6543};
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            // 负数不会是回文数
            if (number < 0) {
                continue;
            }
            // 如果数字末尾是0 则开头必须是0才是回文数  只有0符合该条件
            // TODO 可以和上面判断进行合并 使用 ||
            if (number % 10 == 0 && number != 0) {
                continue;
            }
            // revertedNumber用于存放反转number后的数字
            int revertedNumber = 0;
            while (number > revertedNumber) {
                revertedNumber = (revertedNumber * 10) + (number % 10);
                number /= 10;
            }

            // 当数字长度为偶数是则直接判断是否相等  如果是奇数则需要把最后一位去除
            if (number == revertedNumber || number == revertedNumber / 10) {
                System.out.println("是回文数" + arr[i]);
                for (int j = i; j < arr.length; j++) {
                    if (j + 1 >= arr.length) {
                        arr[j] = 0;
                    } else {
                        arr[j] = arr[j + 1];
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // 判断一个数字是不是回文数
    // 题解链接 https://leetcode-cn.com/problems/palindrome-number/solution/hui-wen-shu-by-leetcode-solution/
    public Boolean isPalindrome(int number) {
        // 负数不会是回文数
        if (number < 0) {
            return false;
        }
        // 如果数字末尾是0 则开头必须是0才是回文数  只有0符合该条件
        // TODO 可以和上面判断进行合并 使用 ||
        if (number % 10 == 0 && number != 0) {
            return false;
        }
        // revertedNumber用于存放反转number后的数字
        int revertedNumber = 0;
        // 这里将数字反转一半，因为如果全部反转 会有整数溢出问题
        while (number > revertedNumber) {
            revertedNumber = revertedNumber * 10 + (number % 10);
            number /= 10;
        }
        // 当数字长度为偶数是则直接判断是否相等  如果是奇数则需要把最后一位去除
        return number == revertedNumber || number == revertedNumber / 10;
    }
}
