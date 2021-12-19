package com.customertimes.tests.lesson_one;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class AppTest {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Something before suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Something after suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Something before test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Something after test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("after method");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("Before Groups");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("After Groups");
    }


    @Test(description = "First Test!!")
    public void openGoogleTest() {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://google.com");

        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String expTittle = "google";
        String gTittle = driver.getTitle();
        Assert.assertEquals(gTittle, expTittle, "Incorrect tittle");
        driver.quit();
    }
}
