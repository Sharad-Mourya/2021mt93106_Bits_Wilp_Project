package stepDefinitions;


import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.*;

public class CreateContactSteps {
    private SalesforceLoginPage salesforceLoginPage = new SalesforceLoginPage(DriverFactory.getDriver());
    private SalesforceHomePage salesforceHomePage = new SalesforceHomePage(DriverFactory.getDriver());
    private CreateContactPage createContactPage = new CreateContactPage(DriverFactory.getDriver());


    @Given("User opens salesforce login page and login with valid credential")
    public void userOpensSalesforceLoginPage() {
        salesforceLoginPage.loginToApplication();
    }

    @Then("User is successfully logged in")
    public void userIsSuccessfullyLoggedIn() {
        salesforceHomePage.closeDialogBoxIfAppears();
    }

    @When("User clicks on Contact tab")
    public void userClicksOnContactTab() {
        createContactPage.clickContactsTab();
    }

    @When("User selects New")
    public void userSelectsNew() {
        createContactPage.clickNew();
    }

    @And("clicks on Save")
    public void clicksOnSave() {
        createContactPage.saveContact();
    }

    @Then("New Contact is created successfully")
    public void newContactIsCreatedSuccessfully() {
        System.out.println("Contact is created successfully");
    }

    @And("enters {string} and {string}")
    public void entersAnd(String firstName, String lastName) {
        createContactPage.createContact(firstName,lastName);

    }
    @And("clicks on Cancel")
    public void clicksOnCancel() {
        createContactPage.cancelContact();
    }

    @Then("New Contact is cancelled successfully")
    public void newContactIsCancelledSuccessfully() {
        System.out.println("Contact is cancelled successfully");
    }
    
    @Given("User perform Salesforce CICD scenario")
    public void userPerformSalesforceCICDScenario() {
        System.out.println("CICD Scenario Successful");
    }
}
