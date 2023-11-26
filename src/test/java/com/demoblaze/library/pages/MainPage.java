package com.demoblaze.library.pages;

import com.demoblaze.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[@id='signin2']")
    public WebElement signUpButton;

    @FindBy (xpath = "//a[@id='login2']")
    public WebElement loginButton;
    @FindBy (xpath = "//input[@id='sign-username']")
    public WebElement usernameBox;

    @FindBy (xpath = "//input[@id='sign-password']")
    public WebElement passwordBox;
    @FindBy (xpath = "//button[text()='Sign up']")
    public WebElement secondSignUpButton;




}
