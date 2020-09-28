package com.tsd.basic.gm;

public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            if(isPalindrome(i)){
                System.out.println(i);
            }
        }
    }

    public static Boolean isPalindrome(int number) {
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
