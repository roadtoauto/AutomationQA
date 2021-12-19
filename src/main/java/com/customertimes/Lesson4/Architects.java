package com.customertimes.Lesson4;

import java.time.LocalDateTime;

public final class Architects extends ConstructionProjectsDep {
    public ArchitecsSolutions solutions;

    Architects(long id, String name, int salary, int priceInHour, String workplace, LocalDateTime dateOfBirthday, String solutionDoc, ArchitecsSolutions solutions) {
        super(id, name, salary, priceInHour, workplace, dateOfBirthday, solutionDoc);
        this.solutions = solutions;
    }

    Architects(long id, String name, int salary, int priceInHour, String workplace, LocalDateTime dateOfBirthday, String solutionDoc) {
        super(id, name, salary, priceInHour, workplace, dateOfBirthday, solutionDoc);
    }

    public static long returnId() {
        return id;
    }

    public  ArchitecsSolutions getSolutions() {
        return solutions;
    }

    public  String forPersonSolution() {
        String a = solutions + " for " + id;
        return a;
    }

    @Override
    public void work() {
        System.out.println("We create architectural solutions ");
    }

    @Override
    public String toString() {
        String result = "id = " + id + ", name = " + name + ", salary = " + getSalary() + ", price in hour = " + getPriceInHour() + ", workplace =" + workplace + " DateTime = " + getDateOfBirthday() + ", solutiondoc =" + solutionDoc + ", solutions =" + solutions;
        return result;
    }

    @Override
    public void information() {
        System.out.println("Architecs: Our department makes your idea real!");
    }

    @Override
    public void departament() {
        System.out.println("Architecs: We work in office, project departament, architects");
    }
}
