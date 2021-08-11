package com.saucedemo.locator;

import com.saucedemo.locator.page_object.HomePage;
import com.saucedemo.locator.page_object.LoginPage;
import com.saucedemo.locator.page_object.PageURL;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest {
    @Test
    public void logoutTestPositive() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");

        HomePage homePage = new HomePage();
        homePage.logout();

        PageURL pageURL = new PageURL();
        String currentURL = pageURL.sendURL();

        Assert.assertEquals(currentURL, "https://www.saucedemo.com/");

        BaseTest baseTest = new BaseTest();
        baseTest.driverQuit();
    }
}
