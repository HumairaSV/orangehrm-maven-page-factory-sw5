package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(name = "username")
    WebElement usernameField;

    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@class, 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')]")
    WebElement loginButton;


    public void enterUsername(String username){
        Reporter.log("Enter the username in the username field" + usernameField.toString());
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password){
        Reporter.log("Enter the password in the password field" + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){
        Reporter.log("Click on the login button" + loginButton.toString());
        clickOnElement(loginButton);
    }
}
