package com.customertimes.Lesson9.task5;

public class TryCatchFinally {
    public static void main(String[] args) {

        getAllMethods();

    }

    public static void getAllMethods() {
        try {
            thirdMethod();
        } catch (StackOverflowError e) {
            System.out.println("\nBreak, because: " + e);
        } finally {
            System.out.println("WOW");
        }
    }

    public static void firstMethod() {
        int[] a = {1, 2, 3};
        int b = a.length;

        try {
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("Array length = " + b);
            secondMethod();
        }
    }

    public static void secondMethod() {
        int a = 5;
        int b = 0;

        try {
            int c = a / b;
            System.out.println("Divide = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception = " + e);
        } finally {
            int d = a * b;
            System.out.println("Multiply = " + d);
            thirdMethod();
        }

    }

    public static void thirdMethod() {
        String a = null;
        try {
            a.toString();
        } catch (Exception e) {
            System.out.println("Exception = " + e);
        } finally {
            firstMethod();
        }
    }
}
