package com.customertimes.framework.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasketPage extends HeaderPage {

    @FindBy(className = "headerCartCount")
    private WebElement basketLink;

    @FindBy(xpath = "//td[@class='g-table-cell basket__item cr-basket__name']/a")
    private WebElement firstProductInBasketText;

    @FindBy(xpath = "//a[contains(text(),'удалить')]")
    private List<WebElement> deleteButtonInBasket;

    WebDriverWait wait;

    public BasketPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, TIME_OUT);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void openPage() {
    }

    public BasketPage clickToBasket() {
        wait.until(ExpectedConditions.elementToBeClickable(basketLink));
        basketLink.click();
        return new BasketPage(driver);
    }

    public int deleteItems() {
        int a = deleteButtonInBasket.size();
        return a;
    }

    public boolean basketIsEmpty() {
        if (deleteItems() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void cleanBasket() {
        if (basketIsEmpty()) {
            for (int i = 0; i < deleteItems(); i++) {
                WebElement element = deleteButtonInBasket.get(i);
                element.click();
            }
        }
    }


//    public void cleanBasket(){
//        try {
//            WebElement products = wait.until(ExpectedConditions.visibilityOf(firstProductInBasketText));
//            int a = products.findElements(By.xpath("//a[@class='g-pseudo_href cr-from_basket j-from_basket']")).size();
//            if(a > 0){
//                wait.until(ExpectedConditions.visibilityOf(deleteButtonInBasket));
//                deleteButtonInBasket.click();
//
//                cleanBasket();
//            } else {
//                System.out.println("No elements, cleaned");
//            }
//        }catch (NoSuchElementException e) {
//            System.out.println("EXCEPTION!!!");
//        }
//    }


    public boolean verifItemInBasket(String bought) {
        try {
            WebElement firstProductInBasket = wait.until(ExpectedConditions.visibilityOf(firstProductInBasketText));
            return firstProductInBasket.getText().equals(bought);
        } catch (NoSuchElementException e) {
            return false;
        }
    }


}
