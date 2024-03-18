package com.CRM.step_definitions;

import com.CRM.pages.DrivePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class US13_DrivePageModuleAccess_StepDefs {

    DrivePage drivePage = new DrivePage();

    @When("User should go to the Drive page")
    public void i_go_to_the_drive_page() {

    }
    @Then("User should see the Drive page")
    public void i_should_see_the_drive_page() {

    }

    @Then("User should see all the following modules")
    public void userShouldSeeAllTheFollowingModules(List<String> expectedTopModules) {

    }
}
