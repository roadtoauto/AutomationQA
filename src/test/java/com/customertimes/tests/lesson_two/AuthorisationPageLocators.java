package com.customertimes.tests.lesson_two;

import lombok.Getter;
@Getter
public class AuthorisationPageLocators {
    private String loginCSS = "[name=username]";
    private String loginXPATH = "//input[@name=username]";
    private String passwordCSS ="[name=pw]";
    private String passwordXPATH="//input[@name=pw]";
    private String submitCSS = "[name=Login]";
    private String submitXPATH = "//input[@name=login]";
    private String sbxCSS = ".pageType";
    private String errorCSS = "error";

}
