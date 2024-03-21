package com.CRM.step_definitions;


import com.CRM.pages.ActivityStream_Message;
import com.CRM.pages.LoginPage;
import com.CRM.utilities.BrowserUtils;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import javax.sql.rowset.BaseRowSet;

public class US4_SendMessages_StepDefs {

    ActivityStream_Message messageFeature = new ActivityStream_Message();
    LoginPage loginPage = new LoginPage();
    @Given("User enter correct {string} and {string}")
    public void user_enter_correct_and(String username, String password) {

        loginPage.login(username,password);
    }


    @When("user click on message box area")
    public void user_click_on_message_box_area() {

        messageFeature.messageBox.click();

    }


    @When("type a {string} in the messageContent")
    public void type_a_in_the_message_content(String message) {
        Driver.getDriver().switchTo().frame(messageFeature.iframMessageBox);

        messageFeature.messageBoxIframe.sendKeys(message);
    }


    @Then("user click on send message")
    public void user_click_on_send_message() {
        Driver.getDriver().switchTo().defaultContent();

        messageFeature.sendButton.click();
    }

    @Then("user can see the {string}")
    public void user_can_see_the(String expectedMessageDisplayed) {
        String actualMessageDisplayed = messageFeature.messageDisplayed.getText();

        System.out.println("messageDisplayed = " + expectedMessageDisplayed);

        Assert.assertEquals(expectedMessageDisplayed,actualMessageDisplayed);


    }



    @Given("User enter correct credentials {string} and {string}")
    public void userEnterCorrectCredentialsAnd(String user, String pass) {
        loginPage.login(user,pass);

    }
    @Then("User left the messageContent empty and click on send message")
    public void userLeftTheMessageContentEmptyAndClickOnSendMessage() {
        messageFeature.sendButton.click();

    }




    @And("user see the ErrorMessageeTitle")
        public void userSeeTheErrorMessageeTitle() {
            assert messageFeature.messageTitleError.isDisplayed();

        }






    @Then("user should be able to see All employees selected by default in the recipient box")
    public void userShouldBeAbleToSeeAllEmployeesSelectedByDefaultInTheRecipientBox() {
        // in previous step when we clicked on message tab, the method contain driver switch to frame, now we need to get out from the frame to continue the following steps
        Driver.getDriver().switchTo().defaultContent();
        assert messageFeature.allEmployee.isDisplayed();


    }

    @And("User keep the recipient empty")
    public void userKeepTheRecipientEmpty()
    {


        messageFeature.closeAllEmployee.click();
    }


    @And("User see the ErrorRecipientMessage")
    public void userSeeTheErrorRecipientMessage() {
        assert messageFeature.recipientError.isDisplayed();

    }

    @Then("User click cancel the message")
    public void userClickCancelTheMessage() {
        Driver.getDriver().switchTo().defaultContent();

        messageFeature.cancelButton.click();

    }

    @Then("User should be able to cancel the message")
    public void userShouldBeAbleToCancelTheMessage() {

        //when the user cancel the message, the message tab shrink, which lead to disapear of some element from it

        //we use All employee, as an element that belong to messsage tab to see if the user is alble to cancle the message or not

        //if false = test passed
        System.out.println("messageFeature.allEmployee.isDisplayed() = " + messageFeature.allEmployee.isDisplayed());
    }


}
