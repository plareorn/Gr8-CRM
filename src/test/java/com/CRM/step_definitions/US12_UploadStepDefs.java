package com.CRM.step_definitions;


import com.CRM.pages.AppreciationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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


    @Then("displays file in Appreciation message box")
    public void displaysFileInAppreciationMessageBox() {
        appreciationPage.insertInTextButton.click();
        if (appreciationPage.iframeElement != null) {
            System.out.println("File/Picture has Uploaded");
        } else {
            System.out.println("File/Picture has NOT Uploaded");
        }


    }

    @Then("user see the file uploaded")
    public void userSeeTheFileUploaded() {
        appreciationPage.filesUploadedText.isDisplayed();
    }


}
