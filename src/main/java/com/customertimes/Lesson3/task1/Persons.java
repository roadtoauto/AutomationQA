package com.customertimes.Lesson3.task1;

import java.util.Objects;

public class Persons {
    String name;
    int year;
    char group;
    boolean checked;

    public Persons(String name, int year, char group, boolean checked) {
        this.name = name;
        this.year = year;
        this.group = group;
        this.checked = checked;
    }

    //Compliance check without variable checked
    //checked == persons.checked &&
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persons persons = (Persons) o;
        return year == persons.year && group == persons.group && Objects.equals(name, persons.name);
    }

    //need to add variables if required additional variables(checked)
    @Override
    public int hashCode() {
        return Objects.hash(name, year, group);
    }
}


