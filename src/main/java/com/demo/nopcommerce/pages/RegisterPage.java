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
public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());




    @FindBy(id = "gender-female")
    WebElement radioBt;
    @FindBy(id = "FirstName")
    WebElement firstNameField;
    @FindBy(id = "LastName")
    WebElement lastNameField;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOfBirthDayDropDown;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthOfBirthDropDown;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearOfBirthDropDown;
    @FindBy(id = "Email")
    WebElement emailField;
    @FindBy(id = "Company")
    WebElement companyName;
    @FindBy(id = "Password")
    WebElement passwordField;
    @FindBy(id = "ConfirmPassword")
    WebElement conformPasswordField;
    @FindBy(xpath = "//input[@id='register-button']")
    WebElement registerBt;
    @FindBy(xpath = "//strong[contains(text(),'Your Personal Details')]")
    WebElement registerMessage;



    public void clickOnRadioBt(){
        Reporter.addStepLog("Clicking on Radio Button :" + radioBt.toString() + "<br>");
        clickOnElement(radioBt);
        log.info("Clicking on Radio Button :" +radioBt.toString());
    }
    public void enterFirstName(String firstName){
        waitUntilPresenceOfElementLocated(firstNameField,30);
        Reporter.addStepLog("Entering First Name : " +firstName+ " in first name field" +firstNameField.toString() + "<br>" );
        sendTextToElement(firstNameField, firstName);
        log.info("Entering First Name : " +firstName+ " in first name field" +firstNameField.toString());
    }
    public void enterLastName(String lastName){
        Reporter.addStepLog("Entering last Name : " +lastName+ " in the last name field" +lastNameField.toString() + "<br>");
        sendTextToElement(lastNameField, lastName);
        log.info("Entering last Name : " +lastName+ " in the last name field" +lastNameField.toString());
    }
    public void selectDayOfBirth( String day){
        Reporter.addStepLog("Selecting Date Of Birth : " +day+ " in the day of birth field" +dateOfBirthDayDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(dateOfBirthDayDropDown, day);
        log.info("Selecting Date Of Birth : " +day+ " in the day of birth field" +dateOfBirthDayDropDown.toString());
    }
    public void selectMonthOfBirth(String month){
        Reporter.addStepLog("Selecting Month Of Birth : " +month+ " in the month of birth field" +monthOfBirthDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(monthOfBirthDropDown, month);
        log.info("Selecting Month Of Birth : " +month+ " in the month of birth field" +monthOfBirthDropDown.toString());
    }
    public void selectYearOfBirth(String year){
        Reporter.addStepLog("Selecting year of birth : " +year+ " in the year of birth field" +yearOfBirthDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(yearOfBirthDropDown, year);
        log.info("Selecting year of birth : " +year+ " in the year of birth field" +yearOfBirthDropDown.toString());
    }
    public void enterEmailId(String emailId){
        Reporter.addStepLog("Entering emailId : " +emailId+ " in the email field" + emailField.toString() + "<br>");
        enterRandomEmail(emailField);
        log.info("Entering emailId : " +emailId+ " in the email field" + emailField.toString());
    }


    public void enterCompanyName(String compName){
        Reporter.addStepLog("Entering company name : " +compName+ " in the company name field" + companyName.toString() + "<br>");
        sendTextToElement(companyName, compName);
        log.info("Entering company name : " +compName+ " in the company name field" + companyName.toString());
    }
    public void enterPassword(String password){
        Reporter.addStepLog("Entering password : " +password+ " in the password field" + passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);
        log.info("Entering password : " +password+ " in the password field" + passwordField.toString());
    }
    public void enterConfirmPassword(String confmPassword){
        Reporter.addStepLog("Entering conform password : " +confmPassword+ " in the conformpassword field :" +conformPasswordField.toString() + "<br>");
        sendTextToElement(conformPasswordField, confmPassword);
        log.info("Entering conform password : " +confmPassword+ " in the conformpassword field : " +conformPasswordField.toString());
    }
    public void clickOnRegisterBt(){
        Reporter.addStepLog("Clicking on Register Btn : " +registerBt.toString() + "<br>");
        clickOnElement(registerBt);
        log.info("Clicking on Register Btn : " +registerBt.toString());
    }

    public String getRegisterText() {
        Reporter.addStepLog("Getting register text : " +registerMessage.toString());
        log.info("Getting welcome text : " +registerMessage.toString());
        return getTextFromElement(registerMessage);
    }

    public void registerInToNopCommerce(String firstname, String lastname, String date, String month, String year, String email, String companyname, String password, String conformpassword){
        enterFirstName(firstname);
        enterLastName(lastname);
        selectDayOfBirth(date);
        selectMonthOfBirth(month);
        selectYearOfBirth(year);
        enterEmailId(email);
        enterCompanyName(companyname);
        enterPassword(password);
        enterConfirmPassword(conformpassword);
    }

}

