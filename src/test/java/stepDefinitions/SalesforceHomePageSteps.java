package stepDefinitions;


import factory.DriverFactory;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.HomePage;

public class SalesforceHomePageSteps {
    private HomePage homePage = new HomePage(DriverFactory.getDriver());

}
