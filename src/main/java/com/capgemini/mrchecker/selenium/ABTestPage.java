package com.capgemini.mrchecker.selenium;

import com.capgemini.mrchecker.selenium.core.BasePage;
import com.capgemini.mrchecker.selenium.environment.TheInternetPageSubURLsEnum;
import com.capgemini.mrchecker.selenium.environment.EnvironmentParam;
import com.capgemini.mrchecker.test.core.logger.BFLogger;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class ABTestPage extends BasePage {
    private static final By elementalSeleniumLinkSelector = By.linkText("Elemental Selenium");
    private static final By elementalSeleniumLinkSelector1 = By.cssSelector("a[href='http://elementalselenium.com/']");

    @Override
    public String pageTitle() {
        return getActualPageTitle();
    }

    @Override
    public boolean isLoaded() {
        getDriver().waitForPageLoaded();
        return getDriver().getCurrentUrl()
                .contains(TheInternetPageSubURLsEnum.ABTEST.getValue());
    }

    @Override
    public void load() {
        BFLogger.logDebug("Loading 'A/B Test Control' page.");
        getDriver().get(EnvironmentParam.THE_INTERNET_MAIN_PAGE.getValue() +
                TheInternetPageSubURLsEnum.ABTEST.getValue());
        getDriver().waitForPageLoaded();
    }

    public ElementalSeleniumPage clickElementalSeleniumLink() {
        getDriver().findElement(elementalSeleniumLinkSelector).click();
        getDriver().waitForPageLoaded();
        return new ElementalSeleniumPage();
    }

    /**
     * Switches window to the next one - different than the current.
     * (the site opens in a new tab, but we'll see if that's what they had in mind)
     */
    public void switchToNextTab() {
        List<String> tabsList = new
                ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo()
                .window(tabsList.get(1));
    }
}
