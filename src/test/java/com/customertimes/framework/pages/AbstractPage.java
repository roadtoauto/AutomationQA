package com.customertimes.framework.pages;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public abstract class AbstractPage {
    protected WebDriver driver;
    protected final int TIME_OUT = 10;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    public abstract void openPage();

    public void screenshot(){
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            String a = RandomStringUtils.random(5);
            FileUtils.copyFile(screenshot, new File("/Users/Александр/IdeaProjects/JavaAutom/src/test/java/resources/"+a+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}