package com.saucedemo.locator.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutCompletePage extends BasePage{
    public String getConfirmationMessage() {
        WebElement messageElement = driver.findElement(By.cssSelector(".complete-header"));
        return messageElement.getText();
    }
}
