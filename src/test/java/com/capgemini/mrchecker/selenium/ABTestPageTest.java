package com.capgemini.mrchecker.selenium;

import com.capgemini.mrchecker.test.core.BaseTest;
import com.capgemini.mrchecker.test.core.logger.BFLogger;
import com.capgemini.mrchecker.test.core.utils.PageFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

//@Category({ TestsSelenium.class, TestsChrome.class, TestsFirefox.class, TestsIE.class})
public class ABTestPageTest extends BaseTest {
    private static final ABTestPage abTestPage = PageFactory.getPageInstance(ABTestPage.class);
//    private static ElementalSeleniumPage elementalSeleniumPage = PageFactory.getPageInstance(ElementalSeleniumPage.class);

    @Test
    public void shouldOpenElementalSeleniumPageWhenClickElementalSeleniumLink() {
        BFLogger.logDebug("Click Elemental Selenium link");
        ElementalSeleniumPage elementalSeleniumPage = abTestPage.clickElementalSeleniumLink();
        BFLogger.logDebug("Switch browser's tab to newly opened one");
        abTestPage.switchToNextTab();
        BFLogger.logDebug("Verify if Elemental Selenium Page is opened");
        assertTrue(elementalSeleniumPage.isLoaded(), "Unable to open Elemental Selenium page");
    }
}