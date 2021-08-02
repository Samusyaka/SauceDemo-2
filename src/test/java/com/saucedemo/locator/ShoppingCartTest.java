package com.saucedemo.locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ShoppingCartTest {
    private WebDriver driver;

    public By loginLocator = By.id("user-name");

    public By passwordLocator = By.id("password");

    public By itemLocator = By.id("add-to-cart-sauce-labs-backpack");

    public By itemNameLocator = By.cssSelector("#item_4_title_link .inventory_item_name");

    public By itemPriceLocator = By.xpath("//*[@id='item_4_title_link']/../..//*" +
            "[@class='inventory_item_price' and contains(normalize-space(.), '$')]");

    public By shoppingCartLocator = By.className("shopping_cart_link");

    public By shoppingCartNameLocator = By.cssSelector("#item_4_title_link .inventory_item_name");

    public By shoppingCartPriceLocator = By.xpath("//*[@class='inventory_item_price' and contains" +
            "(normalize-space(.), '$')]");

    @BeforeTest
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void itemPriceTest() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.saucedemo.com");
        WebElement loginElement = driver.findElement(loginLocator);
        loginElement.sendKeys("standard_user");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("secret_sauce");
        passwordElement.submit();
        WebElement addItemToCartElement = driver.findElement(itemLocator);
        addItemToCartElement.click();
        WebElement priceElement = driver.findElement(itemPriceLocator);
        String price = priceElement.getText();
        WebElement shoppingCartElement = driver.findElement(shoppingCartLocator);
        shoppingCartElement.click();
        WebElement shoppingCartPriceElement = driver.findElement(shoppingCartPriceLocator);
        Assert.assertEquals(shoppingCartPriceElement.getText(), price);
        driver.quit();
    }

    @Test
    public void itemNameTest() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.saucedemo.com");
        WebElement loginElement = driver.findElement(loginLocator);
        loginElement.sendKeys("standard_user");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("secret_sauce");
        passwordElement.submit();
        WebElement addItemToCartElement = driver.findElement(itemLocator);
        addItemToCartElement.click();
        WebElement nameElement = driver.findElement(itemNameLocator);
        String itemName = nameElement.getText();
        WebElement shoppingCartElement = driver.findElement(shoppingCartLocator);
        shoppingCartElement.click();
        WebElement shoppingCartNameElement = driver.findElement(shoppingCartNameLocator);
        Assert.assertEquals(shoppingCartNameElement.getText(), itemName);
        driver.quit();
    }
}
