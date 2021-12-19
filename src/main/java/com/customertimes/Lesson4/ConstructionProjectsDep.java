package com.customertimes.Lesson4;

import java.time.LocalDateTime;

public abstract class ConstructionProjectsDep extends ProjectDep {
    public String solutionDoc;

    ConstructionProjectsDep(long id, String name, int salary, int priceInHour, String workplace, LocalDateTime dateOfBirthday, String solutionDoc) {
        super(id, name, salary, priceInHour, workplace, dateOfBirthday);
        this.solutionDoc = solutionDoc;
    }

    public static String[] allDocumentsForProjects() {
        String[] doc = {"Doc1", "Doc2", "Doc3", "Doc4", "Doc5"};
        return doc;
    }

    public static int[] allEmployeeInDep() {
        int[] emp = {1, 2, 3, 4, 5};
        return emp;
    }

    public abstract void information();
}
