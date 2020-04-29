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
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());



    @FindBy(id = "Email")
    WebElement emailField;
    @FindBy(id = "Password")
    WebElement passwordField;
    @FindBy(xpath = "//input[@class='button-1 login-button']")
    WebElement loginBtn;
    @FindBy(xpath = "//div[@class='page-title']//h1")
    WebElement welcomeText;
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeText1;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    public void enterEmailId(String email) {
        Reporter.addStepLog("Entering emailId :" + email + " in the emailfield :" + emailField.toString() + "<br>");
        sendTextToElement(emailField, email);
        log.info("Entering emailId : " +email+ " in the emailfield : " +emailField.toString());
    }

    public void enterPassword(String password) {
        Reporter.addStepLog("Entering password :" +password+ " in the password field : " +passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);
        log.info("Entering password :" +password+ " in the password field : " +passwordField.toString());
    }

    public void clickOnLoginBt() {
        Reporter.addStepLog("Clicking on login Button : " +loginBtn.toString() + "<br>");
        clickOnElement(loginBtn);
        log.info("Clicking on login Button : " +loginBtn.toString());
    }

    public String getWelcomeText() {
        Reporter.addStepLog("Getting welcome text : " +welcomeText.toString() + "<br>");
        log.info("Getting welcome text : " +welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public String getWelcomeText1() {
        Reporter.addStepLog("Getting welcome text : " + welcomeText1.toString());
        log.info("Getting welcome text : " + welcomeText1.toString());
        return getTextFromElement(welcomeText1);
    }

    public String getErrorMessage(){
        Reporter.addStepLog("Getting error message : " +errorMessage.toString());
        log.info("Getting error message : " +errorMessage.toString());
        return getTextFromElement(errorMessage);

    }

    public void logInToNopCommerce(String username, String password){
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginBt();

    }


}
