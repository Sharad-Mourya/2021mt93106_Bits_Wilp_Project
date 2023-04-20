package stepDefinitions;

import factory.DriverFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import util.PropertyReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.util.Properties;

public class BaseSteps {
    // declaring all variables
    private WebDriver driver;
    private Properties prop;
    private DriverFactory driverFactory;

//     @Before
//     public void setup() {
//         // this method will run Before each Scenario
//         prop = PropertyReader.getAllProperties();
//         driverFactory = new DriverFactory();
//         driver = driverFactory.initDriver(prop.getProperty("browser"));
//         driver.get(prop.getProperty("salesforce_url_home"));
//     }
//     @After
//     public void tearDown(Scenario scenario) {
//         // this method will run After each Scenario
//         if (scenario.isFailed()) {
//             // take screenshot:
//             String screenshotName = scenario.getName().replaceAll(" ", "_");
//             byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//             scenario.attach(screenshot, "image/png", screenshotName);
//         }
//         PropertyReader.cleanUp();
//         driver.quit();
//     }
}
