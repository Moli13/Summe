package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Das Ergebins ist: " + sum(3, 5));
        System.out.println(test);
        System.out.println(sub(3, 5));
    }

    private static int test;

    private static int doppelErgebnis(int a, int b) {
        while (test != 0) {
            test = a + b;
            a--;
            b--;
            System.out.println("Ergebnis b: " + b);
            System.out.println(a);
        }
        return test;
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;

    }

    public static int sub(int a, int b) {
        int sub = a - b;
        return sub;
    }
}
