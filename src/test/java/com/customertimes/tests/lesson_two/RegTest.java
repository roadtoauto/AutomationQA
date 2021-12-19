package com.customertimes.tests.lesson_two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.customertimes.tests.BaseTest;

public class RegTest extends BaseTest {

    @Test(description = "Registration test")
    public void registrationTest() {
        getDriver().get("https://stepik.org/learn?auth=registration");
        try {
            Thread.sleep(12_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement elementFirstName = getDriver().findElement(By.xpath(firstName()));
        elementFirstName.sendKeys(properties().getProperty("firstName"));
        WebElement elementEmail = getDriver().findElement(By.xpath(email()));
        elementEmail.sendKeys(properties().getProperty("mail"));
        WebElement elementPass = getDriver().findElement(By.xpath(password()));
        elementPass.sendKeys(properties().getProperty("password"));
        WebElement elementButton = getDriver().findElement(By.xpath(submitButton()));
//        elementButton.click();
        try {
            Thread.sleep(25_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
