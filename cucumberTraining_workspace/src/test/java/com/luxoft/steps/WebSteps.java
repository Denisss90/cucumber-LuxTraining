package com.luxoft.steps;

import com.luxoft.Auxillary;
import com.luxoft.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class WebSteps {
    HomePage homePage=new HomePage(Auxillary.webDriver);

    @Given("Google home page is opened")
    public void googleHomePageIsOpened() {
        Auxillary.webDriver.navigate().to("https://google.com");
    }

    @When("I search for {string}")
    public void iSearchFor(String arg0) {
        homePage.searchFor(arg0);
    }

    @Then("^element {string} is displayed$")
    public void elementIsDisplayed(String arg0) {
    }
}
