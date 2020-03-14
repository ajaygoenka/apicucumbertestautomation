package com.automation.test.api.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultipleStepDefinition {

    int x ;
    int global;

    @Given("^I want to add this (\\d+) in all$")
    public void addvariable(int value) {
        global = value;
    }


    @Given("^I have variable (\\d+)$")
    public void iHaveVariable(int value) {
        System.out.println("This is my Value"+value);
    }

    @When("^I multiplication (\\d+) and (\\d+)$")
    public void iMultiplicationAnd(int a, int b) {
        x = a * b ;
        x = global +x;
    }

    @Then("^I display the \"([^\"]*)\" as app$")
    public void iDisplayTheResult(String status) {
        System.out.println(status+ " : "+x);
    }

    @Then("^I display the \"([^\"]*)\" its on my app as app$")
    public void isplayTheResult(String status) {
        System.out.println(status+ " : "+x);
    }


    @Then("^I display the \"([^\"]*)\" is applicable$")
    public void iDisplayTheRest(String status) {
        System.out.println(status+ " : "+x);
    }

    @Then("^I display the \"([^\"]*)\" isnot applicalv$")
    public void iDisplaheRest(String status) {
        System.out.println(status+ " : "+x);
    }




    @Then("^I want to display the value as (calc|report)$")
    public void iWantToDisplayTheValueAsReport(String status) {
    }

    @Then("^I display the (.*)$")
    public void iDisplayTheCalc(String status) {
        System.out.println(status+ " : "+x);
    }

    @And("^I want to add the (\\d+) in all scenarios$")
    public void iWantToAddTheInAllScenarios(int value) {
        global = value;
    }
}
