package com.tsd.basic.func;

import java.util.Scanner;

public class FuncEqual {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int n1 = s.nextInt();
        System.out.println("请输入第二个数字");
        int n2 = s.nextInt();

        System.out.println("结果" + isEqual(n1, n2));
    }

    public static boolean isEqual(int n1, int n2) {
        return n1 == n2;
    }
}
