package com.customertimes.framework.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProductsPage extends HeaderPage{

    WebDriverWait wait;


    @FindBy(xpath = "//span[contains(text(),'Смартфон Apple iPhone 12')]")
    private WebElement getTextForItem;

    @FindBy(xpath = "//span[contains(text(),'Смартфон Apple iPhone 12')]/ancestor::dl//form[@class='j-to_basket']")
    private WebElement buyButton;

    By buyButtonLocator = By.xpath("//span[contains(text(),'Смартфон Apple iPhone 12')]/ancestor::dl//form[@class='j-to_basket']");

//    //span[@class='result__name']
//    //span[contains(text(),'Смартфон Apple iPhone 12')]/ancestor::dl//form[@class='j-to_basket']
//    //form[@class='j-to_basket']
//    //span[contains(text(),'Смартфон Apple iPhone 12')]

    public ProductsPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, TIME_OUT);
        PageFactory.initElements(driver, this);
    }


    @Override
    public void openPage() {

    }

    public void clickToBuyButton(){
        wait.until(ExpectedConditions.visibilityOf(buyButton));
        waitForElementBuyButton();
        buyButton.click();
    }

    public HeaderPage waitForElementBuyButton() {
        try {
            wait.until(ExpectedConditions.numberOfElementsToBe(buyButtonLocator, 0));
            return new HeaderPage(driver);
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("'Buy Button number 0");
        }
    }

    public String text(){
        return getTextForItem.getText();
    }

}
