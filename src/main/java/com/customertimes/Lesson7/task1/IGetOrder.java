package com.customertimes.Lesson7.task1;

public interface IGetOrder {
    void getOrder();

    default void getProblemWithReports() {
        System.out.println("Reports losed :(");
    }

    default int minusSlry(int a) {
        return -a;
    }
}
