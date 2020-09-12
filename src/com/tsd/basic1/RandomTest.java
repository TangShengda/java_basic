package com.tsd.basic1;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(10) + 1;

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("请输入你要猜的数字(1~10)");
            int n = s.nextInt();
            if(n < x){
                System.out.println("小了");
            }else if (n > x){
                System.out.println("大了");
            }else {
                System.out.println("猜中了");
                break;
            }
        }


    }
}
