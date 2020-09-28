package com.tsd.basic.gm;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("请输入月份");

        int month = s.nextInt();

        System.out.println(checkSeason(month));

    }

    public static String checkSeason(int month) {
        String result = "";
        switch (month) {
            case 1:
            case 2:
            case 3:
                result = "春";
                break;
            case 4:
            case 5:
            case 6:
                result = "夏";
                break;
            case 7:
            case 8:
            case 9:
                result = "秋";
                break;
            case 10:
            case 11:
            case 12:
                result = "冬";
                break;
            default:
                result = "输入有误";
        }

        return result;
    }
}
