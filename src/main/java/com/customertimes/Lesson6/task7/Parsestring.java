package com.customertimes.Lesson6.task7;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Parsestring {

    public static void main(String[] args) {
        System.out.println(returnLDT());
        System.out.println(timeFormatting());
    }

    public static LocalDateTime returnLDT() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:s");
        String a = "1986-22-08 12:30:1";
        LocalDateTime date = LocalDateTime.parse(a, formatter);
        return date;
    }

    public static ZoneId getZone() {
        ZoneId zoneIdNY = ZoneId.of("America/New_York");
        return zoneIdNY;
    }

    public static LocalDateTime timeZoneNow() {
        LocalDateTime a = LocalDateTime.now(getZone());
        return a;

    }

    public static LocalDateTime timeFormatting() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:s");
        String a = timeZoneNow().format(formatter);
        LocalDateTime date = LocalDateTime.parse(a, formatter);
        return date;

    }
}
