package com.demoblaze.library.pages;

import com.demoblaze.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='loginusername']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='loginpassword']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[text()='Log in']")
    public WebElement loginButton;

}
