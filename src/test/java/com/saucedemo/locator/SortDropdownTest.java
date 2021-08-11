package com.saucedemo.locator;

import com.saucedemo.locator.page_object.HomePage;
import com.saucedemo.locator.page_object.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortDropdownTest {
    @Test
    public void sortDropdownByZtoATest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");

        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.sortByZtoA());

        BaseTest baseTest = new BaseTest();
        baseTest.driverQuit();
    }

    @Test
    public void sortDropdownByAtoZTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");

        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.sortByAtoZ());

        BaseTest baseTest = new BaseTest();
        baseTest.driverQuit();
    }

    @Test
    public void sortDropdownByPriceLoHi() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");

        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.sortByPriceLoHi());

        BaseTest baseTest = new BaseTest();
        baseTest.driverQuit();
    }

    @Test
    public void sortDropdownByPriceHiLo() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");

        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.sortByPriceHiLo());

        BaseTest baseTest = new BaseTest();
        baseTest.driverQuit();
    }
}
