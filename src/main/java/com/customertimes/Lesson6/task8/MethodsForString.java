package com.customertimes.Lesson6.task8;

public class MethodsForString {

    public static void main(String[] args) {
        System.out.println(subString());
        System.out.println(containst());
        System.out.println(replace());
        split();
    }

    public static String subString() {
        String a = "Hello my dear friends!";
        String b = a.substring(2, 15);
        return b;
    }

    public static Boolean containst() {
        String a = "Hello my dear friends!";
        Boolean b = a.contains("dear");
        return b;
    }

    public static String replace() {
        String a = "Hello my dear friends!";
        String b = a.replace("e", "***");
        return b;
    }

    public static void split() {
        String a = "Hello my dear friends!";
        String[] b = a.split(" ");
        for (String text : b) {
            System.out.println(text);
        }
    }

}
