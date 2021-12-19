package com.customertimes.Lesson9.task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set {
    public static void main(String[] args) {
        getHashSet();

    }

    public static void getHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("1 element");
        hashSet.add("2 element");
        hashSet.add("3 element");
        hashSet.add("4 element");
        hashSet.add("9 element");
        hashSet.add("2 element");
        hashSet.add("7 element");
        hashSet.add("4 element");
        hashSet.add("5 element");
        hashSet.add("10 element");

        List<String> toList = new ArrayList<>(hashSet);

        System.out.println(hashSet);
        System.out.println(hashSet.contains("xx element"));
        System.out.println(hashSet.size());
        System.out.println(hashSet.iterator().hasNext());
        System.out.println();
        System.out.println("Second element in Set = " + toList.get(1));
        System.out.println();

        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }
    }
}

