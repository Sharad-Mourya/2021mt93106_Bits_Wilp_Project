package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDate;
import java.time.LocalTime;

public class CreateAccountPage {
    // object repository for Account page

    @FindBy(xpath="//a[@title='Accounts Tab']")
    private WebElement accountTabBtn;
    @FindBy(name="acc2")
    private WebElement accountName;

    public CreateAccountPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void clickAccountTab(){
        accountTabBtn.click();
    }

    public void enterAccountName(String accountName){
        this.accountName.sendKeys(accountName);
    }
}
