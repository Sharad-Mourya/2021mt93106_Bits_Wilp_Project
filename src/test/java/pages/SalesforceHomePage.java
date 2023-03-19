package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesforceHomePage {
    // object repository for home page

    @FindBy(id="tryLexDialog")
    private WebElement dialogBox;

    @FindBy(id="tryLexDialogX")
    private WebElement closeDialogBox;

    @FindBy(id="home_Tab")
    private WebElement homeTabBtn;

    private WebDriver driver;
    public SalesforceHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    public void closeDialogBoxIfAppears(){
        WebDriverWait wait = new WebDriverWait(driver, 8);
        try {
            WebElement lightningDialogbox = wait.until(ExpectedConditions.presenceOfElementLocated(((By.id("tryLexDialog")))));
            if (lightningDialogbox != null) {
                System.out.println("Dialog box found, closing this dialog box");
                closeDialogBox.click();
            }
        }
        catch (Exception e){

        }
        System.out.println("User is successfully logged in...");
    }

}
