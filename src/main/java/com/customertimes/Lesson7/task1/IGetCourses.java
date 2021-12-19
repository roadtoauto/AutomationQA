package com.customertimes.Lesson7.task1;

public interface IGetCourses {
    default void getCourses() {
        System.out.println("Our Departament get refresher courses");
    }
}
