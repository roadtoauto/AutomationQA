package com.customertimes.Lesson9.task2;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        getLinkedList();
    }

    public static void getLinkedList() {
        List<String> linkedList = new java.util.LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Fish");
        linkedList.add("Monkey");
        linkedList.add("Elephant");
        linkedList.add("Pig");
        linkedList.add("Horse");
        linkedList.add("Wolf");
        linkedList.add("Tiger");
        linkedList.add("Lion");

        linkedList.remove(2);
        linkedList.remove(3);
        linkedList.remove(5);

        System.out.println("Element 0 = "+ linkedList.get(0));
        System.out.println("Element 1 = "+ linkedList.get(1));
        System.out.println("Element 2 = "+ linkedList.get(2));
        System.out.println("Element 3 = "+ linkedList.get(3));
        System.out.println("Element 4 = "+ linkedList.get(4));
        System.out.println("Element 5 = "+ linkedList.get(5));
        System.out.println("Element 6 = "+ linkedList.get(6));
        try {
            System.out.println("Element 7 = "+ linkedList.get(7));
            System.out.println("Element 8 = "+ linkedList.get(8));
            System.out.println("Element 9 = "+ linkedList.get(9));
        }catch (IndexOutOfBoundsException e) {
            System.out.println("3 values were deleted, exc = "+e);
        }
        }
    }
