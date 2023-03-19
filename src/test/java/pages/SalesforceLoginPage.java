package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.PropertyReader;
import util.Waits;

import java.util.Properties;

public class SalesforceLoginPage {
    // object repository for login page
    @FindBy(id = "username")
    private WebElement usernametxtBox;
    @FindBy(id = "password")
    private WebElement passwordtxtBox;
    @FindBy(id = "Login")
    private WebElement loginBtn;

    private WebDriver driver;
    private Properties prop;

    Waits waits = new Waits(driver);

    // constructor with PageFactory to initiate all the page objects
    public SalesforceLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // function for logging in to application which will return a Home Page
    public void loginToApplication() {
        prop = PropertyReader.getAllProperties();
//        driver.get(prop.getProperty("salesforce_url_home"));
        usernametxtBox.sendKeys(prop.getProperty("username"));
        passwordtxtBox.sendKeys(prop.getProperty("password"));
        loginBtn.click();
//        return new SalesforceHomePage(driver);
    }
}
