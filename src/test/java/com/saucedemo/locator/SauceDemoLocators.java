package com.saucedemo.locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceDemoLocators {
    WebDriver driver;

    public By rootLocator = By.id("root");

    public By viewportLocator = By.name("viewport");

    public By primaryHeaderLocator = By.className("primary_header");

    public By linkLocator = By.tagName("a");

    public By resetAppStateLocator = By.linkText("Reset App State");

    public By smartResetAppStateLocator = By.partialLinkText("Reset App");

    public By inventoryItemLocator = By.xpath("//div[@class='inventory_item']");

    public By backpackLocator = By.xpath("//div[text()='Sauce Labs Backpack']");

    public By largeInventoryItemLocator = By.xpath("//div[contains (@class, inventory_item)]");

    public By largeBackpackLocator = By.xpath("//div[contains (text(),'Sauce Labs Backpack')]");

    public By ancestorsOfBackPackLocator = By.xpath("//*[text()='Sauce Labs Backpack']//ancestor::div");

    public By descendantsOfRootLocator = By.xpath("//div[@id='root']//descendant::*");

    public By followingsOfRootLocator = By.xpath("//div[@id='root']//following::*");

    public By parentOfRootLocator = By.xpath("//div[@id='root']//parent::*");

    public By precedingOfRootLocator = By.xpath("//div[@id='root']//preceding::*");

    public By shoppingCartLocator = By.xpath("//div[@id='shopping_cart_container' and " +
            "@class='shopping_cart_container']");

    public By headerLabelLocator = By.cssSelector(".header_label");

    public By buttonAddToCartLocator = By.cssSelector(".btn.btn_primary");

    public By itemImageLocator = By.cssSelector(".inventory_item .inventory_item_img");

    public By newRootLocator = By.cssSelector("#root");

    public By buttonLocator = By.cssSelector("button");

    public By headerLocator = By.cssSelector("div.primary_header");

    public By newViewportLocator = By.cssSelector("[name=viewport]");

    public By addToCartLocator = By.cssSelector("[class~=btn]");

    public By newInventoryItemLocator = By.cssSelector("[class|=inventory_item]");

    public By inventoryLocator = By.cssSelector("[class^=inventory]");

    public By priceLocator = By.cssSelector("[class$=price]");

    public By imageLocator = By.cssSelector("[class*=img]");
}
