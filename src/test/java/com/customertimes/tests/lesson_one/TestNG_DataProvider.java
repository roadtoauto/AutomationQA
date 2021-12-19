package com.customertimes.tests.lesson_one;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.customertimes.tests.BaseTest;

public class TestNG_DataProvider extends BaseTest {
    @DataProvider(name = "test1")
    public Object[][] createData() {
        return new Object[][]{
                {"Google", 1},
                {"Onliner", 2}
        };
    }


    @Test(dataProvider = "test1")
    public void checkSiteTitle(String expectedTitle, int number) {
        getDriver().get("https://google.com");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actualTitle = getDriver().getTitle();
        System.out.println("Number" + number);
        Assert.assertEquals(actualTitle, expectedTitle, "Page title[" + actualTitle + "] is not equal to - " + expectedTitle);
    }
}