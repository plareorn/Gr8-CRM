package com.CRM.step_definitions;

import com.CRM.pages.BasePage;
import com.CRM.pages.DrivePage;
import com.CRM.pages.LoginPage;
import com.CRM.utilities.BrowserUtils;
import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class US13_DrivePageModuleAccess_StepDefs extends BasePage {

    DrivePage drivePage = new DrivePage();
    LoginPage loginPage = new LoginPage();

    @When("{string} goes to the Drive page")
    public void goesToTheDrivePage(String userType) {
        if (userType.contains("HR")){
            loginPage.login(ConfigurationReader.getProperty("hr_username"), ConfigurationReader.getProperty("hr_password"));
        } else if (userType.contains("Help")){
            loginPage.login(ConfigurationReader.getProperty("helpdesk_username"), ConfigurationReader.getProperty("helpdesk_password"));
        } else if (userType.contains("Marketing")){
            loginPage.login(ConfigurationReader.getProperty("marketing_username"), ConfigurationReader.getProperty("marketing_password"));
        } //Changes depending on username in the feature page
        DrivePageLink.click(); //Using the abstract class of BasePage that contains the main page information to first navigate to the drive page
    }


    @Then("User should see the Drive page")
    public void i_should_see_the_drive_page() {
        BrowserUtils.verifyTitleContains("Drive"); //Checking the is correctly landing on the drive page
    }

    @Then("User should see all the following modules:")
    public void userShouldSeeAllTheFollowingModules(List<String> expectedTopModules) {

        List<String> actualTopModules = new ArrayList<>();
        for (WebElement each : drivePage.DrivePageModules) {
            actualTopModules.add(each.getText());
        } //Loop through actual top modules

        Assert.assertEquals(actualTopModules, expectedTopModules);

    }
}
