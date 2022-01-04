package com.luxoft.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class Stepdefs {
    private  int distance;
    private String sentence="";
    boolean hunger=true;

    @Given("^.ucy is in (\\d+) m from Sean$")
    public void lucy_is_in_m_from_sean(Integer int1) {
        distance=int1;

    }

    @When("^Sean shouts \"([^\"]*)\"$")
    public void seanShoutsFreeBagels(String message) {
        sentence=message;
        System.out.println(message);
    }

    @Then("^Lucy (hear|not hear) Sean message$")
    public void lucyHearSeanMessage(String arg0 ) {
        if (arg0.equalsIgnoreCase("hear")){
            Assertions.assertTrue(distance<15);
        }else {
            if(!hunger){
                System.out.println("Lucy is not hungry");
            }else{
                Assertions.assertFalse(distance<15);
            }
        }


    }

    @And("Lucy is not hungry")
    public void lucyIsNotHungry() {
        hunger = false;
    }

/*    @Then("Lucy not hear Sean message")
    public void lucyNotHearSeanMessage() {
        if (!hunger){
            System.out.println("Lucy is not hungry");
        }else {
            Assertions.assertFalse(distance<15);
        }

    }*/
}
