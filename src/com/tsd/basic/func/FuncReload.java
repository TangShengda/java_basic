package com.tsd.basic.func;

public class FuncReload {
    public static void main(String[] args) {
        float result = sum(2.5f,2.5f);
        System.out.println(result);
    }

    public static float sum(float f1, float f2) {
        return f1 + f2;
    }

    public static int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}
