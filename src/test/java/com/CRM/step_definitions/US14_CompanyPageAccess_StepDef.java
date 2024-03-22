package com.CRM.step_definitions;

import com.CRM.pages.CompanyPage;
import com.CRM.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US14_CompanyPageAccess_StepDef {

    CompanyPage companyPage = new CompanyPage();
    LoginPage loginPage = new LoginPage();


    @Given("User logIn to the CRM")
    public void userLogInToTheCRM() {
        loginPage.login("marketing");
    }



    @When("User should go to the company page")
    public void user_should_go_to_the_company_page() {
        companyPage.CompanyPage.click();
    }

    @Then("User should see the following modules")
    public void user_should_see_the_following_modules(List<String> expectedModules) {
        List<String> actualModules = new ArrayList<>();
        for (WebElement eachModules : companyPage.allModules) {
            actualModules.add(eachModules.getText());
            eachModules.isDisplayed();
        }

        Assert.assertEquals(actualModules, expectedModules);
    }



}
