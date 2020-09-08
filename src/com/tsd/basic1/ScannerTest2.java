package com.tsd.basic1;

import java.util.Scanner;

public class ScannerTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数据");
        int a = sc.nextInt();

        System.out.println("请输入第二个数据");
        int b = sc.nextInt();

//        boolean flag = a == b ? true : false;
        boolean flag = a == b;
        System.out.println("两数相等吗" + flag);
    }
}
