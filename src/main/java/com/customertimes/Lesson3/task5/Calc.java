package com.customertimes.Lesson3.task5;

public class Calc {
    static double arr[] = {10, 2.5, 1, 100};

    public static void main(String[] args) {
        double a = toProcess(Operation.DIVIDED, arr);
        System.out.println("Result = " + a);
    }

    public static double toProcess(Operation en, double... arr) {
        double result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            switch (en) {
                case PLUS:
                    result += arr[i];
                    break;
                case MINUS:
                    result -= arr[i];
                    break;
                case MULTILPLE:
                    result *= arr[i];
                    break;
                case DIVIDED:
                    if (!getZero(arr)) {
                        System.out.println("Incorrect value");
                        return 0;
                    } else
                        result /= arr[i];
            }
        }
        return result;
    }

    public static boolean getZero(double... arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                return false;
            }
        }
        return true;
    }
}


