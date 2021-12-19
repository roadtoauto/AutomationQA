package com.customertimes.Lesson3.task2;

public class NotStatic {
    public static void main(String[] args) {
        new NotStatic().method1();
    }

    public void method1() {
        System.out.println("Hello non Static method!");
    }
}

