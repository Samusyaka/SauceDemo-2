package com.saucedemo.locator.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public void addProductToCart(String productName) {
        WebElement addToCartButton = driver.findElement(By.xpath("//*[text()='" + productName + "']/../../..//" +
                "*[text()='Add to cart']"));
        addToCartButton.click();
    }

    public void navigateToCart() {
        WebElement shoppingCartLink = driver.findElement(By.cssSelector(".shopping_cart_badge"));
        shoppingCartLink.click();
    }

    public void logout() {
        WebElement menuButton = driver.findElement(By.cssSelector("#react-burger-menu-btn"));
        menuButton.click();
        WebElement logoutElement = driver.findElement(By.cssSelector("#logout_sidebar_link"));
        logoutElement.click();
    }

    public boolean sortByAtoZ() {
        WebElement sortByAtoZElement = driver.findElement(By.xpath("//*[@value='az']"));
        sortByAtoZElement.click();
        sortByAtoZElement = driver.findElement(By.xpath("//*[@value='az']"));
        return sortByAtoZElement.isSelected();
    }

    public boolean sortByZtoA() {
        WebElement sortByZtoAElement = driver.findElement(By.xpath("//*[@value='za']"));
        sortByZtoAElement.click();
        sortByZtoAElement = driver.findElement(By.xpath("//*[@value='za']"));
        return sortByZtoAElement.isSelected();
    }

    public boolean sortByPriceLoHi() {
        WebElement sortByPriceLoHiElement = driver.findElement(By.xpath("//*[@value='lohi']"));
        sortByPriceLoHiElement.click();
        sortByPriceLoHiElement = driver.findElement(By.xpath("//*[@value='lohi']"));
        return sortByPriceLoHiElement.isSelected();
    }

    public boolean sortByPriceHiLo() {
        WebElement sortByPriceHiLoElement = driver.findElement(By.xpath("//*[@value='hilo']"));
        sortByPriceHiLoElement.click();
        sortByPriceHiLoElement = driver.findElement(By.xpath("//*[@value='hilo']"));
        return sortByPriceHiLoElement.isSelected();
    }
}
