package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DrivePage {

    public DrivePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//tr[@class='bx-layout-inner-inner-top-row']//div[@class='main-buttons']//div[@id='top_menu_id_docs_menu_my_disk'] | \n" +
            "//div[@id='top_menu_id_docs_63494979'] | \n" +
            "//div[@id='top_menu_id_docs_414529032'] | \n" +
            "//div[@id='top_menu_id_docs_more_button'] | \n" +
            "//div[@id='top_menu_id_docs_2673172489'] | \n" +
            "//div[@id='top_menu_id_docs_3526888156'] | \n" +
            "//div[@id='top_menu_id_docs_menu_my_disk_volume']\n")
    public List<WebElement> DrivePageModules;

}
