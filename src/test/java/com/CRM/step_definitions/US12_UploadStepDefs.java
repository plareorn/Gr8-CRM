package com.CRM.step_definitions;


import com.CRM.pages.AppreciationPage;
import com.CRM.utilities.BrowserUtils;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class US12_UploadStepDefs {

    AppreciationPage appreciationPage= new AppreciationPage();
    String fileName= "/Users/zohraghafoory/Desktop/ScreenShot.png";

    @When("the user navigates to the upload page")
    public void the_user_navigates_to_the_upload_page() {
        appreciationPage.moreButton.click();
        appreciationPage.appreciationButton.click();


    }

    @And("the user selects a file to upload that accept files with the following formats: .pdf, .txt, .jpeg, .png, .docx")
    public void theUserSelectsAFileToUploadThatAcceptFilesWithTheFollowingFormatsPdfTxtJpegPngDocx(List<String> files) {
        appreciationPage.uploadButton.click();

        for (String file : files) {
            String projectPath = System.getProperty("user.dir");

            String filePathJPG = "src/test/resources/files/"+file;

            String fullPathJPG = projectPath + "/" + filePathJPG;
            appreciationPage.uploadFilesAndImagesButton.sendKeys(fullPathJPG);
            BrowserUtils.waitFor(1);

        }
    }


    @Then("user see the file uploaded")
    public void userSeeTheFileUploaded() {

        appreciationPage.filesUploadedText.isDisplayed();
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


    @And("the user selects a file to upload that accept files with the following formats: .pdf, .txt, .jpeg, .png, .docx and the user should click on Insert in text button")
    public void theUserSelectsAFileToUploadThatAcceptFilesWithTheFollowingFormatsPdfTxtJpegPngDocxAndTheUserShouldClickOnInsertInTextButton(List<String> files) {
        appreciationPage.uploadButton.click();

        for (String file : files) {
            String projectPath = System.getProperty("user.dir");

            String filePathJPG = "src/test/resources/files/"+file;

            String fullPathJPG = projectPath + "/" + filePathJPG;
            appreciationPage.uploadFilesAndImagesButton.sendKeys(fullPathJPG);
            BrowserUtils.waitFor(1);

            appreciationPage.insertInTextButton.click();

        }


    }

    @And("the user selects a file to upload that accept files with the following formats: .pdf, .txt, .jpeg, .png, .docx and remove a file or image")
    public void theUserSelectsAFileToUploadThatAcceptFilesWithTheFollowingFormatsPdfTxtJpegPngDocxAndRemoveAFileOrImage(List<String> files) {

        appreciationPage.uploadButton.click();

        for (String file : files) {
            String projectPath = System.getProperty("user.dir");

            String filePathJPG = "src/test/resources/files/"+file;

            String fullPathJPG = projectPath + "/" + filePathJPG;
            appreciationPage.uploadFilesAndImagesButton.sendKeys(fullPathJPG);
            BrowserUtils.waitFor(1);

            appreciationPage.removeButton.click();
    }
}}
