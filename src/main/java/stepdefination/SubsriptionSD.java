package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubsriptionSD {

    @When("^I enter (.+) , (.+) , (.+)$")
   // @When("I enter {string}, {string}, {string}")
    public void enterData(String name,String phone,String email)
    {
        System.out.println("Name = "+ name);
        System.out.println("Phone = "+ phone);
        System.out.println("Email = "+ email);
    }

    @Given("I am on user subscription page")
    public void iAmOnUserSubscriptionPage() {
        // Your code here to navigate to the user subscription page
        System.out.println("I am on user subscription page");
    }


    @When("I click on subscribe button")
    public void iClickOnSubscribeButton() {
        // Your code here to click on the subscribe button
        // This step will perform the action of clicking the subscribe button on the user subscription page.
        System.out.println("I click on subscribe button");
    }

    @Then("user should be subscribed")
    public void userShouldBeSubscribed() {
        // Your code here to verify that the user has been successfully subscribed
        // This step will perform the necessary validation or assertions to confirm the subscription.
        System.out.println("user should be subscribed");
    }
}
