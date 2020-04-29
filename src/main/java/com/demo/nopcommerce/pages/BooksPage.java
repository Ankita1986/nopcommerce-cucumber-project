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
public class BooksPage  extends Utility {
    private static final Logger log = LogManager.getLogger(BooksPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Books')]")
    WebElement bookText;
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortByBt;
    @FindBy(xpath = "//option[contains(text(),'Name: A to Z')]")
    WebElement sortByAToZ;
    @FindBy(xpath = "//option[contains(text(),'Name: Z to A')]")
    WebElement sortByZToA;
    @FindBy(xpath ="//option[contains(text(),'Price: Low to High')] ")
    WebElement sortLowToHigh;


    public String getBookPageText(){
        Reporter.addStepLog("Checking books conformation message : " +bookText.toString());
        log.info("Checking books conformation message : " +bookText.toString());
        return getTextFromElement(bookText);

    }
    public void clickOnSortBy(){
        Reporter.addStepLog("Clicking On SortbyBt : " +sortByBt.toString());
        clickOnElement(sortByBt);
        log.info("Clicking On SortbyBt : " +sortByBt.toString());

    }

    public void clickOnSortByAToZ() {
        Reporter.addStepLog("clicking on A to Z sort by : " + sortByAToZ.toString() + "<br>");
        log.info("clicking on A to Z sort by : " + sortByAToZ.toString());
        clickOnElement(sortByAToZ);
    }
    public void checkSortingOrder(){
        Reporter.addStepLog("Checking order of product : ");
        log.info("Checking order of product : ");
        sortingAToZ(By.tagName("h2"));
    }
    public void clickOnSortByZToA(){
        Reporter.addStepLog("clicking on Z to A sort by : " + sortByZToA.toString() + "<br>");
        log.info("clicking on A to Z sort by : " + sortByZToA.toString());
        clickOnElement(sortByZToA);
    }
    public void clickOnLowToHigh(){
        Reporter.addStepLog("clicking on price low to high : " + sortLowToHigh.toString() + "<br>");
        log.info("clicking on price low to high : " + sortLowToHigh.toString());
        clickOnElement(sortLowToHigh);

    }




}
