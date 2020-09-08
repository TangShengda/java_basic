package com.tsd.basic1;

import java.util.Scanner;

public class ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第1个数字");
        int a = sc.nextInt();

        System.out.println("请输入第2个数字");
        int b = sc.nextInt();

        System.out.println("两数之和为：" + (a + b));
    }
}
