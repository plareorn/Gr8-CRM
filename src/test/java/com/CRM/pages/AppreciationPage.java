package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage {

public AppreciationPage(){
    PageFactory.initElements(Driver.getDriver(), this);

}

@FindBy(xpath="//span[@id='feed-add-post-form-link-text']")
    public WebElement moreButton;

@FindBy(xpath = "//span[contains(text(),'Appreciation')]")
    public WebElement appreciationButton;

@FindBy(xpath="//span[@id='bx-b-uploadfile-blogPostForm'] ")
    public WebElement uploadButton;

@FindBy(name="bxu_files[]")
    public WebElement uploadFilesAndImagesButton;

@FindBy(xpath="//span[contains(text(),'Insert in text')]")
    public WebElement insertInTextButton;

@FindBy(tagName = "iframe")
    public WebElement iframeElement;

@FindBy(xpath="//a[contains(text(),'My Drive / Uploaded files')]")
    public WebElement filesUploadedText;


public static boolean isValidExtension(String fileName){
    // Find the last dot in the file name
    int lastDotIndex = fileName.lastIndexOf('.');

    // Get the substring after the last dot (which is the file extension)
    String extension = fileName.substring(lastDotIndex + 1).toLowerCase();

    // Check if the extension matches one of the specified extensions
    return extension.equals("pdf") || extension.equals("txt") ||
            extension.equals("jpeg") || extension.equals("png") ||
            extension.equals("docx");




}






}
