package com.customertimes.tests.lesson_two;

import com.customertimes.framework.config.TestConfig;
import com.customertimes.model.User;
import com.customertimes.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class AuthorisationTo21vek extends BaseTest {

    private static final String url = "https://www.21vek.by/";
    User user;
    WebDriverWait explicit;

    @BeforeClass
    public void explicit() {
        explicit = new WebDriverWait(getDriver(), 15);
    }

    @Test(description = "Authorisation check", priority = 1)
    public void accountCheck(){
        getDriver().get(url);
        explicit.until(ExpectedConditions.elementToBeClickable(getDriver().findElement((By.xpath(account21vekButton()))))).click();
        explicit.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.xpath(enterButton())))).click();
        explicit.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath(loginInput())))).sendKeys(email);
        explicit.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath(passInput())))).sendKeys(password);
        explicit.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath(submitButtonOnForm())))).click();
        explicit.until(ExpectedConditions.stalenessOf(getDriver().findElement((By.xpath(account21vekButton())))));
        explicit.until(ExpectedConditions.visibilityOf(getDriver().findElement((By.xpath(account21vekButton())))));
        explicit.until(ExpectedConditions.elementToBeClickable(getDriver().findElement((By.xpath(account21vekButton()))))).click();
        explicit.until(ExpectedConditions.visibilityOf(getDriver().findElement((By.cssSelector(userCheckLogin())))));
        explicit.until(ExpectedConditions.visibilityOf(getDriver().findElement((By.xpath(checkMailText())))));
        WebElement checkaccount = getDriver().findElement(By.cssSelector(userCheckLogin()));
        String actTittle = checkaccount.getText();
        String expTittle = email;
        boolean caseTittle =actTittle.equalsIgnoreCase(expTittle);
        Assert.assertTrue(caseTittle);
    }

    @Test(description = "Basket add", priority = 2)
    public void basketCheck(){
        explicit.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.id("j-search"))));
        WebElement search = getDriver().findElement(By.id("j-search"));
        search.sendKeys("Iphone 13 \n");
        explicit.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath(phoneText()))));
        WebElement phone = getDriver().findElement(By.xpath(phoneText()));
        String bought = phone.getText();
        WebElement buy = getDriver().findElement(By.xpath(buyButton()));
        buy.click();
        explicit.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.className(basketLink()))));
        WebElement basket = getDriver().findElement(By.className(basketLink()));
        basket.click();
        explicit.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath(productVerifInBasket()))));
        WebElement basketCheck = getDriver().findElement(By.xpath(productVerifInBasket()));
        String buyInBasket = basketCheck.getText();
        boolean caseProduct = bought.equals(buyInBasket);
        Assert.assertTrue(caseProduct);

    }

    @AfterMethod
    public void returntostart(Method method){
        switch (method.getName()){
            default:
                getDriver().navigate().to(url);
        }
    }

}