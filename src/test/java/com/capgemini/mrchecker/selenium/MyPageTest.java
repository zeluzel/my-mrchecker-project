package com.capgemini.mrchecker.selenium;

import com.capgemini.mrchecker.test.core.BaseTest;
import com.capgemini.mrchecker.test.core.logger.BFLogger;
import com.capgemini.mrchecker.test.core.utils.PageFactory;
import org.junit.Test;
//import org.junit.jupiter.api.Test;

//import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MyPageTest extends BaseTest {
    //    pure Selenium
//    private final MyPage myPage = new MyPage();
    private static final MyPage myPage = PageFactory.getPageInstance(MyPage.class);


    //    junit 5 - może on sprawia problemy?
//
    @BeforeAll
    static void setUpBeforeAll() {
        BFLogger.logDebug("****** Setting up example test");
        BFLogger.logDebug("****** Loading example page");
        myPage.load();
    }

    @AfterAll
    static void tearDownAfterAll() {
        BFLogger.logDebug("****** Cleaning up after all tests");
    }

    @Override
    @BeforeEach
    public void setUp() {
        if (!myPage.isLoaded()) {
            BFLogger.logDebug("****** Page not loaded, trying to load again");
            myPage.load();
        }
    }

    @Override
    @AfterEach
    public void tearDown() {
        BFLogger.logDebug("****** Cleaning up after single test");
    }

    @Test
    public void shouldRunWithoutError() {
        assertTrue(true);
    }
}