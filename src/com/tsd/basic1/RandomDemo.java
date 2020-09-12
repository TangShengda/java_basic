package com.tsd.basic1;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 2; i <= 10; i++) {
            System.out.println(r.nextInt(10) + 1);
        }
    }
}
