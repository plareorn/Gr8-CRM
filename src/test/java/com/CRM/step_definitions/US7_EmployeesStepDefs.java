package com.CRM.step_definitions;

import com.CRM.pages.EmployeesPage;
import com.CRM.pages.LoginPage;
import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.lang.module.Configuration;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class US7_EmployeesStepDefs {

    LoginPage loginPage = new LoginPage();
    EmployeesPage employeesPage = new EmployeesPage();

    @Given("the user is logged in as a {string}")
    public void theUserIsLoggedInAsA(String userType) throws Exception{
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Robot robot = new Robot();
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(500);
        }
        loginPage.login(userType);

    }


    @When("user click on Employees button")
    public void user_click_on_employees_button() {
        employeesPage.employeeButton.click();


    }

    @Then("the user should see the following options on Employees page:")
    public void the_user_should_see_the_following_options_on_employees_page(List<String> ExpectedEmployeeList) {

        List<String> actualEmployeesList = new ArrayList<>();
        for (WebElement eachOptions : employeesPage.employeesMenu) {
            actualEmployeesList.add(eachOptions.getText());
            eachOptions.isDisplayed();
        }


        Assert.assertEquals(ExpectedEmployeeList,actualEmployeesList);
    }
}




