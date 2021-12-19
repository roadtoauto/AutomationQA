package com.customertimes.Lesson8.task1;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class CreateFile {
    public static void main(String[] args){
        writeFile();
    }
    private static void writeFile() {
        String text = "Strings, which are widely used in Java programming, are a sequence of characters. In the Java programming language, strings are objects.\n" +
                "The Java platform provides the String class to create and manipulate strings.\n" +
                "In this case, \"Hello world!\" is a string literal—a series of characters in your code that is enclosed in double quotes. Whenever it encounters a string literal in your code, the compiler creates a String object with its value—in this case, Hello world!.\n" +
                "As with any other object, you can create String objects by using the new keyword and a constructor. The String class has thirteen constructors that allow you to provide the initial value of the string using different sources, such as an array of characters:\n";

        File file = new File("src/main/resources/newFile.txt");
        try {
            FileUtils.writeStringToFile(file,text, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
