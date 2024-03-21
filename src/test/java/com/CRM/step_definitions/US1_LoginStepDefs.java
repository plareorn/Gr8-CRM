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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.module.Configuration;
import java.time.Duration;

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


    @When("user enters incorrect login credentials {string},{string}")
    public void userEntersIncorrectLoginCredentials(String username, String password) {
        loginPage.login(username, password);
    }


    @Then("user should see error message displayed")
    public void userShouldSeeErrorMessageDisplayed() {
        String expectedIncorrectLoginOrPasswordErrorMessage = "Incorrect login or password";
        String actualIncorrectLoginOrPasswordErrorMessage = loginPage.incorrectLoginOrPasswordErrorMessage.getText();

        Assert.assertEquals(expectedIncorrectLoginOrPasswordErrorMessage, actualIncorrectLoginOrPasswordErrorMessage);
    }


    @Then("user should see remember me on this computer link")
    public void userShouldSeeRememberMeOnThisComputerLink() {
        String expectedRememberMeOnThisComputerLink = "Remember me on this computer";
        String actualRememberMeOnThisComputerLink = loginPage.rememberMeOnThisComputerLink.getText();

        Assert.assertEquals(expectedRememberMeOnThisComputerLink, actualRememberMeOnThisComputerLink);
    }

    @And("user should be able to click to the checkbox")
    public void userShouldBeAbleToClickToTheCheckbox() {
        Assert.assertTrue(loginPage.getRememberMeOnThisComputerCheckbox.isEnabled()
        && loginPage.getRememberMeOnThisComputerCheckbox.isDisplayed()
        );
    }

    @When("password should be in bullet signs by default")
    public void passwordShouldBeInBulletSignsByDefault() {
        String expectedPasswordType = "password";
        String actualPasswordType = loginPage.inputPassword.getAttribute("type");

        Assert.assertEquals(expectedPasswordType, actualPasswordType);
    }



}
