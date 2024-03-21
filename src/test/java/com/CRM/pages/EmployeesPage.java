package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeesPage {

    public EmployeesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy (xpath = "//span[@class='main-buttons-item-text-title']")
    public List<WebElement> employeesMenu;

    @FindBy (xpath = "//span[.='Company Structure']")
    public WebElement companyStructureButton;

    @FindBy (xpath = "//span[.='Find Employee']")
    public WebElement findEmployeeButton;

    @FindBy (xpath = "//span[.='Telephone Directory']")
    public WebElement telephoneDirectoryButton;

    @FindBy (xpath = "//span[.='Staff Changes']")
    public WebElement staffChangesButton;

    @FindBy (xpath = "//span[.='Efficiency Report']")
    public WebElement efficiencyReportButton;


    @FindBy (xpath = "//span[.='Honored Employees']")
    public WebElement honoredEmployeesButton;

    @FindBy (xpath = "//span[.='Birthdays']")
    public WebElement birthdaysButton;

    @FindBy (xpath = "//span[.='New page']")
    public WebElement newPageButton;

    @FindBy (xpath = "(//span[.='Company Structure'])[2]")
    public WebElement companyStructure;

    @FindBy (xpath ="//a[@title='Employees']")
    public WebElement employeeButton;



}
