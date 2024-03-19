package com.CRM.step_definitions;


import com.CRM.pages.LoginPage;
import com.CRM.utilities.BrowserUtils;
import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.lang.module.Configuration;

public class US1_LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters the hr user information")
    public void user_enters_the_hr_user_information() {

        loginPage.login(ConfigurationReader.getProperty("hr_username"), ConfigurationReader.getProperty("hr_password"));
    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {

        BrowserUtils.verifyTitleContains("Portal");


    }


    @When("user enters the marketing user information")
    public void user_enters_the_marketing_user_information() {
        loginPage.login(ConfigurationReader.getProperty("marketing_username"), ConfigurationReader.getProperty("marketing_password"));
    }


    @When("user enters the helpdesk user information")
    public void user_enters_the_helpdesk_user_information() {
        loginPage.login(ConfigurationReader.getProperty("helpdesk_username"), ConfigurationReader.getProperty("helpdesk_password"));
    }


    @When("user enters the {string} user information")
    public void userEntersTheUserInformation(String userType) {
        loginPage.login(userType);
    }


    @When("the user login with {string},{string}")
    public void theUserLoginWith(String username, String password) {
        loginPage.login(username, password);
    }
}
