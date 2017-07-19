package com.sample.project.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPage extends PageObject {

    protected AbstractPage(WebDriver driver) {
        super(driver);
    }
}
