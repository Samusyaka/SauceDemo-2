package com.saucedemo.locator;

import com.saucedemo.locator.page_object.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest {
    @Test
    public void orderTestPositive() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");

        HomePage homePage = new HomePage();
        homePage.addProductToCart("Sauce Labs Bike Light");
        homePage.navigateToCart();

        CartPage cartPage = new CartPage();
        cartPage.checkout();

        CheckoutUserInformationPage checkoutUserInformationPage = new CheckoutUserInformationPage();
        checkoutUserInformationPage.addUserInformation("Max", "Nik", "123456");

        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();
        checkoutOverviewPage.finishCheckout();

        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();
        Assert.assertEquals(checkoutCompletePage.getConfirmationMessage(), "THANK YOU FOR YOUR ORDER");

        BaseTest baseTest = new BaseTest();
        baseTest.driverQuit();
    }
}
