package com.CRM.step_definitions;

import com.CRM.pages.EmployeesMenu;
import com.CRM.pages.LoginPage;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class US9_EmployeeMenu {

    LoginPage loginPage = new LoginPage();
    EmployeesMenu employeesMenu = new EmployeesMenu();
    public void EmployeesMenu(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @Given("Users is on the home page of CRM")
    public void users_is_on_the_home_page_of_crm() {
        loginPage.login("hr");
    }
    @When("Users click on the Employees button option")
    public void users_click_on_the_employees_button_option() {
        employeesMenu.employeesButton.click();
    }
    @When("Users are able to see Company Structure")
    public void users_are_able_to_see_company_structure() {
        Assert.assertEquals("Company Structure", employeesMenu.companyStructure.getText());
    }
    @Given("HR User is on the home page of CRM")
    public void hr_user_is_on_the_home_page_of_crm(){
        loginPage.login("hr");
    }
    @When("HR User click on the Employee button option")
    public void hr_user_click_on_the_employee_button_option() {
        loginPage.login("hr");
        employeesMenu.employeesButton.click();
    }
    @When("HR User is able to add department from company structure")
    public void hr_user_is_able_to_add_department_from_company_structure() {
        loginPage.login("hr");
        employeesMenu.addButton.click();
    }
    @Given("Helpdesk user, and Marketing user are on the home page of CRM")
    public void helpdesk_user_and_marketing_user_are_on_the_home_page_of_crm() {
        loginPage.login("hr");
        loginPage.login("marketing");
    }
    @When("Helpdesk user, and Marketing user click on the Employee button option")
    public void helpdesk_user_and_marketing_user_click_on_the_employee_button_option() {
        employeesMenu.employeesButton.click();
    }
    @When("Helpdesk user, and Marketing user are NOT able to see {string} option")
    public void helpdesk_user_and_marketing_user_are_not_able_to_see_option(String string) {
    }
}
