package com.luxoft.steps;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class Stepdefs {

    private int distance;
    private String sentence="";
    private boolean hunger;


    @Given("^Lucy is in {\\d+} m from Sean$")
    public void lucy_is_in_m_from_sean(Integer int1) {
        distance=int1;
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

    @When("Sean shouts {string}")
    public void seanShoutsFreeBagels(String string1) {
        sentence=string1;
    }

    @Then("Lucy hear sean message")
    public void lucyHearSeanMessage() {
        Assertions.assertTrue(distance<15);
    }

    @But("Lucy is not hungry")
    public void lucyIsNotHungry() {
        hunger=false;
    }

    @Then("Lucy not hear sean message")
    public void lucyNotHearSeanMessage() {
        if (!hunger){

        }

    }
}
