package com.customertimes.Lesson7.task4;

public class AllMethods {
    static int a = 10;
    static int b = 0;
    static int[] arr = {1};
    //  static int[] arr = {};

    public static void main(String[] args) {
        doubleRunExc();
        secondValueThrow();
        calcThrows();

    }

    public static void doubleRunExc() {
        try {
            int arrayLengh = arr.length;
            System.out.println("a = " + String.valueOf(arrayLengh));
            int num = 2 / arrayLengh;
            arr[2] = 1;
        } catch (ArithmeticException e) {
            System.out.println("Index = " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "ArrayIndexOutOfBoundsException : " + e.getMessage());
        } finally {
            System.out.println("Array length = " + arr.length);
        }
    }

    static int calcThrows() throws ArithmeticException {
        int c = a / b;
        return c;
    }

    static void secondValueThrow() {
        if (b == 0) {
            throw new ArithmeticException("Throw: Second value = 0");
        } else {
            System.out.println(a / b);
        }
    }
}
