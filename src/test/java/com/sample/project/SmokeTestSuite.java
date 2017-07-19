package com.sample.project;

import com.sample.project.steps.GoogleSearchDefinitionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class SmokeTestSuite extends BaseUiTest {

    @Steps
    private GoogleSearchDefinitionSteps steps;

    @Test
    public void user_should_be_able_to_search() {
        steps.verifySearchPageIsOpened();
        steps.userEntersText("Test");
        steps.verifySearchPageIsOpened();
    }

}