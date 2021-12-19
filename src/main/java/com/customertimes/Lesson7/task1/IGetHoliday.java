package com.customertimes.Lesson7.task1;

public interface IGetHoliday {
    default void getHolidays() {
        System.out.println("Today we will relax!");
    }
}
