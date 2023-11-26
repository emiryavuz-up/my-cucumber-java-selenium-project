package com.demoblaze.library.step_definitions;

import com.demoblaze.library.pages.MainPage;
import com.demoblaze.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUp_StepDefinitions{

    MainPage demoBlazeMainPage = new MainPage();

    @Given("user is on the main page")
    public void userIsOnTheMainPage() {
        Driver.getDriver().get("https://www.demoblaze.com/");
    }

    @When("user clicks on signup button")
    public void userClicksOnSignupButton() {
        demoBlazeMainPage.signUpButton.click();
    }

    @Then("user enters username {string}")
    public void userEntersUsername(String username) {
        demoBlazeMainPage.usernameBox.sendKeys(username);
    }
    @Then("user enters password {string}")
    public void userEntersPassword(String password) {
        demoBlazeMainPage.passwordBox.sendKeys(password);
    }

    @Then("user clicks on second signup button")
    public void userClicksOnSecondSignupButton() {
        demoBlazeMainPage.secondSignUpButton.click();
    }

}
