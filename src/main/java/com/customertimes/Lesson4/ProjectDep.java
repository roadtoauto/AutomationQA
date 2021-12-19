package com.customertimes.Lesson4;

import com.customertimes.Lesson7.task1.IGetNewNotif;
import com.customertimes.Lesson7.task1.IGetCourses;

import java.time.LocalDateTime;

public abstract class ProjectDep extends BoardOfDirectors implements IGetCourses, IGetNewNotif {
    public String workplace;

    ProjectDep(long id, String name, int salary, int priceInHour, String workplace, LocalDateTime dateOfBirthday) {
        super(id, name, salary, priceInHour, dateOfBirthday);
        this.workplace = workplace;
    }

    public abstract void departament();

    public int plusBonus() {
        int salary = getSalary();
        int bonus = salary + 500;
        return bonus;
    }

    public int minusSalary() {
        int salary = getSalary();
        int minus = salary - 250;
        return minus;
    }

    public int countPriceInHour() {
        int salary = getSalary();
        int a = salary / (22 * 8);
        return a;
    }

}
