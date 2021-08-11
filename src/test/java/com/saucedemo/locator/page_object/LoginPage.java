package com.saucedemo.locator.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    public void login(String userName, String password) {
        WebElement inputUsername = driver.findElement(By.cssSelector("input[placeholder='Username']"));
        inputUsername.clear();
        inputUsername.sendKeys(userName);
        WebElement inputPassword = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        inputUsername.clear();
        inputPassword.sendKeys(password);
        WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));
        loginButton.click();
    }
}
