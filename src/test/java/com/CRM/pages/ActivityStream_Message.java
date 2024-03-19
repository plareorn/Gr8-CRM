package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStream_Message {

    //intiliaze Driver and object

    public ActivityStream_Message(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "microoPostFormLHE_blogPostForm_inner")
    public WebElement messageBox;

@FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
public WebElement iframMessageBox;

@FindBy (xpath = "//body[@style='min-height: 184px;']")
public WebElement messageBoxIframe;

@FindBy(xpath = "//span[@class='feed-add-post-destination-text']")
    public WebElement allEmployee;

@FindBy (xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement closeAllEmployee;

@FindBy(xpath ="//button[@id='blog-submit-button-save']" )
    public WebElement sendButton;

@FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement cancelButton;

@FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement messageTitleError;


@FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement recipientError;

@FindBy(id = "blog_post_body_513")
    public WebElement messageDisplayed;



}
