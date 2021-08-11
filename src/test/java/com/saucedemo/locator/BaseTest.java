package com.saucedemo.locator;

import com.saucedemo.locator.page_object.*;
import org.testng.annotations.AfterTest;

public class BaseTest {
    @AfterTest
    public void driverQuit() {
        DriverProvider.quit();
    }
}
