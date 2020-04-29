package com.demo.nopcommerce.cucumber.stepdefs;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.RegConfPage;
import com.demo.nopcommerce.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static com.demo.nopcommerce.utility.Utility.getRandomString;

/**
 * Created by Ankita
 */
public class RegistrationTestSteps {

    String email = "abc"+ getRandomString(5)+"@yahoomail.com";
    String password = "Harry"+getRandomString(3);


    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I should navigate to register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        Assert.assertEquals(new RegisterPage().getRegisterText(), "Your Personal Details");

    }

    @And("^I select gender$")
    public void iSelectGender() {
        new RegisterPage().clickOnRadioBt();
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName)  {
        new RegisterPage().enterFirstName(firstName);

    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName)  {
        new RegisterPage().enterLastName(lastName);

    }

    @And("^I enter date of birth \"([^\"]*)\"$")
    public void iEnterDateOfBirth(String date)  {
        new RegisterPage().selectDayOfBirth(date);

    }

    @And("^I enter month of birth \"([^\"]*)\"$")
    public void iEnterMonthOfBirth(String month)  {
        new RegisterPage().selectMonthOfBirth(month);

    }

    @And("^I enter year of birth \"([^\"]*)\"$")
    public void iEnterYearOfBirth(String year)  {
        new RegisterPage().selectYearOfBirth(year);

    }

    @And("^I enter emailId into email field$")
    public void iEnterEmailIdIntoEmailField() {
        new RegisterPage().enterEmailId(email);
    }

    @And("^I enter company name \"([^\"]*)\"$")
    public void iEnterCompanyName(String companyName)  {
        new RegisterPage().enterCompanyName(companyName);

    }



    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterBt();
    }

    @Then("^I should register successfully$")
    public void iShouldRegisterSuccessfully() {
        Assert.assertEquals(new RegConfPage().registerTextCnf(), "Your registration completed");

    }


    @And("^I enter password into password field$")
    public void iEnterPasswordIntoPasswordField() {
        new RegisterPage().enterPassword(password);
    }

    @And("^I enter conform password into conform password field$")
    public void iEnterConformPasswordIntoConformPasswordField() {
        new RegisterPage().enterConfirmPassword(password);
    }
}
