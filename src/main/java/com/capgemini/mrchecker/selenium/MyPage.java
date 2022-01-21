package com.capgemini.mrchecker.selenium;


import com.capgemini.mrchecker.selenium.core.BasePage;
import com.capgemini.mrchecker.test.core.logger.BFLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyPage extends BasePage {

    @Override
    public String pageTitle() {
        return "Example page's title is Sheldon Brown";
    }

    @Override
    public boolean isLoaded() {
        return false;
    }

    @Override
    public void load() {
        BFLogger.logDebug("****** I'm loading an Example Page...");

//        pure selenium
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.sheldonbrown.com/");

//        lub korzystając z mrcheckerowych funkcji:
        getDriver().get("https://www.sheldonbrown.com/");
    }
}
