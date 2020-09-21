package com.tsd.basic.func;

import java.util.Scanner;

public class FuncMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int n1 = s.nextInt();

        System.out.println("请输入第二个数");
        int n2 = s.nextInt();

        System.out.println("较大的是" + findMaxNumber(n1, n2));
    }

    public static int findMaxNumber(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }
}
