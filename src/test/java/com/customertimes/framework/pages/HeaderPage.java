package com.customertimes.framework.pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class HeaderPage extends HomePage{

    WebDriverWait wait;

    @FindBy(xpath = "//button[@class='styles_catalogButton__1K6kI']")
    private WebElement catalogButton;

    @FindBy(xpath = "//button[@class='userToolsBtn']")
    private WebElement loginButton;

    @FindBy(xpath = "//span[contains(text(),'Аккаунт')]")
    private WebElement accountButton;



    public HeaderPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, TIME_OUT);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void openPage() {
    }



    public HeaderPage clickAccountButton() {
        wait.until(ExpectedConditions.elementToBeClickable(accountButton));
        accountButton.click();
        return new HeaderPage(driver);
    }

    public HeaderPage catalogButton(){
        wait.until(ExpectedConditions.visibilityOf(catalogButton));
        catalogButton.click();
        return new HeaderPage(driver);
    }

    public LoginPage clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
        return new LoginPage(driver);
    }

//    public void screenshot(){
//        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        try {
//            FileUtils.copyFile(screenshot, new File("/Users/Александр/IdeaProjects/JavaAutom/src/test/java/resources/LoginScreen.png"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}
