package com.customertimes.Lesson2;

public class Methods {
    public static void main(String[] args) {
        String value1 = "Alexander";
        int value2 = 1996;
        char value3 = 'G';
        float value4 = 1.6f;
        boolean value5 = false;

        mod();
        increment1();
        increment2();
        decrement1();
        decrement2();
        while0();
        whileDo();
        for0();
        whileAnd();
        whileAndAnd();
        whileOr();
        whileOrOr();
        switch0();
        fiveParameters(value1, value2, value3, value4, value5);
    }

    public static void mod() {
        int m = 30;
        int a = 100;
        int v = a % m;
        System.out.println("Modulus = " + v);
    }

    public static void increment1() {
        int a = 25;
        int b = ++a;
        System.out.println("Increment ++a for " + a + " = " + b);
    }

    public static void increment2() {
        int a = 25;
        int b = a++;
        System.out.println("Increment a++ for " + a + " = " + b);
    }

    public static void decrement1() {
        int a = 15;
        int b = a--;
        System.out.println("Decrement a-- for " + a + " = " + b);
    }

    public static void decrement2() {
        int a = 15;
        int b = --a;
        System.out.println("Decrement --a for " + a + " = " + b + "\n");
    }

    public static void while0() {
        int j = 3;
        while (j > 0) {
            System.out.println(j);
            j--;
        }
    }

    public static void whileDo() {
        int j = 7;
        do {
            System.out.println(j);
            j++;
        }
        while (j <= 10);
    }

    public static void for0() {
        int a;
        int b = 10;
        for (a = 1; a <= b; a++) {
            System.out.println(a + "x" + a + " = " + a * a);
        }
    }

    public static void whileAnd() {
        int j = 12;
        while (j > 11 & j < 28) {
            System.out.println("WhileAnd: " + j);
            j++;
        }
    }

    public static void whileAndAnd() {
        int j = 15;
        while (j > 10 && j < 20) {
            System.out.println("WhileAndAnd: " + j);
            j++;
        }
    }

    public static void whileOr() {
        int b = 25;
        int c = 1;
        while (b > 15 || b > 10) {
            b--;
            c--;
            System.out.println("WhileOr: " + c + " b =" + b);
        }
    }

    public static void whileOrOr() {
        int b = 25;
        int c = 1;
        while (b > 15 | b > 10) {
            b--;
            c++;
            System.out.println("WhileOrOr: " + c + " b =" + b);
        }
    }

    public static void switch0() {
        int a = 15;
        switch (a) {
            case 15:
                System.out.println("15");
                break;
            case 22:
                System.out.println("22");
                break;
            case 100:
                System.out.println("YES");
                break;
            default:
                System.out.println("Invalid value");
        }
    }

    public static void fiveParameters(String name, int years, char group, double exp, boolean value) {
        System.out.println("Name:" + name + ", year of birthday: " + years + ", group:" + group + ", points=" + exp + ", validated?=" + value);
    }
}