package com.saucedemo.locator.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage extends BasePage{
    public void finishCheckout() {
        WebElement finishButton = driver.findElement(By.cssSelector("#finish"));
        finishButton.click();
    }
}
