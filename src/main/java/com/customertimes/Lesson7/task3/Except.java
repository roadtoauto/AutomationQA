package com.customertimes.Lesson7.task3;

public class Except {
    static int a = 15;
    static int b = 0;
    static String z = null;

    public static void main(String[] args) {
        getCalcExc();
        getExc();
        getCalcRunExc();
    }

    public static void getCalcExc() {

        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Second value = Zero");
        }
    }

    public static void getExc() {
        try {
            z.toString();
            System.out.println(z);
        } catch (NullPointerException e) {
            System.out.println("Z is not available");
        }
    }

    public static void getCalcRunExc() {
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Second value = " + e);
        }
    }

}