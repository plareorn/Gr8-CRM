package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompanyPage {

    // initialize driver and object

    public CompanyPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='top_menu_id_about']/div")
    public List<WebElement> allModules;


    @FindBy(xpath = "//a[@title='Company']")
    public WebElement CompanyPage;

    @FindBy(xpath = "//div[@class='main-buttons-inner-container']//span[2]//span[.='Official Information']")
    public WebElement OfficialInformation;

    @FindBy(xpath = "//div[@class='main-buttons-inner-container']//span[2]//span[.='Our Life']")
    public WebElement OurLife;

    @FindBy(xpath = "//div[@class='main-buttons-inner-container']//span[2]//span[.='About Company']")
    public WebElement AboutCompany;

    @FindBy(xpath = "//div[@class='main-buttons-inner-container']//span[2]//span[.='Photo Gallery']")
    public WebElement PhotoGallery;

    @FindBy(xpath = "//div[@class='main-buttons-inner-container']//span[2]//span[.='Video']")
    public WebElement Video;


    @FindBy(xpath = "//div[@class='main-buttons-inner-container']//span[2]//span[.='Career']")
    public WebElement Career;


    @FindBy(xpath = "//div[@class='main-buttons-inner-container']//span[2]//span[.='Business News (RSS)']")
    public WebElement BusinessNews;


    @FindBy(xpath = "//div[@class='main-buttons-inner-container']//span[.='More']")
    public WebElement More;


}
