package com.sample.project.steps;

import com.sample.project.core.BrowserFactory;
import com.sample.project.pages.GoogleSearchPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class GoogleSearchDefinitionSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(GoogleSearchDefinitionSteps.class.getSimpleName());

    private static WebDriver driver = BrowserFactory.getDriverInstance();
    private GoogleSearchPage searchPage = new GoogleSearchPage(driver);

    private static WebDriver getDriver() {
        return driver;
    }

    @Step
    public void verifySearchPageIsOpened() {
        getDriver().getCurrentUrl().contains("www.google.com");
        assertEquals("Google page title is not displayed!", searchPage.isPageTitleDisplayed(), true);
    }

    @Step
    public void userClicksSearchButton() {
        searchPage.clickSearchButton();
    }

    @Step
    public void userEntersText(final String text) {
        searchPage.enterSearchText(text);
    }

}
