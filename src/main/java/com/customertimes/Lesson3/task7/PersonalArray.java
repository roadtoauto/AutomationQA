package com.customertimes.Lesson3.task7;

public class PersonalArray {
    static int arr[] = {-20, -30, -10, -50, 15, 10, 5};

    public static void main(String[] args) {
        getArray(arr);
    }

    public static void getArray(int[] a) {
        int min = a[0];
        int sec;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        sec = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > min && arr[i] < sec) {
                sec = arr[i];
            }
        }
        int one = Math.abs(min);
        int two = Math.abs(sec);
        int three = (one + two) / 2;
        System.out.println(three);
    }
}