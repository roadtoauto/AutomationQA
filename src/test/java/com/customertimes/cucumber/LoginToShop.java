package com.customertimes.cucumber;

import com.customertimes.framework.pages.HeaderPage;
import com.customertimes.framework.pages.HomePage;
import com.customertimes.framework.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import static com.customertimes.framework.driver.WebDriverRunner.getWebDriver;

public class LoginToShop {

    private LoginPage loginPage = new LoginPage(getWebDriver());
    private HeaderPage headerPage = new HeaderPage(getWebDriver());
    private HomePage homePage = new HomePage(getWebDriver());

    @Given("User goes to login page")
    public void userGoesToLoginPage() {
        headerPage.clickAccountButton()
                .clickLoginButton();
    }

    @When("User enters email {string} and password {string}")
    public void userEntersEmailAndPassword(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
        loginPage.submitCredentials();
        loginPage.waitForSubmitAuthorizationButtonDisappear();
    }

    @Then("User {string} should be logged to application")
    public void userShouldBeLoggedToApplication(String email) {
        headerPage.clickAccountButton();

        Assert.assertTrue(String.format("User subtitle span should contain '%s' email", email),
                homePage.doesUserSubtitleSpanContainEmail(email));
    }
}