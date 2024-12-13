package ge.automation.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
public class MyStepdefs {
    @Given("The user is on the login page")
    public void theUserIsOnTheLoginPage() {
        System.out.println("I am step: theUserIsOnTheLoginPage");
    }

    @When("The user enters valid credentials")
    public void theUserEntersValidCredentials() {
        System.out.println("I am step: theUserEntersValidCredentials");
    }

    @Then("The user is redirected to the dashboard")
    public void theUserIsRedirectedToTheDashboard() {
        System.out.println("I am step: theUserIsRedirectedToTheDashboard");
    }

    @And("user is {string} and password is \"{int}:")
    public void userIsAndPasswordIs(String username, int password) {
        Assert.assertEquals(username, "admin");
//        System.out.println("I am step: " + " " + username + " " + password);
    }

    @And("username is {string} and password is {string}")
    public void usernameIsAndPasswordIs(String arg0, String arg1) {
        
    }

    @Then("status code is {string}")
    public void statusCodeIs(String arg0) {
    }

    @Given("check if user is exist")
    public void checkIfUserIsExist() {
    }
}