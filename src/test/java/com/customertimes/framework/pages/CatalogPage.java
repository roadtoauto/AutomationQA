package com.customertimes.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CatalogPage extends HeaderPage{


    @FindBy(xpath = "//a[contains(text(),'Умные часы')]/ancestor::li//a[@class = 'cloud-sub__header']")
    private WebElement smartTime;

    @FindBy(xpath = "//span[contains(text(),'Смартфоны, ТВ и электроника')]")
    private WebElement linkToGadgets;

    WebDriverWait wait;

    public CatalogPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, TIME_OUT);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void openPage() {
    }

    public CatalogPage linkWithGadgetsInCatalog(){
        wait.until(ExpectedConditions.visibilityOf(linkToGadgets));
        linkToGadgets.click();
        return this;
    }

    public void linkInGadgetsSmartTime(){
        wait.until(ExpectedConditions.visibilityOf(smartTime));
        smartTime.click();
    }
    }




