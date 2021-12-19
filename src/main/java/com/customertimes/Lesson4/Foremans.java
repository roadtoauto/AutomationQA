package com.customertimes.Lesson4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Foremans extends ObjectsDep {
    public static boolean closedObj;

    Foremans(long id, String name, int salary, int priceInHour, String workplace, LocalDateTime dateOfBirthday, String techPlanDoc, boolean closedObj) {
        super(id, name, salary, priceInHour, workplace, dateOfBirthday, techPlanDoc);
        this.closedObj = closedObj;
    }

    Foremans(long id, String name, int salary, int priceInHour, String workplace, LocalDateTime dateOfBirthday, String techPlanDoc) {
        super(id, name, salary, priceInHour, workplace, dateOfBirthday, techPlanDoc);
    }


    public static boolean isClosedObj() {
        return closedObj;
    }

    public static void closedObject() {
        if (closedObj == true) {
            System.out.println("Foremans: object closed");
        } else
            System.out.println("Foremans: object in progress");

    }

    public static String remarksForWork() {
        String a = "for id = " + id + " remarks > 3";
        return a;
    }

    public String getDateOfBirthday() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MMMM/eeee HH:mm:ss");
        String date = dateOfBirthday.format(formatter);
        return date;
    }

    @Override
    public void work() {
        System.out.println("We manage the workers");
    }

    @Override
    public void departament() {
        System.out.println("Foremans: We manage the workers on the objects, project departament");
    }

    @Override
    public void valueOfwork() {
        System.out.println("Foremans closed: 3 objects");
    }
}
