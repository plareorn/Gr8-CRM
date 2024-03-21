package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DrivePage {

    public DrivePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



}
