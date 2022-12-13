package com.orangehrmlive.demo_opensource.testsuite;

import com.orangehrmlive.demo_opensource.pages.ForgotPasswordPage;
import com.orangehrmlive.demo_opensource.pages.HomePage;
import com.orangehrmlive.demo_opensource.pages.LoginPage;
import com.orangehrmlive.demo_opensource.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgotPasswordPageTest extends BaseTest {

    HomePage homePage;
    ForgotPasswordPage forgotPasswordPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        forgotPasswordPage = new ForgotPasswordPage();
    }


    @Test(groups = {"sanity", "regression"})
    public void serShouldNavigateToForgotPasswordPageSuccessfully() {
        forgotPasswordPage.clickOnForgotPasswordLink();
        Assert.assertEquals(forgotPasswordPage.verifyResetPasswordText(), "Reset Password","Did not navigate to the Reset password page" );
    }

}
