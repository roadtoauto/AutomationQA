package com.customertimes.Lesson8.task4l9;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class GetReadAndReplace {
    public static void main(String[] args) {
        readFile();
    }

    private static void readFile() {
        File file = new File("src/main/resources/newFile.txt");
        try {
            String read = FileUtils.readFileToString(file, Charset.defaultCharset());
            String firstTask = StringUtils.replaceChars(read, "!|.\",—: \n", "");
            char[] firstTaskLenght = firstTask.toCharArray();
            String[] taskToArray = StringUtils.stripAll(firstTask);
            String[] arayLenght = StringUtils.split(read, "\n");
            String secondTask = StringUtils.replace(read, "Hello", "322");
            String thirdTask = StringUtils.reverse(read);
            String[] fourTask = StringUtils.stripAll(StringUtils.remove(secondTask, "Strings"));

//            for (int i = firstTaskLenght.length-1; i >= 0; i--) {
//                System.out.println(firstTaskLenght[i]);
//            }

            System.out.println("Amount of chars = " + firstTaskLenght.length);
            System.out.println();
            System.out.println("Amount paragraphs = " + arayLenght.length);
            System.out.println();
            System.out.println(firstTask);
            System.out.println();
            System.out.println(secondTask);
            System.out.println();
            System.out.println(thirdTask);
            System.out.println();
            System.out.println(fourTask[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
