package com.demoblaze.library.step_definitions;

import com.demoblaze.library.pages.LoginPage;
import com.demoblaze.library.pages.MainPage;
import com.demoblaze.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinitions{

    MainPage demoBlazeMainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
    SignUp_StepDefinitions signUpStepDefinitions = new SignUp_StepDefinitions();

    @When("user clicks on login button")
    public void userClicksOnLoginButton() {
        signUpStepDefinitions.userIsOnTheMainPage();
        try{

            demoBlazeMainPage.loginButton.click();
        }catch (NoSuchElementException e){
            System.out.println("Element couldn't found.");
            e.printStackTrace();
        }
    }

    @Then("user clicks on second login button")
    public void userClicksOnSecondLogInButton() {
        try {
            loginPage.loginButton.click();
        }catch (NoSuchElementException e){
            System.out.println("Element couldn't found.");
            e.printStackTrace();
        }
    }

    @Then("user enters registered username {string}")
    public void userEntersRegisteredUsername(String username) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(loginPage.usernameBox));
            loginPage.usernameBox.sendKeys(username);
        }catch (NoSuchElementException e){
            System.out.println("Element couldn't found.");
            e.printStackTrace();
        }
    }

    @Then("user enters registered password {string}")
    public void userEntersRegisteredPassword(String password) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(loginPage.passwordBox));
            loginPage.passwordBox.sendKeys(password);
        }catch (NoSuchElementException e){
            System.out.println("Element couldn't found.");
            e.printStackTrace();
        }
    }

}
