package com.customertimes.Lesson3.task6;

public class Recursion {
    public static void main(String[] args) {
        function(6);
    }

    public static void function(int a) {
        System.out.println(a);
        if (a < 10) {
            function(2 + a);
        }
    }
}
