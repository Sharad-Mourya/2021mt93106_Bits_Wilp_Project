package stepDefinitions;


import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;

public class SalesforceLoginSteps {
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());


}
