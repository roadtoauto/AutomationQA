package com.customertimes.tests.lesson_two;

import com.customertimes.framework.config.TestConfig;
import com.customertimes.tests.BaseTest;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;

import static com.customertimes.framework.driver.WebDriverRunner.getWebDriver;

public class AuthTest extends BaseTest {

    WebDriverWait explicit;

    @BeforeClass
    public void explicit() {
        explicit = new WebDriverWait(getDriver(), 5);
    }

    @Test(description = "Authorisation!", priority = 1)
    public void openSFTest() {
        getDriver().get("https://test.salesforce.com/");
        explicit.until(ExpectedConditions.visibilityOf(getDriver().findElement((By.cssSelector(username())))));
        WebElement elementUsername = getDriver().findElement(By.cssSelector(username()));
        elementUsername.click();
        elementUsername.sendKeys(properties().getProperty("login"));
        WebElement elementPassword = getDriver().findElement(By.cssSelector(password()));
        elementPassword.click();
        elementPassword.sendKeys(properties().getProperty("password"));
        WebElement elementSubmit = getDriver().findElement(By.cssSelector(submitButton()));
        elementSubmit.click();
        explicit.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.cssSelector(sbxAssert()))));
        String email = TestConfig.CONFIG.mail();
        System.out.println(email);
    }

    @Test(description = "Authorisation test", priority = 2)
    private void auth() {
        WebElement elementSBX = getDriver().findElement(By.cssSelector(sbxAssert()));
        String gTittle = elementSBX.getText();
        String expTittle = "alexander Pronichkin at IQVIA-Specialty";
        boolean noCaseSens = gTittle.equalsIgnoreCase(expTittle);
//        Assert.assertEquals(gTittle, expTittle, "Incorrect msg tittle");
        Assert.assertTrue(noCaseSens);
        explicit.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.id(myAccountsButtonNEW()))));
    }

    @Test(description = "ProfilePage Negative Test", priority = 3)
    private void profilePage() {
        explicit.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.id(myAccountsButtonNEW()))));
        WebElement myAccounts = getDriver().findElement(By.id(myAccountsButtonNEW()));
        WebDriverWait wait = new WebDriverWait(getDriver(), 17);
        myAccounts.click();
        WebElement iFrame = wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.id(frameId()))));
        getDriver().switchTo().frame(iFrame);
        WebElement h2 = wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.cssSelector(filter()))));
        System.out.println(h2);
        String actual = h2.getText();
        String expected = "Filter";
        Assert.assertEquals(actual, expected, "null value available");

    }

    @Test(description = "Negative case for auth with FAKER", priority = 4)
    private void negativeAuth() {
        Faker faker = new Faker(new Locale("en"));
        getDriver().get("https://test.salesforce.com/");
        explicit.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.cssSelector(username()))));
        String invalidLogin = faker.internet().safeEmailAddress();
        String invalidPass = faker.internet().password();
        WebElement elementUsername = getDriver().findElement(By.cssSelector(username()));
        WebElement elementPassword = getDriver().findElement(By.cssSelector(password()));
        elementUsername.sendKeys(invalidLogin);
        elementPassword.sendKeys(invalidPass);
        WebElement elementSubmit = getDriver().findElement(By.cssSelector(submitButton()));
        elementSubmit.click();
        List<WebElement> errorElements = getDriver().findElements(By.id(loginError()));
        int expected = 1;
        int actual = errorElements.size();
        Assert.assertEquals(actual, expected, "Message is not available");

    }
}
