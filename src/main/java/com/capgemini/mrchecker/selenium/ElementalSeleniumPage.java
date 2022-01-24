package com.capgemini.mrchecker.selenium;

import com.capgemini.mrchecker.selenium.core.BasePage;
import com.capgemini.mrchecker.selenium.environment.EnvironmentParam;
import com.capgemini.mrchecker.test.core.logger.BFLogger;

public class ElementalSeleniumPage extends BasePage {
    @Override
    public String pageTitle() {
        return getActualPageTitle();
    }

    @Override
    public boolean isLoaded() {
        getDriver().waitForPageLoaded();
        return getDriver().getCurrentUrl()
                .contains(EnvironmentParam.ELEMENTAL_SELENIUM_PAGE.getValue());
    }
    @Override
    public void load() {
        BFLogger.logDebug("Loading 'Elemental Selenium' page.");
        getDriver().get(EnvironmentParam.ELEMENTAL_SELENIUM_PAGE.getValue());
        getDriver().waitForPageLoaded();
    }
}