package com.sample.project.pages;

import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@DefaultUrl("https://www.google.com")
@At("./*www.google.com*")
public class GoogleSearchPage extends AbstractPage {

    @FindBy(xpath = ".//input[@name='btnK']")
    private WebElement searchButton;
    @FindBy(xpath = ".//input[@id='lst-ib']")
    private WebElement searchField;
    @FindBy(xpath = ".//div[@id='hplogo']")
    private WebElement pageTitle;

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageTitleDisplayed() {
        return element(pageTitle).isDisplayed();
    }

    public void clickSearchButton() {
        waitFor(ExpectedConditions.elementToBeClickable(searchButton));
        clickOn(searchButton);
    }

    public void enterSearchText(String text) {
        element(searchField).typeAndEnter(text);
    }

}
