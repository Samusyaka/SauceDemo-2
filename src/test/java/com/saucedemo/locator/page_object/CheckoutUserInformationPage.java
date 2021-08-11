package com.saucedemo.locator.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutUserInformationPage extends BasePage{
    public void addUserInformation(String firstName, String lastName, String postalCode) {
        WebElement firstNameElement = driver.findElement(By.cssSelector("#first-name"));
        WebElement lastNameElement = driver.findElement(By.cssSelector("#last-name"));
        WebElement postalCodeElement = driver.findElement(By.cssSelector("#postal-code"));

        firstNameElement.sendKeys(firstName);
        lastNameElement.sendKeys(lastName);
        postalCodeElement.sendKeys(postalCode);

        WebElement continueButton = driver.findElement(By.cssSelector("#continue"));
        continueButton.click();
    }
}
