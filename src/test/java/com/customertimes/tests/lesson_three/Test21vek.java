package com.customertimes.tests.lesson_three;


import com.automation.remarks.testng.UniversalVideoListener;
import com.automation.remarks.video.annotations.Video;
import com.customertimes.framework.pages.*;
import com.customertimes.model.User;
import com.customertimes.tests.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.lang.reflect.Method;

@Listeners(UniversalVideoListener.class)
public class Test21vek extends BaseTest {

    private static final String TWENTY_FIRST_CENTURY_URL = "https://www.21vek.by/";
    User user;
    HomePage homePage;
    CatalogPage catalogPage;
    BasketPage basketPage;
    HeaderPage headerPage;
    LoginPage loginPage;
    ProductsPage productPage;
    HeaderTwoPage headerTwoPage;


    @BeforeClass
    public void beforeClassMethod() {
        homePage = new HomePage(getDriver());
        catalogPage = new CatalogPage(getDriver());
        basketPage = new BasketPage(getDriver());
        headerPage = new HeaderPage(getDriver());
        headerTwoPage = new HeaderTwoPage(getDriver());
        loginPage = new LoginPage(getDriver());
        productPage = new ProductsPage(getDriver());
        user = User.newBuilder().withEmail(email).withPassword(password).build();
        getDriver().get(TWENTY_FIRST_CENTURY_URL);
        loginToTwentyFirstCenturyTest();
    }


//    @Test(description = "Verify login to 21vek.by", priority = 1)
//    @Video(name = "Testlogin")
public void loginToTwentyFirstCenturyTest() {
    headerPage.clickAccountButton()
            .clickLoginButton()
            .loginAs(user);

}

    @Test(description = "login")
    public void loginTest(){
        headerPage.clickAccountButton();
        Assert.assertTrue(homePage.doesUserSubtitleSpanContainEmail(user.getEmail()),
                String.format("User subtitle span should contain '%s' email", user.getEmail()));
    }


    @Test(description = "Verify buy and basket")
//    @Video(name = "basket")
    public void buyAndBasketTest() {
        homePage.searchProduct()
                .clickToBuyButton();
        String a = productPage.text();
        basketPage.clickToBasket()
                .screenshot();
        Assert.assertTrue(basketPage.verifItemInBasket(a));
        basketPage.cleanBasket();
    }

    @Test(description = "Open catalog, smart time")
    @Video(name = "headerTwo")
    public void catalogSmartTime() {
        homePage.catalogButtonClick()
                .linkWithGadgetsInCatalog()
                .linkInGadgetsSmartTime();

    }

    @Test(description = "HeaderTwo page")
    public void headerTwoPage() {
        homePage.clickOnSmartPhoneButton()
                .clickOnPromoButton();
    }

//    @Test(description = "RandomNegative")
//    @Video(name = "randomNegative")
//    public void hierarchyCheck() {
//        homePage.catalogButtonClick()
//                .linkWithGadgetsInCatalog()
//                .linkInGadgetsSmartTime();
//        headerTwoPage.clickOnPromoButton();
//        basketPage.clickToBasket()
//                .cleanBasket();
//        headerPage.clickAccountButton()
//                .clickLoginButton()
//                .loginAs(user);
//    }

    @AfterMethod
    private void afterMethod(Method method) {
        switch (method.getName()) {
            default:
                getDriver().navigate().refresh();
                waitForLoad();
                break;
        }
    }

    void waitForLoad() {
        new WebDriverWait(getDriver(), 10).until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }
}