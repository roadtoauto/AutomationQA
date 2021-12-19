package com.customertimes.Lesson3.task3and4;

import com.customertimes.Lesson3.task1.Persons;

import java.lang.reflect.Method;

public class Equal {

    public static void main(String[] args) {
        objects();
    }

    public static void objects() {
        Persons person1 = new Persons("Alexandr", 1995, 'A', true);
        Persons person2 = new Persons("Alexandr", 1995, 'A', false);
        Persons person3 = new Persons("Alexandr", 1996, 'A', true);

        System.out.println("Person1 hashcode =" + person1.hashCode());
        System.out.println("Person2 hashcode =" + person2.hashCode());
        System.out.println("Person3 hashcode =" + person3.hashCode());

        System.out.println("Is person1 equals person2 = " + person1.equals(person2));
        System.out.println("Is person3 equals person2 = " + person3.equals(person2) + '\n');

        Method[] m2 = person1.getClass().getMethods();
        for (Method a : m2) {
            System.out.println(a);
        }

    }
}
