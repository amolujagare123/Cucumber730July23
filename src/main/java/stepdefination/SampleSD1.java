package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleSD1 {

 /*   @Given("I am on login page")
    public void navigateToLoginPage() {
        // Code to navigate to the login page
        System.out.println("I am on login page");
    }*/
    @Given("^I am on login page$")
    public void navigateToLoginPage() {
        // Code to navigate to the login page
        System.out.println("I am on login page");
    }


    @When("I enter username and password")
    public void enterCredentials() {
        // Code to enter the username and password
        System.out.println("I enter username and password");
    }

    @When("I click on login button")
    public void clickLoginButton() {
        // Code to click on the login button
        System.out.println("I click on login button");
    }

    /*@Then("I should land on home page")
    public void verifyLandingOnHomePage() {
        // Code to verify landing on the home page
        System.out.println("I should land on home page");
    }
*/
    @When("I enter invalid username and invalid password")
    public void iEnterInvalidUsernameAndInvalidPassword() {
        System.out.println("I enter invalid username and invalid password");
    }

    @Then("I should get error message")
    public void iShouldGetErrorMessage() {
        System.out.println("I should get error message");
    }

    @When("I enter blank username and blank password")
    public void iEnterBlankUsernameAndBlankPassword() {
        System.out.println("I enter blank username and blank password");
    }

    @Then("I should get Another error message")
    public void iShouldGetAnotherErrorMessage() {
        System.out.println("I should get Another error message");
    }

    @When("I enter {string} and {string}")
    public void iEnterAnd(String username, String password) {

        System.out.println("username="+username);
        System.out.println("password="+password);
    }
}
