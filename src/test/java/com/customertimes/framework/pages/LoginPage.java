package com.customertimes.framework.pages;

import com.customertimes.model.User;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;


public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//div[@class='style_inputContainer__2tRgM undefined']/input[@label='Электронная почта']")
    private WebElement emailInput;

    @FindBy(xpath = "//div[@class='style_inputContainer__2tRgM undefined']/input[@label='Пароль']")
    private WebElement passwordInput;

    @FindBy(xpath = "//div[@class='style_actions__2mIsz']/button")
    private WebElement submitAuthorizationButton;

    By submitAuthorizationButtonLocator = By.xpath("//div[@class='style_actions__2mIsz']/button");

    WebDriverWait wait;

    public LoginPage(WebDriver driver) {

        super(driver);
        wait = new WebDriverWait(driver, TIME_OUT);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void openPage() {
    }

    public void enterEmail(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void submitCredentials() {
        submitAuthorizationButton.click();
    }

    public HomePage waitForSubmitAuthorizationButtonDisappear() {
        try{
            wait.until(ExpectedConditions.numberOfElementsToBe(submitAuthorizationButtonLocator, 0));
            return new HomePage(driver);
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("'Submit Authorization' Button was not found");
        }

    }


    public HeaderPage loginAs(User user) {
        wait.until(ExpectedConditions.elementToBeClickable(submitAuthorizationButton));
        enterEmail(user.getEmail());
        enterPassword(user.getPassword());
        submitCredentials();
        waitForSubmitAuthorizationButtonDisappear();
        return new HeaderPage(driver);
    }

    public void screenshot(){
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("/Users/Александр/IdeaProjects/JavaAutom/src/test/java/resources/LoginScreen.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}