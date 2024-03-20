package com.CRM.step_definitions;


import com.CRM.pages.ActivityStream_Message;
import com.CRM.pages.LoginPage;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US4_SendMessages_StepDefs {

    ActivityStream_Message messageFeature = new ActivityStream_Message();
    @Given("User enter correct {string} and {string}")
    public void user_enter_correct_and(String username, String password) {
        LoginPage loginPage = new LoginPage();
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

}
