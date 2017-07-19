package com.sample.project;

import com.sample.project.core.BrowserFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseUiTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseUiTest.class.getSimpleName());

    @BeforeClass
    public static void initBrowser() {
        LOGGER.info("Setting a browser up...");
        WebDriver driver = BrowserFactory.getDriverInstance();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        LOGGER.info("Browser is up. Tests are starting...");
    }

    @AfterClass
    public static void closeAllBrowsers() {
        LOGGER.info("Closing all drivers...");
        BrowserFactory.closeAllDrivers();
    }

}
