package com.automation.test.api.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class MyStepDefinition {

    @Given("^I create a new (internal google|external google) profile service request to the (.*) endpoint$")
    public void create_new_api_request(String satusA,String satusB) throws Throwable {
        System.out.println(satusA+"-----------"+satusB);
     }


}
