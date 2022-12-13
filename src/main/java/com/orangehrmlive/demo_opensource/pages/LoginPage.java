package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span/h6[contains(@class, 'oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module')]")
    WebElement dashboardText;

    public String verifyThatLoginWasSuccessful() {
        Reporter.log("Verify the login was successful text" + dashboardText.toString());
        return getTextFromElement(dashboardText);
    }
}
