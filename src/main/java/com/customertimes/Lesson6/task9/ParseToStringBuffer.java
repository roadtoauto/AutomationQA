package com.customertimes.Lesson6.task9;

public class ParseToStringBuffer {
    public static void main(String[] args) {
        modifStringOne();
        modifStringTwo();
    }

    public static void modifStringOne() {
        String a = "Alexander hello!";
        StringBuffer stringBuffer = new StringBuffer(a);
        stringBuffer.append("*aaaazzzzdddd");
        System.out.println(stringBuffer);
    }

    public static void modifStringTwo() {
        String a = "Alexander hello!";
        StringBuilder stringBuilder = new StringBuilder(a);
        stringBuilder.append("*xzxzxzxzxzxz");
        System.out.println(stringBuilder);
    }

}
