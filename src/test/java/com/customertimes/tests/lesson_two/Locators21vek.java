package com.customertimes.tests.lesson_two;

import lombok.Getter;
@Getter
public class Locators21vek {
    private String accountButton = "//span[@class = 'userToolsText']";
    private String enterButton = "//button[@title='Вход']";
    private String loginString = "//div[@class='style_inputContainer__2tRgM undefined']/input[@label='Электронная почта']";
    private String passwordString = "//div[@class='style_inputContainer__2tRgM undefined']/input[@label='Пароль']";
    private String submitOnForm = "//div[@class='style_actions__2mIsz']/button";
    private String checkAccountEmail = "//span[@class='userToolsSubtitle']";
    private String searchIDinput = ".j-search";
    private String phoneText = "//span[contains(text(),'Смартфон Apple iPhone 13')]";
    private String buyButton = "//span[contains(text(),'Смартфон Apple iPhone 13')]/ancestor::dl//form[@class='j-to_basket']";
    private String basketLink = "headerCartCount";
    private String firstProductInBasketText = "//td[@class='g-table-cell basket__item cr-basket__name']/a";
    private String userCheckLogin = "#userToolsDropDown > div > span";

}
