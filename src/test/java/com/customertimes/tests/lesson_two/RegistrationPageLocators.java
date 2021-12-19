package com.customertimes.tests.lesson_two;

import lombok.Getter;

@Getter
public class RegistrationPageLocators {
    private String firstName = "//input[@name='full_name']";
    private String mail = "//input[@name='email']";
    private String password = "//input[@name='password']";
    private String submit = "//button[@type='submit']";
}
