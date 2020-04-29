package com.demo.nopcommerce.pages;


import com.cucumber.listener.Reporter;
import com.demo.nopcommerce.utility.Utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Ankita
 */
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @FindBy(linkText = "Register")
    WebElement registerLink;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    WebElement computersLink;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")
    WebElement electronicsLink;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]")
    WebElement booksLink;

    public void clickOnLoginLink() {
        Reporter.addStepLog("Clicking on login link :" + loginLink.toString() + "<br>");
        log.info("Clicking on login link :" +loginLink.toString());
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        Reporter.addStepLog("Clicking on register link :" +registerLink.toString() + "<br>");
        clickOnElement(registerLink);
        log.info("Clicking on register link :" +registerLink.toString());
    }

    public void clickOnComputersLink() {
        Reporter.addStepLog("Clicking on computers link :" +computersLink.toString() + "<br>");
        clickOnElement(computersLink);
        log.info("Clicking on computers link :" +computersLink.toString());
    }
    public void clickOnBooksLink(){
        Reporter.addStepLog("Clicking on books link : " +booksLink.toString());
        clickOnElement(booksLink);
        log.info("Clicking on books link : " +booksLink.toString());
    }


    public void waitUntilVisibility() {
        waitUntilPresenceOfElementLocated((By)computersLink, 20);

    }

    public void clickOnElectronicsLink() {
        clickOnElement(electronicsLink);
    }


}





