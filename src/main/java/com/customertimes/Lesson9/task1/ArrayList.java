package com.customertimes.Lesson9.task1;


import java.util.List;
import java.util.stream.Collectors;

public class ArrayList {
    public static void main(String[] args) {
        getArrayList();
    }

    public static void getArrayList() {
        List<String> arrayList = new java.util.ArrayList<>();
        arrayList.add(0, "x1");
        arrayList.add(1, "x2");
        arrayList.add(2, "x3");
        arrayList.add(3, "x4");
        arrayList.add(4, "x5");
        arrayList.add(5, "x6");
        arrayList.add(6, "x7");
        arrayList.add(7, "x8");
        arrayList.add(8, "x9");
        arrayList.add(9, "xx");

        String[] result = arrayList.stream().collect(Collectors.toList()).toArray(new String[0]);
        for (String string : result) {
            System.out.println("Volvo_" + string);
        }
    }
}

