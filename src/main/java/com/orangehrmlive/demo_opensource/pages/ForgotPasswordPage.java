package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ForgotPasswordPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//p[text() = 'Forgot your password? ']")
    WebElement forgotPasswordLink;

    @CacheLookup
    @FindBy(xpath = "//h6[contains(@class, 'oxd-text oxd-text--h6 orangehrm-forgot-password-title')]")
    WebElement resetPasswordText;

    public void clickOnForgotPasswordLink(){
        Reporter.log("Click on Forgotten password link" + forgotPasswordLink.toString());
        clickOnElement(forgotPasswordLink);
    }

    public String verifyResetPasswordText(){
        Reporter.log("Verify the reset Password text" + resetPasswordText.toString());
        return getTextFromElement(resetPasswordText);
    }
}
