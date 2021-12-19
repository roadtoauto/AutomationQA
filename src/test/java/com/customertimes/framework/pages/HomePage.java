package com.customertimes.framework.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends AbstractPage {

    WebDriverWait wait;
    String search = "Iphone 12";

    @FindBy(xpath = "//span[contains(text(),'Каталог товаров')]")
    private WebElement catalogButton;

    @FindBy(xpath = "//a[contains(text(),'Смартфоны')]/ancestor::li[@class = 'styles_promoItem__3H-t7']")
    private WebElement smartphoneButton;

    @FindBy(xpath = "//span[@class='userToolsSubtitle']")
    private WebElement userSubtitleSpan;

    @FindBy(xpath = "//input[@id='catalogSearch']")
    private WebElement searchLocatorInput;

    @FindBy(xpath = "//div[contains(text(),'Категории')]")
    private WebElement waitingLocatorCategory;


    public HomePage(WebDriver driver) {

        super(driver);
        wait = new WebDriverWait(driver, TIME_OUT);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void openPage() {
    }

    public ProductsPage searchProduct(){
        wait.until(ExpectedConditions.visibilityOf(searchLocatorInput));
        searchLocatorInput.clear();
        searchLocatorInput.sendKeys(search);
        searchLocatorInput.click();
        wait.until(ExpectedConditions.visibilityOf(smartphoneButton));
        searchLocatorInput.sendKeys("\n");
        return new ProductsPage(driver);
    }

    public CatalogPage catalogButtonClick(){
        wait.until(ExpectedConditions.visibilityOf(catalogButton));
        catalogButton.click();
        return new CatalogPage(driver);
    }

    public HeaderTwoPage clickOnSmartPhoneButton(){
        wait.until(ExpectedConditions.visibilityOf(smartphoneButton));
        smartphoneButton.click();
        return new HeaderTwoPage(driver);
    }

    public boolean doesUserSubtitleSpanContainEmail(String email) {
        try {
            WebElement userSubtitle = wait.until(ExpectedConditions.visibilityOf(userSubtitleSpan));
            return userSubtitle.getText().equals(email);
        } catch (NoSuchElementException e) {
            return false;
        }
    }


}