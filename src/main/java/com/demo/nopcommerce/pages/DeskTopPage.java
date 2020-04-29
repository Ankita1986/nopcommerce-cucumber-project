package com.demo.nopcommerce.pages;


import com.cucumber.listener.Reporter;
import com.demo.nopcommerce.utility.Utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Ankita
 */
public class DeskTopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DeskTopPage.class.getName());



    @FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Desktops')]")
    WebElement desktopText;
    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Build your own computer')]")
    WebElement buildOnYourComputerText;
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hddRadioBt;
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartBt;
    @FindBy(xpath = "//p[@class='content']")
    WebElement addToCartMsg;


    public String deskTopConfText(){
        Reporter.addStepLog("Checking Conformation text : " + desktopText.toString() + "<br>");
        log.info("Checking Conformation text : " +desktopText.toString());
        return getTextFromElement(desktopText);
    }
    public void clickOnBuildYourComputer(){
        Reporter.addStepLog("Clicking on Text : " + buildOnYourComputerText.toString());
        clickOnElement(buildOnYourComputerText);
        log.info("Clicking on Text : " + buildOnYourComputerText.toString());
    }
    public void clickOnHDDRadioBt(){
        Reporter.addStepLog("Clicking On HDD RadioBt : " + hddRadioBt.toString());
        clickOnElement(hddRadioBt);
        log.info("Clicking On HDD RadioBt : " + hddRadioBt.toString());
    }
    public void clickOnAddToCartBt(){
        Reporter.addStepLog("Clicking On Add To Cart Button : " +addToCartBt.toString());
        clickOnElement(addToCartBt);
        log.info("Clicking On Add To Cart Button : " +addToCartBt.toString());
    }
    public String getAddToCartMessage(){
        Reporter.addStepLog("Getting Add to cart message : " + addToCartMsg.toString());
        log.info("Getting Add to cart message : " + addToCartMsg.toString());
        return getTextFromElement(addToCartMsg);
    }


}

