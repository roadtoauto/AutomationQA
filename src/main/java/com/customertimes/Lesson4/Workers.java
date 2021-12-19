package com.customertimes.Lesson4;

import java.time.LocalDateTime;

public class Workers extends ObjectsDep {
    public char group;

    Workers(long id, String name, int salary, int priceInHour, String workplace, LocalDateTime dateOfBirthday, String techPlanDoc, char group) {
        super(id, name, salary, priceInHour, workplace, dateOfBirthday, techPlanDoc);
        this.group = group;
    }

    Workers(long id, String name, int salary, int priceInHour, String workplace, LocalDateTime dateOfBirthday, String techPlanDoc) {
        super(id, name, salary, priceInHour, workplace, dateOfBirthday, techPlanDoc);
    }

    public static String getMaterials() {
        String waiting = "Workers: We need to more materials";
        return waiting;
    }

    public char getGroup() {
        return group;
    }

    public long getId() {
        return id;
    }


    @Override
    public void valueOfwork() {
        System.out.println("Workers: Soon we will finish");
    }

    @Override
    public void work() {
        System.out.println("Workers: We are build");
    }

    @Override
    public String toString() {
        String result = "id = " + id + ", name = " + name + ", salary = " + getSalary() + ", price in hour = " + getPriceInHour() + ", workplace =" + workplace + ", tech plan doc =" + techPlanDoc + ", group =" + group;
        return result;
    }

    @Override
    public void departament() {
        System.out.println("We work with build objects, in project departament");
    }
}
