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


    /**
     * in this method you can call loginPage.login and provide hr user information with ConfigurationReader
     */
    @When("user enters the hr user information")
    public void user_enters_the_hr_user_information() {

        loginPage.login(ConfigurationReader.getProperty("hr_username"), ConfigurationReader.getProperty("hr_password"));
    }


    @Then("user should be able to login")
    public void user_should_be_able_to_login() {

        BrowserUtils.verifyTitleContains("Portal");


    }


    /**
     * in this method you can call loginPage.login and provide marketing user information with ConfigurationReader
     */
    @When("user enters the marketing user information")
    public void user_enters_the_marketing_user_information() {
        loginPage.login(ConfigurationReader.getProperty("marketing_username"), ConfigurationReader.getProperty("marketing_password"));
    }


    /**
     * in this method you can call loginPage.login and provide helpdesk user information with ConfigurationReader
     */
    @When("user enters the helpdesk user information")
    public void user_enters_the_helpdesk_user_information() {
        loginPage.login(ConfigurationReader.getProperty("helpdesk_username"), ConfigurationReader.getProperty("helpdesk_password"));
    }


    /**
     * For this method you need to call login method and provide userType as string
     * userTypes are: "hr", "marketing", "helpdesk" and it will read the user information from configuration,properties
     *
     * @param userType
     */
    @When("user enters the {string} user information")
    public void userEntersTheUserInformation(String userType) {
        loginPage.login(userType);
    }


    /**
     * This method you can provide a username and password and provide credentials in  @validLoginWithParamsOutLine scenario to log in with multiple users
     *
     * @param username
     * @param password
     */
    @When("the user login with {string},{string}")
    public void theUserLoginWith(String username, String password) {
        loginPage.login(username, password);
    }


    /**
     * This method you can provide a username and password and provide credentials in   @incorrectlogincredentialserrormessage scenario to log in with multiple users
     *
     * @param username
     * @param password
     */
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


    /**
     * There is a defect found on manuel test, I will logg the defect on Jira application
     */
    @When("password or username is empty, user should see Please fill out this field error message displayed")
    public void passwordOrUsernameIsEmptyUserShouldSeePleaseFillOutThisFieldErrorMessageDisplayed() {

        loginPage.inputUsername.sendKeys("crm");
        loginPage.loginButton.click();

        Assert.assertTrue("Please fill out message DOES NOT displayed!", false);

    }


    /**
     * This method is verifying the remember me link is displayed and clickable
     */
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

    /**
     * This method is veriying the password is displayed in bullet signs
     */
    @When("password should be in bullet signs by default")
    public void passwordShouldBeInBulletSignsByDefault() {
        String expectedPasswordType = "password";
        String actualPasswordType = loginPage.inputPassword.getAttribute("type");

        Assert.assertEquals(expectedPasswordType, actualPasswordType);
    }


}
