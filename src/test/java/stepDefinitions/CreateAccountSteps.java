package stepDefinitions;


import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateAccountPage;
import pages.CreateContactPage;
import pages.SalesforceHomePage;
import pages.SalesforceLoginPage;

import java.time.LocalDate;
import java.time.LocalTime;

public class CreateAccountSteps {
    private CreateAccountPage createAccountPage = new CreateAccountPage(DriverFactory.getDriver());

    @When("User clicks on Account tab")
    public void userClicksOnAccountTab() {
        createAccountPage.clickAccountTab();
    }

    @And("enters {string}")
    public void enters(String accountName) {
        String time=(LocalDate.now()+" "+ LocalTime.now().getHour()+"-"+LocalTime.now().getMinute());
        createAccountPage.enterAccountName(accountName+time);
    }

    @Then("New Account is created successfully")
    public void newAccountIsCreatedSuccessfully() {
        System.out.println("Account Created Successfully");
    }

    @Then("New Account is cancelled successfully")
    public void newAccountIsCancelledSuccessfully() {
        System.out.println("Account Cancelled Successfully");

    }
}
