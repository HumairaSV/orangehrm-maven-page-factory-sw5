package com.orangehrmlive.demo_opensource.testsuite;

import com.orangehrmlive.demo_opensource.pages.HomePage;
import com.orangehrmlive.demo_opensource.pages.LoginPage;
import com.orangehrmlive.demo_opensource.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        homePage.enterUsername("Admin");
        homePage.enterPassword("admin123");
        homePage.clickOnLoginButton();
        Assert.assertEquals(loginPage.verifyThatLoginWasSuccessful(), "Dashboard", "Login unsuccessful, user not navigated to Dashboard");
    }
}
