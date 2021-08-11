package com.saucedemo.locator.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class CartPage extends BasePage{

    /**
     * @return Map where key is product name,
     * and value is price
     */
    public Map<String, String> getProductData() {
        Map<String, String> productData = new HashMap<String, String>();
        WebElement productName = driver.findElement(By.cssSelector(".inventory_item_name"));
        WebElement productPrice = driver.findElement(By.cssSelector(".inventory_item_price"));
        String productNameText = productName.getText();
        String productPriceText = productPrice.getText();
        productData.put(productNameText, productPriceText);
        return productData;
    }

    public void checkout() {
        WebElement checkoutElement = driver.findElement(By.cssSelector("#checkout"));
        checkoutElement.click();
    }
}
