package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.util.concurrent.TimeUnit;
public class DriverFactory {
    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
    public WebDriver initDriver(String browser) {
        browser = browser.toUpperCase();
        // use WebDriverManager to automatically setup driver of the browser
        WebDriverManager.getInstance(DriverManagerType.valueOf(browser)).setup();
        // launch appropriate browser
        switch (browser) {
            case "CHROME":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setHeadless(true);
                chromeOptions.addArguments("start-maximized"); // open Browser in maximized mode
                chromeOptions.addArguments("disable-infobars"); // disabling infobars
                chromeOptions.addArguments("--disable-extensions"); // disabling extensions
//                chromeOptions.addArguments("--disable-gpu"); // applicable to windows os only
                chromeOptions.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
                chromeOptions.addArguments("--no-sandbox"); // Bypass OS security model
//                chromeOptions.addArguments("--no-sandbox");
//                chromeOptions.addArguments("--disable-setuid-sandbox");
//                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver");
                tlDriver.set(new ChromeDriver(chromeOptions));
                break;
            case "FIREFOX":
                tlDriver.set(new FirefoxDriver());
                break;
            case "SAFARI":
                tlDriver.set(new SafariDriver());
                break;
            case "EDGE":
                tlDriver.set(new EdgeDriver());
                break;
            case "OPERA":
                tlDriver.set(new OperaDriver());
                break;
            case "IEXPLORER":
                tlDriver.set(new InternetExplorerDriver());
                break;
        }
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return getDriver();
    }
    public static synchronized WebDriver getDriver() {
        return tlDriver.get();
    }
}
