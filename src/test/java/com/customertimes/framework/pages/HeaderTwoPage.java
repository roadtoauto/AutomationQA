package com.customertimes.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderTwoPage extends HeaderPage{

    WebDriverWait wait;

    @FindBy(css = "div.styles_promoList__1dG3i > div > div")
    private WebElement promoButton;

    public HeaderTwoPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, TIME_OUT);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void openPage() {

    }

    public void clickOnPromoButton(){
        wait.until(ExpectedConditions.visibilityOf(promoButton));
        promoButton.click();
    }


}
