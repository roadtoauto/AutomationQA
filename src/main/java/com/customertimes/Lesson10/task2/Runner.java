package com.customertimes.Lesson10.task2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Runner {
    public static void main(String[] args){

        Properties properties = new Properties();

        try {
            properties.load(new FileReader("src/main/resources/test.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("login = "+ properties.getProperty("login"));
        System.out.println("password = "+ properties.getProperty("password"));
        System.out.println("path = "+ properties.getProperty("path"));
        System.out.println("link = "+ properties.getProperty("links"));
        System.out.println("digit = "+ properties.getProperty("digit"));
        properties.put("login", "New Login");
        properties.put("password", "New password");
        properties.put("path", "New path");
        properties.put("links", "New links");
        properties.put("digit", "New digit");
        System.out.println("new login = "+ properties.getProperty("login"));
        System.out.println("new password = "+ properties.getProperty("password"));
        System.out.println("new path = "+ properties.getProperty("path"));
        System.out.println("new link = "+ properties.getProperty("links"));
        System.out.println("new digit = "+ properties.getProperty("digit"));
    }
}
