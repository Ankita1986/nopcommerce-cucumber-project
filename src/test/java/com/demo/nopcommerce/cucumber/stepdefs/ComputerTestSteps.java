package com.demo.nopcommerce.cucumber.stepdefs;

import com.demo.nopcommerce.pages.ComConfPage;
import com.demo.nopcommerce.pages.ComputerPage;
import com.demo.nopcommerce.pages.DeskTopPage;
import com.demo.nopcommerce.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Ankita
 */
public class ComputerTestSteps {
    @When("^I click on computers link$")
    public void iClickOnComputersLink() {
        new HomePage().clickOnComputersLink();
    }

    @Then("^I Should navigate to computers page successfully$")
    public void iShouldNavigateToComputersPageSuccessfully() {
        Assert.assertEquals(new ComConfPage().compuConfMsg(), "Computers");
    }

    @And("^I click on desktop link$")
    public void iClickOnDesktopLink() {
        new ComputerPage().clickOnDesktopLink();
    }

    @And("^I click on build your on computer text$")
    public void iClickOnBuildYourOnComputerText() {
        new DeskTopPage().clickOnBuildYourComputer();
    }
    @And("^I click on (\\d+)GB HDD radio button$")
    public void iClickOnGBHDDRadioButton(int arg0) {
        new DeskTopPage().clickOnHDDRadioBt();
    }



    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new DeskTopPage().clickOnAddToCartBt();
    }

    @Then("^I can see product has been added successfully message$")
    public void iCanSeeProductHasBeenAddedSuccessfullyMessage() {
        Assert.assertEquals(new DeskTopPage().getAddToCartMessage(), "The product has been added to your shopping cart");
    }


}
