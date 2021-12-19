package com.customertimes.Lesson8.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    static String name = "Sergeii";

    public static void main(String[] args) {
        System.out.println(regEx());
    }

    public static String regEx() {
        String str = "User " + name + " updated the page at 12:30 PM 330 day's ago";
        Pattern patternOne = Pattern.compile("^User \\w[7,9] updated the page at \\d[0,12]:\\d[0,59] [AM,PM]{2} \\d[1,1000] day's ago$");
        Matcher matcherOne = patternOne.matcher(str);
        boolean isTrue = matcherOne.find();
        System.out.println("Correspond name? =" + isTrue);
        String a = "Incorrect login";
        if (isTrue) {
            return str;
        } else
            return a;
    }

}
