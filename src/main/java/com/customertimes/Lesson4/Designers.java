package com.customertimes.Lesson4;

import java.time.LocalDateTime;

public final class Designers extends ConstructionProjectsDep {
    public DesignSolutions solutions;

    Designers(long id, String name, int salary, int priceInHour, String workplace, LocalDateTime dateOfBirthday, String solutionDoc, DesignSolutions solutions) {
        super(id, name, salary, priceInHour, workplace, dateOfBirthday, solutionDoc);
        this.solutions = solutions;
    }

    Designers(long id, String name, int salary, int priceInHour, String workplace, LocalDateTime dateOfBirthday, String solutionDoc) {
        super(id, name, salary, priceInHour, workplace, dateOfBirthday, solutionDoc);
    }

    public static String getSolution() {
        String solution = " We have new idea!";
        return solution;
    }

    @Override
    public void work() {
        System.out.println("We work with Design");
    }

    @Override
    public String toString() {
        String result = "id = " + id + ", name = " + name + ", salary = " + getSalary() + ", price in hour = " + getPriceInHour() + ", workplace =" + workplace + ", solutiondoc =" + solutionDoc + ", solutions =" + solutions;
        return result;
    }

    @Override
    public void information() {
        System.out.println("Designers: Our department create your reality to paradise!");
    }

    @Override
    public void departament() {
        System.out.println("Designers: We work in office, project departament, designers");
    }
}
