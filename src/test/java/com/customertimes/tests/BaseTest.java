package com.customertimes.tests;

import com.customertimes.framework.config.TestConfig;
import com.customertimes.framework.driver.WebDriverRunner;
import com.customertimes.tests.lesson_two.Locators21vek;
import com.customertimes.tests.lesson_two.AuthorisationPageLocators;
import com.customertimes.tests.lesson_two.ProfilePageLocators;
import com.customertimes.tests.lesson_two.RegistrationPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected SoftAssert soft;
    protected String email = TestConfig.CONFIG.mail();
    protected String password = TestConfig.CONFIG.password();

    @BeforeSuite(alwaysRun = true)
    public void setup() {
        System.out.println("Tests automation is started");
        soft = new SoftAssert();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        System.out.println("Tests automation is ended");
        WebDriverRunner.closeWebDriver();
    }

    protected WebDriver getDriver() {
        return WebDriverRunner.getWebDriver();
    }


    protected String username() {
        AuthorisationPageLocators login = new AuthorisationPageLocators();
        return login.getLoginCSS();
    }

    protected String password() {
        AuthorisationPageLocators password = new AuthorisationPageLocators();
        return password.getPasswordCSS();
    }

    protected String submitButton() {
        AuthorisationPageLocators submit = new AuthorisationPageLocators();
        return submit.getSubmitCSS();
    }

    protected String firstName() {
        RegistrationPageLocators firstName = new RegistrationPageLocators();
        return firstName.getFirstName();
    }

    protected String email() {
        RegistrationPageLocators email = new RegistrationPageLocators();
        return email.getMail();
    }

    protected String sbxAssert() {
        AuthorisationPageLocators sbx = new AuthorisationPageLocators();
        return sbx.getSbxCSS();
    }

    protected String myAccountsButton() {
        ProfilePageLocators myAcc = new ProfilePageLocators();
        return myAcc.getMyAccountButton();
    }

    protected String myAccountsButtonNEW() {
        ProfilePageLocators myAccNEW = new ProfilePageLocators();
        return myAccNEW.getMyAccontButtonNEW();
    }

    protected String filter() {
        ProfilePageLocators filterLocator = new ProfilePageLocators();
        return filterLocator.getFilter();
    }

    protected String frameId() {
        ProfilePageLocators frame = new ProfilePageLocators();
        return frame.getFrameID();
    }

    protected String loginError(){
        AuthorisationPageLocators errorLogin = new AuthorisationPageLocators();
        return errorLogin.getErrorCSS();
    }

    protected Properties properties() {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/main/resources/test.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    protected String account21vekButton(){
        Locators21vek account = new Locators21vek();
        return account.getAccountButton();
    }

    protected String enterButton(){
        Locators21vek enterButton = new Locators21vek();
        return enterButton.getEnterButton();
    }

    protected String loginInput(){
        Locators21vek loginString = new Locators21vek();
        return loginString.getLoginString();
    }

    protected String passInput(){
        Locators21vek passString = new Locators21vek();
        return passString.getPasswordString();
    }

    protected String submitButtonOnForm(){
        Locators21vek enterForm = new Locators21vek();
        return enterForm.getSubmitOnForm();
    }

    protected String checkMailText(){
        Locators21vek checkMail = new Locators21vek();
        return checkMail.getCheckAccountEmail();
    }

    protected String phoneText(){
        Locators21vek phoneProd = new Locators21vek();
        return phoneProd.getPhoneText();
    }

    protected String buyButton(){
        Locators21vek buyButton = new Locators21vek();
        return buyButton.getBuyButton();
    }

    protected String basketLink(){
        Locators21vek basketButton = new Locators21vek();
        return basketButton.getBasketLink();
    }
    protected String productVerifInBasket(){
        Locators21vek basketVerif = new Locators21vek();
        return basketVerif.getFirstProductInBasketText();
    }

    protected String userCheckLogin(){
        Locators21vek userCheckLogin = new Locators21vek();
        return userCheckLogin.getUserCheckLogin();
    }

}

