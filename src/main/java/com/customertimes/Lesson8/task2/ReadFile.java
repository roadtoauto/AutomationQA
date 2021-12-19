package com.customertimes.Lesson8.task2;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class ReadFile {
    public static void main(String[] args) {
        readFile();
    }

    private static void readFile() {
        String sep = "\\ |. |, |!|\"|—|\n|:";

        File file = new File("src/main/resources/newFile.txt");

        String read = null;
        try {
            read = FileUtils.readFileToString(file, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] firstTask = StringUtils.split(read, "\n");
        String[] secondTask = StringUtils.splitByWholeSeparator(read, ".");
        String[] thirdTask = StringUtils.split(read, sep);
        String[] thirdTask1 = StringUtils.split(firstTask[0], sep);
        String[] thirdTask2 = StringUtils.split(firstTask[1], sep);
        String[] thirdTask3 = StringUtils.split(firstTask[2], sep + "!.");
        String[] thirdTask4 = StringUtils.split(firstTask[3], sep);

        int length = 0;
        for (int i = 0; i < thirdTask.length; i++) {
            for (int j = 0; j < thirdTask[i].length(); j++) {
                length++;
            }
        }
        char[] fourTask = new char[length];
        int k = 0;
        for (int i = 0; i < thirdTask.length; i++) {
            for (int j = 0; j < thirdTask[i].length(); j++) {
                fourTask[k] = thirdTask[i].charAt(j);
                k++;
            }
        }


        System.out.println(read);
        System.out.println("Amount paragraphs = " + firstTask.length);
        System.out.println("Amount of sentences = " + secondTask.length);
        System.out.println("Amount of words = " + thirdTask.length);
        System.out.println("Amount of characters = " + fourTask.length);
        System.out.println("Amount of words for 1 paragraph =" + thirdTask1.length);
        System.out.println("Amount of words for 2 paragraph =" + thirdTask2.length);
        System.out.println("Amount of words for 3 paragraph =" + thirdTask3.length);
        System.out.println("Amount of words for 4 paragraph =" + thirdTask4.length);
        System.out.println("Amount of words for 3 paragraph =" + thirdTask3[44]);

    }
}