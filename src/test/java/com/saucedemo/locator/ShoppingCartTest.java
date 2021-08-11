package com.saucedemo.locator;

import com.saucedemo.locator.page_object.CartPage;
import com.saucedemo.locator.page_object.HomePage;
import com.saucedemo.locator.page_object.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class ShoppingCartTest {
    @Test
    public void itemNameAndPriceTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");

        HomePage homePage = new HomePage();
        homePage.addProductToCart("Sauce Labs Fleece Jacket");
        homePage.navigateToCart();

        CartPage cartPage = new CartPage();
        Map<String, String> productCartData = cartPage.getProductData();

        Assert.assertFalse(productCartData.isEmpty(), "No products in cart");
        Assert.assertTrue(productCartData.containsKey("Sauce Labs Fleece Jacket"),
                "No product with name Sauce Labs Fleece Jacket"
        );
        Assert.assertEquals(productCartData.get("Sauce Labs Fleece Jacket"),
                "$49.99",
                "Expected and actual results doesn't match"
        );

        BaseTest baseTest = new BaseTest();
        baseTest.driverQuit();
    }
}
