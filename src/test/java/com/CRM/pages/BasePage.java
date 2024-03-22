package com.CRM.pages;


import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {



    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy (xpath = "//tr[@class='bx-layout-inner-top-row']//li[@id='bx_left_menu_menu_files']//a//span")
    public WebElement DrivePageLink;





}
