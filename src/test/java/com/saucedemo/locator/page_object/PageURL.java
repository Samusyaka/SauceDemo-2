package com.saucedemo.locator.page_object;

public class PageURL extends BasePage {
    public String sendURL() {
        return driver.getCurrentUrl();
    }

}
