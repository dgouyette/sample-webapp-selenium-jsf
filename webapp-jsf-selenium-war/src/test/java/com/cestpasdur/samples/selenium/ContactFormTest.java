package com.cestpasdur.samples.selenium;

import com.thoughtworks.selenium.SeleneseTestCase;
import com.thoughtworks.selenium.Selenium;


public class ContactFormTest extends SeleneseTestCase {


    private Selenium selenium;


    @Override
    public void setUp() throws Exception {
        setUp("http://localhost:8080/", "*firefox");
        selenium.open("/tomsquest/test.jsp");
    }


    public void testLogin() {
        selenium.type("login", "tom");
        selenium.click("submit");
        selenium.waitForPageToLoad("5000");
        assertTrue(selenium.isElementPresent("welcome"));
    }


}
