package com.CRM.pages;


import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(name = "USER_LOGIN")
    public WebElement inputUsername;

    @FindBy(name = "USER_PASSWORD")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement incorrectLoginOrPasswordErrorMessage;

    @FindBy(xpath = "//div[@class='login-text login-item']//label")
    public WebElement rememberMeOnThisComputerLink;

    @FindBy(xpath = "//div[@class='login-text login-item']//input")
    public WebElement getRememberMeOnThisComputerCheckbox;


    /**
     * This method you can provide a "username" and "password" by calling the login method and using ConfigurationReader to read the value
     *
     * @param username
     * @param password
     */
    public void login(String username, String password) {
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }


    /**
     * This method use parameterization, it will read given userType from feature file and read the login credentials
     * from configuration.properties. userTypes are: "hr", "marketing", "helpdesk"
     * you can call the login method and provide the string usertype as above examples and be able to log in
     *
     * @param userType
     */
    public void login(String userType) {

        String username = ConfigurationReader.getProperty(userType + "_username");
        String password = ConfigurationReader.getProperty(userType + "_password");

        login(username, password);

    }


}
