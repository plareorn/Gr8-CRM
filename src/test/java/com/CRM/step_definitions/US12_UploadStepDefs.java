package com.CRM.step_definitions;


import com.CRM.pages.AppreciationPage;
import com.CRM.utilities.BrowserUtils;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

public class US12_UploadStepDefs {

    AppreciationPage appreciationPage= new AppreciationPage();
    String fileName= "/Users/zohraghafoory/Desktop/ScreenShot.png";

    @When("the user navigates to the upload page")
    public void the_user_navigates_to_the_upload_page() {
        appreciationPage.moreButton.click();
        appreciationPage.appreciationButton.click();


    }

    @And("the user selects a file to upload that accept files with the following formats: .pdf, .txt, .jpeg, .png, .docx")
    public void theUserSelectsAFileToUploadThatAcceptFilesWithTheFollowingFormatsPdfTxtJpegPngDocx() {
        appreciationPage.uploadButton.click();

        if(appreciationPage.isValidExtension(fileName)){
            appreciationPage.uploadFilesAndImagesButton.sendKeys(fileName);
        }else{
            System.out.println("File format is not the following: .pdf, .txt, .jpeg, .png, .docx");
        }


    }

    @Then("user see the file uploaded")
    public void userSeeTheFileUploaded() {

        appreciationPage.filesUploadedText.isDisplayed();
    }


    @Then("the user should click on Insert in text button")
    public void theUserShouldClickOnInsertInTextButton() {
        appreciationPage.insertInTextButton.click();
    }

    @And("the file or image should be displayed appropriately within the appreciation box")
    public void theFileOrImageShouldBeDisplayedAppropriatelyWithinTheAppreciationBox() {
       Driver.getDriver().switchTo().frame(0);
       String image= appreciationPage.iframeElement.getAttribute("src");
        System.out.println("image = " + image);

    }

    @Then("the user selects the option to remove a file or image")
    public void theUserSelectsTheOptionToRemoveAFileOrImage() {
        appreciationPage.removeButton.click();
    }

}
