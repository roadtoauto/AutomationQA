package com.customertimes.Lesson4;

import java.time.LocalDateTime;

public abstract class ObjectsDep extends ProjectDep {
    public String techPlanDoc;

    ObjectsDep(long id, String name, int salary, int priceInHour, String workplace, LocalDateTime dateOfBirthday, String techPlanDoc) {
        super(id, name, salary, priceInHour, workplace, dateOfBirthday);
        this.techPlanDoc = techPlanDoc;
    }

    ObjectsDep(long id, String name, int salary, int priceInHour, String workplace, LocalDateTime dateOfBirthday) {
        super(id, name, salary, priceInHour, workplace, dateOfBirthday);
    }

    public static int plusBonus(int salary) {
        int bonus = salary + 500;
        return bonus;
    }

    public static int minusSalary(int salary) {
        int minus = salary - 250;
        return minus;
    }

    public abstract void valueOfwork();

//    public static int countPriceInHour(){
//        int salary = getSalary();
//        int a = salary / 1 / 1;
//        return a;
//    }
}
