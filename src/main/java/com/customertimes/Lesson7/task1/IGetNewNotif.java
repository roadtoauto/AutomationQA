package com.customertimes.Lesson7.task1;

public interface IGetNewNotif {
    default void tommorowPhotosession() {
        System.out.println("There will be a photo session tomorrow!");
    }
}
