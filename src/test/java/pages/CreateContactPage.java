package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDate;
import java.time.LocalTime;

public class CreateContactPage {
    // object repository for Contact page

    @FindBy(xpath="//a[@title='Contacts Tab']")
    private WebElement contactTabBtn;
    @FindBy(xpath="//input[@title='New']")
    private WebElement newBtn;
    @FindBy(id="name_firstcon2")
    private WebElement fName;
    @FindBy(id="name_lastcon2")
    private WebElement lName;
    @FindBy(name="save")
    private WebElement saveBtn;


    private WebDriver driver;


    public CreateContactPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickContactsTab(){
        contactTabBtn.click();
    }

    public void clickNew(){
        newBtn.click();
    }

    public void createContact(String firstName,String lastName){
        String time=(LocalDate.now()+" "+LocalTime.now().getHour()+"-"+LocalTime.now().getMinute());
        fName.sendKeys(firstName);
        lName.sendKeys(lastName+time);
    }
    public void saveContact(){
        saveBtn.click();
    }

}
