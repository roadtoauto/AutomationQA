package com.customertimes.Lesson4;

import com.customertimes.Lesson7.task1.IGetHoliday;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public abstract class BoardOfDirectors implements IGetHoliday {
    public final static int tax = 25;
    protected static long id;
    public String name;
    public LocalDateTime dateOfBirthday;
    private int salary;
    private int priceInHour;

    BoardOfDirectors(long id, String name, int salary, int priceInHour, LocalDateTime dateOfBirthday) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.priceInHour = priceInHour;
        this.dateOfBirthday = dateOfBirthday;
    }

    public static LocalDateTime getTodayDate() {
        LocalDateTime todayDate = LocalDateTime.now();
        return todayDate;
    }

    public String getDateOfBirthday() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MMMM/eeee HH:mm:ss");
        String date = dateOfBirthday.format(formatter);
        return date;
    }

    public abstract void work();

    public int getSalary() {
        return salary;
    }

    public int getPriceInHour() {
        return priceInHour;
    }

    public int sallaryWithTax(){
        int a = getSalary() - (getSalary()/100)*25;
        return a;
    }

}

