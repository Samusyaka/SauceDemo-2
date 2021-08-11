package com.saucedemo.locator;

import com.saucedemo.locator.page_object.LoginPage;
import com.saucedemo.locator.page_object.PageURL;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void loginTestPositive() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("performance_glitch_user", "secret_sauce");

        PageURL pageURL = new PageURL();
        String currentURL = pageURL.sendURL();

        Assert.assertEquals(currentURL, "https://www.saucedemo.com/inventory.html");

        BaseTest baseTest = new BaseTest();
        baseTest.driverQuit();
    }
}
