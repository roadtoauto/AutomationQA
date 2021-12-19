package com.customertimes.Lesson4;

import java.time.LocalDateTime;

public final class Administrative extends BoardOfDirectors {
    protected String stamp;

    Administrative(long id, String name, int salary, int priceInHour, String stamp, LocalDateTime dateOfBirthday) {
        super(id, name, salary, priceInHour, dateOfBirthday);
        this.stamp = stamp;
        this.dateOfBirthday = dateOfBirthday;

    }

    public static String takeDismiss() {
        String dis = "Administrative: first warning";
        return dis;
    }

    public static String[] listOfStamps() {
        String[] stamp = {"Stamp1", "{Stamp2}"};
        return stamp;
    }

    public static int plusBonus(int salary) {
        int bonus = salary + 500;
        return bonus;
    }

    @Override
    public void work() {
        System.out.println("We work with administrative issues");
    }
}
