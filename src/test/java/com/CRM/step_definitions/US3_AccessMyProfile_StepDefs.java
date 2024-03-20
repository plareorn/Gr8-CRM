package com.CRM.step_definitions;

import com.CRM.pages.LoginPage;
import com.CRM.pages.ProfileMenuPage;
import com.CRM.utilities.BrowserUtils;
import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class US3_AccessMyProfile_StepDefs {
    LoginPage loginPage= new LoginPage();
    ProfileMenuPage profileMenuPage = new ProfileMenuPage();
    @Given("the user is logged in")
    public void the_user_is_logged_in() {

        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("hr_username"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("hr_password"));
        loginPage.loginButton.click();


    }
    @When("the user navigates to the My Profile page")
    public void the_user_navigates_to_the_my_profile_page() {
        profileMenuPage.profileName.click();



    }
    @Then("the user should see the following options:")
    public void the_user_should_see_the_following_options(List<String> expectedOptions) {
        profileMenuPage.myProfileBtn.click();
        List<String> actualOptions = new ArrayList<>();
        for (WebElement eachOptions : profileMenuPage.allMyProfileOptions) {
            actualOptions.add(eachOptions.getText());
            eachOptions.isDisplayed();
        }

        Assert.assertEquals(actualOptions, expectedOptions);
    }

    @When("selects the General tab")
    public void selects_the_general_tab() {

    }
    @Then("the email displayed should be the same as the user’s account email")
    public void the_email_displayed_should_be_the_same_as_the_user_s_account_email() {

    }

}
