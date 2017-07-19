package com.sample.project.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    private final static String CHROME = "chrome";

    private static WebDriver driverInstance = null;

    private BrowserFactory() {
    }

    /*
    Singleton driver instance to pass through steps
     */
    public static WebDriver getDriverInstance() {
        if (driverInstance == null) {
            setBrowserPath(CHROME);
            driverInstance = new ChromeDriver();
        }
        return driverInstance;
    }

    /*
    Method sets path to chrome driver. Can be extended
     */
    private static void setBrowserPath(String browserName) {
        switch (browserName) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        }
    }

    /*
    Close driver instance
     */
    public static void closeAllDrivers() {
        driverInstance.close();
        driverInstance.quit();
    }

}
