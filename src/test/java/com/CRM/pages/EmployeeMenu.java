package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmployeeMenu {

    public EmployeeMenu() {PageFactory.initElements(Driver.getDriver(), this);}
    @FindBy (xpath = "//span[@class='main-buttons-item-text-title']")
    public List<WebElement> employeesMenu;

        @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employeeButton;

    @FindBy(xpath = "//span[@class='pagetitle-item']")
    public WebElement companyStructure;

    @FindBy(xpath = "//span[@class='webform-small-button-text']")
    public WebElement addButton;




}


