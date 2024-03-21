package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfileMenuPage {

    public ProfileMenuPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement profileName;
    @FindBy(xpath = "//div[@id='profile-menu-filter']/a")
    public List<WebElement> allMyProfileOptions;

    @FindBy(xpath = "//span[.='My Profile']")
    public WebElement myProfileBtn;

    @FindBy(xpath = "//a[.='General']")
    public WebElement generalBtn;

    @FindBy(xpath ="//td[@class='user-profile-nowrap-second']/a")
    public WebElement underTheGeneralEmail;
}
